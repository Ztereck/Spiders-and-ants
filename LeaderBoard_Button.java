import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class LeaderBoard_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaderBoard_Button extends Actor
{
    private GreenfootImage leadButtonImage = new GreenfootImage(230, 50);
    
    /**
     * LeaderBoard_Button sets how the LeaderBoard_Button looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public LeaderBoard_Button()
    {
        GreenfootImage text1 = new GreenfootImage(230, 50);
        
        leadButtonImage.setColor(Color.GRAY);
        leadButtonImage.fillRect(0, 0, 230, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 30 ) );
        text1.drawString("Leader Board", text1.getWidth()/12 + 1, text1.getHeight()/2 + 8);
        
        leadButtonImage.drawImage( text1, 0, 0 );
        
        setImage( leadButtonImage );
    }
}
