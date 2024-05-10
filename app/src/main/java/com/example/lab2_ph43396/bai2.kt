package com.example.lab2_ph43396

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    print("Nhập tháng: ")
    var thang: Int = scanner.nextInt();

    when (thang) {
        1, 2, 3 -> println("Tháng $thang thuộc quý I")
        4, 5, 6 -> println("Tháng $thang thuộc quý II")
        7, 8, 9 -> println("Tháng $thang thuộc quý III")
        10, 11, 12 -> println("Tháng $thang thuộc quý IV")
        else -> println("Dữ liệu không hợp lệ")
    }
}