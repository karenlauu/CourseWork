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

public class HouseCarpet {
	private RoomDimension[] rooms;
	private double cost;
	private double totArea;
	
	public HouseCarpet(int c, double costt) {
		this.cost = costt;
		this.rooms = new RoomDimension[c];
		
		for (int i = 0; i < c; i++) {
            this.rooms[i] = new RoomDimension(0.0, 0.0);
        }
	}
	
	public double getCarpetCost() {
		double totalArea = 0;
		double totalCCost = 0;
		for (int i=0; i< rooms.length; i++) {
			double area = rooms[i].getArea();
			totalArea += area;
			totalCCost += cost*area;
		}
		this.totArea = totalArea;
		return totalCCost;
	}
	public double[] getRoomCosts() {
		double[] result = new double[rooms.length];
		for (int i=0; i< rooms.length; i++) {
			double area = rooms[i].getArea();
			double CCost = cost*area;
			result[i] = CCost;
		}
		return result;
	}
	
	public void setRooms(RoomDimension[] other) {
		if (other.length != rooms.length) {
			this.rooms = new RoomDimension[other.length];
		}
		for (int i = 0; i< rooms.length; i++) {
			this.rooms[i] = other[i];
			}
		}
	public String toString() {
		return "Total Rooms: " + rooms.length + ", Total Area:" + totArea 
				+ ", Total Carpet Cost:" + getCarpetCost();
	}
	
	public int isFanSuitable(Fan fan) {
		int count = 0;
		for (int i=0; i<rooms.length; i++) {
			double area = rooms[i].getArea();
			if (fan.isSuitable(area)) {
				count ++;
			}
		} return count;
	}
}
