package model;

public class RefurbishedStore {
	private int noe;
	private Entry[] privatearray;
	
	public RefurbishedStore() {
		this.noe = 0;
		this.privatearray = new Entry[5];
	}
	
	public int getNumberOfEntries() {
		return this.noe;
	}
	public Entry[] getPrivateEntriesArray() {
		return this.privatearray;
	}
	public Entry[] getEntries() {
		Entry[] temp = new Entry[noe];
		if (noe>0) {
			for (int i=0; i<noe; i++) {
				temp[i] = privatearray[i];
			}
		} return temp;
	}
	
	public void addEntry(Entry e) {
		privatearray[noe] = e;
		noe++;
	}
	public void addEntry(String s, Product p) {
		addEntry(new Entry(s, p));
	}
	public void addEntry(String s, String prod, double price) {
		addEntry(s, new Product(prod, price));
	}
	
	public Product getProduct(String prod) {
		for (int i=0; i<noe; i++) {
			if (privatearray[i].getSerialNumber().equals(prod)) {
				return privatearray[i].getProduct();
			}
		} return null;
	}
	
	public String[] getSpaceGreyOrPro() {
		String[] temp = new String[noe];
		int counter = 0;
		for (int i=0; i<noe;i++) {
			Entry e = privatearray[i];
			if (e.getProduct().getFinish().equals("SpaceGrey") ||
					e.getProduct().getModel().contains("Pro")) {
				temp[counter] = e.getSerialNumber();
				counter++;
			}
		}
		String[] result = new String[counter];
		for (int i=0; i<counter; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	public String[] getSpaceGreyPro() {
		String[] temp = new String[noe];
		int counter = 0;
		for (int i=0; i<noe;i++) {
			Entry e = privatearray[i];
			if (e.getProduct().getFinish().equals("Space Grey") &&
					e.getProduct().getModel().contains("Pro")) {
				temp[counter] = e.getSerialNumber();
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
