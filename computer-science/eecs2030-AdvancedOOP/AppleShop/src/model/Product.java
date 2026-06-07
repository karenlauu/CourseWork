package model;

public class Product{ 
	String model;
	String finish;
	int storage;
	boolean cellularConnectivity;
	double originalPrice;
	double discountValue;
	
	public Product() {	
	}
	public Product(String str, double price) {
		this.model = str;
		this.originalPrice = price;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public boolean hasCellularConnectivity() {
		return cellularConnectivity;
	}

	public void setHasCellularConnectivity(boolean cellularConnectivity) {
		this.cellularConnectivity = cellularConnectivity;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getPrice() {
		return (originalPrice - discountValue);
	}
	
	public String toString() {
		String s = model + " " + finish + " " + storage + "GB (cellular connectivity: " + cellularConnectivity;
		s += "): $(" + String.format("%.2f", originalPrice) + " - " + String.format("%.2f", discountValue) + ")";
		return s;
	}
}
