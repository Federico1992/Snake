import java.util.*;

/**
 * 
 * @author French people
 * Class TestObstacle
 * Used to test if the display of obstacles 
 * corresponds to the level chosen by the player
 *
 */
public class TestObstacle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("level->");
		int n = sc.nextInt();
		Obstacle obstacle = new Obstacle (new Synchronizer(100, 100), n);
		obstacle.placeObstacle();
	}

}
