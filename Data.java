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
public class Data {
    private String Merk;
    private int Size;
    private String Warna;
    private String JenisKelamin;
    private String Kategori;
    private int Harga;
    
    public String getMerk() {
        return Merk;
    }
    public int getSize() {
        return Size;
    }
    public String getWarna() {
        return Warna;
    }
    public String getJenisKelamin() {
        return JenisKelamin;
    }
    public String getKategori() {
        return Kategori;
    }
    public int getHarga() {
        return Harga;
    }
    
    public void setMerk (String newMerk) {
        Merk = newMerk;
    }
    public void setSize (int newSize) {
        Size = newSize;
    }
    public void setWarna (String newWarna) {
        Warna = newWarna;
    }
    public void setJenisKelamin (String newJenisKelamin) {
        JenisKelamin = newJenisKelamin;
    }
    public void setKategori (String newKategori) {
        Kategori = newKategori;
    }
    public void setHarga (int newHarga) {
        Harga = newHarga;
    }
}
