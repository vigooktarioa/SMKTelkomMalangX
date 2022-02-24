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
public class Hero extends GameObject{
int ID;
public void setId(int ID){
this.ID=ID;
}
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
public void setDamage(int Damage){
super.damage=damage;
}
    public int getDamage(){
        return damage;
    }

public void display(){
System.out.println("name ="+getName());
System.out.println("HP ="+getHP());
System.out.println("Damage ="+getDamage());
}
}
