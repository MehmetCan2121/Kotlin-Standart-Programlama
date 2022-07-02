package com.mehmetcanmut.geneltekrar

import java.util.*

fun main() {
    val dersler= Array<String>(5){""}
    val notlar =Array<Int>(5){0}
    val girdi=Scanner(System.`in`)
    for (i in 1..dersler.count()){

        println("$i. Dersi Giriniz:")
        var ders =girdi.next()
        dersler[i-1] = ders

        println("$i. Notu Giriniz:")
        var not=girdi.nextInt()
        notlar[i-1] = not

    }
    var toplam=0
    for (i in 0 until notlar.count()){
        println("${dersler[i]} : ${notlar[i]}")
        toplam=toplam+notlar[i]
    }
    val ortalama=toplam/notlar.count()
    if (toplam>50){
        println("Ortalamanız : $ortalama GEÇTİNİZ.")
    }else{
        println("Ortalamanız : $ortalama KALDINIZZ.")
    }



}