package model;

public class WeatherApp {
	protected String name;
	protected WeatherStation[] stations;
	protected int nos;

	public WeatherApp(String name, int maxStation) {
		this.name =name;
		this.stations = new WeatherStation[maxStation];
	}
	
	public String getName() {
		return this.name;
	}
	
	public String stationList() {
		String result = "";
		for (int i=0; i<nos; i++) {
			result += stations[i].getName();
			if (i< nos-1) {
				result += ", ";
			}
		}return result;
	}
	
	public int findStation(String s) {
		int index =-1;
		for (int i=0; i<nos; i++) {
			if (stations[i].getName().equals(s)) {
				index = i;
			}
		} return index;
	}
	
	public String toString() {
		String result = null;
		String type = null;
		if (this instanceof DummyApp) {
			type = "Dummy App";
		} else { 
			type = "Sensor App";
		}
		if (nos == 0) {
			result = String.format("Weather %s %s is connected to no stations.", 
					type, this.name);
		}else {
			 result = String.format("Weather %s %s is connected to %d stations: <%s>.", 
						type, this.name, this.nos, stationList());
		} return result;
	}
	
	public void connect(WeatherStation station) {
		stations[nos] = station;
		nos++;
	}
}
