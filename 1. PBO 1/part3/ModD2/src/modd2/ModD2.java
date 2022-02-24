/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modd2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ModD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // C ke R = 4/5 * C
        // C ke F = (9/5) * C + 32
        // C ke K = C + 273.15
        int F, C, R;
        double K;
        Scanner sken = new Scanner(System.in);
        System.out.println("Masukkan suhu dalam satuan celcius : ");
        C = sken.nextInt();
        R = C * 4/5;
        F = (C * 9/5) + 32;
        K = C + 273.15;
        System.out.println();
        System.out.println(C + " C dalam satuan Reamur = " + R);
        System.out.println(C + " C dalam satuan Fahrenheit = " + F);
        System.out.println(C + " C dalam satuan Kelvin = " + K);
    }
    
}
