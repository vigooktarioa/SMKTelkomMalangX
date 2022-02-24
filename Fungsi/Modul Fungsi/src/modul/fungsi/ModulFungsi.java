/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.fungsi;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class ModulFungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nilai1 = new Scanner(System.in);
        
        
        System.out.println("Masukkan Nilai 1:");
        int nilaipertama = nilai1.nextInt();
        
        System.out.println("Masukkan Nilai 2:");
        int nilaikedua = nilai1.nextInt();
        
        System.out.println("Masukkan Nilai 3:");
        int nilaiketiga = nilai1.nextInt();
        
        if (nilaipertama >= nilaikedua && nilaipertama >= nilaiketiga){
         System.out.println("Pemenang adalah peserta pertama");
        }
        
        else if (nilaikedua >= nilaipertama && nilaikedua >= nilaiketiga){
         System.out.println("Pemenang adalah peserta kedua");
        }
        
        else if (nilaiketiga >= nilaipertama && nilaiketiga >= nilaikedua){
         System.out.println("Pemenang adalah peserta ketiga");
        }
        
    }
    }
    

