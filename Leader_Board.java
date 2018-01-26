import greenfoot.*;  // World, Actor, GreenfootImage, Greenfoot and MouseInfo XD
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Leader_Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leader_Board extends World
{
    
    private String[] names;
    private int[] scores;
    
    /**
     * Constructor for objects of class Leader_Board.
     * 
     */
    public Leader_Board()
    {
        super(750, 750, 1);
        
        names = new String[]{"NashMan", "Zach T. (the creator)", "Brayden", "Brandon", "Keenan"};
        scores = new int[]{1687, 1507, 668, 213, 200};
        
        display();
        
    }
    
    private void display()
    {
        GreenfootImage leaderNames = new GreenfootImage(300, 500);
        GreenfootImage leaderScores = new GreenfootImage(300, 500);
        
        String namesList = "";
        String scoresList = "";
        
        for( int i = 0; i < names.length; i++ )
        {
            namesList += String.format("%25s\n\n", names[i]);
        }
        
        for( int i = 0; i < scores.length; i++ )
        {
            scoresList += String.format("%10d\n\n", scores[i]);
        }
        
        leaderNames.setColor( Color.BLACK );
        leaderNames.setFont( new Font("Times New Roman", Font.BOLD, 26) );
        leaderNames.drawString(namesList, 0, 26);
        
        leaderScores.setColor( Color.BLACK );
        leaderScores.setFont( new Font("Times New Roman", Font.BOLD, 26) );
        leaderScores.drawString(scoresList, 0, 26);
        
        getBackground().drawImage( leaderNames, 100, 250 );
        getBackground().drawImage( leaderScores, 500, 250 );
    }
    
    public void act()
    {
        restart();
    }
    
    /**
     * restart alows the game to be restarted via the enter button
     * 
     * @param there are no parmateres
     * @return nothing is returned
     */
    public void restart()
    {
        if(Greenfoot.isKeyDown("enter") )
        {
            Greenfoot.setWorld(new Title_Screen());
        }
    }
    
    public void updateLeaderBoard(String name, int score)
    {
        int indexOfLess = 0;
        
        for(int i = 0; i < scores.length; i++)
        {
            if( score > scores[i] )
            {
                indexOfLess = i;
            }
        }
        
        for(int j = scores.length - 1; j > indexOfLess; j--)
        {
            names[j] = names[j-1];
            scores[j] = scores[j-1];
        }
        
        names[indexOfLess] = name;
        scores[indexOfLess] = score;
    }
}





























