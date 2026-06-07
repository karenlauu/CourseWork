package model;

public class RetailStore {
	private String store;
	private int[] stock;
	private String[] products;
	private int nop;
	private StoreManager storeManager;
	
	public RetailStore(String store) {
		this.store = store;
		this.stock = new int[6];
		this.products = new String[6];
	}
	public void setManager(StoreManager m) throws TooManyStoresException {
		if (m.getNos() + 1 > 3) {
			throw new TooManyStoresException("Managing too much");
		}
		
		this.storeManager = m;
		m.addStore(this);
	}
	
	public String getName() {
		return this.store;
	}
	public StoreManager getManager() {
		return this.storeManager;
	}
	
	public int findProduct(String product) {
		int index = -1;
		for (int i=0; i<nop; i++) {
			if (products[i].equals(product)) {
				index = i;
			}
		} return index;
	}
	
	public int getAvailableStock(String product) {
		int index = findProduct(product);
		int result = 0;
		if (index != -1) {
			result = stock[index];
		} return result;
	}
	
	public void addStock(String product, int quant) {
		int index = findProduct(product);
		if (index != -1) {
			stock[index] += quant;
		} else {
			products[nop] = product;
			stock[nop] = quant;
			nop++;
		}
	}
	
	public void submitOrder(CustomerProfile p, String product, int quant, String date) throws InsufficientStockException {
		int index = findProduct(product);
		if (index == -1 || quant > this.getAvailableStock(product)) {
			p.order();
			String s = String.format("Last order of %d %s in %s requested by %s failed", 
					quant, product, this.store, p.getName());
			p.setStatus(s);
			throw new InsufficientStockException("Insufficient stock");
		}
		stock[index] -= quant;
		p.order();
		String s = String.format("Last order of %d %s in %s requested by %s succeeded", 
				quant, product, this.store, p.getName());
		p.setStatus(s);
		
	}
	
	public String[] findProductsInOtherStores(String product) {
		String[] temp = new String[3];
		int counter = 0;
		for (int i=0; i< storeManager.getNos(); i++) {
			RetailStore[] stores = storeManager.getStores();
			if (stores[i].findProduct(product) != -1 && stores[i]!= this) {
				temp[counter] = stores[i].getName() + ": " + stores[i].getAvailableStock(product);
				counter++;
			}
		}
		String[] result = new String[counter];
		for (int i=0; i<counter; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	
}
