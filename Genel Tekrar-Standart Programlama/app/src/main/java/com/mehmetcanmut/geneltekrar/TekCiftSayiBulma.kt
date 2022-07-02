package com.mehmetcanmut.geneltekrar

import java.util.*

fun main() {
    val girdi =Scanner(System.`in`)

    while (true){

        print("Sayı Giriniz:")
        var sayi=girdi.nextInt()
        val sonuc=sayi%2
        if (sonuc == 0){
            println("$sayi sayısı Çift bir sayıdır")
        }else{
            println("$sayi sayısı tek bir sayıdır")}

        println("Çıkamak için (1) - Devam etmek için diğer sayılar")
        val cikis =girdi.nextInt()
        if (cikis == 1){
            print("Çıkış Yapıldı")
            break
        }
    }

}