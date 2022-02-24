/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpbo3no4;

/**
 *
 * @author LENOVO
 */
class B extends A{
    
    private String b;
    public void setB (String nilai){
        b = nilai;
    }
    
    public String getB(){
        return b;
    }
    
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nama Guru : "+ getB());
    }
    
}
