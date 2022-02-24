/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gameobject;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Play{
    public static void main(String[]args){
Hero Fighter=new Hero();
Enemy Minion=new Enemy();
GameObject Open=new GameObject();
Scanner input=new Scanner (System.in);

Open.display();
System.out.println("Masukkan nama fighter: ");
Fighter.setName(input.next());

System.out.println("Masukkan HP fighter: ");
Fighter.setHP(input.nextInt());

System.out.println("Masukkan Damage fighter: ");
Fighter.setDamage(input.nextInt());

System.out.println("Masukkan nama minion: ");
Fighter.setName(input.next());

System.out.println("Masukkan HP figther: ");
Fighter.setHP(input.nextInt());

System.out.println("Masukkan Damage fighter: ");
Fighter.setDamage(input.nextInt());
    }
}
