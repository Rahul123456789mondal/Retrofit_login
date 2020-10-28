package com.example.retrofit_practice2.models

import com.google.gson.annotations.SerializedName

data class DefaultResponse(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message:String
)