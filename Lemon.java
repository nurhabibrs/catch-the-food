import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lemon extends Benda {
    public void act() {
        setLocation(getX(), getY()+4); 
        LemonFall(); 
    } 
    
    public void  LemonFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}
