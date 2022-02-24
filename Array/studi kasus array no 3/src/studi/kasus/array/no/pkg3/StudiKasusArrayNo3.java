/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.array.no.pkg3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class StudiKasusArrayNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] angka = new int[15];
        int kuadrat;
        Scanner scan = new Scanner(System.in)
        
        for(int i=0; i<angka.length;i++){
        
        angka[i] = i +1;
        }
        
        for(int i = 0; i< angka.length;i++){
            
            if (angka[i] % 2 !=0 ){
            kuadrat = angka[i] * angka[i];
            System.out.println(angka[i] + " kuadrat " + kuadrat);
    
    }
            
            int namasiapa = scan.nextInt();
            
            if (namasiapa == 1);{
            System.out.Println("hdwud");
                    }
}
