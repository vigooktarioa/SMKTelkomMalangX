/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fungsi.no.pkg4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class SKFungsiNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner (System.in);
        int nilairata, bagi;
        
        
        
        System.out.println("masukkan nilai ke-1");
        int nilai1 = sken.nextInt();
        
        System.out.println("masukkan nilai ke-2");
        int nilai2 = sken.nextInt();
        
        System.out.println("masukkan nilai ke-3");
        int nilai3 = sken.nextInt();
        
        System.out.println("masukkan nilai ke-4");
        int nilai4 = sken.nextInt();
        
        System.out.println("masukkan nilai ke-5");
        int nilai5 = sken.nextInt();
        
        nilairata = (nilai1+nilai2+nilai3+nilai4+nilai5);
        bagi = (nilairata / 5);
        
        System.out.println("Nilai Rata Rata adalah :" + bagi);

    }
    
}
