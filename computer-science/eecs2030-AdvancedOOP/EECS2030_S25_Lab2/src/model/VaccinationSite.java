package model;

public class VaccinationSite {
	private String name;
	private int total;
	private Vaccine[] order;
	private int[] supply;
	private int nov;
	private int limit;
	private HealthRecord[] appointments;
	private int noa;
	
	public VaccinationSite(String site, int limit) {
		this.name = site;
		this.order = new Vaccine[4];
		this.supply = new int[4];
		this.limit = limit;
		this.appointments = new HealthRecord[10];
	}
	
	public int getNumberOfAvailableDoses() {
		return this.total;
	}
	
	public int getNumberOfAvailableDoses(String v) {
		int index = findVaccine(v);
		int result = 0;
		if (index!= -1) {
			result= supply[index];
		} return result;
	}
	
	public int findVaccine(String v) {
		int index = -1;
		for (int i=0; i<nov; i++) {
			if (v.equals(order[i].getCode())) {
				index = i;
			}
		} return index;
	}
	
	public void addDistribution(Vaccine v, int doses) throws UnrecognizedVaccineCodeNameException, TooMuchDistributionException {
		if (!(v.checkVaccine(v.getCode()).contains("Recognized"))) {
			throw new UnrecognizedVaccineCodeNameException("Unregulated Vaccine");
		}
		if (doses + this.total > limit) {
			throw new TooMuchDistributionException("Over supply");
		}
		
		int index = findVaccine(v.getCode());
		if (index == -1) {
			supply[nov] = doses;
			order[nov] = v;
			this.total += doses;
			nov++;
		} else {
			supply[index] += doses;
			this.total += doses;
		}
	}
	
	public String vaccineList() {
		String result = "";
		for (int i=0; i<nov; i++) {
			result += supply[i] + " doses of " + order[i].getManufacturer();
			if (i< nov-1) {
				result += ", ";
			}
		}return result;
	}
	
	public void bookAppointment(HealthRecord h) throws InsufficientVaccineDosesException {
		if (noa +1 > this.total) {
			String s = String.format("Last vaccination appointment for %s with %s failed",
					h.getName(),this.name);
			h.booked();
			h.setStatus(s);
			throw new InsufficientVaccineDosesException("Too many appointments");
		}
		appointments[noa] = h;
		noa++;
		h.booked();
		String s = String.format("Last vaccination appointment for %s with %s succeeded",
				h.getName(),this.name);
		h.setStatus(s);
		
	}
	
	
	public void administer(String date) {
		int noaa = noa;
		for (int i=0; i<noaa; i++) {
			HealthRecord patient = appointments[i];
			
			boolean found = false;
			int index = -1;
			for (int j=0; !found && j<nov; j++) {
				if (supply[j]>0) {
					found = true;
					index = j;
				}
			}
			
			supply[index]--;
			total--;
			noa--;
			
			patient.addRecord(order[index], this.name, date);
			
		}
	}
	
	public String toString() {
		String result = null;
		if (nov==0) {
			result = String.format("%s has %d available doses: <>", this.name, this.total);
		} else if (nov>0 && total >0) {
			result = String.format("%s has %d available doses: <%s>", this.name, this.total, this.vaccineList());
		} else if (total== 0 &&  nov>0) {
			result = String.format("%s has 0 available doses: <%s>", this.name, this.vaccineList());
		}
		
		return result;
	}
}
