package com.mehmetcanmut.geneltekrar

fun main() {

    var yas:Int = 23
    var ad:String ="Mehmet"

    if (yas>18){
        println("$ad Reşittir.")
    }else{
        println("$ad Reşit değilsinizz.")
    }

    var kullaniciAdi:String = "admin"
    var sifre:Int = 12345

    if (kullaniciAdi=="admin" && sifre==12345){
        println("Giriş Başarılı")
    }else if (kullaniciAdi=="admin" && sifre!= 12345){
        println("Şifre yanlış")
    }else if (kullaniciAdi!="admin" && sifre== 12345){
        println("Kullanıcı adı yanlış")
    }else{
        println("Kullanıcı adı ve şifre yanlış")}



}