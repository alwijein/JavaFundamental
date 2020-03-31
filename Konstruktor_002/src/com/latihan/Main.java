/*

Nama    : Alwi Jaya
Stambuk : 13020180226
Kelas   : A6

*/

//memberitahu packege dari file yang tersimpan
package com.latihan;

//mengambil library dari java.util untuk library Scanner
import java.util.Scanner;


//pembuatan class dengan konstruktor
class Mahasiswa{
    String nama,STB,jurusan;
    double IPK;
    int umur;
//pembuatan konstruktor dengan parameter
    Mahasiswa(String inputNama,String inputSTB,String inputJurusan,double inputIPK,int inputUmur){
        nama = inputNama;
        STB = inputSTB;
        jurusan = inputJurusan;
        IPK = inputIPK;
        umur = inputUmur;
    }
}
//pembuatan class utama yang akan pertama kali dieksekusi
public class Main{
    public static void main(String[] args) {
        //instansiasi (pembuatan objeck menerima inputan dari keyboard)
        Scanner inputKey = new Scanner(System.in);
        
        //pendeklarasian variabel
            String nama,STB,jurusan;
            double IPK;
            int umur;

        //menampilkan serta memasukkan hasil inputan keyboard ke variabel yang dituju
        System.out.print("Masukkan Nama Anda: ");
        nama = inputKey.nextLine();
        System.out.print("Masukkan STB Anda: ");
        STB = inputKey.nextLine();
        System.out.print("Masukkan Jurusan Anda: ");
        jurusan = inputKey.nextLine();
        System.out.print("Masukkan IPK Anda: ");
        IPK = inputKey.nextDouble();
        System.out.print("Masukkan Umur Anda: ");
        umur = inputKey.nextInt();

        //instansiasi (pembuatan objeck dari klass konstruktor)
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, STB, jurusan, IPK, umur);
        
        //menampilkan text beserta isi dari variabel yang berasal dari objeck konstruktor
        System.out.println("===================");
        System.out.format("Nama   : %s %n",mahasiswa1.nama);
        System.out.println("===================");
        System.out.format("STB    : %s %n",mahasiswa1.STB);
        System.out.println("===================");
        System.out.format("Jurusan: %s %n",mahasiswa1.jurusan);
        System.out.println("===================");
        System.out.format("IPK    : %f %n",mahasiswa1.IPK);
        System.out.println("===================");
        System.out.format("Umur   : %d %n",mahasiswa1.umur);
        System.out.println("===================");
    }
}