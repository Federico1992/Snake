/**
 * Created by Tariq on 18.3.2014.
 */
public class Synchronizer {

    private int gameAreaWidth;
    private int gameAreaHeight;

    private char[][] gameWorld;
    private char lastButtonPressed;

    private boolean snakeStillAlive = true;
    private boolean gameOver = false;


    public Synchronizer(int width, int height) {
        this.gameWorld = new char[width][height];
        this.gameAreaHeight = height;
        this.gameAreaWidth = width;
    }

    public char[][] getGameWorld() {
        return gameWorld;
    }

    public void setGameWorld(char[][] gameWorld) {
        this.gameWorld = gameWorld;
    }

    public char getLastButtonPressed() {
        return lastButtonPressed;
    }

    public void setLastButtonPressed(char lastButtonPressed) {
        this.lastButtonPressed = lastButtonPressed;
    }

    public boolean isSnakeStillAlive() {
        return snakeStillAlive;
    }

    public void setSnakeStillAlive(boolean snakeStillAlive) {
        this.snakeStillAlive = snakeStillAlive;
    }

    public int getGameAreaWidth() {
        return gameAreaWidth;
    }

    public void setGameAreaWidth(int gameAreaWidth) {
        this.gameAreaWidth = gameAreaWidth;
    }

    public int getGameAreaHeight() {
        return gameAreaHeight;
    }

    public void setGameAreaHeight(int gameAreaHeight) {
        this.gameAreaHeight = gameAreaHeight;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }


}
