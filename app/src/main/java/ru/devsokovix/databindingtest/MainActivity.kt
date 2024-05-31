package ru.devsokovix.databindingtest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import ru.devsokovix.databindingtest.Unit
import ru.devsokovix.databindingtest.databinding.ActivityMainBinding
import ru.devsokovix.databindingtest.databinding.ActivityMainBindingImpl
import ru.devsokovix.databindingtest.databinding.SampleBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: SampleBinding = DataBindingUtil.setContentView(this, R.layout.sample)
        binding.unit = Unit(5,6,12, 52)
    }
}