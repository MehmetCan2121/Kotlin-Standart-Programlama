package com.mehmetcanmut.geneltekrar

fun main() {
    // 1 ile 5 arasını yazdırma
    for(i in 1..5){
        println(i)
    }
    //10 ile 20 arasında 5 er artışla yazdırma
    var baslangic:Int =10
    for (i in baslangic..20 step 5){
        println(i)
    }
    //1 ile 10 arasındaki tek sayıları bulam
    for (c in 1 until 10 step 2){
        println("c $c")
    }

    var sayac:Int = 0
    while(sayac<5){
        println("sayac: $sayac")
        sayac += 1
    }
}