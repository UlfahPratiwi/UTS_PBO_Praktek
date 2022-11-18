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
public class WarnetRecordExampleUlfah {
    public static void main(String[] args){
        WarnetUlfahRecord customer1 = new WarnetUlfahRecord();
        
        customer1.setKode("2101092022");
        customer1.setNamaPelanggan("Ulfah Pratiwi");
        customer1.setJenisPelanggan("VIP");
        customer1.setTglMasuk("18 - 11 - 2022");
        customer1.setJamMasuk(5);
        customer1.setJamKeluar(9);
        customer1.setHarga(10000);
        
        //
        
        System.out.println("Masukkan Kode           :"+customer1.getKode());
        System.out.println("Nama Pelanggan          :"+customer1.getNamaPelanggan());
        System.out.println("Jenis Pelanngan         :"+customer1.getJenisPelanggan());
        System.out.println("Masukkan Tgl Masuk      :"+customer1.getTglMasuk());
        System.out.println("Masukkan Jam Masuk      :"+customer1.getJamMasuk());
        System.out.println("Masukkan Jam Keluar     :"+customer1.getJamKeluar());
        System.out.println("Harga per Jam           :"+customer1.getHarga());
        System.out.println("1ama menggunakan Warnet :"+customer1.getLama());
        System.out.println("Besar Tarif             :"+customer1.getTarif());
         System.out.println("Besar Diskon Penjualan :"+customer1.getDiskon());
        System.out.println("Total Pembayaran        :"+customer1.getTotalBayar());
      
        
        
    }
}
