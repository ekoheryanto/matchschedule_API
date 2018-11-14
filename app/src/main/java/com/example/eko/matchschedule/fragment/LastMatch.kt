package com.example.eko.matchschedule.fragment


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.eko.matchschedule.R
import com.example.eko.matchschedule.model.Team
import com.example.eko.matchschedule.adapter.MainAdapter
import com.example.eko.matchschedule.presenter.MatchPresenter
import com.example.eko.matchschedule.repository.ApiRepository
import com.example.eko.matchschedule.view.MatchView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_last_match.*
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"


class LastMatch : Fragment(), MatchView{
    private var teams: MutableList<Team> = mutableListOf()
    private lateinit var presenter: MatchPresenter
    private lateinit var adapter: MainAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_last_match, container, false)
//      return createView(AnkoContext.create(ctx))


    }

//    override fun createView(ui: AnkoContext<Context>): View {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        lastMatch.layoutManager = LinearLayoutManager(ctx)
        lastMatch.adapter = MainAdapter(teams)

        val request = ApiRepository()
        val gson = Gson()
        presenter = MatchPresenter(this, request, gson)


    }



    override fun showMatchList(data: List<Team>) {
        teams.clear()
        teams.addAll(data)
        adapter.notifyDataSetChanged()
    }


}
