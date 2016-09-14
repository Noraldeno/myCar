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
	private double tank, time;

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
	public Subaru(String owner, int year, String model, int miles, int gas, double tank){
		this.owner = owner;
		this.year = year;
		this.model = model;
		mileage = miles;
		fuelEcon = gas;
		this.tank = tank;
		
		System.out.println("Make: Subaru");
		System.out.printf("Year: %d\n", year);
		System.out.printf("Model: %s\n", model);
		System.out.printf("Owner: %s\n", owner);
		System.out.printf("Current Miles: %d\n", mileage);
		System.out.printf("Fuel Economy: %d\n", fuelEcon);
		System.out.printf("Tank Capacity: %.2f\n\n", tank);
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
	public void speedUp(int num, int miles, double hour){
		if (checkGas()){
			speed += num;
			travel += miles;
			time += hour;

			//Updates fuel tank
			gasTank(miles);

			System.out.printf("You are accelerating to %d mph.\n", speed);
			System.out.printf("You have traveled %d miles in %.2f hours\n\n", travel, time);
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
	public void slowDown(int num, int miles, double hour){
		speed -= num;
		travel += miles;
		time += hour;
		System.out.printf("You are decelerating to %d mph.\n", speed);
		System.out.printf("You have traveled %d miles in %.2f hours\n\n", travel, time);
	}

	/**
	 * Calcuates miles traveled in a time while traveling
	 * at constant speed. Prints out current speed, time and 
	 * miles traveled
	 * 
	 * @param miles 		The miles traveled 
	 * @param time			The time spent driving
	 */
	public void constantSpeed(int miles, double hour){
		if (checkGas()){	
			travel += miles;
			time += hour;

			//Updates fuel tank
			gasTank(miles);

			System.out.printf("You are driving at constant speed of %d mph.\n", speed);
			System.out.printf("You have traveled %d miles in %.2f hours\n\n", travel, time);
		}
	}

	/**
	 * Calculates the average speed in one drive
	 * 
	 * @return time/hour 	The calculation of distance over a set time
	 */
	public double avgSpeed(){
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
	 * Prints miles traveled, time spent new mileage, average speed, and tank level
	 */
	public void print(){
		System.out.println("\n\n************************");
		System.out.println("Driving ended...");
		System.out.printf("Distance traveled: %d\n", travel);
		System.out.printf("Time Spent: %.2f\n", time);
		System.out.printf("Average Speed: %.2f\n", avgSpeed());
		System.out.printf("New Mileage: %d", mileage);
		System.out.printf("Fuel Left: %.2f\n", tank);
	}
}