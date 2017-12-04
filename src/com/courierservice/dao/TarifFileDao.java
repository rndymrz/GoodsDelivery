package com.courierservice.dao;

import com.courierservice.model.MasterCourier;
import com.courierservice.model.Paket;
import com.courierservice.model.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TarifFileDao {

    public static List<MasterCourier> kotaPaket() {

        List<MasterCourier> listTujuan = new ArrayList<>();
        

        //Person person = new Person();
        try {
            Scanner scan = new Scanner(new File("e:/java/tarif.txt"));
            

            while (scan.hasNextLine()) {
                MasterCourier mc = new MasterCourier();
                
                String kotaDanPaket = scan.nextLine();
                String[] data = kotaDanPaket.split(",");
                mc.setTujuan(data[0]);
                mc.setReguler(Double.parseDouble(data[1].trim()));
                mc.setKilat(Double.parseDouble(data[2].trim()));
                mc.setSds(Double.parseDouble(data[3].trim()));
                mc.setOns(Double.parseDouble(data[4].trim()));
                mc.setHds(Double.parseDouble(data[5].trim()));
                listTujuan.add(mc);
                
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifFileDao.class.getName()).log(Level.SEVERE, null, ex);
    }
        return listTujuan;
    } 
}