/*
Title: Car Interface
Name: Norald Alejo
Date Created: September 12, 2016
*/


public interface Car{

	//Speeds up object Car
	public void speedUp(int num);

	//Slows down object Car
	public void slowDown(int num);

	//Adds miles to current mileage
	public void addMileage(int miles);

	//Takes in gas per mile
	public void gasMileage(int gas);

	//Checks if gas is almost empty
	public boolean checkGas(int gas);

	//Gas decreases as car is used
	public int gasTank(int gas);
}