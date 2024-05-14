package com.sunnyweather.android.logic.model

import android.health.connect.datatypes.units.Temperature
import com.google.gson.annotations.SerializedName

//实时天气
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}