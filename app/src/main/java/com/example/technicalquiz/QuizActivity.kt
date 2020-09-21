package com.example.technicalquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz.*
import kotlin.math.log

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionList = Constants.getQuestions()
        Log.d("!!!", "${questionList.size}")

        val currentPosition = 1
        val question: Question? = questionList[currentPosition - 1]

        progressBar.progress = currentPosition
        text_progress.text = "$currentPosition" + "/" + progressBar.max
        if (question != null) {
            question.image?.let { quiz_showcase_image.setImageResource(it) }
        }
        question_quiz.text = question!!.question
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text = question.optionTwo
        option_four.text = question.optionThree

    }
}