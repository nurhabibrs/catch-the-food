import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Humb extends Benda {
    public void act() {
        setLocation(getX(), getY()+5);
        HumbFall();
    } 
    
    public void  HumbFall() {  
        if (atWorldEdge()) {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}

