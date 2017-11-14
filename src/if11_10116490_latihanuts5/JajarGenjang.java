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
public class JajarGenjang implements BangunDatar{
    private int luas, keliling;
    private final int sisiAb = 50;
    private final int sisiBc = 60;
    private final int sisiCd = 70;
    private final int sisiDa = 80;
    private final int alas = 100;
    private final int tinggi = 120;
    
    public void hitungLuas(){
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : "+luas);
    }
    public void hitungKeliling(){
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : "+keliling);
    }
}
