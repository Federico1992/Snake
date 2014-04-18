/**
 * Created by Tariq on 18.4.2014.
 * Class Game
 */
public class Game {

    World world;
    Synchronizer synchronizer;
    

    /**
     * Method initializeNewGame
     * only called from within this class
     */
    public void initializeNewGame() {
        synchronizer = new Synchronizer();               // make an instance of synchronizer
        world = new World(synchronizer);                 // make an instance of world and pass it the synchronizer

        // here goes the methods the world utilises to initialize new game like
        // world.createNewGame() or something

    }

    
    /**
     * Method runNewGame
     * only called from within this class
     */
    public void runNewGame(){        
        // the method the world uses to run the game

    }

    
    /**
     * Method runUntilOver
     * runs until game is over
     */
    public void runUntilOver(){
                                                        // so every time the user resets the game, it is restarted
        while(!synchronizer.isGameOver()){              // but when the user dies, then that's it
        initializeNewGame();
        runNewGame();}

        System.out.println("Game over!");
    }


}
