/**
 * Created by Tariq on 18.3.2014.
 * Class Synchronizer
 */

public class Synchronizer {

	
			// ATTRIBUTS
	

	/**Width of the area*/
    private int gameAreaWidth;
    
    /**Height of the area */
    private int gameAreaHeight;

    /**Array 2D which represents the area of the game */
    private char[][] gameWorld;
    
    /**The last key the player pressed */
    private Command[] lastButtonPressed;

    /**If the game is over */
    private boolean gameOver;
    
    /**If the player want or not restart the game */
    private boolean stopGameLoop;

    public final static int LENGTH = 80;
    
    
    		// CONSTRUCTOR

    /**
     * Empty constructor
     */
    public Synchronizer() {
    	this.gameWorld = new char[LENGTH][LENGTH];
        this.gameAreaHeight = LENGTH;
        this.gameAreaWidth = LENGTH;
        this.gameOver = false;
        this.stopGameLoop = false;
    }
    
    /**
     * 
     * @param length
     */
    public Synchronizer(int length){
    	if (length < 10)
    		length = LENGTH;
    	this.gameWorld = new char [length][length];
    	 this.gameAreaHeight = length;
         this.gameAreaWidth = length;
         this.gameOver = false;
         this.stopGameLoop = false;
    }

  
    		// METHODS
    
    
    /**
     * Method initialize
     * which initializes the game with an empty area
     * @param width
     * @param height
     */
    public void initialize(int width, int height){
        this.gameWorld = new char[width][height];
        this.gameAreaHeight = height;
        this.gameAreaWidth = width;
    }

    
    /**
     * Method getGameWorld
     * @return gameWorld
     * the array of the area
     */
    public char[][] getGameWorld() {
        return this.gameWorld;
    }

    
    /**
     * Method setGameWorld
     * which changes the gameWorld used
     * @param gameWorld
     */
    public void setGameWorld(char[][] gW) {
        this.gameWorld = gW;
    }

    
    /**
     * Method getLastButtonPressed
     * @return lastButtonPressed
     * the last button pressed by the player
     */
    public Command[] getLastButtonPressed() {
        return this.lastButtonPressed;
    }

    
    /**
     * Method setLastButtonPressed
     * which changes the last button pressed by the player by another one
     * @param lastButtonPressed
     */
    public void setLastButtonPressed(Command[] lastButtonPressed) {
        this.lastButtonPressed = lastButtonPressed;
    }


    
    /**
     * Method getGameAreaWidth
     * @return gameAreaWidth
     * the width of the area
     */
    public int getGameAreaWidth() {
        return this.gameAreaWidth;
    }

    
    /**
     * Method setGameAreaWidth
     * which changes the width of the area
     * @param gameAreaWidth
     */
    public void setGameAreaWidth(int gameAreaWidth) {
        this.gameAreaWidth = gameAreaWidth;
    }

    
    /**
     * Method getGameAreaHeight
     * @return gameAreaHeight
     * the height of the area
     */
    public int getGameAreaHeight() {
        return this.gameAreaHeight;
    }

    
    /**
     * Method setGameAreaHeight
     * which changes the height of the area
     * @param gameAreaHeight
     */
    public void setGameAreaHeight(int gameAreaHeight) {
        this.gameAreaHeight = gameAreaHeight;
    }

    
    /**
     * Method isGameOver
     * @return gameOver
     * true only if the game is over
     */
    public boolean isGameOver() {
        return this.gameOver;
    }
    
    
    public void TheGameIsOver(){
    	this.gameOver = true;
    }

    
    /**
     * Method isStopGameLoop
     * @return stopGameLoop
     *  true only if the player doesn't want to restart
     */
    public boolean isStopGameLoop() {
        return this.stopGameLoop;
    }

    
    /**
     * Method setStopGameLoop
     * changes the situation of the game loop
     * if the game must restart or not
     * @param stopGameLoop
     */
    public void setStopGameLoop(boolean stopGameLoop) {
        this.stopGameLoop = stopGameLoop;
    }

    
    /**
     * Method isEmpty
     * return a boolean
     * @param x
     * @param y
     * @return true if the square [x][y] of gameWorld is empty
     */
    public boolean isEmpty (int x, int y){
    	return (this.gameWorld[x][y] == '\0');
    }

}
