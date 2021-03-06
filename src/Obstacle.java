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
		// we are going to build one obstacle
		// just an horizontal wall 
		// this wall will start at the coordinates (x, y) :
		int x = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		int y = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		
		int i = 0;	// we have to check if (x+i) is in the array
		
		// while the obstacle is different to (1/6) of the larger
		// an while x is not out of bounds
		while (i<(this.synchronizer.getGameWorld().length/6) && x<this.synchronizer.getGameWorld().length){
			// we build an horizontal wall 
			this.synchronizer.getGameWorld()[x][y] = WALL;
			x += i;
			i++;
		}
		
	}
	
	/**
	 * Method levelHard
	 * Used to create the obstacles in the area
	 * for a hard level
	 */
	public void levelHard(){
		// two obstacle horizontal and one vertical
		// we have to define 2 variables for the start of each obstacle
		// to check if the coordinates are different at the beginning

		int x1 = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		int y1 = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		
		int x2 = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		int y2 = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		// the 2 horizontal obstacles musn't be placed on the same ordinate
		while (x2== x1)
			x2 = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		while (y2==y1)
			y2 = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		
		int x3 = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		int y3 = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		// the vertical obstacle should be in another way that the horizontal obstacles
		while ( (y3==y1) || (y3 == y2) )
			y3 = (int)Math.random()*this.synchronizer.getGameAreaHeight();
		while ( (x3==x1) || (x3 == x2) )
			x3 = (int)Math.random()*this.synchronizer.getGameAreaWidth();
		
		
		
		int i = 0;	// we have to check if (x+i) is in the array

		// while the obstacle is different to (1/6) of the larger
		// an while x is not out of bounds
		while (i<(this.synchronizer.getGameWorld().length/6) && x1<this.synchronizer.getGameWorld().length){
			// we build an horizontal wall 
			this.synchronizer.getGameWorld()[x1][y1] = WALL;
			x1 += i;
			i++;
		}
		
		
		i = 0;
		
		// while the obstacle is different to (1/6) of the larger
		// an while x is not out of bounds
		while (i<(this.synchronizer.getGameWorld().length/6) && x2<this.synchronizer.getGameWorld().length){
			// we build an horizontal wall 
			this.synchronizer.getGameWorld()[x2][y2] = WALL;
			x2 += i;
			i++;
		}
		
		
		
		i = 0;
		
		while (i<(this.synchronizer.getGameWorld()[x3].length/6) && y3<this.synchronizer.getGameWorld()[x3].length){
			// we build a vertical wall 
			this.synchronizer.getGameWorld()[x3][y3] = WALL;
			x3 += i;
			i++;
		}
		
		
		
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