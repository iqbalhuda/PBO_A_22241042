package com.tutorial;

// class tanpa konstruktor
class Polos {
    String dataString;
    int dataInteger;   
}

// class dengan konstruktor
class Mahasiswa{
    String nama;
    String nim;
    String prodi;

    // Membuat konstruktor tanpa parameter
    // Mahasiswa() {
    //     System.out.println("Ini adalah konstruktor");
    // }
 
    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi) {
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;
    }
}
public class Main {
    public static void main(String[] args) {
    
        // instansiasi objek dari class Polos 
        // Polos pls = new Polos ();

        // // isi ciri pada objek pls 
        // pls.dataString = "POLOS";
        // pls.dataInteger = 10;

        // // cetak data
        // System.out.println("Isi Data String : " + pls.dataString);
        // System.out.println("Isi Data Integer :" + pls.dataInteger);

        new Mahasiswa("iqbal", "22241042", "PTI");
    }
}