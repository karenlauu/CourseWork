package model;

public class Entry{
	Product p;
	String serialNumber;
	
	public Entry(String str, Product p) {
		this.serialNumber = str;
		this.p = p;
	}

	public Product getProduct() {
		return p;
	}

	public void setProduct(Product p) {
		this.p = p;
	}
	
	public void setProduct(String str, double price) {
		setProduct(new Product(str, price));
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String toString() {
		String s = "[" + serialNumber + "] " + p.toString();
		return s;
	}
	
}