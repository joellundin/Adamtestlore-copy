import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class adam extends Actor
{
    
    private int horizontalSpeed = 0;
    private int verticalSpeed = 0;
    love love = new love();
    /**
     * Act - do whatever the adam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d")) move(3);
        turn(90);
        if(Greenfoot.isKeyDown("s")) move(3);
        turn(90);
        if(Greenfoot.isKeyDown("a")) move(3);
        turn(90);
        if(Greenfoot.isKeyDown("w")) move(3);
        turn(90);
        hitpadda();
        fireOnCommand();
    }

    /*
     * Adam dor om man ror en padda
     */
    public void hitpadda()
    {
        Actor padda = getOneIntersectingObject(padda.class);
        if(padda != null)
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            myWorld.removeObject(this);
        }
    }
    public void fireOnCommand()
    {
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if(mouseInfo != null && mouseInfo.getButton() ==1)
        {
            World myWorld = getWorld();
            myWorld.addObject(love, 0, 0);
            love.setLocation(getX(), getY());
            love.turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
            
        }
    }

}
