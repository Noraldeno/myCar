/**
 * This program allows object Subaru to interact with outside world
 * 
 * @author  Norald Alejo
 * @version 1.00
 * 
 */

public class Subaru implements Car{
	//Initializes speed
	private int speed = 0;
	private int travel = 0;

	private String owner, model;
	private int year, car, mileage, time, fuelEcon;
	private float tank;

	/**
	 * Constructor for Subaru object and sets owner, year, model, miles,
	 * gas, and tank. Prints all parameters.
	 * 
	 * @param owner 	Name of the current car owner
	 * @param year 		Year car was released
	 * @param model 	Model of the car
	 * @param miles 	Current miles the car has
	 * @param gas 		The fuel economy of the car
	 * @param tank 		The capacity of the fuel tank
	 */
	public Subaru(String owner, int year, String model, int miles, int gas, float tank){
		this.owner = owner;
		this.year = year;
		this.model = model;
		mileage = miles;
		fuelEcon = gas;
		this.tank = tank;
		
		System.out.printf("Make: Subaru\nYear: %d\nModel: %s\nOwner: %s\nCurrent Miles: %d\nMileage: %d\n\n", year, model, owner, mileage, fuelEcon);
	}

	/**
	 * Accelerates car while calculating miles and time 
	 * traveled
	 * 
	 * @param num 			The speed to accelerate
	 * @param miles 		The miles traveled while accelerating
	 * @param time			The time spent while accelerating
	 */
	public void speedUp(int num, int miles, int hour){
		speed += num;
		travel += miles;
		time += hour;
		System.out.println("Your current speed is now " + num);
	}

	/**
	 * Decelerates car while calculating miels and time traveled
	 * 
	 * @param num 			The speed to decelerate
	 * @param miles 		The miles traveled while decelerating
	 * @param time			The time spent while decelerating
	 */
	public void slowDown(int num, int miles, int hour){
		speed -= num;
		travel += miles;
		time += hour;
		System.out.println("Your current speed is now " + num);
	}

	/**
	 * Calcuates miles traveled in a time while traveling at constant speed
	 * 
	 * @param miles 		The miles traveled 
	 * @param time			The time spent driving
	 */
	public void constantSpeed(int miles, int hour){
		travel += miles;
		time += hour;
	}

	/**
	 * Calculates the average speed in one drive
	 * 
	 * @return time/hour 	The calculation of distance over a set time
	 */
	public float avgSpeed(){
		return travel/time;
	}
	
	/**
	 * Checks if tank is empty.
	 * 
	 * @param gas 			The amount of gas used
	 * @return true			Returns true if gas is not empty
	 * @return false 		Returns false if gas is empty
	 */
	public boolean checkGas(int gas){
		return false;
	}

	/**
	 * Calculates how much gas is left in tank
	 * 
	 * @param gas 			The amount of gas that is being used
	 * @return tank 		The amount of gas left in tank
	 */
	public float gasTank(int gas){
		return 0;
	}

	/**
	 * Prints miles traveled, new mileage, average speed, and tank level
	 */
	public void print(){
		System.out.println();
	}
}