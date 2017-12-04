/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courierservice.model;

/**
 *
 * @author user
 */
public class MasterCourier {
    
    private String tujuan;
    private int berat;
    private double reguler;
    private double kilat;
    private double sds;
    private double ons;
    private double hds;

    public MasterCourier() {
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    @Override
    public String toString() {
        return this.tujuan;//+" "+this.reguler+" "+this.kilat+" "+this.sds+" "+this.ons+" "+this.hds;
    }
    
    //Paket pak = new Paket();
    
    public double hargaReguler() {
        return this.reguler = this.reguler * this.berat;
        
    
    }
    
    public double hargaKilat() {
        return this.kilat = this.kilat * this.berat;
        
    
    }
    
    public double hargaSds() {
        return sds = this.sds * this.berat;
        
    }
    
    public double hargaOns() {
        return ons = this.ons * this.berat;
        
    }
    
    public double hargaHds() {
        return hds = this.hds * this.berat;
       
    }
    
}
