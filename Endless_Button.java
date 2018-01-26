import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class infinite_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endless_Button extends Actor
{
    private GreenfootImage endlessButtonImage = new GreenfootImage(100, 50);
    
    /**
     * Endless_Button sets how the Endless_Button looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public Endless_Button()
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);
        
        endlessButtonImage.setColor(Color.BLACK);
        endlessButtonImage.fillRect(0, 0, 100, 50);
        text1.setColor( Color.RED );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 23 ) );
        text1.drawString("Endless",  text1.getWidth()/25 + 1, text1.getHeight()/2 + 8);
        
        endlessButtonImage.drawImage( text1, 0, 0 );
        
        setImage( endlessButtonImage );
    }  
}
