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
public class Bola extends BangunRuang{
    
    public double jarijari;
    public double hitungVol() {
        double vol = (4 * Math.PI * Math.pow(jarijari, 3)) / 3;
        return vol;
    }

    public double luas() {
        double luasBola = 4 * Math.PI * Math.pow(jarijari, 2);
        return luasBola;
    }
}
