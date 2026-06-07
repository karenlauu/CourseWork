
public class Person {
	/*
	 * A person is characterized by their weight and height.
	 */

	double weight;
	double height;

	/* 
	 * If no constructor explicitly declared - Java makes a default
	 * As soon as defined constructor is present - default constructor no longer valid
	 */
	public Person(double newWeight, double newHeight) {
		weight = newWeight;
		height = newHeight;
	}

}
