package com.karlo.emotionalintelligence.repository.model.result

import com.google.gson.annotations.SerializedName
import com.karlo.emotionalintelligence.repository.model.result.Details


data class File (

    @SerializedName("url"         ) var url         : String?  = null,
    @SerializedName("details"     ) var details     : Details? = Details(),
    @SerializedName("fileName"    ) var fileName    : String?  = null,
    @SerializedName("contentType" ) var contentType : String?  = null

)