package Lab4;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : -- 
//Date : March 8, 2025

//////////////////////////////////////////////////////////////////////////


public class Fan {
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;
	private int speed;
	
	public final static boolean ON = true;
	public final static boolean OFF = false;
	private boolean status; 
	
	private double radius; 
	private String color; 
	
	public double getCoverage() {
		double area = speed*radius*5;
		return area;
	}
	public boolean isSuitable(double area) {
		double slowCoverage = Fan.SLOW * radius *5;
		double fastCoverage = Fan.FAST * radius *5;
		
		if ((slowCoverage >= 2*area) && (fastCoverage <= 10*area)) {
			return true;
		}else 
			return false;
		
	}
	
	//Default constructor of Fan Object
	public Fan() {
		this.speed = Fan.SLOW;
		this.status = Fan.OFF;
		this.radius = 5.0;
		this.color = "blue";
	}
	
	//Customer Constructor
	public Fan(int a, boolean b, double c, String d) {
		this.speed = a;
		this.status = b;
		this.radius = c;
		this.color = d;
	}
	
	//Speed to String
	private String getSpeedString() {
		if (speed == SLOW) {
			return "SLOW";
		} else if (speed == MEDIUM) {
			return "MEDIUM";
		} else if (speed == FAST) {
			return "FAST";
		}else
			return "UNKNOWN";
	}
	
	
	public String toString() {
		String result = "";
		if (status == true) {
			result += "Speed: "+ getSpeedString() +", Color: " + color + ", Radius: " + radius;
		} else 
			result += "fan is off, Color: " + color + ", Radius: " + radius;
		return result;
	}
	
}
