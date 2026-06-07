package model;

public class Unit {
	private String room;
	private int width;
	private int length;
	private double widthm;
	private double lengthm;
	private boolean toggle; // false: measured in feet, true: measured in metres

	public Unit(String room, int width, int length) {
		this.room = room;
		this.width = width;
		this.length = length;
		this.lengthm = length*0.3048;
		this.widthm = width*0.3048;
	}
	
	public int getArea() {
		return length*width;
	}
	
	public double getAreaM() {
		return lengthm*widthm;
	}
	public void toggleMeasurement() {
		if (toggle) {
			toggle = false;
		}else {
			toggle = true;
		}
	}
	public int getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	
	public String getRoom() {
		return this.room;
	}

	public String toString() {
		String result = null;
		if (!toggle) {
			result = String.format("A unit of %d square feet (%d' wide and %d' long)"
					+ " functioning as %s", length*width, width, length, room);
		} else {
			result = String.format("A unit of %.2f square meters (%.2f m wide and %.2f m long)"
					+ " functioning as %s", getAreaM(), widthm, lengthm, room);
		}return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj == null) {return false;}
		if (this.getClass()!= obj.getClass()) {return false;}
		
		boolean result = false;
		Unit other = (Unit) obj;
		if (this.room.equals(other.room) && this.getArea()==other.getArea()) {
			result = true;
		} return result;
	}

}
