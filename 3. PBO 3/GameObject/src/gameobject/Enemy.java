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
public class Enemy extends GameObject{
public void setName(String name){
super.name=name;
}
    public String getName(){
        return name;
    }
public void setHP(int HP){
super.HP=HP;
}
    public int getHP(){
        return HP;
    }
public void setDamage(){
super.damage=damage;
}
    public int getDamage(){
        return damage;
    }

@Override
public void display(){
System.out.println("name ="+getName());
System.out.println("HP ="+getHP());
System.out.println("Damage ="+getDamage());
}
}
