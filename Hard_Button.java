import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Hard_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard_Button extends Actor
{
    private GreenfootImage hardButtonImage = new GreenfootImage(100, 50);
    
    /**
     * Hard_Button sets how the Hard_Button looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public Hard_Button()
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);

        hardButtonImage.setColor(Color.RED);
        hardButtonImage.fillRect(0, 0, 100, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 30 ) );
        text1.drawString("Hard", text1.getWidth()/6 + 1, text1.getHeight()/2 + 8);
        
        hardButtonImage.drawImage( text1, 0, 0 );
        
        setImage( hardButtonImage );
    }  
}
