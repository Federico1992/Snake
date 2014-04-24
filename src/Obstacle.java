/**
 *  @author French People
 *  Class Obstacle
 *  Models obstacle and manages their creation in a valid space.
 */
public class Obstacle {

	
			//ATTRIBUTES
	
	/** Synchronizer of the class*/
	private Synchronizer synchronizer;
	
	/** Level for the obstacle*/
	private int level;
	
	/**	Element which represents a wall, a brick of the obstacle */
	public final static char WALL = 'X';
	
	/** Constant : easy level */
	 public final static int EASY = 0; 
	 
	 /** Constant : medium level */
	 public final static int MEDIUM = 1;
	 
	 /** Constant : hard level */
	 public final static int HARD = 2;
	 
	 /** Constant : expert level */
	 public final static int EXPERT = 3;
	
	
			//CONSTRUCTORS
	
	/**
	 * Empty constructor
	 * Initialize the obstacles on the area
	 * As an easy level
	 */
	public Obstacle(){
		this.synchronizer = new Synchronizer();
		this.level = EASY;
		//Add the "wall" around the area of the game only
		this.initializeArea();	
	}
	
	
	/**
	 * Constructor with 1 param
	 * Initialize the obstacles according to the level
	 * @param lvl , difficulty of the game
	 */
	public Obstacle(int lvl){
		this.synchronizer = new Synchronizer();
		
		//Check if the level is valid 
		if (  (lvl<0)  ||  (lvl>3) )
			lvl = EASY;
		this.level = lvl;
		
		//Add the "wall" around the area of the game
		this.initializeArea();
		
		//And the obstacles inside the area according to the level
		switch (this.level) {
			
			case MEDIUM :
				this.levelMedium();
				break;
			
			case HARD :
				this.levelHard();
				break;
			
			case EXPERT :
				this.levelExpert();
				break;
			
			default :
				this.initializeArea();
				break;
		}
	}
	
	
	
			//METHODS

	/**
	 * Method initializeArea
	 * create the wall around the area
	 */
	public void initializeArea(){
		// level easy contains only the area
		int length1 = this.synchronizer.getGameWorld().length;		// length of the first dimension
		for (int i = 0; i<length1; i++){
			int length2 = this.synchronizer.getGameWorld()[i].length;		// length of the second dimension
			for (int j = 0; j<length2 ; j++){
				this.synchronizer.getGameWorld()[i][0] = WALL;
				this.synchronizer.getGameWorld()[0][j] = WALL;
				this.synchronizer.getGameWorld()[length1][j] = WALL;
				this.synchronizer.getGameWorld()[i][length2] = WALL;
			}
		}
	}
	
	/**
	 * Method levelMedium
	 * Used to create the obstacles in the area
	 * for a medium level
	 */
	public void levelMedium(){
		// one or two obstacles
		int x = (int)Math.random()*synchronizer.getGameAreaWidth();
		int y = (int)Math.random()*synchronizer.getGameAreaHeight();
		
		for (int i = 0 ; i < (this.synchronizer.getGameWorld().length)/6 ; i++ ){
			//Horizontal line, length : 1/6 of the length of the area
			this.synchronizer.getGameWorld()[x+i][y] = WALL;
			
			// Warning ! Obstacle can't be placed on this.synchronizer.getGameWorld().[length][y]  
			//Check that we're not out of area's bounds
		}
		
	}
	
	/**
	 * Method levelHard
	 * Used to create the obstacles in the area
	 * for a hard level
	 */
	public void levelHard(){
		// two  or three obstacles
	}
	
	/**
	 * Method levelExpert
	 * Used to create the obstacles in the area
	 * for an expert level
	 */
	public void levelExpert(){
		// 5 obstacles !
	}
	
	
	
	/**
	 * Getter of level
	 * @return int level
	 */
	public int getLevel(){
		return this.level;
	}
	
	/**
	 * Setter of level
	 * @param int lvl, new level
	 */
	public void setLevel(int lvl){
		this.level = lvl;
	}
	
	/**
	 * Method toString
	 * @return String
	 */
	public String toString(){
	 
		//Return the array of Obstacles
		//Represents the game area with the obstacles
	 return "";
	}


}