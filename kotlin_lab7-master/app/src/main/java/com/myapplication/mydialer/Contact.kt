package com.myapplication.mydialer

import com.google.gson.annotations.SerializedName

data class Contact(
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("type")
    val type: String
)
