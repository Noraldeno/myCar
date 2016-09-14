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
	private double travel = 0;

	private String owner, model;
	private int year, car, fuelEcon, stop;
	private double tank, time, mileage;

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
	public Subaru(String owner, int year, String model, double miles, int gas, double tank){
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
		System.out.printf("Current Miles: %.2f\n", mileage);
		System.out.printf("Fuel Economy: %d\n", fuelEcon);
		System.out.printf("Tank Capacity: %.2f\n\n", tank);
		System.out.println("****************************\n\n");
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
	public void speedUp(int num, double miles, double hour){
		if (checkGas(miles)){
			stop = 0;
			speed += num;
			travel += miles;
			mileage += miles;
			time += hour;

			System.out.printf("You are accelerating to %d mph.\n", speed);
			System.out.printf("You have traveled %.2f miles in %.2f hours.\n", travel, time);
			
			//Updates fuel tank
			gasTank(miles);
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
	public void slowDown(int num, double miles, double hour){
		if (stop != 1 && checkGas(miles)){	
			speed -= num;
			travel += miles;
			mileage += miles;
			time += hour;
			System.out.printf("You are decelerating to %d mph.\n", speed);
			System.out.printf("You have traveled %.2f miles in %.2f hours.\n\n", travel, time);
		}
	}

	/**
	 * Calcuates miles traveled in a time while traveling
	 * at constant speed. Prints out current speed, time and 
	 * miles traveled
	 * 
	 * @param miles 		The miles traveled 
	 * @param time			The time spent driving
	 */
	public void constantSpeed(double miles, double hour){
		if (stop != 1 && checkGas(miles)){	
			travel += miles;
			time += hour;
			mileage += miles;

			System.out.printf("You are driving at constant speed of %d mph.\n", speed);
			System.out.printf("You have traveled %.2f miles in %.2f hours.\n", travel, time);
			
			//Updates fuel tank
			gasTank(miles - 3.5);
		}
	}

	/**
	 * Stops the car to 0 mph
	 */
	public void stop(){
		if (stop == 0){	
			double stopDistance = Math.pow(speed, 2) / (2 * 0.8 * 9.8) * 0.0006213;
			double required = stopDistance / (0.2 * speed);
			speed = 0;
			stop = 1;
			mileage += stopDistance;
			time += required;
			System.out.println("You car is now stopping.");
			System.out.printf("Stopping Distance: %.2f miles.\n", stopDistance);
			System.out.printf("Time Required To Stop: %.2f hours.\n\n", required);
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
	public boolean checkGas(double miles){

		if (tank > 2.00 && (tank * fuelEcon) >= miles) {
			return true;
		}
		else if (tank <= 2.00 && tank > 0 && (tank * fuelEcon) >= miles){
			System.out.println("Fuel almost empty!! Find the nearest gas station!!");
			return true;
		}
		else if (tank > 0 && (tank * fuelEcon) < miles){
			System.out.printf("You no longer have enough fuel to travel %.2f miles.\n", miles);
			System.out.printf("You can only travel %.2f more miles.\n", (tank * fuelEcon));
			System.out.printf("You would need %.2f more gallons to travel %.2f miles.\n\n", ((miles / fuelEcon) - tank), miles);
			return false;
		}

		else{
			System.out.println("No more fuel!");
			stop();
			return false;
		}
	}

	/**
	 * Calculates how much gas is left in tank
	 * 
	 * @param  miles  		The amount of miles driven
	 * @return tank 		The amount of gas left in tank
	 */
	public void gasTank(double miles){
		tank -= miles / fuelEcon;
		System.out.printf("You have %.2f gallons left in your tank.\n\n", tank);
	}

	/**
	 * Prints miles traveled, time spent new mileage, average speed, and tank level
	 */
	public void print(){
		System.out.println("\n\n***************************");
		System.out.println("Driving ended...");
		System.out.printf("Distance traveled: %.2f\n", travel);
		System.out.printf("Time Spent: %.2f\n", time);
		System.out.printf("Average Speed: %.2f\n", avgSpeed());
		System.out.printf("New Mileage: %.2f\n", mileage);
		System.out.printf("Fuel Left: %.2f\n", tank);
	}
}