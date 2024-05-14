package com.example.lab2_ph43396


import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val scanner = Scanner(System.`in`)

    val sv1 = SinhVien("Trần Tuấn Anh", "PH43", 10.0, true, 20)
    val sv2 = SinhVien("Trần Văn Anh", "PH22", 9.0, false, 18)
    val sv3 = SinhVien("Trần Văn Hiếu", "PH46", 6.0, true, 19)


    var listSV = mutableListOf<SinhVien>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)


    do {
        println("------Chương trình quản lý Sinh viên bằng Kotlin-------")
        println("1. Xem danh sách sinh viên")
        println("2. Thêm sinh viên")
        println("3. Xóa sinh viên")
        println("4. Sửa sinh viên")
        println("5. Thoát")


        print("Nhập chức năng 1-5: ")
        var s = readLine();

        when (s!!.toInt()) {
            1 -> {
                println("Danh sách sinh viên!")
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
                        println("Xóa thành công!")
                        check = true
                        break
                    }
                }

                if (check == false)
                    println("Không tìm thấy sinh viên!")
            }

            4 -> {
                print("Nhập mã sinh viên cần sửa: ")
                var masv: String = scanner.nextLine();

                var check = false

                for (sv in listSV) {
                    if (sv.masv == masv) {
                        print("Nhập tên sinh viên: ")
                        sv.tensv = scanner.nextLine();
                        print("Nhập điểm trung bình: ")
                        sv.diemtb = scanner.nextDouble()
                        scanner.nextLine()

                        print("Trạng thái tốt nghiệp (true/false, bỏ trống để bỏ qua): ")
                        var trangThaiTotNghiep: String? = readLine()
                        if (trangThaiTotNghiep?.isNotEmpty() == true) {
                            sv.datotnghiep = trangThaiTotNghiep.toBoolean()
                        }

                        print("Nhap tuổi sinh viên (bỏ trống để bỏ qua): ")
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

            5 -> {
                break
            }

            else -> {
                println("Chức năng không tồn tại !!!")
            }
        }

        print("Bạn có muốn chọn tiếp không (y/n): ")
        var c = readLine();
        if (c == "n") break
    } while (true)


}

fun ttsv(): SinhVien {
    print("Nhập tên sinh viên: ")
    var tensv: String = scanner.nextLine();
    print("Nhập mã sinh viên: ")
    var masv: String = scanner.nextLine();
    print("Nhập điểm trung bình: ")
    var diemtb: Double = scanner.nextDouble()
    scanner.nextLine()

    var datotnghiep: Boolean? = null
    var tuoi: Int? = null

    print("Trạng thái tốt nghiệp (true/false, bỏ trống để bỏ qua): ")
    var trangThaiTotNghiep: String? = scanner.nextLine()
    if (trangThaiTotNghiep?.isNotEmpty() == true) {
        datotnghiep = trangThaiTotNghiep.toBoolean()
    }

    print("Nhập tuổi sinh viên (bỏ trống để bỏ qua): ")
    var tuoiInput: String? = scanner.nextLine()
    if (tuoiInput?.isNotEmpty() == true) {
        tuoi = tuoiInput.toInt()
    }

    var sv = SinhVien(tensv, masv, diemtb, datotnghiep, tuoi)

    return sv
}