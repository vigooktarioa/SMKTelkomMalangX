/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fungsi.no.pkg3;

/**
 *
 * @author LENOVO
 */



public class SKFungsiNo3 {

    /**
     */
    
    
    
    	public static String nama = "Vigo Oktario Arifianto";

	public static String getNama(){
		return nama;
	}

	public static int hitungUmur(int lahir, int sekarang){
		int umur = sekarang - lahir;
		return umur;
	}
    
    
    public static void main(String[] args) {
        // Pemrograman Non void / method return
        
                String namaSaya = getNama();
		System.out.println(namaSaya);

		int umurSaya = hitungUmur(2005, 2020);
		System.out.println(umurSaya);
        
    }
    

    
}
