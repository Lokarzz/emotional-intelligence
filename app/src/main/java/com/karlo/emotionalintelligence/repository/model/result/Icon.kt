package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName


data class Icon (

  @SerializedName("file"        ) var file        : File?   = File(),
  @SerializedName("title"       ) var title       : String? = null,
  @SerializedName("description" ) var description : String? = null

)