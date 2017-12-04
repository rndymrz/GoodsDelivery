/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courierservice.dao;

import com.courierservice.model.MasterCourier;
import java.util.List;

/**
 *
 * @author user
 */
public class PaketDao {

    public MasterCourier hitungBiaya(String namaKota, int berat) {
        MasterCourier mc = new MasterCourier();
        List<MasterCourier> daftarKota = TarifFileDao.kotaPaket();

        for (MasterCourier masterCourier : daftarKota) {
            if (namaKota.equalsIgnoreCase(masterCourier.getTujuan())) {
                mc.setBerat(berat);
                mc.setReguler(masterCourier.getReguler());
                mc.setKilat(masterCourier.getKilat());
                mc.setSds(masterCourier.getSds());
                mc.setOns(masterCourier.getOns());
                mc.setHds(masterCourier.getHds());

                mc.hargaReguler();
                mc.hargaKilat();
                mc.hargaOns();
                mc.hargaSds();
                mc.hargaHds();

            }
        }
        return mc;

    }
}
