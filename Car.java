/*
Title: Car Interface
Name: Norald Alejo
Date Created: September 12, 2016
*/


public interface Car{

	//Speeds up object Car. Calculates miles at acceleration
	public void speedUp(int num, int miles, int time);

	//Slows down object Car. Calculates miles at deceleration
	public void slowDown(int num, int miles, int time);

	//Calculates miles at constant speed
	public void constantSpeed(int miles, int time);

	//Calculates the average speed
	public float avgSpeed();

	//Checks if gas is almost empty
	public boolean checkGas(int gas);

	//Gas decreases as car is used
	public float gasTank(int gas);

	//Prints miles traveled, new mileage, average speed, and tank level
	public void print();
}