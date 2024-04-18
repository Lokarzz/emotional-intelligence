package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName
import com.karlo.emotionalintelligence.repository.model.result.File


data class LockedIcon (

    @SerializedName("file"        ) var file        : File?   = File(),
    @SerializedName("title"       ) var title       : String? = null,
    @SerializedName("description" ) var description : String? = null

)