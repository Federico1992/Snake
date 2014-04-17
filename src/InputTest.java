

public class InputTest{
	
	public static void main(String []args){
		System.out.println("\n\nTest input class!\n\n...Push w/a/s/d to set a direction and then push ENTER to confirm your choice...\n");
		
		Command d;
		
		while(true){
			d = Control.getDirection();
			if(d != null)
				System.out.println(d.toString());
			}
		
		
		}
	}
