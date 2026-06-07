package model;

public class Vaccine {
	private String code;
	private String type;
	private String manufacturer;
	
	public Vaccine(String code, String type, String manufacturer) {
		this.code =code;
		this.type = type;
		this.manufacturer = manufacturer;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String checkVaccine(String code) {
		String result = "Unrecognized vaccine";
		if (code.equals("mRNA-1273") || 
				code.equals("BNT162b2") ||
				code.equals("Ad26.COV2.S") ||
				code.equals("AZD1222")) {
			result = "Recognized vaccine";
		} return result;
	}
	
	public String toString() {
		String result = String.format("%s: %s (%s; %s)",
				checkVaccine(this.code), this.code, this.type, this.manufacturer);
		return result;
	}
}
