package com.mehmetcanmut.geneltekrar

import java.util.*

fun main(){
    val girdi= Scanner(System.`in`)
    println("BİR SEÇİM YAPINIZ")
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val secim=girdi.nextInt()

    println("Birinci sayıyı Giriniz:")
    val sayi1=girdi.nextInt()

    println("İkinci sayiyi Giriniz:")
    val sayi2=girdi.nextInt()

    when( secim ){
        1 -> print("Toplama işlemi sonucunuz: ${sayi1+sayi2}")
        2 -> print("TÇıkarma işlemi sonucunuz: ${sayi1-sayi2}")
        3 -> print("Çarpma işlemi sonucunuz: ${sayi1*sayi2}")
        4 -> print("Bölme işlemi sonucunuz: ${sayi1/sayi2}")
        else -> print("Böyle bir işlem yok")
    }

}