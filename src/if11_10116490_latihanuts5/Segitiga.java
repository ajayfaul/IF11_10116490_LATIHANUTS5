/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116490_latihanuts5;

/**
 *
 * @author ajayfaul
 * Kelas :IF-11
 * 10116490 / Muhammad Fajar Maulana
 */
public class Segitiga implements BangunDatar{
    private int luas, keliling;
    private final int sisiAb = 50;
    private final int sisiBc = 60;
    private final int sisiCa = 70;
    private final int alas = 100;
    private final int tinggi = 120;
    
    public void hitungLuas(){
        luas  = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }
    public void hitungKeliling(){
        keliling = sisiAb+sisiBc+sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }
}
