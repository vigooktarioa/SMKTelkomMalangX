/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modlanjutanpraktikum;

/**
 *
 * @author LENOVO
 */
public class ModLanjutanPraktikum {

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
        
        System.out.println("");
        
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int n=5;
        for (int i = 1; i<=n;i++){
            for(int j=n;j>=1;j--){
                
                if(i==1||i==n||i==j){
                 System.out.print("@ ");
                }
                
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
