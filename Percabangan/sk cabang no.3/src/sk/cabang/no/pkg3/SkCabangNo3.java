/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.cabang.no.pkg3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SkCabangNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Vigo Oktario Arifianto / X RPL 3";
        System.out.println("Identitas : " + identitas);
        
        System.out.print("\nAlat Olahraga\n");
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Apa yang ingin anda gunakan?");
        
        
        System.out.println("1. Alat Olahraga");
        System.out.println("2. Alat Elektronik");
        System.out.println("3. Alat Masak");
        System.out.println("Masukkan no pilihan Anda : ");
        int in = scanner.nextInt();
        
        if (in == 1){
        System.out.println("Anda memilih alat olahraga");}
        
        if (in == 2){
        System.out.println("Anda memilih alat elektronik");}
        
        if (in == 3){
        System.out.println("Anda memilih alat masak");}
    }
    
}
