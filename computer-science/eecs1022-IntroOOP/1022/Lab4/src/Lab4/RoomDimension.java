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


public class RoomDimension {
	private double length;
	private double width;
	
	public double getArea() {
		double area = width*length;
		return area;
	}
	
	public RoomDimension(double len, double wid) {
		this.length = len;
		this.width = wid;
	}
	
	public String toString() {
		return "Length: " + length + ", Width: " + width;
	}
	
	public boolean equals(RoomDimension other) {
		if ((other.length == length) && (other.width == width)) {
			return true;
		} else 
			return false;
	}
	public boolean isFanSuitable (Fan fan) {
		double area = getArea();
		return fan.isSuitable(area);
				
	}
}
