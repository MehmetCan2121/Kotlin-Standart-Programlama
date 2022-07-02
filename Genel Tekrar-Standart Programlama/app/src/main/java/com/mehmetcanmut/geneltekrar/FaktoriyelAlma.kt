package com.mehmetcanmut.geneltekrar

import java.util.*

fun main() {

    val girdi=Scanner(System.`in`)
    print("Faktoriyeli alıncak sayıyı giriniz.")
    var sayi=girdi.nextInt()

    var sonuc=1
    for(i in 1..sayi){
       sonuc=sonuc*i
    }
    println("Sonuc: $sonuc")

}