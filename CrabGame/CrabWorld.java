import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject( new Crab(),231, 203);// Crab 1마리 (231, 203) 좌표에 추가
        
        for (int i = 0; i <=10; i++)// Worm 10마리 랜덤 좌표에 추가
        {
            addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        }
        
        addObject( new Lobster(),334, 65);// Lobster 3마리 추가 /각 좌표는 (334, 65), (481, 481), (79, 270)
        addObject( new Lobster(),481, 481);
        addObject( new Lobster(), 79, 270);
        addObject( new Turtle(100), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        // 100을 세고 움직이는 Turtle 추가
        // 좌표는 랜덤
        
       
        
    }
}