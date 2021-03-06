/** 
 * Display class.
 * For score printing, we are waiting Synchronizer Class to implement getScore() method.
 * @author Italian People
 */
public class Display {

	private Synchronizer sync;
	private int height, width;
	
	/**
	 * Constructor with 1 parameter.
	 * Inizialize parameter and set screen's size.
	 * @param sync
	 */
	public Display (Synchronizer sync) {
		this.sync=sync;
		height = sync.getGameAreaHeight();
		width = sync.getGameAreaWidth();
	}
	
	/**
	 * Refresh matrix and print game's screen.
	 */
	public void printGame () {
		char[][] gameWorld = sync.getGameWorld();
		//System.out.pritln("\nScore: " + sync.getScore() + "\n");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; i++)
				if (gameWorld[i][j] == '\0')
					System.out.print(" ");
				System.out.print(gameWorld[i][j]+" ");
			System.out.println();
		}
	}
	
	private static void printLineOf (char c, int len){
		for (int i=0; i<len; i++)
			System.out.print(c);
		System.out.println();
	}
		
				
}
