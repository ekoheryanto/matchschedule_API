package com.example.eko.matchschedule.model

import com.google.gson.annotations.SerializedName

data class Team (
    @SerializedName("idLeague")
    var idLeague: String? = null,

    @SerializedName("strDate")
    var matchdate: String? = null,

    @SerializedName("strTeam")
    var teamName: String? = null
    )

