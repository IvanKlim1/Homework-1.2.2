package ru.netology

import kotlin.random.Random.Default.nextInt

fun main() {
    val end1="Человеку"
    val end2="Людям"
    val likes = nextInt(0,100 ) // можно указать любой диапазон
    val like=likes%10
    if (likes ==11 ) {
        println("Понравилось: $likes $end2")
    } else  if  (like ==1 ) {
       println("Понравилось: $likes $end1")
    } else {
        println("Понравилось: $likes $end2")
    }
}