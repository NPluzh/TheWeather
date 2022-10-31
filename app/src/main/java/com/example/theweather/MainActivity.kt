package com.example.theweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.theweather.databinding.ActivityMainBinding
import com.example.theweather.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding // экземпляр binding класса

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
    }
}