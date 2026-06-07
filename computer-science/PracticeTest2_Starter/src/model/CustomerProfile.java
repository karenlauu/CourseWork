package model;

public class CustomerProfile {
	private String name;
	private int noo;
	private String[] orders;
	private boolean ordered;
	private String status;

	public CustomerProfile(String name, int maxOrders) {
		this.name = name;
		this.orders = new String[maxOrders];

	}
	public void order() {
		this.ordered = true;
	}
	public void setStatus(String s) {
		this.status = s;
	}
	public String getName() {
		return this.name;
	}

	public String getProfileReport() {
		String result = null;
		if (noo==0) {
			result = String.format("%s has not yet placed any orders", this.name);
		} else {
			result = String.format("%s has placed %d orders <%s>", this.name, this.noo, orderList());
		}
		return result;
	}

	public String getStatusofLastOrder() {
		String result = null;

		if (!ordered) {
			result = String.format("No order has been placed for %s yet", this.name);
		} else {
			result = this.status;
		}
		return result;
	}

	public boolean checkProduct(String product) {
		boolean result = false;
		if (product.equals("iPad Mini") ||
				product.equals("iPad Pro 12.9") || 
				product.equals("Apple Magic Keyboard") ||
				product.equals("Surface Pro 9") ||
				product.equals("Surface Laptop 5") ||
				product.equals("iSurface Pro Keyboard with Slim Pen 2")) {
			result = true;
		} return result;
	}

	public String productType(String product) {
		String result = null;
		if (product.equals("iPad Mini") ||
				product.equals("iPad Pro 12.9") || 
				product.equals("Apple Magic Keyboard")) {
			result = "Apple product";
		} else {
			result = "Microsoft product";
		} return result;
	}

	public void addOrder(String product, int quant, String store, String date) throws InvalidProductKindException {
		if (!checkProduct(product)) {
			throw new InvalidProductKindException("Invalid");
		}

		orders[noo] = String.format("%d %s %s in %s on %s", quant, productType(product), product, store, date);
		noo++;
	}

	public String orderList() {
		String result = "";
		for (int i=0; i<noo; i++) {
			result += orders[i];
			if (i<noo-1) {
				result += "; ";
			}
		} return result;
	}


	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj == null) {return false;}
		if (this.getClass()!= obj.getClass()) {return false;}

		boolean result = true;
		CustomerProfile other = (CustomerProfile) obj;
		if (this.noo != other.noo || !(this.name.equals(other.name))) {return false;}
		for (int i=0; result && i< noo; i++) {
			if (!(this.orders[i].equals(other.orders[i]))) {
				result = false;
			}
		} return result;
	}

}
