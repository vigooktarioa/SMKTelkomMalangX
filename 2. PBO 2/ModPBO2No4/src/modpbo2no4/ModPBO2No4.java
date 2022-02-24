/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo2no4;

/**
 *
 * @author LENOVO
 */
public class ModPBO2No4 {

    /**
     * 
     */
 

    public static void main(String[] abc){
        
        Mobil Bus = new Mobil(5);
        Bus.getpenumpang(19);
        Bus.getpenumpang(21);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang  (2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang  (1); //tambah 1 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang  (2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang  (2); //tambah 2 penumpang
        Bus.cetakpenumpang();
    }
}
    
    

