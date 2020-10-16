/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10119005.latihan4;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Menambahkan jumlah Kambing 
 */
public class Kambing {

   public void tambahKambing() {
       //Deklarasi variabel lokal
       int jumlahKambing = 0;
   
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing telah di tambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
