/* Direction
 *
 * This class represent certain type of input: a direction. There are 4 static constants which
 * represent commons directions ( UP, DOWN, LEFT, RIGHT) easily implemented with an integer value.
 *	
 */

public class Direction extends Command{
	
	static final int UP = 1;
	static final int DOWN = 2;
	static final int LEFT = 3;
	static final int RIGHT = 4;
	
	public Direction(int value){
		super(value);
		}



	
	public String toString(){      //Method used to debug this class
		switch(this.getValue()){
			case 1: return "UP ";
			case 2: return "DOWN ";
			case 3: return "LEFT ";
			case 4: return "RIGHT ";
			default: return "" + this.getValue();
			}
		}

	}
		
