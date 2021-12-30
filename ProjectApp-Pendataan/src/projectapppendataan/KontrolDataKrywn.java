/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapppendataan;

/**
 *
 * @author ASUS Toyib h.
 */
public abstract class KontrolDataKrywn {
    private int status;
    private int jumlahAnak;
    private String kodeKary;
    private String namaKary;
    private String alamat;
    private String tglLahir;
    public abstract float gajiPokok();
    
    //kode karyawan
    public String gettingKodeKary() {
        return kodeKary;
    }
    public void settKodeKary(String kodeKary) {
        this.kodeKary = kodeKary;
    }
    
    //status
    public int gettingStatus() {
        return status;
    }
    public void settStatus(int status) {
        this.status = status;
    }
    
    //jumlah anak
    public int gettingJumlahAnak() {
        return jumlahAnak;
    }
    public void settJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    //nama Karyawan
    public String gettingNamaKary() {
        return namaKary;
    }
    public void settNamaKary(String namaKary) {
        this.namaKary = namaKary;
    }
    
    //alamat
    public String gettingAlamat() {
        return alamat;
    }
    public void settAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //tgl lahir
    public String getTglLahir() {
        return tglLahir;
    }
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
}
