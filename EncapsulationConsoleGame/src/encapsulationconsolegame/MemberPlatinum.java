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
public class MemberPlatinum extends MemberGold{
    private int bonus;
    
    MemberPlatinum() {
        setRentCost (45000);
        setPoint (10);
        setDiscount (3);
        setCashBack (10000);
    }
    
    protected int getBonus(int rentalDuration) {
        
        bonus = rentalDuration * 5000;
        return bonus;
    }
}
