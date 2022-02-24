/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sk;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
public class ArraySk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String[] laptop = new String[5];
                String[] harga = new String [5];
               
        
            laptop[0]="Asus X124L Core i3";
            laptop[1]="Lenovo i320 Core i7";
            laptop[2]="Axioo K897S Intel Celeron";
            laptop[3]="HP 75839 Intel Pentium";
            laptop[4]="Alienware G675X Core i9"; 
            
            harga[0]="3.6 Juta";
            harga[1]="7 Juta";
            harga[2]="1.5 Juta";
            harga[3]="2.6 Juta";
            harga[4]="19 Juta";
        
            System.out.println(laptop[0]+" dengan harga "+harga[0]);
            System.out.println(laptop[1]+" dengan harga "+harga[1]);
            System.out.println(laptop[2]+" dengan harga "+harga[2]);
            System.out.println(laptop[3]+" dengan harga "+harga[3]);
            System.out.println(laptop[4]+" dengan harga "+harga[4]);
    }
    
}
