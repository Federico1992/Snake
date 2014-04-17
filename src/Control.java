/* Control
 *
 * This class is useful to manage Input user interaction. 
 *	
 */


import java.util.*;

public class Control{
	
  private Synchronizer sync;
//Default direction. When the game starts, Snake goes right (like Nokia 3310 :))
	static Direction arrow = new Direction(4);

	public Control(Synchronizer sync){
		this.sync = sync;
		}

	/* 1st version
	 *
	 * This method use a Scanner and asks the player its input, but he must push enter to confirm
	 * his comand and for this reason this version isn't dynamic.
	 *
	 * Return an instance of Command which describe a direction or a special key insert by player.
    *
    */ 
	public static Command getDirection(){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Command c = toDirection(input);
		return c;
		}

	//It parses a String and return a Command representation of it
	public static Command toDirection(String input){	
		if(input.length() != 0){	
			switch(input.toUpperCase().charAt(input.length() - 1)){
				case 'W': arrow = new Direction(1);
									 break;
				case 'A': arrow = new Direction(3);
									 break;
				case 'S': arrow = new Direction(2);
									 break;
				case 'D': arrow = new Direction(4);
									 break;
				}
			}
		return arrow;
		}
	}

