package com.example.signup

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.butt.setOnClickListener{
            infoUser()
        }

    }

    private fun infoUser() {
        val emailInfo = binding.text.editableText.toString()
        val passInfo = binding.text2.editableText.toString()

        val intent=Intent(this,info::class.java)
        intent.putExtra("email",emailInfo)
        intent.putExtra("password",passInfo)

        startActivity(intent)
    }
}