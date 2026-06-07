package Lab4;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 8, 2025

//////////////////////////////////////////////////////////////////////////

public class HouseCarpet {
	private RoomDimension[] rooms;
	private double cost;
	private double totalArea;
	
	public double getCarpetCost() {
		double sum = 0;
		double[] arr = getRoomCosts();
		for (int k=0; k<arr.length;k++ ) {
			sum+= arr[k];
		}
		return sum;
	}
	
	public double[] getRoomCosts() {
		double[] roomCost = new double[rooms.length];
		totalArea =0;
		for (int i=0; i< rooms.length; i++) {
			double roomArea = rooms[i].getArea();
			roomCost[i] = roomArea*cost;
			totalArea += roomArea;
		}
		return roomCost;
	}
	public void setRooms(RoomDimension[] otherRooms) {
		if (otherRooms.length != rooms.length) {
			rooms = new RoomDimension[otherRooms.length];	
		}
		for (int i=0; i< otherRooms.length;i++) {
			rooms[i] = new RoomDimension(otherRooms[i].getLength(), otherRooms[i].getWidth());
		}
	}
	public HouseCarpet(int c, double carpetCost) {
		this.rooms = new RoomDimension[c];
		this.cost = carpetCost;
		this.totalArea = 0.0;
		
		for(int i = 0; i < c; i++) {
            this.rooms[i] = new RoomDimension(0.0, 0.0);
        }
	}
	public String toString() {
		String result = "Total Rooms: " + rooms.length + ", Total Area: " +totalArea+  ", Total Carpet Cost: " + getCarpetCost();
		return result;
	}
	public int isFanSuitable(Fan fan) {
		int count = 0;
		for (int j=0; j< rooms.length; j++) {
			double roomArea = rooms[j].getArea();
			if (fan.isSuitable(roomArea)) {
				count++;
			}
		}
		return count;
	}
	
}
