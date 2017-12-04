package com.courierservice.model;

public class Paket {

    
    private int berat;
    private MasterCourier paketTarif;
    //private double asuransi;
    private double hargaBarang;
    private final double PERSENASURANSI = 0.03;
    
    
    public Paket() {
    }
    

    public double getaAsuransi() {
        return this.hargaBarang * PERSENASURANSI;
    
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
   
    
}
    
    
    
    


    
//
//    public int getBerat() {
//        return berat;
//    }
//
//    /**
//     * @param berat the berat to set
//     */
//    public void setBerat(int berat) {
//        this.berat = berat;
//    }
//
//    /**
//     * @return the paketTarif
//     */
//    public MasterCourier getPaketTarif() {
//        return paketTarif;
//    }
//
//    /**
//     * @return the asuransi
//     */
//    public double getAsuransi() {
//        return asuransi;
//    }
//
//    /**
//     * @param asuransi the asuransi to set
//     */
//    public void setAsuransi(double asuransi) {
//        this.asuransi = asuransi;
//    }
//
//    /**
//     * @param paketTarif the paketTarif to set
//     */
//    public void setPaketTarif(MasterCourier paketTarif) {
//        this.paketTarif = paketTarif;
//    }
    
    
//}
