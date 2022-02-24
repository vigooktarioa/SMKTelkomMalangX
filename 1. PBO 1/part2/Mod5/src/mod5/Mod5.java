/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod5;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Mod5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner (System.in);
        int nilai;
        System.out.println("Masukkan nilai akhir PBO :");
        nilai = sken.nextInt();
        if (nilai < 70){
        System.out.println("siswa tidak lulus");}
        if (nilai > 70){
        System.out.println("siswa lulus");}
    }
    
}
