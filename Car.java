/**
 * This program 
 * @author  Norald Alejo
 * @version 1.00
 * 
 */

public interface Car{

	/**
	 * Accelerates car while calculating miles and time 
	 * traveled
	 * 
	 * @param num 			The speed to accelerate
	 * @param miles 		The miles traveled while accelerating
	 * @param time			The time spent while accelerating
	 */
	public void speedUp(int num, int miles, int time);

	/**
	 * Decelerates car while calculating miels and time traveled
	 * 
	 * @param num 			The speed to decelerate
	 * @param miles 		The miles traveled while decelerating
	 * @param time			The time spent while decelerating
	 */
	public void slowDown(int num, int miles, int time);

	/**
	 * Calcuates miles traveled in a time while traveling at constant speed
	 * 
	 * @param miles 		The miles traveled 
	 * @param time			The time spent driving
	 */
	public void constantSpeed(int miles, int time);

	/**
	 * Calculates the average speed in one drive
	 * 
	 * @return time/hour 	The calculation of distance over a set time
	 */
	public float avgSpeed();

	/**
	 * Checks if tank is empty.
	 * 
	 * @param gas 			The amount of gas used
	 * @return true			Returns true if gas is not empty
	 * @return false 		Returns false if gas is empty
	 */
	public boolean checkGas(int gas);

	/**
	 * Calculates how much gas is left in tank
	 * 
	 * @param gas 			The amount of gas that is being used
	 * @return tank 		The amount of gas left in tank
	 */
	public float gasTank(int gas);

	/**
	 * Prints miles traveled, new mileage, average speed, and tank level
	 */
	public void print();
}