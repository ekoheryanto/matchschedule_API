package com.example.eko.matchschedule.db

import com.example.eko.matchschedule.BuildConfig


object DBLastMatch {
    fun getTeams1(league: String?): String {
    return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventspastleague.php?id=" + league
         }
}
