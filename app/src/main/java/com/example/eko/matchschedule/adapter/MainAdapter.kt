package com.example.eko.matchschedule.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.eko.matchschedule.R
import com.example.eko.matchschedule.model.Team
import org.jetbrains.anko.*
import java.text.FieldPosition

class MainAdapter (private val teams: List<Team>)
    : RecyclerView.Adapter<TeamViewHolder>(){

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
      holder.bindItem(teams[position])
    }

    override fun getItemCount(): Int = teams.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
    return TeamViewHolder(MainAdapter.TeamUI().createView(AnkoContext.create(parent.context, parent)))
    }

    class TeamUI : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>): View {
            return with(ui) {
                this.linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    padding = dip(16)
                    orientation = LinearLayout.VERTICAL

                    textView {
                        id = R.id.tgl
                        textSize=16f
                    }.lparams{
                        margin =dip(18)
                    }
                    linearLayout{
                        lparams(matchParent, wrapContent)
                        padding =dip(6)
                        orientation =LinearLayout.HORIZONTAL


                        textView {
                            id = R.id.team_A
                            textSize = 16f
                        }.lparams{
                            margin = dip(15)
                        }


                        textView {
                            id = R.id.team_B
                            textSize = 16f
                        }.lparams{
                            margin = dip(15)
                        }
                    }


                }
            }
        }

    }


}

class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tanggal: TextView = view.find(R.id.tgl)
    private val teamNameA: TextView = view.find(R.id.team_A)
    private val teamNameB: TextView = view.find(R.id.team_B)

    fun bindItem(teams: Team) {
        tanggal.text = teams.matchdate
        teamNameA.text = teams.teamName
        teamNameB.text = teams.teamName
    }

}