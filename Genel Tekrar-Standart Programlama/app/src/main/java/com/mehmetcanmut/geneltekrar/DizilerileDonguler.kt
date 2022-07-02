package com.mehmetcanmut.geneltekrar



fun main() {
    val meyveler= arrayOf<String>("Elma","Çilek","Muz","Karpuz","Kivi","Kiraz")
    for (meyve in  meyveler){
        println("Sonuc : $meyve")
    }
    //indeks numaralarına getirebiiriz.
    for ((indeks,meyve) in meyveler.withIndex()){
        println("Sonuc $indeks: $meyve")
    }
}