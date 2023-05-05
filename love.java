import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class love here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class love extends Actor
{
    
    /**
     * Act - do whatever the love wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        Actor padda = getOneIntersectingObject(padda.class);
        if(padda != null)
        {
            World myWorld = getWorld();
            myWorld.removeObject(padda);
            myWorld.removeObject(this);
        }
    }
    
    
}

