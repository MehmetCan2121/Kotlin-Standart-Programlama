package com.mehmetcanmut.geneltekrar

import android.support.v4.app.INotificationSideChannel

fun main() {
    //3 ile 6 arasındaki sayıları ekrana yazdırma for ve while ile.
    for(i in 3..6){
        println("Döngü : $i")
    }

    var sayac:Int=3
    while (sayac<=6){
        println("Döngü2 : $sayac")
        sayac+=1
    }

    // 0 ile 8 arasındaki sayıları 2 şer arttırarak ekrana yazdırma.
    for(i in 0..8 step 2){
        println("Döngü3 : $i")
    }

    var sayac1:Int = 0
    while (sayac1<=8){
        println("Döngü4 : $sayac1")
        sayac1+=2
    }
    // 15 ten 5 azaltarak sıfıra kadar olan sayıları ekrana yazdırma
    for (i in 15 downTo 0 step 5){
        println("Döngü5 $i")
    }

    var sayac3:Int =15
    while (sayac3 > -1){
        println("Döngü6 : $sayac3")
        sayac3 -=5
    }
}