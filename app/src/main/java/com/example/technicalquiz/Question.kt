package com.example.technicalquiz

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Question (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "question") val question: String,
    @ColumnInfo(name = "optionOne")val optionOne: String,
    @ColumnInfo(name = "optionTwo")val optionTwo: String,
    @ColumnInfo(name = "optionThree")val optionThree: String,
    @ColumnInfo(name = "optionFour")val optionFour: String,
    @ColumnInfo(name = "correctAnswer")val correctAnswer: Int
)