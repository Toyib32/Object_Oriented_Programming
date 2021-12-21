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
public class Balok extends BangunRuang{
    
    public double tinggi, lebar, panjang;
    public double hitungVol() {
        double vol = panjang * lebar * tinggi;
        return vol;
    }
    
    public double luas() {
        
        double luasp = 2 * ((panjang * lebar) + (lebar * tinggi) + (tinggi + panjang));
        return luasp;
    }
}
