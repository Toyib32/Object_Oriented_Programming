/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapppendataan;
import static projectapppendataan.ProjectAppPendataan.input;
/**
 *
 * @author ASUS
 */
public class MainMenu {
    public static void MainMenu(){     
        System.out.println("Menu Utama");
        System.out.println("1.Tambah Data");
        System.out.println("2.Hapus Data");
        System.out.println("3.Cari Data");
        System.out.println("4.Lihat Data");
        System.out.println("5.Exit");
        System.out.println(" ");
        System.out.print("Menu pilihan: ");
        int menu = input.nextInt();
        switch(menu){
            case 1:
                AddingDataKary.AddingDataKary();
            case 2:
                Delete.Delete();
            case 3:
                SearchData.SearchData();
            case 4:
                ViewData.ViewData();
            case 5:
                System.exit(0);
        }
    }
}

