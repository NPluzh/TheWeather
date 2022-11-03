package com.example.theweather.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.theweather.AppState
import java.lang.Thread.sleep


class MainViewModel(private val liveDataToObserve:MutableLiveData<Any> = MutableLiveData()):ViewModel(){

    fun getLiveData() = liveDataToObserve
    fun getWeather() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(AppState.Success(Any()))
        }.start()
    }
}