package com.example.technicalquiz

object Constants {

    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>() // Dekalarerar en variable som blir en lista som ska innehålla alla question

        val que1 = Question(
            1, "You can create an emulator to simulate the configuration of a particular type of Android device using a tool like ___.?",
            R.drawable.question_showcase, "Theme Editor", "Android SDK Manager", "AVD Manager", "Virtual Editor", 3
        )

        val que2 = Question(
            2, "What parameter specifies the Android API level that Gradle should use to compile your app?",
            R.drawable.show_case, "minSdkVersion", "compileSdkVersion", "targetSdkVersion","testSdkVersion", 2
        )

        val que3 = Question(
            3, "What phrase means that the compiler validates types while compiling?",
            R.drawable.show_case,"Type safety", "Data binding", "Type validation","Wrong text", 1
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList
    }
}