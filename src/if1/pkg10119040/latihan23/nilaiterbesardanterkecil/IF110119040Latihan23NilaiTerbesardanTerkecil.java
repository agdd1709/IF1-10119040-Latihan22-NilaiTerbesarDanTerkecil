/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;


/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * program menghitung nilai terbesar dan terkecil dari nilai mahasiswa
 */
public class IF110119040Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak, kurang;
        String nama;
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=======");
        System.out.print("Masukan Nama Petugas : ");
        nama = input.next();
       
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        banyak = input.nextInt();
        double[] angka = new double[10];
        for (int i = 0; i < banyak; i++){
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i+1) + " : ");
            angka[i] = new Scanner(System.in).nextDouble();         
        }
        
        System.out.println();
        System.out.println("========Hasil Nilai Mahasiswa========");
        for (int i = 0; i < banyak; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : "+angka[i]);
        }
        
        for (int i = 0; i < banyak; i++) {
            for (kurang = 0;  kurang < banyak - i; kurang++) {
                if (angka[kurang] > angka[kurang + 1]) {
                    double n = angka[kurang];
                    angka[kurang] = angka[kurang + 1];
                    angka[kurang + 1] = n;
                } 
            }
        }
        
        double nilaiBesar = angka[banyak];
        double nilaiKecil = angka[1];
        
        System.out.println();
        System.out.println("Nilai terbesar : " + nilaiBesar);
        System.out.println("Nilai terkecil : " + nilaiKecil);
        System.out.println();
        System.out.println("Petugas : " + nama);
        System.out.println();
    }
}
