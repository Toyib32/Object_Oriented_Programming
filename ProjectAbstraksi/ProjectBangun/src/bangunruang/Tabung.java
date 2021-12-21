/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS Toyib h. 
 */
public class Tabung extends BangunRuang{
    
    public double jarijari, tinggi;
    public double hitungVol() {
        double volTabung = Math.PI * Math.pow(jarijari, 2) * tinggi;
        return volTabung;
    }

    public double luas() {
        double luasTabung = Math.PI * jarijari * (jarijari + (2 * tinggi));
        return luasTabung;
    }    
}

