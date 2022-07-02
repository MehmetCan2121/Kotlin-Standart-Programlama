package com.mehmetcanmut.geneltekrar

import java.util.*

fun main(){
    val girdi=Scanner(System.`in`)
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
    if (secim == 1){
        val toplama=sayi1+sayi2
        println("Sonucunuz: $toplama")
    }else if (secim == 2){
        val cikarma=sayi1-sayi2
        println("Sonucunuz: $cikarma")
    }else if (secim == 3){
        val carpma=sayi1*sayi2
        println("Sonucunuz: $carpma")
    }else if (secim == 4){
        val bölme=sayi1/sayi2
        println("Sonucunuz: $bölme")
    }else{
        println("Lütfen 1 ile 4 arasında bir değer griniz.")}

}