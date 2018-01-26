import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Infinite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endless_World extends World
{
    private int counter;
    private int level;
    private boolean startGame;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Endless_World(int l)
    {
        super( 750, 750, 1 );
        startGame = false;
        level = 3;
        prepare();
        counter = 0;
        showText("Survive for as long as possible\nPress space to start", getWidth()/2, getHeight()/2);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant,35,48);
        Spiders spiders = new Spiders(level);
        addObject(spiders,89,442);
        Spiders spiders2 = new Spiders(level);
        addObject(spiders2,433,669);
        Spiders spiders3 = new Spiders(level);
        addObject(spiders3,312,447);
        Spiders spiders4 = new Spiders(level);
        addObject(spiders4,162,590);
        Spiders spiders5 = new Spiders(level);
        addObject(spiders5,590,494);
    }
    
    /**
     * act starts the game and sets the counter and shows the text on the screen
     * 
     * @paramthere are no parameters
     * @return nothing is returned
     */
    public void act()
    {
        if(startGame == false)
        {
            if( Greenfoot.isKeyDown("space"))
            {
                startGame = true;
                
                showText("3", getWidth()/2, getHeight()/2);
                Greenfoot.delay(60);
                
                showText("2", getWidth()/2, getHeight()/2);
                Greenfoot.delay(60);
                
                showText("1", getWidth()/2, getHeight()/2);
                Greenfoot.delay(60);
                
                showText("",getWidth()/2, getHeight()/2);
                
                Greenfoot.start();
                
            }
            else
            {
                restart();
            }
        }
        else
        {
            counter ++;
            showText( "Time: " + counter, 375, 48 );
            
            if( getObjects(Ant.class).size() == 0 )
            {
                showText( "score:" + counter + "\nPress Enter to reset", getWidth()/2, getHeight()/2 );
                startGame = false;
            }
        }
    }
    
    /**
     * getStarted returnes the getStarted variable
     * 
     * @param there are no paramteres
     * @return the getStarted variable
     */
    public boolean getStarted()
    {
        return startGame;
    }
    
    /**
     * restart alows the game to be restarted via the enter button
     * 
     * @param there are no parmateres
     * @return nothing is returned
     */
    public void restart()
    {
        if(Greenfoot.isKeyDown("enter") && getObjects(Ant.class).size() == 0 )
        {
            Greenfoot.setWorld(new Title_Screen());
        }
    }
}
