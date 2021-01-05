import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chips extends Benda {
    public void act() {
        setLocation(getX(), getY()+5); 
        ChipsFall(); 
    } 
    
    public void  ChipsFall() {
        if (atWorldEdge()) 
        {
            getWorld().removeObject(this); 
            Greenfoot.playSound("lemonfall.wav"); 
        }
    }
}

