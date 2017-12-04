/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courierservice.model;

import com.courierservice.dao.TarifFileDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<MasterCourier> listTujuan = new ArrayList<>();
        
        Paket p = new Paket();
        MasterCourier masc = new MasterCourier();
        


 
        try {
            Scanner scan = new Scanner(new File("e:/java/tarif.txt"));
            //List<Paket> kp = new ArrayList<>();
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
            for (MasterCourier masterCourier : listTujuan) {
                System.out.println(masterCourier);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifFileDao.class.getName()).log(Level.SEVERE, null, ex);
    
        
        
        }

       

        
    }
    
}
