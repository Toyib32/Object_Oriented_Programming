/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author ASUS Toyib h.
 */
public abstract class Kendaraan {
    public abstract double BBMminimal();
    public abstract double LamaJalan();
    public void print() {
        System.out.println("Perkiraan Bahan Bakar Minimal yang Diperlukan adalah : " + this.BBMminimal());
        System.out.println("Perkiraan Lama Perjalanan yang Akan Ditempuh adalah : " + this.LamaJalan());
    }
}