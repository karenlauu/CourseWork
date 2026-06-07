package model;

public class WeatherPerson {
	private String name;
	private static WeatherPerson instance=null;
	private WeatherApp[] apps;
	private int noa;

	public WeatherPerson() {
		this.apps = new WeatherApp[100];
	}

	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name = s;
	}
	public static void resetWeatherPerson() {
		instance = null;
	}

	public static WeatherPerson getInstance() {
		if (instance == null) {
			instance = new WeatherPerson();
		} return instance;
	}
	
	public void addApp(WeatherApp a) {
		apps[noa] = a;
		noa++;
	}
	public int countDummy() {
		int count = 0;
		for (int i=0; i<noa; i++) {
			if (apps[i] instanceof DummyApp) {
				count++;
			}
		}return count;
	}
	public int countSensor() {
		int count = 0;
		for (int i=0; i<noa; i++) {
			if (apps[i] instanceof SensorApp) {
				count++;
			}
		}return count;
	}
	
	public WeatherApp[] getWeahterApps() {
		return this.apps;
	}
	
	public String toString() {
		String result = String.format("%s has  %d sensor apps and %d dummy apps.", this.name, countSensor(), countDummy());
		return result;
	}
}
