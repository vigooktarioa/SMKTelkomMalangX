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
public class SepedaMotor {

     int jmlRoda;
     long harga;
     String bahanBakar;
     
    public int getRoda(){
    return jmlRoda;
    }
    
    public void setRoda (int jmlRoda){
        this.jmlRoda = jmlRoda;
    }

    public long getharga (){
        return harga;
    }
    
    public void setHarga (int harga){
        this.harga = harga;
    }
    
    public void tampilkan(){
       System.out.println("Jumlah roda : "+ getRoda());
        System.out.println("Harga Motor : "+ getharga()); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor honda = new SepedaMotor();
        honda.jmlRoda = 2;
        honda.harga = 1000000;
    
        System.out.println("Jumlah roda : "+ honda.getRoda());
        System.out.println("Harga Motor : "+ honda.getharga());
    }   
}
