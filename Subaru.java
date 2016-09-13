/*
Title: Subaru Object
Name: Norald Alejo
Date Created: September 12, 2016
*/


public class Subaru implements Car{
	//Initializes speed
	private int speed = 0;
	private int travel = 0;

	private String owner, model;
	private int year, car, mileage, time, fuelEcon;

	public Subaru(String owner, int year, String model, int miles, int gas){
		this.owner = owner;
		this.year = year;
		this.model = model;
		mileage = miles;
		fuelEcon = gas;
		
		System.out.printf("Make: Subaru\nYear: %d\nModel: %s\nOwner: %s\nCurrent Miles: %d\nMileage: %d", year, model, owner, mileage, fuelEcon);
	}

	//Accelerates car
	public void speedUp(int num, int miles, int hour){
		speed += num;
		travel += miles;
		time += hour;
		System.out.println("Your current speed is now " + num);
	}

	//Decelerates car
	public void slowDown(int num, int miles, int hour){
		speed -= num;
		travel += miles;
		time += hour;
		System.out.println("Your current speed is now " + num);
	}

	public void constantSpeed(int miles, int hour){
		travel += miles;
		time += hour;
	}

	//Calculates average speed
	public int avgSpeed(){
		return travel/time;
	}
	//Checks if gas is almost empty
	public boolean checkGas(int gas){
		return false;
	}

	//Gas decreases as car is used
	public int gasTank(int gas){
		return 0;
	}

	public void print(){
		System.out.println();
	}
}