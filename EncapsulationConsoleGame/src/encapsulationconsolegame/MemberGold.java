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
public class MemberGold extends MemberSilver{
    private int cashback;
    
    public void setCashBack(int scb){
    this.cashback = scb;
    }
    
    MemberGold() {
        setRentCost (30000);
        setPoint (5);
        setDiscount (2);
        setCashBack (5000);
    }
    public int getCashBack (){
        return this.cashback;
    }
}
