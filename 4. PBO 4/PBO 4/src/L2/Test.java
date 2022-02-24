/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Line obj1 = new Line (1,4,5,8);
        Line obj2 = new Line (2,3,6,7);
        System.out.println("Apakah nilai a > b : "+obj1.isGreater(obj1,obj2));
        System.out.println("Apakah nilai a < b : "+obj1.isLess(obj1,obj2));
        System.out.println("Apakah nilai a = b : "+obj1.isEqual(obj1,obj2));
    }
    
}
