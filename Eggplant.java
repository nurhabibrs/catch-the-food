import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Eggplant extends Benda {
    public void act(){
        setLocation(getX(), getY()+6); 
        eggplantFall(); 
    } 
    
    public void  eggplantFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}

