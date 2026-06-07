package model;

public class Blueprint {
	private int used;
	private int max;
	private Floor[] floors;
	
	public Blueprint(int maxFloors) {
	this.max = maxFloors;	
	this.floors = new Floor[maxFloors];
	}
	
	public Blueprint(Blueprint b) {
		this(b.max);
		this.used = b.used;
		this.floors = b.getFloors();
	}
	
	public String toString() {
		String result = String.format("%.1f percents of building blueprint completed (%d out of %d floors)", 
				(double)used/max*100, used, max);
		return result;
	}
	
	public void addFloorPlan(Floor f) {
		floors[used] =f;
		used++;
	}
	
	public Floor[] getFloors() {
		Floor[] result = new Floor[used];
		for (int i=0; i<used; i++) {
			result[i] = new Floor(floors[i]);
		} return result;
	}
}
