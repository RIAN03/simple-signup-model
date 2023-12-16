package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signup.databinding.ActivityDisplayBinding

class showw : AppCompatActivity() {
    lateinit var binding: ActivityDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.show.setText("Welcome sir,\nyou have successfully logged in\n${intent.getStringExtra("ee")}" +
                "\n${intent.getStringExtra("pp")}")
    }
}