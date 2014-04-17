import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Tariq on 16.3.2014.
 */
public class Game {


    //Game World Objects

    private World world;
    private Food food;
    private Obstacle obstacle;

    // Game Mechanic Objects
    private Control control;
    private Display display;

    //Game Helper Objects
    public Synchronizer synchronizer;
    Timer engineTimer;

    //The Snake
    private Snake snake;


    //Game parameters
    private int frameRate = 1;
    private int gameAreaWidth = 50;
    private int getGameAreaHeight = 50;
    int counter = 0;


    public Game() {
        synchronizer = new Synchronizer(this.gameAreaWidth, getGameAreaHeight);

        world = new World(synchronizer);
        food = new Food(synchronizer);
       obstacle = new Obstacle (synchronizer, 0); 
        //modification, param int : level of the game


        control = new Control(synchronizer);
        display = new Display(synchronizer);

        snake = new Snake(synchronizer);


    }

    public void startNewGame() {

        // build a world and place it in the sync object
        // place food
        // place obstacles
        // place snake


    }

    public void startEngine() {                                          // start the game engine and request a frame rate
        engineTimer = new Timer();
        engineTimer.schedule(new TimerTask() {          // a timer to run our game loop
            @Override
            public void run() {

                update();                                               // run these two
                render();                                               // for ever and ever



                if (synchronizer.isSnakeStillAlive() == false) {        // if game is over
                    gameOver();                                         //  run gameOver function and
                    engineTimer.cancel();                               // stop timer loop
                }
            }
        }, 0, 1000 / frameRate);    // arguments are delay and interval, so for example 1000 ms / framerate of 5
                                    // makes this loop run every 200 ms
    }

    public void update() {                          // update function should take player input and do all the calculations

        snake.exampleUpdateFunction();              // these two are example functions
        world.exampleFunctionCheckIfGameOver();     // to demonstrate how the synchronizer class works

    }

    public void render() { // render function should draw a new game screen based on the input and calculations done in the update function

        // display class object goes here

    }

    public void gameOver() {
        System.out.println("Game Over!");
    }


}
