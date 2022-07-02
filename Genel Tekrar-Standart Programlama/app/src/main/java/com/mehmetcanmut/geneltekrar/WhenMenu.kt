package com.mehmetcanmut.geneltekrar

import java.util.*

fun main(){
    val girdi=Scanner(System.`in`)
    println("Sil (1)")
    println("Ekle (2)")

    val secim=girdi.nextInt()

    when(secim){
        1-> println("Veri Silindi")
        2-> println("Veri Eklendi")
        else -> println("Böyle bir işlem yok")
    }
}