import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Värld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Värld extends World
{

    /**
     * Constructor for objects of class Värld.
     * 
     */
    public Värld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        adam adam = new adam();
        addObject(adam,272,196);
    }
}
