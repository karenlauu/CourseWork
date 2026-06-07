package model;

public class WeatherStation {
	private String name;
	private int noa;
	private WeatherApp[] apps;
	
	public WeatherStation(String name) {
		this.name =name;
		this.apps = new WeatherApp[2];
	}
	
	public String getName() {
		return this.name;
	}
	public WeatherApp[] getInternalAppsArray() {
		return this.apps;
	}
	public WeatherApp[] getApps() {
		WeatherApp[] result = new WeatherApp[noa];
		for (int i=0; i<noa; i++) {
			result[i] = this.apps[i];
		} return result;
	}
	
	public String appList() {
		String result = "";
		for (int i=0; i< noa; i++) {
			if (apps[i] instanceof DummyApp) {
				result += "Weather Dummy App ";
			}else {
				result += "Weather Sensor App ";
			}
			result += apps[i].getName();
			if (i< noa-1) {
				result += ", ";
			}
		} return result;
	}
	
	public void connect(WeatherApp app) {
		if (noa+1 > apps.length) {
			WeatherApp[] temp = new WeatherApp[apps.length+3];
			for (int i=0; i<noa; i++) {
				temp[i] = apps[i];
			} apps= temp;
		}
		
		apps[noa] = app;
		noa++;
		app.connect(this);
		
	}
	
	public DummyApp[] getDummyApps() {
		DummyApp[] temp = new DummyApp[noa];
		int counter = 0;
		
		for (int i=0; i<noa; i++) {
			if (apps[i] instanceof DummyApp) {
				temp[counter] = (DummyApp) apps[i];
				counter++;
			}
		}
		DummyApp[] result= new DummyApp[counter];
		for (int i=0; i<counter; i++) {
			result[i] = temp[i];
		} return result;
		
	}
	
	public String toString() {
		String result = null;
		if (noa==0) {
			result = String.format("%s has no connected apps.", this.name);
		}else {
			result = String.format("%s is connected by %d apps: <%s>.", this.name, this.noa, appList());
		} return result;
	}
	
	
}
