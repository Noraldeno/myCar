/*
Title: Subaru Object
Name: Norald Alejo
Date Created: September 12, 2016
*/


public class Subaru implements Car{
	//Initializes speed
	private int speed = 0;

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
}