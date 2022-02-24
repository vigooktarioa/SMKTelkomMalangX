/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.cabang.no.pkg4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SkCabangNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Vigo Oktario Arifianto / X RPL 3";
        System.out.println("Identitas : " + identitas);
        

        Scanner scanner = new Scanner (System.in);

        System.out.println("Masukkan nilai anda : ");
        int in = scanner.nextInt();
        
        if (in >=90){
        System.out.println("Grade B+");}
        
        else if (in >= 80){
        System.out.println("Grade B");}
        
        else if (in >= 70){
        System.out.println("Grade C");}
    }
    
}
