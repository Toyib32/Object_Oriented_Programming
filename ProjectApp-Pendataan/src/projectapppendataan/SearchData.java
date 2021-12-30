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
public class SearchData{
    public static void SearchData(){
        System.out.print("Masukkan Kode Karyawan:  ");
        String kode = input.next();
        
        Karyawan searchKaryawan = new Karyawan();
        for(int i = 0; i < dataKaryawan.size();i++){
            searchKaryawan = dataKaryawan.get(i);
            if(searchKaryawan.gettingKodeKary().equals(kode)){
                break;
            }
        }
        
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("-----------------------------------");
        System.out.println("Kode Karyawan          :" + searchKaryawan.gettingKodeKary());
        System.out.println("Nama Karyawan          :" + searchKaryawan.gettingNamaKary());
        System.out.println("Golongan               :" + searchKaryawan.gettingGol());
        System.out.println("Umur                   :" + searchKaryawan.getUmur());
        System.out.println("Status Menikah         :" + searchKaryawan.gettingStatusKaryawan());
        System.out.println("Jumlah Anak            :" + searchKaryawan.gettingJumlahAnak());
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok             :Rp" + searchKaryawan.gajiPokok());
        System.out.println("Tunjangan Istri/Suami  :Rp" + searchKaryawan.tunjgnNikah());
        System.out.println("Tunjangan Pegawai      :Rp" + searchKaryawan.tunjgnPegawai());
        System.out.println("Tunjangan Anak         :Rp" + searchKaryawan.tunjgnAnak());
        System.out.println("----------------------------------- +");
        System.out.println("Gaji Kotor             :Rp" + searchKaryawan.gajiKotor());
        System.out.println("Potongan               :Rp" + searchKaryawan.potonganGaji());
        System.out.println("----------------------------------- -");
        System.out.println("Gaji Bersih            :Rp" + searchKaryawan.gajiBersih()); 
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
