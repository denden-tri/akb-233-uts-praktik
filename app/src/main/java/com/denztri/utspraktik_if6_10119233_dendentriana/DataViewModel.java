package com.denztri.utspraktik_if6_10119233_dendentriana;

import androidx.lifecycle.ViewModel;

/**
 *  Tanggal Pengerjaan  : 03-06-2022
 *  NIM                 : 10119233
 *  Nama                : Denden Triana
 *  Kelas               : IF-6
 *
 */

public class DataViewModel extends ViewModel {
    private String jenisTest = "Rapid Antigen";
    private String tangglKonfir = "8 September 2021";
    private String nik = "7323456778941234";
    private String nama = "Mohammad Reksa";
    private String tanggalLahir = "2 November 1993";
    private String jenisKelamin = "laki - Laki";
    private String hubungan = "Orang Tua";

    public String getJenisTest() {
        return jenisTest;
    }

    public void setJenisTest(String jenisTest) {
        this.jenisTest = jenisTest;
    }

    public String getTangglKonfir() {
        return tangglKonfir;
    }

    public void setTangglKonfir(String tangglKonfir) {
        this.tangglKonfir = tangglKonfir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }
}
