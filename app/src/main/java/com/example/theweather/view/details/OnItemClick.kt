package com.gb.k_2135_2136_2.view.details

import com.example.theweather.domain.Weather

fun interface OnItemClick {
    fun onItemClick(weather: Weather)
}