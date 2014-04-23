/**
 * Created by UK - Cheri, Kimberly and Ryan
 */
public class Snake 
{

    private Synchronizer synchronizer;
    private int exampleCounter;
    
    //instance variable for placing snake
    private char //note to self - finish this
    
    //positions the snake
    private int x;
    //positions the snake
    private int y;
    
    
    //

    public Snake(Synchronizer synchronizer) 
    {
        this.synchronizer = synchronizer;
    }


    public void exampleUpdateFunction() 
    {
      // if counter greater than five
      if (exampleCounter > 5) 
      {                          
                System.out.println(" Snake.exampleUpdateFunction says: Yes! I'm finally going to kill that snake!");
                synchronizer.setSnakeStillAlive(false);                                                                 
            
            else {
                    System.out.println(" Snake.exampleUpdateFunction says:  I'll let the snake live... for now.");
                 }
    
                exampleCounter++;
    
            try {
                    Thread.sleep(1000);
                }       
                
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
      }
   }
   
    public void placeSnake(){
        //fix this tonight
    	int X = (int)Math.random()*synchronizer.getGameAreaWidth();
    	int Y = (int)Math.random()*synchronizer.getGameAreaHeight();
    	boolean empty = false;

    	while (empty == false) {
    		if (synchronizer.getGameWorld()[X][Y]=='\0') {
    			synchronizer.getGameWorld()[X][Y] = this.//insert array name from above later;
    			empty = true;
    		}
    		else {
    			X = (int)Math.random()*synchronizer.getGameAreaWidth();
    			Y = (int)Math.random()*synchronizer.getGameAreaHeight();
    		}
    	}

      this.x = X;
      this.y = Y;
    }
   
   
}

