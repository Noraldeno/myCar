/*
Title: Subaru Object
Name: Norald Alejo
Date Created: September 12, 2016
*/


public class Subaru implements Car{
	//Initializes speed
	private int speed = 0;

	private String owner, model;
	private int year, carMiles, gasMileage;

	public Subaru(String owner, int year, String model, int miles, int gas){
		this.owner = owner;
		this.year = year;
		this.model = model;
		carMiles = miles;
		gasMileage = gas;

		System.out.printf("Make: Subaru\nYear: %d\nModel: %s\nOwner: %s\nCurrent Miles: %d\nMileage: %d", year, model, owner, carMiles, gasMileage);
	}

	//Accelerates car
	public void speedUp(int num){
		speed += num;
		System.out.println("Your current speed is now " + num);
	}

	//Decelerates car
	public void slowDown(int num){
		speed -= num;
		System.out.println("Your current speed is now " + num);
	}

	public void carMiles(int miles){
		carMiles += miles;
	}

	

	//Checks if gas is almost empty
	public boolean checkGas(int gas){
		return false;
	}

	//Gas decreases as car is used
	public int gasTank(int gas){
		return 0;
	}
}