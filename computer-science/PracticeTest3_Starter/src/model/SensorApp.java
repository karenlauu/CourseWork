package model;

public class SensorApp extends WeatherApp {
	public SensorApp(String name, int num) {
		super(name, num);
	}

	public DummyApp[] getConnectedDummysOf(String station) {
		int index = findStation(station);
		if (index!= -1) {
			WeatherStation app = this.stations[index];
			return app.getDummyApps();
		}
		return new DummyApp[0];
	}
}
