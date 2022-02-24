/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo2no4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Mobil {
    public int penumpang;
    public int maxpenumpang;
    public int password;
    public int average;
    Scanner sken = new Scanner(System.in);
    
    public Mobil(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //Method Mutator
    public void addpenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang + penumpang;
        if ( temp>maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");            
        }
        else
        {
            this.penumpang=temp;
        }
}

    
public void getpenumpang(int password){
    if (password==24)
    {
        cetakpenumpang();
    }
    else
    {
        System.out.println("Password Salah");
    }
}
public void cetakpenumpang()
{
    System.out.println("penumpang Bus Sekarang = "+ penumpang);
    System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
}
}


    



