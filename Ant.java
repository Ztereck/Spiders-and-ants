import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spiders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    private boolean startGame;
    
    /**
     * Act - do whatever the Spiders wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World world;
        
        if( getWorld() instanceof MyWorld )
        {
            world = (MyWorld)getWorld();
        }
        else
        {
            world = (Endless_World)getWorld();
        }
        
        if( world instanceof MyWorld )
        {
            if( ((MyWorld)world).getStarted() == true )
            {
                move(5);
                
                if ( Greenfoot.isKeyDown("a") )
                {
                  turn (-4);
                }
                
                if ( Greenfoot.isKeyDown("d") )
                {
                    turn (4);
                }
                
                if( isTouching( Food.class ) )
                {
                  removeTouching( Food.class );
                }
            }
        }
        else
        {
            if( ((Endless_World)world).getStarted() == true )
            {
                move(5);
                
                if ( Greenfoot.isKeyDown("a") )
                {
                  turn (-4);
                }
                
                if ( Greenfoot.isKeyDown("d") )
                {
                    turn (4);
                }
                
                if( isTouching( Food.class ) )
                {
                  removeTouching( Food.class );
                }
            }
        }
    }
    
    /**
     * getStarted sets when the ant is allowed to move
     * 
     * @param there are no paramteres
     * @return the startGame variable
     */
    public boolean getStarted()
    {
        return startGame;
    }
}    

