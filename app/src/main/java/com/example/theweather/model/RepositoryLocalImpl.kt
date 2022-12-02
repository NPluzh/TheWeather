package com.gb.k_2135_2136_2.model


import com.example.theweather.domain.Weather
import com.example.theweather.domain.getRussianCities
import com.example.theweather.domain.getWorldCities

class RepositoryLocalImpl : RepositoryMany,RepositoryOne {
    override fun getListWeather(location: Location): List<Weather> {
        return when (location) {
            Location.Russian -> {
                getRussianCities()
            }
            Location.World -> {
                getWorldCities()
            }
        }
    }

    override fun getWeather(lat: Double, lon: Double): Weather {
        return Weather()
    }
}