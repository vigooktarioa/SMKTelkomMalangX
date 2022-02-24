/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod8;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner
public class Mod8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner(System.in);
        System.out.print("Masukkan nilai TPA: ");
        int TPA = sken.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        int BahasaInggris = sken.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80)){
            System.out.println("Siswa dapat Beasiswa");}
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
    }
    
}
