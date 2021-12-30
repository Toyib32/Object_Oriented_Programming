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
public class Delete {
    public static void Delete(){
        System.out.print("Kode Karyawan yang mau dihapus:  ");
        String kodeKary = input.next();
         
        for(int i = 0; i < dataKaryawan.size();i++){
            Karyawan deleteKary = dataKaryawan.get(i);
            if(deleteKary.gettingKodeKary().equals(kodeKary)){
                dataKaryawan.remove(i);
            }
        }
        
        System.out.println(dataKaryawan.size());
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println("2.Hapus Data Kembali");
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        int subMenu = input.nextInt();
        switch(subMenu){
            case 1:
                MainMenu.MainMenu();
            case 2:
                Delete();
        }
    }
}
