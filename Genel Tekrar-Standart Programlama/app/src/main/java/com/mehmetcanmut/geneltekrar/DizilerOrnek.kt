package com.mehmetcanmut.geneltekrar

import java.util.*

fun main() {
    val isimler = Array<String>(5){""}
    val girdi = Scanner(System.`in`)
    for (i in 1..isimler.count()){
        print("$i. isim giriniz:")
        var isim=girdi.next()
       isimler[i-1] = isim

    }

    for ((indeks,isim) in isimler.withIndex()){
        println("${indeks+1}. isim :$isim ")
    }
}