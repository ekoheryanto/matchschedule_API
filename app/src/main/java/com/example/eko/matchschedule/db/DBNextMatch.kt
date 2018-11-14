package com.example.eko.matchschedule.db

import com.example.eko.matchschedule.BuildConfig


object DBNextMatch1 {
    fun getTeams2(league: String?): String {
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventsnextleague.php?id=" + league
    }
}