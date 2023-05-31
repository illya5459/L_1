package com.example.labka1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DogData(
    val name: String,
    val age: Int,
    val color: String,
    val sex: String,
    val weight: Int,
    val description: String
): Parcelable

val dogs = arrayOf(
    DogData("Cooper", 2, "Чорний", "Самець", 12, "Вірний помічник"),
    DogData("Charlie", 4, "Білий", "Самка", 23, "Дружелюбна"),
    DogData("Duke", 5, "Коричневий", "Самець", 18, "Жвавий гравець"),
)