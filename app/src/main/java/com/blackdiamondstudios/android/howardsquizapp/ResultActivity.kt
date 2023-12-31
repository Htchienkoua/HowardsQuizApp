package com.blackdiamondstudios.android.howardsquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_result1)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val EndButton : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
         val totQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $correctAnswers out of $totQuestions "

        EndButton.setOnClickListener{
            startActivity(Intent(this, MainActivity ::class.java) )


        }
    }
}