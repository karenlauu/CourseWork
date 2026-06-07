package model;

public class Account {
	private AppStore store;
	private String name;
	private String update;
	private App[] downloaded;
	private int nod;

	public Account(String name, AppStore store) {
		this.name = name;
		this.store = store;
		this.downloaded = new App[10];
		this.nod = 0;

		this.update = String.format("An account linked to the %s store is created for %s.", 
				this.store.getBranch(), this.name);
	}

	public String[] getNamesOfDownloadedApps() {
		String[] result = new String[nod];
		for (int i=0; i<nod; i++) {
			result[i] = downloaded[i].getName();
		}
		return result;
	}

	public App[] getObjectsOfDownloadedApps() {
		App[] result = new App[nod];
		for (int i=0; i<nod; i++) {
			result[i] = downloaded[i];
		}
		return result;
	}

	public void uninstall(String appName) {
		int index = findApp(appName);
		if (index!= -1) {
			for (int i=index; i<nod-1;i++) {
				downloaded[index] = downloaded[index+1];
			}downloaded[nod-1]=null;
			nod--;
			this.update = String.format("%s is successfully uninstalled for %s.", appName, this.name);
		} else {
			this.update = String.format("Error: %s has not been downloaded for %s.", appName, this.name);
		}
	}

	public void submitRating(String appName, int rate) {
		int index = findApp(appName);
		if (index!= -1) {
			downloaded[index].submitRating(rate);
			this.update = String.format("Rating score %d of %s is successfully submitted for %s.", rate, this.name, appName);
		} else {
			this.update = String.format("Error: %s is not a downloaded app for %s.", appName, this.name);
		}
	}

	public void switchStore(AppStore a) {
		this.store = a;
		this.update = String.format("Account for %s is now linked to the %s store.", this.name, this.store.getBranch());
	}

	public int findApp(String appName) {
		int index = -1;
		for (int i=0;i<nod; i++) {
			if (downloaded[i].getName().equals(appName)) {
				index = i;
			}
		} return index;
	}

	public void download(String appName) {
		int index = findApp(appName);
		if (index == -1) {
			downloaded[nod] = store.getApp(appName);
			nod++;
			this.update = String.format("%s is successfully downloaded for %s.", appName, this.name);
		} else {
			this.update = String.format("Error: %s has already been downloaded for %s.", appName, this.name);
		}
	}

	public String toString() {
		return this.update;
	}
}
