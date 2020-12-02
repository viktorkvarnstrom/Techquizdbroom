package com.example.technicalquiz

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert
    fun insert(item: ArrayList<Question>?)

    @Delete
    fun delete(item: Question)

    @Query("SELECT * FROM Question")
    fun getAll() : List<Question>
}