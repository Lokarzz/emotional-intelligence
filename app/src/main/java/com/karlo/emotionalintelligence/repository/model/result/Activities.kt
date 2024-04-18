package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName


data class Activities (

  @SerializedName("id"           ) var id           : String?     = null,
  @SerializedName("challengeId"  ) var challengeId  : String?     = null,
  @SerializedName("type"         ) var type         : String?     = null,
  @SerializedName("title"        ) var title        : String?     = null,
  @SerializedName("titleB"       ) var titleB       : String?     = null,
  @SerializedName("description"  ) var description  : String?     = null,
  @SerializedName("descriptionB" ) var descriptionB : String?     = null,
  @SerializedName("state"        ) var state        : String?     = null,
  @SerializedName("icon"         ) var icon         : Icon?       = Icon(),
  @SerializedName("lockedIcon"   ) var lockedIcon   : Icon? = Icon()

)