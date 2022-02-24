/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modlanjutan3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ModLanjutan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        a = sken.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = sken.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = sken.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+ (jumlah(a,b)));
        System.out.println("Jumlah b + c : "+ (jumlah(b,c)));
        System.out.println("Jumlah a + c : "+ (jumlah(a,c)));
    }
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
}
