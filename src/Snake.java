/**
 * Created by UK - Cheri, Kimberly and Ryan
 */
public class Snake 
{

    private Synchronizer synchronizer;
    private int exampleCounter;

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
   
   
}

