package com.example.eko.matchschedule.presenter

import com.example.eko.matchschedule.db.DBLastMatch
import com.example.eko.matchschedule.model.TeamResponse
import com.example.eko.matchschedule.repository.ApiRepository
import com.example.eko.matchschedule.view.MatchView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MatchPresenter(private val view: MatchView, private val apiRepository: ApiRepository, private val gson: Gson){
    fun getTeamList(league: String?) {
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(DBLastMatch.getTeams1(league)),
                TeamResponse::class.java
            )

            uiThread {
                view.showMatchList(data.teams)
            }
        }
    }
}