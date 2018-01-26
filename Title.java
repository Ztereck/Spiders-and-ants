import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    private GreenfootImage titleImage = new GreenfootImage(450, 150);
    
    /**
     * Title sets how the Title looks
     * 
     * @param ther are no parameters
     * @return nothing is returned
     */
    public Title()
    {
        GreenfootImage text1 = new GreenfootImage(450 , 150);
        
        titleImage.setColor(Color.BLACK);
        titleImage.fillRect(0, 0, 450, 150);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", Font.BOLD, 150 ) );
        text1.drawString("Ants", text1.getWidth()/7 + 1, text1.getHeight()/2 + 45);

        titleImage.drawImage( text1, 0, 0 );

        setImage( titleImage );
    } 
}

