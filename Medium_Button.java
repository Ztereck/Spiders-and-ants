import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Medium_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium_Button extends Actor
{
    private GreenfootImage mediumButtonImage = new GreenfootImage(100, 50);
    
    /**
     * Medium_Button sets how the Medium_Button looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public Medium_Button()
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);

        mediumButtonImage.setColor(Color.BLUE);
        mediumButtonImage.fillRect(0, 0, 100, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 25 ) );
        text1.drawString("Normal", text1.getWidth()/12 + 1, text1.getHeight()/2 + 8);

        mediumButtonImage.drawImage( text1, 0, 0 );

        setImage( mediumButtonImage );
    }
}

