package model;

public class StoreManager {
	private static StoreManager instance = null;
	private String name;
	private RetailStore[] stores;
	private int nos;
	
	public int getNos() {
		return this.nos;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String s) {
		this.name = s;
	}
	public StoreManager() {
		this.stores = new RetailStore[3];
	}
	
	public static StoreManager getInstance() {
		if (instance == null) {
			instance = new StoreManager();
		} return instance;
	}
	
	public static void resetManager() {
		instance = null;
	}
	public void addStore(RetailStore s) {
		stores[nos] = s;
		nos++;
	}
	
	public RetailStore[] getStores() {
		return this.stores;
	}
}
