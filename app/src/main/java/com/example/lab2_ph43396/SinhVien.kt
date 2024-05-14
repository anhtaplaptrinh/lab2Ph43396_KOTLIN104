package com.example.lab2_ph43396

class SinhVien {
    var tensv : String = ""
    var masv : String? = ""
    var diemtb : Double = 0.0
    var datotnghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tensv: String, masv: String, diemtb: Double, datotnghiep: Boolean?, tuoi: Int?){
        this.tensv = tensv
        this.masv = masv
        this.diemtb = diemtb
        this.datotnghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin (): String {

        var sDatotnghiep: String
        if (datotnghiep == null){
            sDatotnghiep = "Chưa có dự liệu"
        }else{
            if (datotnghiep!!){
                sDatotnghiep = "Đã tốt nghiệp"
            }else{
                sDatotnghiep = "Chưa tốt nghiệp"
            }
        }

        var sTuoi: String
        if (tuoi == null){
            sTuoi = "Chưa có dự liệu"
        }else{
            sTuoi = tuoi.toString()
        }

        return "Ten: $tensv, " +
                "masv: $masv, " +
                "diemTB: $diemtb, " +
                "trang thai: $sDatotnghiep, "  +
                "tuoi: $sTuoi"
    }

}