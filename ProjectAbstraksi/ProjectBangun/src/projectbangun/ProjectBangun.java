/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

/**
 *
 * @author ASUS
 */
public class ProjectBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //BangunDatar
        Persegi pers = new Persegi();
        Lingkaran ling = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();
            
        Tabung tbg = new Tabung();
        Balok b = new Balok();
        Bola bl = new Bola();
            
        //persegi
        pers.sisi = 5;
        System.out.println("\nPersegi dengan panjang sisi " + pers.sisi);
        pers.hitungLuas();
        pers.hitungKeliling();
        pers.tampilHasil();
            
        //lingkaran
        ling.jarijari = 10;
        System.out.println("\nLingkaran dengan panjang jari - jari " + ling.jarijari);
        ling.hitungLuas();
        ling.hitungKeliling();
        ling.tampilHasil();
            
        //persegi panjang
        pp.lebar = 4;
        pp.panjang = 5;
        System.out.println("\nPersegi Panjang dengan panjang " + pp.panjang + " dan lebar " + pp.lebar);
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.tampilHasil();
            
        //tabung
        tbg.jarijari = 10;
        tbg.tinggi = 10;
        System.out.println("\nTabung dengan panjang jari - jari " + tbg.jarijari + " dan tinggi " + tbg.tinggi);
        tbg.hitungVolume();
        tbg.hitungLuasPermukaan();
        tbg.tampilHasil();
            
        //balok
        b.lebar = 3;
        b.panjang = 4;
        b.tinggi = 5;
        System.out.println("\nBalok dengan panjang " + b.panjang + ", lebar " + b.lebar + ", dan tinggi " + b.tinggi);
        b.hitungVolume();
        b.hitungLuasPermukaan();
        b.tampilHasil();
            
        //bola
        bl.jarijari = 10;
        System.out.println("\nBola dengan panjang jari - jari " + t.jarijari);
        bl.hitungVolume();
        bl.hitungLuasPermukaan();
        bl.tampilHasil();
    }
}
