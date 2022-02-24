/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedamotor;

/**
 *
 * @author LENOVO
 */
public class BecakMotor extends SepedaMotor{
    
    public BecakMotor(){
        jmlRoda = 3;
        bahanBakar = "Avtur";
    }
    
    public void tampilkan(int a, int b){
        System.out.println("Harga :"+a);
        System.out.println("Jumlah Roda : "+b);
    }
    
    
}
