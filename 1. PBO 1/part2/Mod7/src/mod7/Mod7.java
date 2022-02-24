/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Mod7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner(System.in);
        System.out.print("Silahkan pilih angka 1-3 : ");
        int bil = sken.nextInt();
        switch(bil){
        case 1 : System.out.println("Satu");
        break;
        case 2 : System.out.println("Dua");
        break;
        case 3 : System.out.println("Tiga");
        }
        }
    }
    
}
