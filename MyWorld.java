import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Zachary Tereck)
 * @version (Version 1)
 */
public class MyWorld extends World
{
    private Easy_Button easyButton;
    private Medium_Button mediumButton;
    private Hard_Button hardButton;
    private int counter;
    private int level;
    private boolean startGame;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(int l)
    {
        super( 750, 750, 1 );
        startGame = false;
        level = l;
        prepare();
        counter = 1000;
        showText("Collect the food and survive the time limit\nPress space to start", getWidth()/2, getHeight()/2);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int antX = 35;
        int antY = 48;
        int randomX;
        int randomY;
        
        Ant ant = new Ant();
        addObject(ant,35,48);
        
        for( int i = 0; i < 5; i++ )
        {
            randomX = Greenfoot.getRandomNumber( getWidth() );
            randomY = Greenfoot.getRandomNumber( getHeight() );
            
            while( randomX == antX && randomY == antY )
            {
                randomX = Greenfoot.getRandomNumber( getWidth() );
                randomY = Greenfoot.getRandomNumber( getHeight() );
            }
            
            addObject( new Spiders(level), randomX, randomY );
        }
        
        Food food = new Food();
        addObject(food,372,341);
        Other_Ants other_ants = new Other_Ants();
        addObject(other_ants,37,726);
        Other_Ants other_ants2 = new Other_Ants();
        addObject(other_ants2,718,734);
        Other_Ants other_ants3 = new Other_Ants();
        addObject(other_ants3,723,27);
    }
    
    /**
     * act starts the game and sets the counter and shows the text on the screen
     * 
     * @param there are no parameters
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
            counter --;
            showText( "Time: " + counter, 375, 48 );
            if( counter == 0 && level == 0 )
            {
                showText( "Easy mode is for casuals\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                startGame = false;
            }
            else if( counter == 0 && level == 1 )
            {
                showText ("10/10 IGN\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                startGame = false;
            }
            else if( counter == 0 && level == 2 )
            {
                showText ("Nice Job\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                startGame = false;
            }
            
            if( getObjects(Ant.class).size() == 0 )
            {
                if( counter > 800 )
                {
                    showText ("Just give up\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
                else if( counter > 500 )
                {
                    showText ("WOW, you're trash\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
                else if( counter > 300 )
                {
                    showText ("Get Gud Casual\nPress Enter to return to tilte screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
                else if( counter > 100 )
                {
                    showText ("you're bad\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
                else if( counter > 10 )
                {
                    showText ("That's too bad\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
                else
                {
                    showText ("So close\nPress Enter to return to title screen", getWidth()/2, getHeight()/2 );
                    startGame = false;
                }
            }
            
            if( counter == 0 && getObjects(Food.class).size() == 1 )
            {
                showText ("Should have grabed the food, idiot", getWidth()/2, getHeight()/2 );
            }
        }
    }
    
    /**
     * getStarted returns the startGame variable
     * 
     * @param ther are no parameters
     * @return the startGame variable
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
        if(Greenfoot.isKeyDown("enter") && counter == 0 )
        {
            Greenfoot.setWorld(new Title_Screen());
        }
        else if(Greenfoot.isKeyDown("enter") && getObjects(Ant.class).size() == 0 )
        {
            Greenfoot.setWorld(new Title_Screen());
        }
    }
}
