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
public class MPV extends Kendaraan{
    public double speed, lenght;
    
    @Override
    public double BBMminimal() {
        double bbmmin = lenght / 14;
        return bbmmin;
    }
    @Override
    public double LamaJalan() {
        double waktu = lenght / speed;
        return waktu;
    }
}
