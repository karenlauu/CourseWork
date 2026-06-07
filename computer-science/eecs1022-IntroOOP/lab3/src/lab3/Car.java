package lab3;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : February 27, 2025

//////////////////////////////

/*Write the definition for a class named Car that has the following private fields:

	yearModel: An int that holds the car's year model
	make: A String object that holds the make of the car
	speed: An int that holds the car's current speed

In addition, the class should have the following public methods:

	Constructor: Accepts two arguments. The first argument is the car's year model and
		the second argument is the car's make. These values should be assigned to the yearModel
		and make fields. The constructor should also assign 0 to the speed field.
	getYearModel: A public method that returns the value stored in the yearModel field.
	getMake: A public method that returns the value stored in the make field.
	getSpeed: A public method that returns the value stored in the speed field.
	setYearModel: A public method that accepts an int argument that is assigned to the yearModel
		field. The method returns no value.
	setMake: A public method that accepts a String argument that is assigned to the make field.
		The method returns no value.
	setSpeed: A public method that accepts an int argument that is assigned to the speed field.
		The method returns no value.
	accelerate: A public void method that adds 5 to the speed field.
	brake: A public void method that subtracts 5 from the speed field.
	getDescription: This public method should return the information about the Car instance
		in the form of a String array as given in the following example:
		if yearModel is 2025, make is "Toyota" and speed is 5 then getDescription returns:
		{"This is a 2025 model vehicle.","It is made by Toyota.", "It is cruising at 5 kmph."}
*/

public class Car {
	//Private fields
	private int yearModel;
	private String make;
	private int speed;
	
	//Public Methods
	public Car(int year, String makes) {
		this.yearModel = year;
		this.make = makes;
		this.speed = 0;
	}
	public int getYearModel() {
		return this.yearModel;
	}
	public String getMake() {
		return this.make;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setYearModel(int newYear) {
		this.yearModel = newYear;
	}
	public void setMake(String newMake) {
		this.make = newMake;
	}
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	public void accelerate() {
		speed+= 5;
	}
	public void brake() {
		speed-= 5;
	}
	public String[] getDescription() {
		String[] description = {"This is a " + yearModel + " model vehicle.", 
				"It is made by " + make + ".",
				"It is cruising at " + speed + " kmph."};
		return description;
	}
}
