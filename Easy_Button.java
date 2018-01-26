import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Easy_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy_Button extends Actor
{
    private GreenfootImage easyButtonImage = new GreenfootImage(100, 50);
    
    /**
     *Easy_Button sets how the Easy_Button looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public Easy_Button()
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);

        easyButtonImage.setColor(Color.GREEN);
        easyButtonImage.fillRect(0, 0, 100, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 30 ) );
        text1.drawString("Easy", text1.getWidth()/6 + 1, text1.getHeight()/2 + 8);

        easyButtonImage.drawImage( text1, 0, 0 );

        setImage( easyButtonImage );
    }
}
