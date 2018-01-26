import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Other_Ants here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Other_Ants extends Actor
{
    private boolean startGame;
    
    /**
     * Act - do whatever the Other_Ants wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = ( MyWorld ) getWorld();
        if( world.getStarted() == true )
        {
            move(5);
        
            if( isAtEdge() )
            {
                turn(17);
            }
            
            if( Greenfoot.getRandomNumber(100) < 10 )
            {
                turn(Greenfoot.getRandomNumber(90) - 45 );
            }
        } 
    }
    
    /**
     * getStarted decides when the other ants begin to move
     * 
     * @param there are no paramteres 
     * @return the startGame variable
     */
    public boolean getStarted()
    {
        return startGame;
    }
}
