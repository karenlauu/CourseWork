package model;

public class Floor {
	private int capacity;
	private int used;
	private Unit[] units;
	private int nou;

	public Floor(int capacity) {
		this.capacity = capacity;
		this.units = new Unit[10];
	}
	
	public Floor(Floor f) {
		this(f.capacity);
		this.units = f.units;
		this.used = f.used;
		this.nou = f.nou;
	}

	public void addUnit(String room, int width, int length) throws InsufficientFloorSpaceException{
		Unit u = new Unit(room, width, length);
		if (u.getArea() + used > capacity) {
			throw new InsufficientFloorSpaceException("Exceeds capacity");
		}

		units[nou] = u;
		nou++;
		this.used += u.getArea();
	}

	public String roomList() {
		String result = "";
		for (int i=0; i<nou; i++) {
			Unit u = units[i];
			result += u.getRoom() + ": " + u.getArea() + " sq ft (" + u.getWidth() + "' by "; 
			result += u.getLength() + "')"; ;
			if (i< nou-1) {
				result += ", ";
			}
		} return result;
	}

	public String toString() {
		String result=null;
		if (nou == 0) {
			result = String.format("Floor's utilized space is %d sq ft (%d sq ft remaining): []", 
					this.used, capacity - used);
		} else {
			result= String.format("Floor's utilized space is %d sq ft (%d sq ft remaining): [%s]", 
					this.used, capacity-used, roomList());
		} return result;

	}

	public int equalUnits(Unit u) {
		int count = 0;
		for (int i=0; i<this.nou; i++) {
			if (units[i].equals(u)) {
				count++;
			}
		} return count;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj == null) {return false;}
		if (this.getClass()!= obj.getClass()) {return false;}

		boolean result = true;
		Floor other = (Floor) obj;
		if (this.capacity != other.capacity || this.nou != other.nou) {return false;}
		for (int i=0; result && i<nou; i++) {
			Unit u = this.units[i];
			if (this.equalUnits(u) != other.equalUnits(u)) {
				result=false;
			}
		} return result;
	}

}
