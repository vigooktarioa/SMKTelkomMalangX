/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo2praktikum;

/**
 *
 * @author LENOVO
 */
public class ModPBO2Praktikum {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        double Jarijari = 14;
            Bola bola = new Bola(7);
            bola.showDiameter();
            bola.showLuasPermukaan();
            bola.showVolume();
            System.out.println("\n\n");
            //manipulasi dengan variabel jari - jari yang dibuat
            bola.setJarijari(Jarijari); 
            bola.showDiameter();
            bola.showLuasPermukaan();
            bola.showVolume();
    }
}

    
    

