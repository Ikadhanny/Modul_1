package com.IkadhannyYudyanPratama.Modul1.Object;

public class Mahasiswa {
    String nama;
    int nim;

    //Constructor 1 //tanpa parameter
    public Mahasiswa(){}

    //Constructor 2 //2 parameter
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
