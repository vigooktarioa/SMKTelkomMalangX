/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.pak.bagus.batch.pkg1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class ChallengePakBagusBatch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total, i;
        Scanner sken = new Scanner (System.in);
        
        do {
        System.out.println("Nilai Minimum rata rata untuk lulus adalah 75");
        
        System.out.println("Masukkan Nilai Matematika anda");
        int nilaiMat = sken.nextInt();
        
        System.out.println("Masukkan Nilai Kimia anda");
        int nilaiKim = sken.nextInt();
        
        System.out.println("Masukkan Nilai Fisika anda");
        int nilaiFis = sken.nextInt();
        
        System.out.println("Masukkan Nilai Biologi anda");
        int nilaiBio = sken.nextInt();
        
        total = ((nilaiMat + nilaiFis + nilaiKim + nilaiBio) / 4);
        System.out.println("Nilai rata rata anda adalah : " + total);
        
        if (total >= 75 ){
        System.out.println("Selamat, anda lulus");}
        
        else {
        System.out.println("Maaf, anda tidak lulus");}
        
        
        System.out.println("Bila ingin mengulang, ketik 1, bila tidak, ketik 2");
        i = sken.nextInt();
        }while(i==1);
    }
    
}
