/**
 * @author French People
 * Class food
 * models food, creates food elements and drops them in a valid space.
 */
public class Food{

	
	
			// ATTRIBUTS
	
	/** Synchronizer*/
    private Synchronizer synchronizer;

    /** Eat object */
    private final Eating eat = new Eating();

    /** x of the point where will be placed the food */
    private int x;

    /** y of the point where will be placed the food*/
    private int y;

    /** Food random generated (look constructor) */
    private char foodElement;

    /** count to avoid to have more than 3 same elements on the bounce*/
    private int count = 0;

    /** element who was before the new object random generated*/ 
    private int beforeElement = -1;

    
    
    			// CONSTRUCTOR 
    
    /**
    * Constructor with a param
    * where we verify that no more than 3 same elements will be placed on the bounce 
    * and we take a random food in the EAT table
    * @param synchronizer
    */
    public Food(Synchronizer synchronizer){
       this.synchronizer = synchronizer;

       int rand1 = (int)Math.random()*10;

       if (rand1 == beforeElement)
       {
       		if (count < 3)
       		{
       			this.foodElement = eat.getTable()[rand1];
       			this.count++;
       			this.beforeElement = rand1;
       		} 
       		else
       		{
       			int rand2 = rand1;
       			this.count = 0;

       			while (rand2 == rand1)
       			{
       				rand2 = (int)Math.random()*10;
       			}

       			this.foodElement = eat.getTable()[rand2];
       			this.count++;
       			this.beforeElement = rand2;
        	}
       }
       else
       {
       		this.foodElement = eat.getTable()[rand1];
       		this.count++;
       		this.beforeElement = rand1;
       }
    }
    
    
    
    		//METHODS

    /**
    * Method placeFood
    * which place randomly the food element (char)
    * in the game area
    * if the place is free -> add it
    * else -> check for another
    */
    public void placeFood(){
    	int X = (int)Math.random()*synchronizer.getGameAreaWidth();
    	int Y = (int)Math.random()*synchronizer.getGameAreaHeight();
    	boolean empty = false;

    	while (empty == false) {
    		if (synchronizer.getGameWorld()[X][Y]=='\0') {
    			synchronizer.getGameWorld()[X][Y] = this.foodElement;
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

    /**
    * @return X
    */
    public int getX(){
    	return this.x;
    }

    /**
    * @return Y
    */
    public int getY(){
    	return this.y;
    }

}