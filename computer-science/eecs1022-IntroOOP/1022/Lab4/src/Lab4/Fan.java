package Lab4;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : karenl05@my.yorku.ca
//Date : March 8, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////////////////////////////////////////////////


public class Fan {
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	private int speed;
	
	public static boolean ON = true;
	public static boolean OFF = false;
	private boolean status;
	
	private double radius;
	private String color;
	
	public Fan() {
		this.color = "blue";
		this.radius = 5.0;
		this.status = false;
		this.speed = SLOW;
	}
	
	public Fan(int speeds, boolean statuss, double radiuss, String colour) {
		this.speed = speeds;
		this.status = statuss;
		this.radius= radiuss;
		this.color = colour;
	}
	
	public double getCoverage() {
		double area = speed*radius*5;
		return area;
	}
	public boolean isSuitable(double space) {
		this.speed = SLOW;
		double slowCoverage = getCoverage();
		this.speed = FAST;
		double fastCoverage = getCoverage();
		if ((slowCoverage >= 2*space) || (fastCoverage <= space*10)) {
			return true;
		} else 
			return false;
	}
	
	private String statusString() {
		if (speed == 1) {
			return "SLOW";
		} else if (speed == 2){
			return "MEDIUM";
		} else if (speed == 3) {
			return "FAST";
		}
		return "UNKNOWN";
	}
	
	public String toString() {
		String result = "";
		if (status == true) {
			result = "Speed: " + statusString() + ", Color: " + color + ", Radius: " + radius;
			return result;
		} else {
			result = "fan is off, Color: " + color + ", Radius: " + radius;
			return result;
		}
	}
	
}
