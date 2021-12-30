/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapppendataan;

import projectapppendataan.Karyawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS Toyib h.
 */
public class ProjectAppPendataan {
    /**
     * @param args the command line arguments
     */

    static ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
    static Scanner input = new Scanner(System.in);
        
    public static void main(String[] args) {
        MainMenu.MainMenu();
    }
}
