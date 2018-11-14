package com.example.eko.matchschedule.view

import com.example.eko.matchschedule.model.Team

interface MatchView {
    fun showMatchList(data :List<Team>)
}