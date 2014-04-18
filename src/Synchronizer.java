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
    private char lastButtonPressed;

    /**If the snake is alive */
    private boolean snakeStillAlive = true;
    
    /**If the game is over */
    private boolean gameOver = false;
    
    /**If the player want or not restart the game */
    private boolean stopGameLoop = false;

    
    
    
    		// CONSTRUCTOR

    /**
     * Empty constructor
     */
    public Synchronizer() {

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
    public char getLastButtonPressed() {
        return this.lastButtonPressed;
    }

    
    /**
     * Method setLastButtonPressed
     * which changes the last button pressed by the player by another one
     * @param lastButtonPressed
     */
    public void setLastButtonPressed(char lastButtonPressed) {
        this.lastButtonPressed = lastButtonPressed;
    }

    
    /**
     * Method isSnakeStillAlive 
     * @return snakeStillAlive
     * true if the snake is already alive
     */
    public boolean isSnakeStillAlive() {
        return this.snakeStillAlive;
    }

    
    /**
     * Method setSnakeStillAlive
     * changes the situation of the snake
     * if it's alive or not
     * @param snakeStillAlive
     */
    public void setSnakeStillAlive(boolean snakeStillAlive) {
        this.snakeStillAlive = snakeStillAlive;
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

    
    /**
     * Method setGameOver
     * changes the situation of the game
     * if it's over or not
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
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


}
