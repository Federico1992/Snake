import static org.junit.Assert.*;

import org.junit.Test;


public class TestFood {


	@Test
	public void TestConstructorParamChar(){
		Food f = new Food ('c');
		assertEquals("The food must be represanted by a C ",'c', f.getFoodElement());
	}
	
	@Test
	public void TestConstructor_WrongParamChar1(){
		Food f =new Food (' ');
		assertEquals(Food.FOOD_ELEMENT_DEFAULT, f.getFoodElement());
	}
	
	@Test
	public void TestConstructor_WrongParamChar2(){
		Food f =new Food ( '\0');
		assertEquals(Food.FOOD_ELEMENT_DEFAULT, f.getFoodElement());
	}
	
	@Test
	public void TestConstructorParamCoordinates(){
		Food f = new Food (10, 15);
		assertEquals(10, f.getX());
		assertEquals(15, f.getY());
		assertEquals(Food.FOOD_ELEMENT_DEFAULT, f.getFoodElement());
	}
	
	@Test
	public void TestConstructor3Param(){
		Food f = new Food (20, 25, 'v');
		assertEquals(20, f.getX());
		assertEquals(25, f.getY());
		assertEquals('v', f.getFoodElement());
	}
	
	
	
	
	/*Test placeFood :
		Food f = new Food();
	vérifié que la place f.synchronizer.getGame[f.getX()][f.getY()] est vide
	faire un place food
	vérifié que la place f. bla bla est occupé

	(penser a garder f.getX et f.getY dans des variables tmp au cas ou)*/
	
	
	@Test
	public void TestPlaceFoodPossible(){
		Food f = new Food();
		int x = f.getX();
		int y = f.getY();
		
		boolean isEmpty = ( f.getSynchronizer().getGameWorld()[x][y] == '\0' );
		
		if (isEmpty){
			assertEquals(isEmpty, true);
			f.placeFood();
			isEmpty = ( f.getSynchronizer().getGameWorld()[x][y] == '\0' );
			assertEquals(isEmpty, false);
			char obtenu = f.getSynchronizer().getGameWorld()[x][y];
			assertEquals(f.getFoodElement(), obtenu);
		}
		else {
			//assertEquals(isEmpty, false);
			f.placeFood();
			x = f.getX();
			y = f.getY();
			isEmpty = ( f.getSynchronizer().getGameWorld()[x][y] == '\0' );
			assertEquals(isEmpty, false);
			char obtenu = f.getSynchronizer().getGameWorld()[x][y];
			assertEquals(f.getFoodElement(), obtenu);
		}
		
	}
}
