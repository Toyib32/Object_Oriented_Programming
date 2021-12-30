/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapppendataan;
import static projectapppendataan.ProjectAppPendataan.dataKaryawan;
import static projectapppendataan.ProjectAppPendataan.input;
/**
 *
 * @author ASUS Toyib h.
 */
public class ViewData {
    public static void ViewData(){
        Karyawan viewKary = new Karyawan();
         
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("KODE KARY    NAMA KARY      GOL     USIA    STATUS NIKAH        JUMLAH ANAK");
        System.out.println("---------------------------------------------------------------------------");
        
        for(int i = 0; i < dataKaryawan.size();i++){
            viewKary = dataKaryawan.get(i);
            System.out.println(viewKary.gettingKodeKary() + "          " + viewKary.gettingNamaKary() + "            " + viewKary.gettingGol() + "        " + viewKary.getUmur() + "      " + viewKary.gettingStatusKaryawan() + "           "  +
                    viewKary.gettingJumlahAnak());
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Jumlah data: " + dataKaryawan.size()); 
        System.out.println(" ");
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println(" ");
        System.out.print("Menu pilihan: ");
        int subMenu = input.nextInt();
        switch(subMenu){
            case 1:
                MainMenu.MainMenu();
        }
    } 
}
