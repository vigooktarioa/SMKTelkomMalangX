/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3.v2;

/**
 *
 * @author LENOVO
 */
public class Mod3V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p=5;
        int l=10;
        int t=5;
        System.out.println("Nilai panjang balok: "+p);
        System.out.println("Nilai lebar balok: "+l);
        System.out.println("Nilai tingi balok: "+t);
        System.out.println("=======================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("=======================");
        System.out.println("Luas Permukaan balok= "+((2*p*l)+(2*p*t)+(2*l*t)));
    }
    
}
