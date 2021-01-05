import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Keranjang extends Benda {
    public void act() {
        moveKeranjang(); 
        objectDisappear(); 
    }    
       
    public void objectDisappear() {
        if (canSee(Lemon.class)) {
            eat(Lemon.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(5);
            Greenfoot.playSound("score.wav");
        }
         
        if (canSee(Bread.class)) {
            eat(Bread.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); 
            Greenfoot.playSound("score.wav");
        }
         
        if (canSee(Humb.class)) {
            eat(Humb.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(15); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Chips.class)) {
            eat(Chips.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(20); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Cabbage.class)) {
            eat(Cabbage.class); 
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(7); 
            Greenfoot.playSound("score.wav"); 
        }
         
        if (canSee(Eggplant.class)) {
            eat(Eggplant.class);
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
            Greenfoot.playSound("score.wav"); 
        } 
    }
       
    public void moveKeranjang() {
        if (Greenfoot.isKeyDown("left")) {
            move(-10); 
        }
        if (Greenfoot.isKeyDown("right")) {
            move(10); 
        }
    }
}


