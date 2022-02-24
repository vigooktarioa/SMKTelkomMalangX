/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabang.no.pkg2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CabangNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Vigo Oktario Arifianto / X RPL 3";
        System.out.println("Identitas : " + identitas);
        
        System.out.print("\nProgram Diskon\n");
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Penjualan Anda Hari ini");
        
        
        System.out.println("1. 0 - 200K");
        System.out.println("2. 200K - 500K");
        System.out.println("3. > 500K");
        System.out.println("Masukkan no pilihan Anda : ");
        int sken = scanner.nextInt();
        
        if (sken == 1){
        System.out.println("Bonus 10K");}
        
        if (sken == 2){
        System.out.println("Bonus 20K");}
        
        if (sken == 3){
        System.out.println("Bonus 30K");}
        
        else {
        System.out.println("Bonus 15%");}
    }
    
}
