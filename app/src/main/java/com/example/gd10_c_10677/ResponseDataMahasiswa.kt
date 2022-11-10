package com.example.gd10_c_10677

import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("status") val stt:String,
    val totalData: Int,
    val data:List<MahasiswaData>
)
