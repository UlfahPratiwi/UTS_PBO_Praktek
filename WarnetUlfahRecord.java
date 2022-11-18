/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_181122_A;

/**
 *
 * @author ASUS
 */
public class WarnetUlfahRecord {
    private String kode; 
    private String namapelanggan; 
    private String jenispelanggan; 
    private String tglmasuk; 
    private int jammasuk; 
    private int jamkeluar;
    private int lama;
    private double diskon;
    private double tarif;
    private double totalbayar;
    private double harga;
    private static int warnetulfahCount;
    
    //kode
    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    
    //namapelanggan
    public String getNamaPelanggan() {
        return namapelanggan;
    }
    
    public void setNamaPelanggan(String namapelanggan){
        this.namapelanggan = namapelanggan;
    }
    
    //lama menggunakan warnet
    public int getLama(){
        lama = jamkeluar - jammasuk;
        return lama;
    }
    
   
    
    
    //jenispelanggan
    public String getJenisPelanggan() {
        return jenispelanggan;
    }
    
    public void setJenisPelanggan(String jenispelanggan){
        this.jenispelanggan = jenispelanggan;
    }
    
    //diskon
    public double getDiskon(){
       if(jenispelanggan == "VIP" && lama > 2){
           System.out.println("Anda mendapatkan Tarif dengan Diskon 2%");
           diskon = tarif * 0.02;
           
       }
       else if(jenispelanggan == "GOLD" && lama > 2){
          System.out.println("Anda mendapatkan Tarif dengan Diskon 5%");
            diskon = tarif * 0.05;
       }
       return diskon;
    }
    
    //tglmasuk
    public String getTglMasuk() {
        return tglmasuk;
    }
    
    public void setTglMasuk(String tglmasuk){
        this.tglmasuk = tglmasuk;
    }
    
    //jammasuk
    public int getJamMasuk() {
        return jammasuk;
    }
    
    public void setJamMasuk(int jammasuk){
        this.jammasuk = jammasuk;
    }
    
    //jamkeluar
    public int getJamKeluar() {
        return jamkeluar;
    }
    
    public void setJamKeluar(int jamkeluar){
        this.jamkeluar = jamkeluar;
    }
    
    //harga
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    //tarif tidak gunakan set
    public double getTarif(){
        tarif = lama * harga;
        return tarif;
    }
    
    //totalbayar
    public double getTotalBayar(){
        totalbayar = lama * tarif - diskon;
        return totalbayar;
    }
    
    
    //warnetulfah tidak gunakan set
    public double getWarnetUlfahCount() {
        return warnetulfahCount;
    }
}
