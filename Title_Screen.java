import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Title_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title_Screen extends World
{
    boolean play = true;
    private Easy_Button easyButton;
    private Medium_Button mediumButton;
    private Hard_Button hardButton;
    private Endless_Button endlessButton;
    private LeaderBoard_Button leadButton;
    private Title title;
    private static Spiders spider;

    /**
     * Constructor for objects of class Title_Screen.
     * 
     */
    public Title_Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        easyButton = new Easy_Button();
        mediumButton = new Medium_Button();
        hardButton = new Hard_Button();
        endlessButton = new Endless_Button();
        leadButton = new LeaderBoard_Button();
        title = new Title();
        
        addObject( easyButton, getWidth()/2, getHeight()/2 );   
        
        addObject( mediumButton, getWidth()/2, getHeight()/2 + 100 );
        
        addObject( hardButton, getWidth()/2, getHeight()/2 + 200 );
        
        addObject( endlessButton, getWidth()/2, getHeight()/2 + 300 );
        
        addObject( leadButton, getWidth()/2, getHeight()/2 + - 100 );
        
        addObject( title, getWidth()/2, getHeight()/2 + - 250 );
        
        Greenfoot.start();
        play = true;
        prepare();
    }
    
    /**
     * act checks the mouse
     */
    public void act()
    {
        checkMouse();
    }
    

    /**
     * checkMouse checks if the mouse has clicked on one of the buttons
     * 
     * @param there are no paramters
     * @return nothing is returned
     */
    public void checkMouse()
    {
        if( Greenfoot.mouseClicked(easyButton))
        {
            Greenfoot.setWorld(new MyWorld(0));
        }
        else if( Greenfoot.mouseClicked(mediumButton))
        {
            Greenfoot.setWorld(new MyWorld(1));
        }
        else if( Greenfoot.mouseClicked(hardButton))
        {
            Greenfoot.setWorld(new MyWorld(2));
        }
        else if( Greenfoot.mouseClicked(endlessButton))
        {
            Greenfoot.setWorld(new Endless_World(0));
        }
        else if( Greenfoot.mouseClicked(leadButton))
        {
            Greenfoot.setWorld(new Leader_Board());
        }
    }
   

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
