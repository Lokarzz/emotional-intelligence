package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName


data class ResultResponse (

  @SerializedName("levels" ) var levels : ArrayList<Levels> = arrayListOf()

)