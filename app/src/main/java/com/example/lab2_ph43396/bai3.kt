package com.example.lab2_ph43396


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    do {
        print("Nhập năm: ")
        var nam = scanner.nextInt();
        while (nam == null || nam <=0){
            print("Nhập lại: ")
            nam = scanner.nextInt();
        }

        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0){
            println("năm $nam là năm nhuận")
        }else{
            println("năm $nam không phải là năm nhuận")
        }

        println("Bạn có muốn nhập tiếp không? (y/n)")
        var s = readLine()
        if (s.equals("n"))
            break
    }while (true)

}