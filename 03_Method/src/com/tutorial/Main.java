package com.tutorial;

class Mahasiswa{
       // Data Member
    String Nama;
    String Nim;
    String Prodi;

    // construktor dengan parameter
    Mahasiswa(String Nama, String Nim, String Prodi){
      this.Nama = Nama;
      this.Nim  = Nim;
      this.Prodi = Prodi;
    }

    // method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.Nama) ;
        System.out.println("Nim : " + this.Nim) ;
        System.out.println("Prodi : " + this.Prodi) ;

    }

    // method tanpa return dengan parameter
     void setNama(String getNama) {
        this.Nama = getNama;
    }

    // method dengan return tanpa parameter
    String getnama() {
        return this.nama;
    }
     // method dengan return dan parameter
     String sayHi("Aku bisa menjadi") + this.nama;
    }

public class Main {

    public static void main (String[] args) {
        // instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("Iqbal HUda", "22241042", "PTI");

        mhs1.show();
        mhs1.setNama("Huda");
        mhs1.show();
        System.out.println(mhs1.getNama());

        String pesan = mhs1.sayHi("hi");
        System.out.println(pesan);

    }

}

   





    

    


        