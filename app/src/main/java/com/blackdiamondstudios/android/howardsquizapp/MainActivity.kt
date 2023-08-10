package com.blackdiamondstudios.android.howardsquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener() {

            if (etName.text.isEmpty() ){
                Toast.makeText(this, "Please enter your sweet name dear", Toast.LENGTH_LONG).show()

            }else {
                val intent = Intent(this, Quiz_Questions_activity::class.java)  //to move from one activity
            //to send over data from an activity to another
                intent.putExtra(Constants.USER_NAME, etName.text.toString() )
                // to another once a condition has being verified
                startActivity(intent)    // it moves the activity to the next screen but we need to close it afterwards
            finish()
            }
        }
    }
}