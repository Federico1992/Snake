/**
 * @author French People
 * Class Wall
 * Used to create the different array of obstacles possible
 * An array of wall, already define with fixed obstacles.
 */

public class Wall {
	
	/** Difficulty of the game */
	 public final static int EASY = 0; 
	 public final static int MEDIUM = 1;
	 public final static int HARD = 2;
	 public final static int EXPERT = 3;
	 
	 /** Array of the game, which contains the obstacles*/
	 private char [][] tab;
	 
	 /**
	  * Constructor with a param
	  * @param diff
	  * 			difficulty chosen by the player
	  */
	 public Wall(int diff){
		 
		 //Check if the level is valid
		 if( (diff<0) || (diff>3) )
			 diff = 0;
		 tab = new char[10][10];
		 int a1 = tab.length-1;
		for (int i = 0; i<tab.length; i++){
			int a2 = tab[i].length-1;
			for (int j = 0; j<tab[i].length; j++){
				tab[i][0] = 'X';
				tab[0][j] = 'X';
				tab[a1][j] = 'X';
				tab[i][a2] = 'X';
			}
		}
	 }
	 
	 
	 /**
	  * Method getTab
	  * return the array of the class
	  * @return
	  */
	 public char [][] getTab(){
		 return this.tab;
	 }
	 
	 
	 /**
	  * Method levelTab
	  * Create the different choice of array
	  * According to the level chosen
	  * @param diff, level chosen
	  * @return an array of Wall
	  */
	 public Wall[] levelTab(int diff){
		 Wall[] tab = null;
		 if (diff == 0){
			 tab = new Wall[1];
			 tab[0] = new Wall(0);
		 }
		 
		 //Level MEDIUM
		 if (diff == 1){
			 tab = new Wall[3];
			 
			 //Create the first array of obstacles (first choice)
			 Wall w1 = new Wall(1);
			 w1.getTab()[3][1] = 'X';
			 w1.getTab()[3][2] = 'X';
			 w1.getTab()[7][4] = 'X';
			 w1.getTab()[8][4] = 'X';
			 w1.getTab()[2][6] = 'X';
			 w1.getTab()[3][6] = 'X';
			 
			 //Create the second array of obstacles (second choice)
			 Wall w2 = new Wall(1);
			 w2.getTab()[2][2] = 'X';
			 w2.getTab()[3][2] = 'X';
			 w2.getTab()[3][5] = 'X';
			 w2.getTab()[3][6] = 'X';
			 w2.getTab()[7][2] = 'X';
			 w2.getTab()[7][3] = 'X';
			 
			 //Create the third array of obstacles (third choice)
			 Wall w3 = new Wall(1);
			 w3.getTab()[1][5] = 'X';
			 w3.getTab()[2][5] = 'X';
			 w3.getTab()[3][5] = 'X';
			 w3.getTab()[7][2] = 'X';
			 w3.getTab()[7][3] = 'X';
			 w3.getTab()[6][6] = 'X';
			 w3.getTab()[6][7] = 'X';
			 w3.getTab()[6][8] = 'X';
			 
			 //Place the 3 choices in the array
			 tab[0] = w1;
			 tab[1] = w2;
			 tab[2] = w3;
		 }
		 
		 //Level HARD
		 if (diff == 2){
			 tab = new Wall[2];
			 
			 //Create the first array of obstacles (first choice)
			 Wall w1 = new Wall(2);
			 w1.getTab()[2][2] = 'X';
			 w1.getTab()[3][3] = 'X';
			 w1.getTab()[6][3] = 'X';
			 w1.getTab()[7][2] = 'X';
			 w1.getTab()[5][6] = 'X';
			 w1.getTab()[5][7] = 'X';
			 w1.getTab()[5][8] = 'X';
			 
			 //Create the second array of obstacles (second choice)
			 Wall w2 = new Wall(2);
			 w2.getTab()[2][4] = 'X';
			 w2.getTab()[2][5] = 'X';
			 w2.getTab()[3][3] = 'X';
			 w2.getTab()[3][6] = 'X';
			 w2.getTab()[6][3] = 'X';
			 w2.getTab()[7][4] = 'X';
			 w2.getTab()[7][5] = 'X';
			 w2.getTab()[6][6] = 'X';
			 
			 //Place the 3 choices in the array
			 tab[0] = w1;
			 tab[1] = w2;
		 }
		 
		 //Level EXPERT
		 if(diff == 3){
			 tab = new Wall[1];
			 
			 //Create the only choice of obstacles
			 Wall w1 = new Wall(3);
			 w1.getTab()[2][2] = 'X';
			 w1.getTab()[1][5] = 'X';
			 w1.getTab()[3][3] = 'X';
			 w1.getTab()[2][7] = 'X';
			 w1.getTab()[3][6] = 'X';
			 w1.getTab()[4][1] = 'X';
			 w1.getTab()[7][2] = 'X';
			 w1.getTab()[6][3] = 'X';
			 w1.getTab()[8][4] = 'X';
			 w1.getTab()[6][6] = 'X';
			 w1.getTab()[7][7] = 'X';
			 w1.getTab()[5][8] = 'X';
			 
			 //Place the choice in the array
			 tab[0] = w1;
		 }
		 
		 return tab;
	 }
	 
	 /**
	  * Method toString 
	  * which displays the content of the array
	  * @param String, the content of the array
	  */
	 public String toString(){
		 String s = "";
		 //process of the 2D table
		 for (int i = 0; i<this.tab.length; i++){
			 for (int j = 0; j<this.tab[i].length; j++){
				if (tab[i][j] == '\0')
					tab[i][j] = '.';
				 s += tab[i][j];
			 } 
			 s+="\n";
		 }
		 return s;
	 }
}
