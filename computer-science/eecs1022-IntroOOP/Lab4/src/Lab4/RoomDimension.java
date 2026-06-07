package Lab4;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 8, 2025
//Authenticity Declaration :

//////////////////////////////////////////////////////////////////////////


public class RoomDimension {
	private double length;
	private double width;
	
	public double getArea() {
		return length*width;
	}
	
	public RoomDimension(double len, double wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public String toString() {
		String str = "Length: " + length + ", Width: " + width;
		return str;
	}
	public boolean equals(RoomDimension otherRoom) {
		if ((otherRoom.length == length) && (otherRoom.width == width)) {
			return true; 
		} else
			return false;
	}
	public boolean isFanSuitable(Fan fan) {
		if (fan.isSuitable(getArea())) {
			return true;
		}else 
			return false;
	}
}
