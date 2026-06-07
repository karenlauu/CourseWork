package model;

public class AppStore {

	private String branch;
	private App[] apps;
	private int noa;
	
	public AppStore(String country, int maxApp) {
		this.branch = country;
		this.apps = new App[maxApp];
		this.noa = 0;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public App getApp(String appName) {
		for (int i=0; i< noa; i++) {
			if (apps[i].getName().equals(appName)) {
				return apps[i];
			}
		} return null;
	}
	
	public void addApp(App a) {
		apps[noa] = a;
		noa++;
	}
	
	public String[] getStableApps(int num) {
		String[] temp = new String[noa];
		int counter = 0;
		for (int i=0; i<noa; i++) {
			App a = apps[i];
			if (a.getNou()>= num) {
				String s = String.format("%s (%d versions; Current Version: %s)", a.getName(), a.getNou(), a.getWhatIsNew());
				temp[counter] = s;
				counter++;
			}
		}
		String[] result = new String[counter]; 
		for (int i=0; i<counter; i++) {
			result[i] = temp[i];
		} return result;
	}
	
}
