/**
 *  @author French People
 *  Class Obstacle
 *  Models obstacle and manages their creation in a valid space.
 */
public class Obstacle {
    
	
			// ATTRIBUTS
	
	private Synchronizer synchronizer;
	private int level;
	private Wall wall;
    
	
			// CONSTRUCTOR
	
    public Obstacle(Synchronizer synchronizer, int lvl) {
        this.synchronizer = synchronizer;
        
        //Check if the level is valid
        if( (lvl<0) || (lvl>3) )
			 lvl = 0;
        this.level = lvl;
        this.wall = new Wall(this.level);
    }
    
    
    
    		// METHODS
    
    public void placeObstacle(){
    	// choose a number between 1 and 9
    	int i = (int)(Math.random()*10);
    	
    	switch(this.level){
    	
    		//there are 3 different medium level
    		case Wall.MEDIUM :
    			i = i%3;
    			break;
    		
    		//there are 2 different hard level	
    		case Wall.HARD :
    			i = i%2;
    			break;
    			
    		//there are just 1 hard level and 1 easy level	
    		default :
    			i = 0;
    			break;
    	}
    	
    	//Write the char ('.' or 'X' if there is an obstacle)
    	System.out.println(this.wall.levelTab(this.level)[i]);
    }
     
}
