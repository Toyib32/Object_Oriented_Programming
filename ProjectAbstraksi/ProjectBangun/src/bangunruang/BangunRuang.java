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
public abstract class BangunRuang {
    
    public abstract double hitungVol();
    public abstract double luas();
    public void print(){
        System.out.println("Volumenya: " + this.hitungVol());
        System.out.println("Luas Permukaannya: " + this.luas());
    }
}
