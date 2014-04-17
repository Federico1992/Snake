/**
 * Created by Tariq on 18.3.2014.
 */
public class World {

    private Synchronizer synchronizer;

    public World(Synchronizer synchronizer) {
        this.synchronizer = synchronizer;
    }


    public void exampleFunctionCheckIfGameOver() {
        if (synchronizer.isSnakeStillAlive() == false) {                                                            // if snake is not alive
            synchronizer.setGameOver(true);                                                                         // end game
            System.out.println(" World.exampleFunctionCheckIfGameOver says: Oh noes! The Snake is dead :'(\n");
        } else {                                                                                                    //otherwise
            System.out.println(" World.exampleFunctionCheckIfGameOver says: Snake still alive, all is well :)\n");  //rejoice
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

