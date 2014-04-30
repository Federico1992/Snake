/**
 * Created by UK
 * Class Snake
 * In charge of snake itself, it's movement and growth
 */

/**Allows complier to know about library class*/
import java.util.ArrayList; 

public class Snake
{
          
            /**ARRAYLIST - CREATING THE SNAKE*/
            
      /**Delcaring instant variables arrayList and ArrayList<Character>*/
      private Character arrayList; 
      private ArrayList<Character> s;
          
     /**The contructor for the snake class, creates a new ArrayList*/
     public Snake(Character arrayList) 
     { 
       this.arrayList = arrayList;
       s = new ArrayList<Character>();
     }
     
     /**the getS method, returns the value for s that will be used in the add method*/
     public ArrayList<Character> getS() 
     { 
         return s; 
     } 
     
     /** getArrayList method, returns the position of the value in the list*/
     public Character getArrayList()
     {
        return arrayList;
     }
     
     /**adds the value of the snake, for example S or O*/
      public void addChar(Character newChar) 
     { 
         s.add('S'); 
         s.add('O');
     } 
     
            /**PLACING THE SNAKE*/
            
    /** x of the point where will be placed the snake */
    private int abscissa ;

    /** y of the point where will be placed the snake*/
    private int ordinate;
    
    /** The default value for placing the Arraylist - snake into the game. 'S' and 'O' */
    public final static char ARRAY_LIST_DEFAULT = 's';
    
    /**Place the Snake in the middle of the area by default*/
    public Snake(){
       this.synchronizer = new Synchronizer();
       this.abscissa = (int)0*synchronizer.getGameAreaWidth();
       this.ordinate = (int)0*synchronizer.getGameAreaHeight();
       this.arrayList = ARRAY_LIST_DEFAULT;
    }
    
    /**sets the values for x and y to be in the centre of the game world*/
    public void placeSnake(){
        int x = (int)0*synchronizer.getGameAreaWidth();							
    	int y = (int)0*synchronizer.getGameAreaHeight();						
    	this.setX(x); 																		
    	this.setY(y);
    		}
    	
    /**Gets the x value, abscissa*/
    public int getX(){
    	return this.abscissa;
    }
    
    /**Gets the y value, ordinate*/
    public int getY(){
    	return this.ordinate;
    }
    
    /**Set the x value, abscissa*/
      public void setX(int abs){
    	if (abs >= 0)
    		this.abscissa = abs;
    }

    /**Set the y value, ordinate*/
    public void setY(int ord){
    	if (ord >= 0)
    		this.ordinate = ord;
    }
    
            /**MOVEMENT OF SNAKE*/
            
     
}
