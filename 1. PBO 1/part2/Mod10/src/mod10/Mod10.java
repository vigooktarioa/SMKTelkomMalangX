/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Mod10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner(System.in);
        System.out.println("Masukkan batas bilangan : ");
        int batas = sken.nextInt();
        int hasil = 0;
        for(int i=1; i<=batas; i++)
            hasil += i;
        System.out.println("Total jumlahnya adalah : " +hasil);
    }
    
}
