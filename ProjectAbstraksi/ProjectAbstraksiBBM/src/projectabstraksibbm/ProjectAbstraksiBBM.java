/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectabstraksibbm;
import kendaraan.*;

/**
 *
 * @author ASUS Toyib h.
 */
public class ProjectAbstraksiBBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sedan sdn = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV();
        String[][] dataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i <= dataMobil.length - 1; i++ ) {
            if(dataMobil[i][1] == "Sedan") {
                sdn.lenght = Double.parseDouble(dataMobil[i][2]);
                sdn.speed = Double.parseDouble(dataMobil[i][3]);
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                sdn.BBMminimal();
                sdn.LamaJalan();
                sdn.print();
                
            } else if(dataMobil[i][1] == "SUV") {
                suv.lenght = Double.parseDouble(dataMobil[i][2]);
                suv.speed = Double.parseDouble(dataMobil[i][3]);
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                suv.BBMminimal();
                suv.LamaJalan();
                suv.print();
                
            } else if(dataMobil[i][1] == "MPV") {
                mpv.lenght = Double.parseDouble(dataMobil[i][2]);
                mpv.speed = Double.parseDouble(dataMobil[i][3]);
                System.out.println("\nMobil " + dataMobil[i][0]);
                
                mpv.BBMminimal();
                mpv.LamaJalan();
                mpv.print();
            }
        }
    }
}
