package com.example.technicalquiz

object Constants {

    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>() // Dekalarerar en variable som blir en lista som ska innehålla alla question

        val que1 = Question(
            1, "You can create an emulator to simulate the configuration of a particular type of Android device using a tool like ___.?",
           "Theme Editor", "Android SDK Manager", "AVD Manager", "Virtual Editor", 3
        )

        val que2 = Question(
            7, "Under which license is Kotlin available?",
            "Kotlin is a closed source, commercial software", "GPL", "MIT","Apache 2", 4
        )

        val que3 = Question(
            2, "What parameter specifies the Android API level that Gradle should use to compile your app?",
            "minSdkVersion", "compileSdkVersion", "targetSdkVersion","testSdkVersion", 2
        )

        val que4 = Question(
            3, "What phrase means that the compiler validates types while compiling?",
          "Type safety", "Data binding", "Type validation","Wrong text", 1
        )

        val que5 = Question(
            4, "___ is a way to restrict direct access to some of an object’s fields.",
            "Score", "LiveData", "Encapsulation","GameViewModal", 3
        )

        val que6 = Question(
            8, "What about Java interoperability?",
            "Kotlin provides a compatibility layer for Java interoperability which comes with some cost at runtime", "Kotlin can easily call Java code while Java cannot access code written i kotlin", "Kotlin can easy call Java code and vice versa","While Kotlin runs on JBM, it cannot interpolate with Java", 3
        )

        val que7 = Question(
            5, "Which of the following is not true about fragments?",
            "A fragment has its own lifecycle and receives its own input events.", "It is not possible to remove a fragment while the activity is running.", "A fragment is defined in a Kotlin class.","A fragment's UI is defined in an XML layout file.", 2
        )

        val que8 = Question(
            6, "What does the !! operator do?",
            "It's modulo operator in Kotlin, similar to Java's %", "It converts any value to a non-null type and throws a exception if the value is in fact null", "It compares two values fo identity rather than equality","It returns the left-hand operand if the operand is not null; otherwise it returns the right hand operand", 2
        )


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)


        return questionsList
    }
}