package model;

public class HealthRecord {
	private String name;
	private String[] receipt;
	private int nov;
	private boolean scheduled;
	private String status;
	
	public HealthRecord(String name, int limit) {
		this.name = name;
		this.receipt = new String[limit];
		this.nov = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public String getVaccinationReceipt() {
		String result = null;
		if (nov == 0) {
			result = String.format("%s has not yet received any doses.", this.name);
		} else {
			result = String.format("Number of doses %s has received: %d [%s]", 
					this.name, this.nov, vaccineList());
		}
		return result;
	}
	
	public void setStatus(String s) {
		this.status = s;
	}
	public void booked() {
		this.scheduled = true;
	}
	
	public String getAppointmentStatus() {
		String result = null;
		if (!scheduled) {
			result = String.format("No vaccination appointment for %s yet", this.name);
		} else {
			result = this.status;
		}
		return result;
	}
	
	public String vaccineList() {
		String result = "";
		for (int i=0; i<nov; i++) {
			result += receipt[i];
			if (i<nov-1) {
				result += "; ";
			}
		}return result;
	}
	
	public void addRecord(Vaccine v, String site, String date) {
		String s = v.toString() + " in " + site + " on " + date;
		receipt[nov] = s;
		nov++;
	}
	
}
