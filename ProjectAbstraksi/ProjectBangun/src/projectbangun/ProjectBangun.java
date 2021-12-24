/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author ASUS Toyib h.
 */
public class ProjectBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //hitung luas, kel, dan vol BangunDatar
        Persegi pers = new Persegi();
        Lingkaran ling = new Lingkaran();
        PersegiPanjang persPanj = new PersegiPanjang();
            
        Tabung tbg = new Tabung();
        Balok blk = new Balok();
        Bola bla = new Bola();
            
        //hitung luas dan keliling persegi
        pers.sisi = 5;
        System.out.println("\n### PERSEGI ###");
        System.out.println("Persegi dengan panjang sisi " + pers.sisi);
        pers.hitungLuas();
        pers.hitungKeliling();
        pers.tampilHasil();
            
        //hitung luas dan keliling lingkaran
        ling.jarijari = 10;
        System.out.println("\n### LINGKARAN ###");
        System.out.println("Lingkaran dengan panjang jari - jari " + ling.jarijari);
        ling.hitungLuas();
        ling.hitungKeliling();
        ling.tampilHasil();
            
        //hitung luas dan keliling persegi panjang
        persPanj.lebar = 4;
        persPanj.panjang = 5;
        System.out.println("\n### PERSEGI PANJANG ###");
        System.out.println("Persegi Panjang dengan panjang " + persPanj.panjang + " dan lebar " + persPanj.lebar);
        persPanj.hitungLuas();
        persPanj.hitungKeliling();
        persPanj.tampilHasil();
            
        //hitung luas dan vol tabung
        tbg.jarijari = 10;
        tbg.tinggi = 10;
        System.out.println("\n### TABUNG ###");
        System.out.println("Tabung dengan panjang jari - jari " + tbg.jarijari + " dan tinggi " + tbg.tinggi);
        tbg.hitungVol();
        tbg.luas();
        tbg.print();
            
        //hitung luas dan vol balok
        blk.lebar = 3;
        blk.panjang = 4;
        blk.tinggi = 5;
        System.out.println("\n### BALOK ###");
        System.out.println("Balok dengan panjang " + blk.panjang + ", lebar " + blk.lebar + ", dan tinggi " + blk.tinggi);
        blk.hitungVol();
        blk.luas();
        blk.print();
            
        //hitung luas dan vol bola
        bla.jarijari = 10;
        System.out.println("\n### BOLA ###");
        System.out.println("Bola dengan panjang jari - jari " + bla.jarijari);
        bla.hitungVol();
        bla.luas();
        bla.print();
    }
}
