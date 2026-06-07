package model;

public class Product {
	private String model;
	private String finish;
	private int storage;
	private boolean cellularConnectivity;
	private double originalPrice;
	private double discountValue;
	
	public Product() {
		
	}
	public Product(String product, double op) {
		this.model = product;
		this.originalPrice = op;
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

	public void setOriginalPrice(double price) {
		this.originalPrice = price;
	}

	public double getPrice() {
		return this.originalPrice - this.discountValue;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public String toString() {
		String result = String.format("%s %s %dGB (cellular connectivity: %s): "
				+ "$(%.2f - %.2f)", this.model, this.finish, this.storage, this.cellularConnectivity,
				this.originalPrice, this.discountValue);
		return result;
	}
	
}
