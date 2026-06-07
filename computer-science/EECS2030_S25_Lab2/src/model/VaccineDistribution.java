package model;

public class VaccineDistribution {
	private Vaccine vaccine;
	private int supply;
	
	public VaccineDistribution(Vaccine v, int supply) {
		this.vaccine = v;
		this.supply = supply;
	}
	
	public String toString() {
		String result = String.format("%d doses of %s by %s", 
				this.supply, this.vaccine.getCode(), this.vaccine.getManufacturer());
		return result;
	}
}
