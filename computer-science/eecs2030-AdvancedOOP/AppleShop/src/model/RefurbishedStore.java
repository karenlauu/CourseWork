package model;
public class RefurbishedStore{
	int numberOfEntries;
	Entry[] privateEntriesArray;
	
	public RefurbishedStore() {
		this.numberOfEntries = 0;
		privateEntriesArray = new Entry[5];
	}

	public int getNumberOfEntries() {
		return numberOfEntries;
	}

	public Entry[] getPrivateEntriesArray() {
		return privateEntriesArray;
	}
	
	public Entry[] getEntries() {
		Entry[] result = new Entry[numberOfEntries];
		for (int i=0; i<numberOfEntries; i++) {
			result[i] = privateEntriesArray[i];
		} return result;
	}
	
	public void addEntry(Entry e) {
		privateEntriesArray[numberOfEntries] = e;
		numberOfEntries++;
	}
	public void addEntry(String str, Product p) {
		addEntry(new Entry(str, p));
	}
	public void addEntry(String str1, String str2, double num) {
		addEntry(new Entry(str1, new Product(str2, num)));
	}
	public Product getProduct(String str) {
		for (int i=0; i<numberOfEntries; i++) {
			if (privateEntriesArray[i].getSerialNumber().equals(str)) {
				return privateEntriesArray[i].getProduct();
			}
		} return null;
	}
	
	public String[] getSpaceGreyOrPro() {
		int count = 0;
		Entry[] results = new Entry[numberOfEntries];
		for (int i=0; i<numberOfEntries; i++) {
			if((privateEntriesArray[i].getProduct().getFinish().equals("Space Grey"))|| (privateEntriesArray[i].getProduct().getModel().contains("Pro"))) {
				results[count] = privateEntriesArray[i];
				count++;
			}
		}
		String[] result = new String[count];
		for (int j=0; j<count; j++) {
			result[j] = results[j].getSerialNumber();
		}
		return result;
	}
	public String[] getSpaceGreyAndPro() {
		int count = 0;
		Entry[] results = new Entry[numberOfEntries];
		for (int i=0; i<numberOfEntries; i++) {
			if((privateEntriesArray[i].getProduct().getFinish().equals("Space Grey"))&& (privateEntriesArray[i].getProduct().getModel().contains("Pro"))) {
				results[count] = privateEntriesArray[i];
				count++;
			}
		}
		String[] result = new String[count];
		for (int j=0; j<count; j++) {
			result[j] = results[j].getSerialNumber();
		}
		return result;
	}


	
}
