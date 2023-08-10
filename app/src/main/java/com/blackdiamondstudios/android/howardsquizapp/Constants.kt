package com.blackdiamondstudios.android.howardsquizapp

object Constants {
    //storage of the various constants like the username , answers etc

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total questions"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // we need to fill now the question list

        //question 1
        val que1 = Question(
            1,"Where was this my Bachelors' defense picture taken ?",
            R.drawable.dhlone,
            "My Room",
            "Carrefour Meec",
            "UPAC Etoa-meki",
            "UY1 Ngoa-ekelle",
        3
        )
        questionsList.add(que1)

        //question 2
        val que2 = Question(
            2,"Location of our first outing picture taken?",
            R.drawable.dhltwo,
            "Quartier Fouda",
            "Carrefour Meec",
            "UPAC Etoa-meki",
            "Chapelle Obili",
            1
        )
        questionsList.add(que2)

        //question 3
        val que3 = Question(
            3,"Was this area(choose location) comfortable enough for you?",
            R.drawable.dhlthree,
            "Quartier Fouda",
            "Dagobert Street",
            "My Room",
            "Chapelle Obili",
            3
        )
        questionsList.add(que3)

        //question 4
        val que4 = Question(
            4,"Was the swimming pool(choose location) here cool?",
            R.drawable.dhlfour,
            "Nsimeyong",
            "Club Camtel Nlongkak",
            "UPAC Etoa-meki",
            "Chapelle Obili",
            2
        )
        questionsList.add(que4)

        //question 5
        val que5 = Question(
            5,"Wow, what a warm feeling this picture gives...where was it taken ?",
            R.drawable.dhlfive,
            "Quartier Fouda",
            "Dagobert Street",
            "My Room",
            "Chapelle Obili",
            3
        )
        questionsList.add(que5)

        //question 6
        val que6 = Question(
            6,"For me, its your smile in this picture at (choose location) which is unforgettable?",
            R.drawable.dhlsix,
            "Quartier Fouda",
            "Le VISA plus essos",
            "My Room",
            "Ble d’or Nkolbisson",
            4
        )
        questionsList.add(que6)

        //question 7
        val que7 = Question(
            7,"So beautiful and cute right? Where was this place again eh?",
            R.drawable.dhlseven,
            "Pizza Nkolbisson",
            "Le VISA plus essos",
            "My Room",
            "Ble d’or Nkolbisson",
            1
        )
        questionsList.add(que7)

        //question 8
        val que8 = Question(
            8,"Me and My very own paddy for life :) at (choose location please) ?",
            R.drawable.dhleight,
            "Quartier Fouda",
            "Le Printemps Plus essos",
            "Carrefour Meec",
            "Ble d’or Nkolbisson",
            3
        )
        questionsList.add(que8)

        //question 9
        val que9 = Question(
            9,"Where was this picture taken my love?",
            R.drawable.dhlnine,
            "Dagobert",
            "Carrefour Meec",
            "My Room",
            "Quartier Fouda",
            1
        )
        questionsList.add(que9)

        //question 10
        val que10 = Question(
            10,"You remember that we took this picture at (choose location) after I covered you from someone right?",
            R.drawable.dhlten,
            "Carrefour Onana",
            "Dagobert",
            "My Room",
            "Ble d’or Nkolbisson",
            1
        )
        questionsList.add(que10)

        //question 6
        val que11 = Question(
            11,"I guess one of the most stressful place(location) and period of your life,Sweetheart?",
            R.drawable.dhleleven,
            "Quartier Fouda",
            "Your Parlour",
            "My Room",
            "Ble d’or Nkolbisson",
            2
        )
        questionsList.add(que11)

        //question 6
        val que12 = Question(
            12,"First seperation for greater glory...Please which place was this?",
            R.drawable.dhltvelve,
            "Club Camtel Nlongkak",
            "Le VISA plus essos",
            "Dagobert",
            "Airport Nsimalen",
            4
        )
        questionsList.add(que12)

        //question 13
        val que13 = Question(
            13,"You wanted to dodge me when I saw you coming inside here(give location) right?",
            R.drawable.dhlthirteen,
            "Club Camtel Nlongkak",
            "Le VISA plus essos",
            "Dagobert",
            "Airport Nsimalen",
            4
        )
        questionsList.add(que13)

        //question 14
        val que14 = Question(
            14,"On the way to go 'destress' ourselves  ?",
            R.drawable.dhlfourteen,
            "Nsimeyong",
            "Le VISA plus essos",
            "Dagobert",
            "In town somewhere...",
            4
        )
        questionsList.add(que14)

        //question 15
        val que15 = Question(
            15,"At least from time to time we could relax at this place right?",
            R.drawable.dhlfifteen ,
            "Nsimeyong",
            "Le VISA plus essos",
            "le printemps Essos",
            "In town somewhere...",
            2
        )
        questionsList.add(que15)

        //question 16
        val que16 = Question(
            16,"Love is located from the heart as this picture shows right?",
            R.drawable.dhlsixteen,
            "My room",
            "Dagobert",
            "le printemps Essos",
            "Ble d'or Nkolbisson",
            1
        )
        questionsList.add(que16)

        //question 17
        val que17 = Question(
            17,"Do you remember the movie we watched this day, sweetheart?",
            R.drawable.dhlseventeen,
            "TOM & JERRY ",
            " The HOUSE OF GUCCI",
            "CATS EYES",
            "CINEMA HALL",
            2
        )
        questionsList.add(que17)

        //question 18
        val que18 = Question(
            18,"My first time to give you a piggy back ride in this place?",
            R.drawable.dhleighteen,
            "Quartier Fouda",
            "Le VISA plus essos",
            "le printemps Essos",
            "Chapelle Obili",
            4
        )
        questionsList.add(que18)

        //question 19
        val que19 = Question(
            19,"Go Team dhl!! Where was this picture taken ?",
            R.drawable.dhlnineteen,
            "Quartier Fouda",
            "Le VISA plus essos",
            "le printemps Essos",
            "Chapelle Obili",
            4
        )
        questionsList.add(que19)

        return questionsList


    }
}