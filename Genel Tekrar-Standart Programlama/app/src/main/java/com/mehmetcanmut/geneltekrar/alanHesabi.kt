package com.mehmetcanmut.geneltekrar

import java.util.*

fun main(){

    val girdi =Scanner(System.`in`)
    println("Diktörgen Alanı -> 1")
    println("Çember Alanı -> 2")
    val secim=girdi.nextInt()
    println("Seçiminiz: $secim")
    if (secim==1){
        println("Kısa kenar giriniz:")
        val kisaKenar =girdi.nextInt()
        println("Uzun kenar giriniz:")
        val uzunKenar=girdi.nextInt()
        val alan=kisaKenar*uzunKenar
        println("Dikdörtgen Alanı : $alan")
    }else if (secim == 2){
        println("Yarı Çap Giriniz:")
        val yariCap=girdi.nextInt()
        val cemberAlani= 3.14*yariCap*yariCap
        println("Çember Alanı : $cemberAlani")

    }else
    {
        print("Lütfen seçiminizi 1 ve 2 sayılardan seçin")}
}