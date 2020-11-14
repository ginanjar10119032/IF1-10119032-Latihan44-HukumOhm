/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan44.hukumohm;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan perhitungan hukum ohm
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan44HukumOhm {
    public static void main(String[] args) {
        Baterai batt = new Baterai();
        Baterai batt1 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + batt1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + batt1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + batt1.hitungTegangan() + " volt");
    }
    
}