/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayabaru;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pembelian {
    public static void main (String args[]) {
        int Jumlah;
        int TotalHarga;
       
        Data beli = new Data();
        beli.setMerk ("Nike");
        beli.setSize (34);
        beli.setWarna("Black");
        beli.setJenisKelamin("Laki-laki");
        beli.setKategori("Lari");
        beli.setHarga(500000);
        
        System.out.println("Nama Kasir = Valent");
        System.out.println("Tanggal pembelian = 29 Mei 2021");
        System.out.println("");
        System.out.println("DETAIL PEMBELIAN");
        System.out.println("Merk = " +beli.getMerk());
        System.out.println("Ukuran = " +beli.getSize());
        System.out.println("Warna = " +beli.getWarna());
        System.out.println("JenisKelamin = " +beli.getJenisKelamin());
        System.out.println("Kategori = " + beli.getKategori());
        System.out.println("Harga/pasang = " + beli.getHarga());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah pasang sepatu yang akan dibeli = ");
        Jumlah = scan.nextInt();
        if (Jumlah>2) {
            TotalHarga = beli.getHarga()-100000;
            System.out.println("Total Harga =" + TotalHarga);
            System.out.println("Selamat anda mendapat diskon pembelian sebesar Rp 100.000");
        } else if (Jumlah<2) {
            System.out.println("Total Harga =" + beli.getHarga());
        } else if (Jumlah>1) {
            TotalHarga = beli.getHarga()-50000;
            System.out.println("Total Harga =" + TotalHarga);
            System.out.println("Selamat anda mendapat diskon pembelian sebesar Rp 50.0000");
        }
    }
    
    
}
