/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo2no2;

/**
 *
 * @author LENOVO
 */
public class UjiBus {
public static void main (String[] arg){
    
    //membuat objek busBesar dari class Bus
    Bus busBesar = new Bus(40);
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(15);
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(5);
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(26);
    busBesar.cetak();
}
}
