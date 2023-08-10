package com.blackdiamondstudios.android.howardsquizapp

data class Question(
    //datatypes of the questionnaire model
    val id: Int,
    val questions: String,
    val image: Int,
//different answer options
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
//the right answer to chose
    val correctAnswer: Int
)
