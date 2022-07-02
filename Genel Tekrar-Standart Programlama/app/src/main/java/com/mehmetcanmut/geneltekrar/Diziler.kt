package com.mehmetcanmut.geneltekrar

fun main() {

    //Tanımlamalar

    val dizi1 = Array<Int>(5){0}    //Uzunluğu 5 olan boş bir dizi

    val meyveler= arrayOf<String>("Elma","Armut","Muz","Kivi","Karpuz")

    //Verilere erişim
    val str1 =meyveler[2]
    println(str1)

    //Veri Üzerinde işlem Yapma
    meyveler[1] = "Yeni Armut"
    println(meyveler.contentToString())

    meyveler.set(3,"Yeni Kivi")
    println(meyveler.contentToString())

    println(meyveler.isEmpty()) //Dizinin boşmu dolumu olduğunu kontrol eder.
    println(meyveler.count())  // Dizinin boyutunu verir
    println(meyveler.first())  // Dizideki ilk elemanı verir
    println(meyveler.last())   //Dizideki son elamanı verir.
    println(meyveler.indexOf("Yeni Kivi")) // girdiğimiz değerin index numarasını verir
    println(meyveler.contains("Muz")) //Bu dizide muz varmı yokmu kontrol eder
    println(meyveler.sort())  //a dan z ye sıralar
    println(meyveler.contentToString())

}