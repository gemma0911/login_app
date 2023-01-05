package com.example.app.login.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text_view_email : TextView = findViewById<TextView>(R.id.editEmail)
        val text_view_pass : TextView = findViewById<TextView>(R.id.editpasword)

        val btn_click : Button = findViewById<Button>(R.id.btnLogin)

        var onClick = false

        text_view_email.setOnClickListener {
            if(onClick==false){
                text_view_email.setBackgroundResource(R.drawable.change_edit_text)
                text_view_pass.setBackgroundResource(R.drawable.style_edit_view)
                onClick=true
            }
        }
        text_view_pass.setOnClickListener {
            if(onClick==true){
                text_view_pass.setBackgroundResource(R.drawable.change_edit_text)
                text_view_email.setBackgroundResource(R.drawable.style_edit_view)
                onClick=false
            }
        }

    }

}