package com.mehmetcanmut.geneltekrar

fun main() {
    // Break komutu döngüden çıkmamızı sağlar
    for (i in 1..5){
        if (i == 4){
            break
        }
        println("Döngü 1 : $i")
    }
    //Contiune komutu istediğimiz degeri almamamızı sağlar
    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 2 : $i")
    }
}