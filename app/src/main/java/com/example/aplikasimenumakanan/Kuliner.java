package com.example.aplikasimenumakanan;

public class Kuliner {

    private String nama, harga;
    private int imgGambar;

    public Kuliner(String nama, String harga, int imgGambar) {
        this.nama = nama;
        this.harga = harga;
        this.imgGambar = imgGambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getImgGambar() {
        return imgGambar;
    }

    public void setImgGambar(int imgGambar) {
        this.imgGambar = imgGambar;
    }
}
