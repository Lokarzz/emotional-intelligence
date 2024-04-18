package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName
import com.karlo.emotionalintelligence.repository.model.result.Activities


data class Levels (

  @SerializedName("level"       ) var level       : String?               = null,
  @SerializedName("title"       ) var title       : String?               = null,
  @SerializedName("description" ) var description : String?               = null,
  @SerializedName("state"       ) var state       : String?               = null,
  @SerializedName("activities"  ) var activities  : ArrayList<Activities> = arrayListOf()

)