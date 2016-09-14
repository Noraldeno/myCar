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

		myFirstCar.speedUp(23, 5, 0.42);
		myFirstCar.constantSpeed(10, 0.532);
		myFirstCar.speedUp(42, 3, 0.232);
		myFirstCar.constantSpeed(90, 1.223);
		myFirstCar.speedUp(40, 132, 4);
		myFirstCar.slowDown(65, 4, 0.343);

		myFirstCar.print();
	}
}