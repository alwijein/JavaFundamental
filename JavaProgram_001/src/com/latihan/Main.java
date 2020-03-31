package com.latihan;


class Mahasiswa{
    String nama,NIM,jurusan;
    double IPK;
    int umur;
}

public class Main{
    public static void main(String[] args) {
        //instansiasi (pembuatan objek)
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "AlwiJein";
        mahasiswa1.NIM = "13020180226";
        mahasiswa1.jurusan = "Teknkik informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 21;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        
    }
}