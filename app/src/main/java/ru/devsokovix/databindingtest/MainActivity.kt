package ru.devsokovix.databindingtest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import ru.devsokovix.databindingtest.databinding.ActivityMainBinding
import ru.devsokovix.databindingtest.databinding.ActivityMainBindingImpl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.cash = 10
        binding.notifyPropertyChanged(BR.cash)
    }
}