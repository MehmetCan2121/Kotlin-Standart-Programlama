package com.mehmetcanmut.geneltekrar

import java.util.*

fun main() {
    //For ile örnek
    val isim =Scanner(System.`in`)
    print("İsim Giriniz:")
    val ad =isim.nextLine()
    print("Tekrar Sayısı Giriniz:")
    val sayi =isim.nextInt()
    for (i in 1..sayi ){
        println("$i. $ad")
    }
    println(" ")
    //While ile Örnek
    var i =1
    print("İşlenecek veri Miktarını giriniz:")
    val sayi2=isim.nextInt()
    while (i<=sayi2){
        println("$i. veri")
        i+=1
    }
}