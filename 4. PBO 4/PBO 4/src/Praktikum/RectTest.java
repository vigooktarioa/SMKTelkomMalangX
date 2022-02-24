/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author LENOVO
 */
public class RectTest {
    public static void main(String[] args) {
    Rect nilai1=new Rect(1,2,3,4);
    Rect nilai2=new Rect(4,3,2,1);
    Rect uni = nilai2.union(nilai1);
    Rect inter = nilai2.intersection(nilai1);
    
    if(uni.isInside(nilai1.x1, nilai2.y1))
        System.out.println("<"+nilai2.x1+","+nilai2.y1+">"+" is inside the union ");
        System.out.println(nilai1+" union "+nilai2+" = "+uni);
        System.out.println(nilai1+" intersect "+nilai2+" = "+uni);
    }
    
}
