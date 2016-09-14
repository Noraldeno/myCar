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
	private int year, car, mileage, fuelEcon;
	private float tank, time;

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
		
		System.out.printf("Make: Subaru\nYear: %d\nModel: %s\nOwner: %s\nCurrent Miles: %d\nMileage: %d\nTank Capacity: %.2f\n\n", year, model, owner, mileage, fuelEcon, tank);
		System.out.println("****************************\n");
	}

	/**
	 * Accelerates car while calculating miles and time 
	 * traveled. Prints out current speed, time and 
	 * miles traveled
	 * 
	 * @param num 			The speed to accelerate
	 * @param miles 		The miles traveled while accelerating
	 * @param time			The time spent while accelerating
	 */
	public void speedUp(int num, int miles, int hour){
		if (checkGas()){
			speed += num;
			travel += miles;
			time += hour;

			//Updates fuel tank
			gasTank(miles);

			System.out.printf("You have accelerated to %d mph.\nYou have traveled %d miles in %.2f hours", speed, travel, time);
		}
	}

	/**
	 * Decelerates car while calculating miels and time traveled.
	 * Prints out current speed, time and 
	 * miles traveled
	 * 
	 * @param num 			The speed to decelerate
	 * @param miles 		The miles traveled while decelerating
	 * @param time			The time spent while decelerating
	 */
	public void slowDown(int num, int miles, int hour){
		speed -= num;
		travel += miles;
		time += hour;
		System.out.printf("You have decelerated %d mph.\nYou have traveled %d miles in %.2f hours", speed, travel, time);
	}

	/**
	 * Calcuates miles traveled in a time while traveling
	 * at constant speed. Prints out current speed, time and 
	 * miles traveled
	 * 
	 * @param miles 		The miles traveled 
	 * @param time			The time spent driving
	 */
	public void constantSpeed(int miles, int hour){
		if (checkGas()){	
			travel += miles;
			time += hour;

			//Updates fuel tank
			gasTank(miles);

			System.out.printf("You are driving at constant speed of %d mph.\n You have traveled %d miles in %.2f hours", speed, travel, time);
		}
	}

	/**
	 * Calculates the average speed in one drive
	 * 
	 * @return time/hour 	The calculation of distance over a set time
	 */
	public float avgSpeed(){
		return travel / time;
	}
	
	/**
	 * Checks if there is still gas in tank.
	 * 
	 * @return true			Returns true if gas is greater than 0 gallon
	 * @return false 		Returns false if gas is empty
	 */
	public boolean checkGas(){
		if (tank > 1.00){
			return true;
		}

		else if(tank <= 1.00 || tank > 0){
			System.out.println("Fuel almost empty!! Find the nearest gas station!!");
			return true;
		}

		else{
			System.out.println("No more fuel!!");
			return false;
		}
	}

	/**
	 * Calculates how much gas is left in tank
	 * 
	 * @param  miles  		The amount of miles driven
	 * @return tank 		The amount of gas left in tank
	 */
	public void gasTank(int miles){
		tank -= miles / fuelEcon;
		System.out.printf("You have %.2f gallons left in your tank.\n", tank);
	}

	/**
	 * Prints miles traveled, new mileage, average speed, and tank level
	 */
	public void print(){
		System.out.println();
	}
}