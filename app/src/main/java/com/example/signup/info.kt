package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import com.example.signup.databinding.ActivityInfoBinding
import com.example.signup.databinding.ActivityMainBinding

class info : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding

    companion object{
        const val emaa = "emailInfo"
        const val passs = "passwordInfo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ema = intent.getStringExtra("email")
        val pass = intent.getStringExtra("password")
        //val info = ema + pass
        //binding.info.setText("email id = ${ema}\n password = $pass")




        binding.infoButt.setOnClickListener {
            showww(pass!!,ema!!)

        }
        /*val intent = Intent(this, showw::class.java)
        intent.putExtra("ee",logId)
        intent.putExtra("pp",pass)
        startActivity(intent)*/
        /* if(logId == ema  && logPass == pass){
             val intent = Intent(this, showw::class.java)
             intent.putExtra("ee",ema)
             intent.putExtra("pp",pass)
             startActivity(intent)
         }
         else if (logId != ema || logPass != pass){
             print("You've enterred wrong id or password")
         }*/
    }

    private fun showww(pass:String,ema:String) {

        val logId = binding.infoText.editableText.toString()
        val logPass = binding.infoText2.editableText.toString()


        if(logId == ema  && logPass == pass){
            val intent = Intent(this, showw::class.java)
            intent.putExtra("ee",ema)
            intent.putExtra("pp",pass)
            startActivity(intent)
        }

    }
}