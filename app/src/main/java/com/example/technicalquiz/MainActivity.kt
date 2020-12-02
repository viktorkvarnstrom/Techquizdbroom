package com.example.technicalquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    private lateinit var job : Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private lateinit var db : AppDatabase
   // private var mQuestionsList: ArrayList<Question>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        job = Job()

        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "technical-quiz")
            .fallbackToDestructiveMigration()
            .build()

        val list = loadAllItems()

//        mQuestionsList = Constants.getQuestions()
//        saveItem(mQuestionsList)

        launch {
            val questionList = list.await()
            for( question in questionList) {
                Log.d("!!!", "Question: ${question.question}")
            }
        }

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        startActivity_btn.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

//    fun saveItem(item: ArrayList<Question>?) {
//        launch(Dispatchers.IO) {
//            db.QuestionDao().insert(item)
//        }
//    }

    fun loadAllItems() : Deferred<List<Question>> =
        async(Dispatchers.IO) {
            db.QuestionDao().getAll()
        }
}