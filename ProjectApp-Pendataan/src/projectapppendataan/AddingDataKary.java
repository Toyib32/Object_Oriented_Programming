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
public class AddingDataKary {
    public static void AddingDataKary(){
    System.out.println(" ");
        // input kode karyawan
        System.out.print("Masukkan Kode Karyawan             : ");
        String kodeKary = input.next();
        // input nama karyawan
        System.out.print("Masukkan Nama Karyawan             : ");
        String namaKary = input.next();
        // input alamat 
        System.out.print("Masukkan Alamat                    : ");
        String alamat = input.next();
        // input tanggal lahir 
        System.out.print("Masukkan Tanggal Lahir             : ");
        String  tglLahir = input.next();
        // input golongan
        System.out.print("Masukkan Golongan                  : ");
        String golongan = input.next();
        // input status karyawan
        System.out.print("Masukkan Status Menikah            : ");
        int status = input.nextInt();

        int jumlahAnak = 0;
        if(status == 1){
            System.out.print("Masukkan Jumlah Anak               : ");
            jumlahAnak = input.nextInt();
        }
        Karyawan dataKary = new Karyawan(kodeKary, namaKary, alamat, tglLahir, golongan, status, jumlahAnak);
        dataKaryawan.add(dataKary);
        
        System.out.println("Pilih SubMenu:");
        System.out.println("1.Kembali ke menu utama");
        System.out.println("2.Tambah Data kembali");
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        int subMenu = input.nextInt();
        switch(subMenu){
            case 1:
                MainMenu.MainMenu();
            case 2:
                AddingDataKary();
        }
    }
}
