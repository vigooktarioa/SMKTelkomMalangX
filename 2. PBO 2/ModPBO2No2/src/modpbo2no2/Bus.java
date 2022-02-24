/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo2no2;

/**
 *
 * @author LENOVO
 */
public class Bus {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("penumpang Bus sekarang adalah "+penumpang);
        System.out.println("penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
