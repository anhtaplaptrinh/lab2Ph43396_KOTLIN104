package com.example.lab2_ph43396


import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val scanner = Scanner(System.`in`)

    val sv1 = SinhVien("Trần Tuấn Anh", "PH43396", 10.0, true, 20)
    val sv2 = SinhVien("Trần Văn Anh", "PH43396", 9.0, false, 18)

    var listSV = mutableListOf<SinhVien>()
    listSV.add(sv1)
    listSV.add(sv2)

    do {
        println("------Chuc nang-------")
        println("1. Xem danh sach sinh vien")
        println("2. Them sinh vien")
        println("3. Xoa sinh vien")
        println("4. Sửa sinh vien")

        print("Nhập chức năng: ")
        var s = readLine();

        when (s!!.toInt()) {
            1 -> {
                println("Danh sách sinh vien!")
                for (sv in listSV) {
                    println(sv.getThongTin())
                }
            }

            2 -> {
                listSV.add(ttsv())
                println("Thêm thành công!")
            }

            3 -> {
                print("Nhap ma sinh vien can xoa: ")
                var masv: String = scanner.nextLine();

                var check = false

                for (sv in listSV) {
                    if (sv.masv == masv) {
                        listSV.remove(sv)
                        println("Xoa thanh cong!")
                        check = true
                        break
                    }
                }

                if (check == false)
                    println("Không tìm thấy sinh viên!")
            }

            4 -> {
                print("Nhap ma sinh vien can sua: ")
                var masv: String = scanner.nextLine();

                var check = false

                for (sv in listSV) {
                    if (sv.masv == masv) {
                        print("Nhap ten sinh vien: ")
                        sv.tensv = scanner.nextLine();
                        print("Nhap diem trung binh: ")
                        sv.diemtb = scanner.nextDouble()
                        scanner.nextLine()

                        print("Trạng thái tốt nghiệp (true/false, bỏ trống để bỏ qua): ")
                        var trangThaiTotNghiep: String? = readLine()
                        if (trangThaiTotNghiep?.isNotEmpty() == true) {
                            sv.datotnghiep = trangThaiTotNghiep.toBoolean()
                        }

                        print("Nhap tuoi sinh vien (bo trong de bo qua): ")
                        var tuoiInput: String? = readLine()
                        if (tuoiInput?.isNotEmpty() == true) {
                            sv.tuoi = tuoiInput.toInt()
                        }

                        println("Sửa thành công!")

                        check = true

                        break
                    }
                }

                if (check == false)
                    println("Không tìm thấy sinh viên!")
            }

            else -> {
                println("Chức năng không hợp lệ!")
            }
        }

        print("Bạn có muốn chọn tiếp không (y/n): ")
        var c = readLine();
        if (c == "n") break
    } while (true)


}

fun ttsv(): SinhVien {
    print("Nhap ten sinh vien: ")
    var tensv: String = scanner.nextLine();
    print("Nhap ma sinh vien: ")
    var masv: String = scanner.nextLine();
    print("Nhap diem trung binh: ")
    var diemtb: Double = scanner.nextDouble()
    scanner.nextLine()

    var datotnghiep: Boolean? = null
    var tuoi: Int? = null

    print("Trạng thái tốt nghiệp (true/false, bỏ trống để bỏ qua): ")
    var trangThaiTotNghiep: String? = scanner.nextLine()
    if (trangThaiTotNghiep?.isNotEmpty() == true) {
        datotnghiep = trangThaiTotNghiep.toBoolean()
    }

    print("Nhap tuoi sinh vien (bo trong de bo qua): ")
    var tuoiInput: String? = scanner.nextLine()
    if (tuoiInput?.isNotEmpty() == true) {
        tuoi = tuoiInput.toInt()
    }

    var sv = SinhVien(tensv, masv, diemtb, datotnghiep, tuoi)

    return sv
}