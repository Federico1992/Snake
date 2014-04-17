/**
* @author French People
* Class Eating
* Complementary class
*/
public class Eating {
	
	/**
	* Table of char
	* contains food elements
	*/
	private char[] foodTable;
	private String chain = "abcdefghij";

	
	
			 // CONSTRUCTOR 
	
	
	/**
	* Constructor which initialize food table
	* 	with first letter of the food element
	*/
	public Eating()
	{
		this.foodTable = new char[10];

		for (int i = 0; i<this.chain.length();i++)
		{
			this.foodTable[i] = chain.charAt(i);
		}
	}

	
	
			// METHODS
	
	
	/**
	* Getter of the array
	* @return char[]
	*/
	public char[] getTable() {
		return this.foodTable;
	}

	
	/**
	* Getter of the food element String
	* @return String
	*/
	public String getChain(){
		return this.chain;
	}
}