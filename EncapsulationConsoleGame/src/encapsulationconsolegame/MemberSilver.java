/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationconsolegame;

/**
 *
 * @author ASUS
 */
public class MemberSilver extends Lainnya{
    // atribut
    private int biayaRental, jumlahPoint, discount, tempCost, totalDiskon, totalBiaya;
    
    public void setRentCost(int srt){
    this.biayaRental = srt;
    }
    
    public void setPoint(int sp){
    this.jumlahPoint = sp;
    }
   
    public void setDiscount(int sd){
    this.discount = sd;
    }
    
    // constructor
    MemberSilver() {
        setRentCost (25000);
        setPoint (1);
        setDiscount (1);
    }
    
    protected int biayaTotal(int lamaRental) {
        
        tempCost = lamaRental * biayaRental;
        totalDiskon = (tempCost * discount) / 100;
        totalBiaya = tempCost - totalDiskon;
        
        return totalBiaya;
    }
    
    protected int perolehanPoint(int lamaRental) {
        
        int totalPoint = lamaRental * jumlahPoint;
        return totalPoint;
    }
    
}