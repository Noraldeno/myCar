/**
 * This program allows object Subaru to interact with outside world
 * 
 * @author  Norald Alejo
 * @version 1.00
 * 
 */


public class myCar{
	public static void main(String [] args){

		//Initializes Subaru Object
		Subaru myFirstCar = new Subaru("Norald Alejo", 2002, "WRX", 242000, 22, 12);

		myFirstCar.speedUp(23, 5, 4);
	}
}