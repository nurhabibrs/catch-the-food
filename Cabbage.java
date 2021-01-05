import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cabbage extends Benda {
    public void act() {
        setLocation(getX(), getY()+6);
        cabbageFall();
    } 
    
    public void  cabbageFall() {
        if (atWorldEdge()) {
            getWorld().removeObject(this);
            Greenfoot.playSound("lemonfall.wav");
        }
    }
}
