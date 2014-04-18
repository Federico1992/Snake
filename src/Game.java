

/**
 * Created by Tariq on 18.4.2014.
 */
public class Game {

    World world;
    Synchronizer synchronizer;




    private void initializeNewGame() {                   // a method only called from within this class
        synchronizer = new Synchronizer();               // make an instance of synchronizer
        world = new World(synchronizer);                 // make an instance of world and pass it the synchronizer

        // here goes the methods the world utilises to initialize new game like
        // world.createNewGame() or something

    }

    private void runNewGame(){                          // a method only called from within this class
        // the method the world uses to run the game

    }

    public void runUntilOver(){                         // this runs until game is over
                                                        // so every time the user resets the game, it is restarted
        while(!synchronizer.isGameOver()){              // but when the user dies, then that´s it
        initializeNewGame();
        runNewGame();}

        System.out.println("Game over!");
    }


}
