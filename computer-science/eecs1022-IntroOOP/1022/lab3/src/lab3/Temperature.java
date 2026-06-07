package lab3;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : karenl05@my.yorku.ca
//Date : February 27, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

/*Write the definition of class named Temperature.
 * The Temperature class will hold a temperature in Fahrenheit and provide methods to get
 * the temperature in Fahrenheit, Celsius, and Kelvin.
 * 
 * The class should have the following private field:
 * 		ftemp: a double that holds a Fahrenheit temperature.
 * 
 * The class should have the following public methods:
 * 		Constructor: The constructor should accept a Fahrenheit temperature (as a double) and
 * 			assign it to the ftemp field.
 * 		setFahrenheit: This public method should accept a Fahrenheit temperature (as a double)
 * 			and assign it to the ftemp field.
 * 		getFahrenheit: This public method should return the value of the ftemp field. The method
 * 			should accept no arguments.
 * 		getCelsius: This public method should return the value of the ftemp field converted to
 * 			Celsius. The method should accept no arguments. Use the following formula to convert
 * 			to Celsius:
 * 				Celsius = (5.0 / 9.0) * (Fahrenheit - 32)
 * 		getKelvin: This public method should return the value of the ftemp field converted to
 * 			Kelvin. The method should accept no arguments. Use the following formula to convert
 * 			to Kelvin:
 * 				Kelvin = ((5.0 / 9.0) * (Fahrenheit - 32)) + 273.15
 * 		getAll: This public method should return the value of the ftemp field, its Celsius
 * 			equivalent, and its Kelvin equivalent, all three in the form of a double array.
 *			For example, if the ftemp is 32, then the return value is {32.0,0.0,273.15}*/

public class Temperature {
	double ftemp;
	
	public Temperature(double temp) {
		this.ftemp = temp;
	}
	
	public void setFahrenheit(double temp) {
		this.ftemp = temp;
	}
	public double getFahrenheit() {
		return ftemp;
	}
	public double getCelsius() {
		double cel = (5.0/9.0)*(ftemp-32);
		return cel;
	}
	public double getKelvin() {
		double kel = getCelsius() + 273.15;
		return kel;
	}
	public double[] getAll() {
		double[] result = new double[3];
		result[0] = ftemp;
		result[1] = getCelsius();
		result[2] = getKelvin();
		return result;
	}
}
