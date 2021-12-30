/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapppendataan;
import java.util.Calendar;
/**
 *
 * @author ASUS Toyib h.
 */
public class Karyawan extends KontrolDataKrywn{
    
    private String golongan;
    public String gettingGol() {
    return golongan;
    }

    public void settGol(String golongan) {
        this.golongan = golongan;
    }
    
    public Karyawan(String kodeKary, String namaKary, String alamat, String tglLahir, String golongan, int status, int jumlahAnak ){
        this.settKodeKary(kodeKary);
        this.settNamaKary(namaKary);
        this.settAlamat(alamat);
        this.setTglLahir(tglLahir);
        this.settGol(golongan);
        this.settStatus(status);
        this.settJumlahAnak(jumlahAnak);
    }

    public Karyawan() {
    }
    // data gaji pokok karyawan
    public float gajiPokok() {
        float gajiPokok = 0;
        if(this.gettingGol().equals("A")){
            gajiPokok = 5000000;
        }
        else if(this.gettingGol().equals("B")){
            gajiPokok = 6000000;
        }
        else if(this.gettingGol().equals("C")){
            gajiPokok = 7000000;
        }
        else if(this.gettingGol().equals("D")){
            gajiPokok = 8000000;
        }
        return gajiPokok;
    }
    
    // Tunjangan menikah karyawan 
    public float tunjgnNikah(){
        float tunjangan = 0;
        if(this.gettingStatus() == 1){
            tunjangan = (float) (this.gajiPokok() * 0.1);
        }
        return tunjangan;
    }
    
    // tunjangan untuk pegawai
    public float tunjgnPegawai(){
        float tunjangan = 0;
        if(this.getUmur() > 30){
             tunjangan = (float) (this.gajiPokok() * 0.15);
        }
        return tunjangan;
    }
    
    // tunjangan anak
    public float tunjgnAnak(){
        float tunjangan = 0;
        if(this.gettingStatus() == 1 && this.gettingJumlahAnak() >0){
             tunjangan = (float) ((this.gajiPokok() * 0.05) * this.gettingJumlahAnak());
        }
        return tunjangan;
    }
    
    //perhitungan Gaji Pokok
    public float gajiKotor(){
        float totalGajiKotor = 0;
        totalGajiKotor = this.gajiPokok() + this.tunjgnNikah() + this.tunjgnPegawai() + this.tunjgnAnak();
        return totalGajiKotor;
    }
     
    // hitung potongan gaji 
    public float potonganGaji(){
        float potongan = 0;
        potongan = (float) (this.gajiKotor() * 0.025);
        return potongan;
    }
    
    // hitung Gaji Bersih
    public float gajiBersih(){
        float totGajiBersih = 0;
        totGajiBersih = this.gajiKotor() - this.potonganGaji();
        return totGajiBersih;
    }
    
    // perhitungan umur
    public int getUmur(){
        int thnLahir = Integer.valueOf(this.getTglLahir().substring(0, 4));
        Calendar kalender = Calendar.getInstance();
        int thnSkrng = kalender.get(Calendar.YEAR);
        int umur = thnSkrng - thnLahir;
        return umur;
    }
    
    // menentukan status pernikahan
    public String gettingStatusKaryawan(){
        if(this.gettingStatus() == 1 ){
            return "Menikah";
        }
        else{
            return "Belum Menikah";
        }
    }
}
