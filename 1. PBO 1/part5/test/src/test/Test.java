/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LENOVO
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<=5; i++){
                    
            for(int j=0; j<=3; j++)
            {
                if(i==1||i==5||j==0||j==3)
                {
                    System.out.print("@ ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
