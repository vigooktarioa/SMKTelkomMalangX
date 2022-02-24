/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.fungsi.no.pkg5;

/**
 *
 * @author LENOVO
 */
public class SKFungsiNo5 {

    /**
     */
    
    
        public static String namapembeli = "Vigo Oktario Arifianto";

	public static String Nama(){
		return namapembeli;
	}
    
    public static int hitungBelanjaan(int hargabarang1, int hargabarang2){
		int umur = hargabarang1 + hargabarang2;
		return umur;
	}
    
    public static void main(String[] args) {
        // TODO code application logic here
        
                String namaSaya = Nama();
		System.out.println(namaSaya);
        
                int total = hitungBelanjaan(17500, 15000);
		System.out.println(total);
        
    }
    
}
