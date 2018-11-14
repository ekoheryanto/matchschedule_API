package com.example.eko.matchschedule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.example.eko.matchschedule.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
//    private lateinit var listTeam: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = PagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewpager)



//        linearLayout {
//            lparams (width = matchParent, height = wrapContent)
//            orientation = LinearLayout.VERTICAL
//            topPadding = dip(16)
//            leftPadding = dip(16)
//            rightPadding = dip(16)
//
//                relativeLayout{
//                    lparams (width = matchParent, height = wrapContent)
//
//                    listTeam = recyclerView {
//                        lparams (width = matchParent, height = wrapContent)
//                        layoutManager = LinearLayoutManager(ctx)
//                    }
//
//                }
//            }





        }
    }



