


import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Tariq on 18.4.2014.
 */

/* this needs the following instances to run an iteration of the game
*  1.(an array with) all the Snakes
*  2. display
*  3. world
*  4. control
*  5. synchronizer

* */




public class GameEngine {


    // variables from the outside
    Snake[] snakes;
    Display display;
    Control control;
    int frameRate;
    Synchronizer synchronizer;

    // in-class variables
    Timer engineTimer;

    public GameEngine(Snake[] snakes, Display display, Control control, int frameRate, Synchronizer synchronizer) {
        this.snakes = snakes;
        this.control = control;
        this.display = display;
        this.frameRate = frameRate;
        this.synchronizer = synchronizer;

    }


    public void startYourEngines() {                                    // start the timer to run the game
        engineTimer = new Timer();
        engineTimer.schedule(new TimerTask() {                          // a timer to run our game loop
            @Override
            public void run() {
                if (!synchronizer.isStopGameLoop()) {

                    update();                                               // run these two
                    render();                                               // for ever and ever
                } else {
                    engineTimer.cancel();
                    engineTimer.purge();
                }

            }
        }, 0, 1000 / frameRate);    // arguments are delay and interval, so for example 1000 ms / framerate of 5
        // makes this loop run every 200 ms
    }


    public void update() {

        /* get info from control here
        *
        *
        * */

        for (Snake snake : snakes) {       // this loop goes over every snake in the snakes array

            // put code for updating and movin snake here
            // which could look like this
            // snake.move()


        }


    }

    public void render() { // render function should draw a new game screen based on the input and calculations done in the update function

        // here goes the display class


    }


}
