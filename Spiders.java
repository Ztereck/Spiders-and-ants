import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ants here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spiders extends Actor
{
    private int speed;
    private boolean startGame;
    private int currentLevel;
    
    /**
     * Spiders decides the current level of the spiders
     * 
     * @param level
     */
    public Spiders(int level)
    {
        if( level == 0 )
        {
            speed = 4;
        }
        else if( level == 1 )
        {
            speed = 7;
        }
        else if( level == 2 )
        {
            speed = 12;
        }
        else if( level == 3 )
        {
            speed = 8;
        }
        
        currentLevel = level;
    }
    
    /**
     * Act - do whatever the Ants wants to do. This method is called whenever
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
                move(speed);
            
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
        else
        {
            if( ((Endless_World)world).getStarted() == true )
            {
                move(speed);
                
                if( isAtEdge() )
                {
                    turn(17);
                }
                
                if(Greenfoot.getRandomNumber(100) < 10 )
                {
                    turn(Greenfoot.getRandomNumber(90) - 45 );
                }
            }
        }
        
        if( isTouching(Other_Ants.class))
        {
            if(currentLevel == 2)
            {
                getImage().scale( (int)(getImage().getWidth()*1.5), (int)(getImage().getHeight()*1.5));
            }
            removeTouching(Other_Ants.class);
        }
        
        if( isTouching(Ant.class))
        {
            removeTouching(Ant.class);
        }
    }
    
    /**
     * getStarted sets when the spider is allowed to move
     * 
     * @param there are no paramteres
     * @return the startGame variable
     */
    public boolean getStarted()
    {
        return startGame;
    }
}
 