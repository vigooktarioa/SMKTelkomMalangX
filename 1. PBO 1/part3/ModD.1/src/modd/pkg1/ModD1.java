/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modd.pkg1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ModD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //luas permukaan = L = 4 x phi x r x r
        Scanner sken = new Scanner(System.in);
        double L;
        int r;
        System.out.println("Masukkan jari-jari bola : ");
        r = sken.nextInt();
        L = 4*3.14*r*r;
        System.out.println("Luas Permukaan = "+L);
        
    }
    
}
