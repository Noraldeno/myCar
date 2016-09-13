/*
Title: Car Interface
Name: Norald Alejo
Date Created: September 12, 2016
*/


public interface Car{

	//Speeds up object Car. Calculates miles at acceleration
	public void speedUp(int num, int miles);

	//Slows down object Car. Calculates miles at deceleration
	public void slowDown(int num, int miles);

	//Calculates miles at constant speed
	public void constantSpeed(int miles);

	//Calculates the average speed
	public void avgSpeed();

	//Checks if gas is almost empty
	public boolean checkGas(int gas);

	//Gas decreases as car is used
	public int gasTank(int gas);

	//Prints miles traveled, new mileage, average speed, and tank level
	public void print();
}