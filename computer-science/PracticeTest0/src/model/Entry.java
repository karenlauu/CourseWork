package model;

public class Entry {
	private String serialNumber;
	private Product product;
	
	public Entry(String serial, Product p) {
		this.serialNumber = serial;
		this.product = p;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setProduct(String prod, double price) {
		setProduct(new Product(prod, price));
	}
	
	public String toString() {
		String result = String.format("[%s] %s", this.serialNumber, this.product.toString());
		return result;
	}
	
}
