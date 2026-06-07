package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Entry;
import model.Product;
import model.RefurbishedStore;

public class StarterTests {
	
	/*
	 * This is a practice test completely based on your Lab0 Part1 and Part2.
	 * In the actual test, test comments can be expected to explain the intended functions of methods.   
	 */

	@Test
	public void test_product_1() {
		Product p = new Product();

		assertNull(p.getModel());

		assertTrue(p.getFinish() == null);
		assertFalse(p.getFinish() != null);

		assertTrue(p.getStorage() == 0);
		assertEquals(0, p.getStorage());

		assertFalse(p.hasCellularConnectivity());
		assertFalse(p.hasCellularConnectivity() == true);
		assertTrue(p.hasCellularConnectivity() == false);
		assertTrue(p.hasCellularConnectivity() != true);
		assertTrue(!(p.hasCellularConnectivity() == true));
		assertTrue(!p.hasCellularConnectivity());

		assertEquals(0.0, p.getOriginalPrice(), 0.1);
		assertEquals(0.0, p.getDiscountValue(), 0.1);
		assertEquals(0.0, p.getPrice(), 0.1);

		assertEquals("null null 0GB (cellular connectivity: false): $(0.00 - 0.00)", p.toString());
	} 

	@Test
	public void test_product_2() {
		Product p = new Product(new String("iPad Pro 12.9"), 1709.00);

		assertNotNull(p.getModel());
		assertEquals("iPad Pro 12.9", p.getModel());
		assertTrue(p.getModel().equals("iPad Pro 12.9"));

		assertTrue(p.getFinish() == null);
		assertFalse(p.getFinish() != null);

		assertTrue(p.getStorage() == 0);
		assertEquals(0, p.getStorage());

		assertFalse(p.hasCellularConnectivity());
		assertFalse(p.hasCellularConnectivity() == true);
		assertTrue(p.hasCellularConnectivity() == false);
		assertTrue(p.hasCellularConnectivity() != true);
		assertTrue(!(p.hasCellularConnectivity() == true));
		assertTrue(!p.hasCellularConnectivity());

		assertEquals(1709.00, p.getOriginalPrice(), 0.1);
		assertEquals(0.0, p.getDiscountValue(), 0.1);
		assertEquals(1709.00, p.getPrice(), 0.1);

		assertEquals("iPad Pro 12.9 null 0GB (cellular connectivity: false): $(1709.00 - 0.00)", p.toString());
	}
	
	@Test
	public void test_product_3() {
		Product p = new Product(new String("iPad Pro 12.9"), 1709.00);

		assertNotNull(p.getModel());
		assertEquals("iPad Pro 12.9", p.getModel());
		assertTrue(p.getModel().equals("iPad Pro 12.9"));

		p.setFinish("Space Grey");
		assertFalse(p.getFinish() == null);
		assertTrue(p.getFinish() != null);
		assertEquals("Space Grey", p.getFinish());
		assertTrue(p.getFinish().equals("Space Grey"));
		
		p.setStorage(1000); // 1TB
		assertTrue(p.getStorage() == 1000);
		assertEquals(1000, p.getStorage()); 

		p.setHasCellularConnectivity(true);
		assertFalse(!p.hasCellularConnectivity());
		assertFalse(p.hasCellularConnectivity() == false);
		assertTrue(p.hasCellularConnectivity() == true);
		assertTrue(p.hasCellularConnectivity() != false);
		assertTrue(!(p.hasCellularConnectivity() == false));
		assertTrue(!(!p.hasCellularConnectivity()));

		assertEquals(1709.00, p.getOriginalPrice(), 0.1);
		
		p.setDiscountValue(220.00);
		assertEquals(220.00, p.getDiscountValue(), 0.1);
		assertEquals(1489.00, p.getPrice(), 0.1);

		assertEquals("iPad Pro 12.9 Space Grey 1000GB (cellular connectivity: true): $(1709.00 - 220.00)", p.toString());
	}
	
	@Test
	public void test_entry_1() {
		Product p = new Product("iPad Pro 12.9", 1709.00);
		p.setFinish("Space Grey");
		p.setStorage(1000); // 1TB
		p.setHasCellularConnectivity(true);
		p.setDiscountValue(220.00);

		Entry e = new Entry("F9DN4NKQ1GC", p);
		assertEquals("F9DN4NKQ1GC", e.getSerialNumber());
		assertTrue(e.getProduct() == p);
		assertSame(e.getProduct(), p);
		assertEquals("[F9DN4NKQ1GC] iPad Pro 12.9 Space Grey 1000GB (cellular connectivity: true): $(1709.00 - 220.00)", e.toString());

		assertEquals("iPad Pro 12.9", e.getProduct().getModel());
		assertTrue(e.getProduct().getModel().equals("iPad Pro 12.9"));
		assertEquals("Space Grey", e.getProduct().getFinish());
		assertTrue(1000 == e.getProduct().getStorage());
		assertTrue(e.getProduct().hasCellularConnectivity());
		assertEquals(1709.00, e.getProduct().getOriginalPrice(), 0.1);
		assertEquals(220.00, e.getProduct().getDiscountValue(), 0.1);
		assertEquals(1489.00, e.getProduct().getPrice(), 0.1);
		assertEquals("iPad Pro 12.9 Space Grey 1000GB (cellular connectivity: true): $(1709.00 - 220.00)", e.getProduct().toString());
	}

	@Test
	public void test_entry_2() {
		Product p = new Product("iPad Pro 12.9", 1709.00);
		p.setFinish("Space Grey");
		p.setStorage(1000); // 1TB
		p.setHasCellularConnectivity(true);
		p.setDiscountValue(220.00);

		Entry e = new Entry("F9DN4NKQ1GC", p);
		assertEquals("F9DN4NKQ1GC", e.getSerialNumber());
		assertTrue(e.getProduct() == p);
		assertSame(e.getProduct(), p); 
		assertEquals("[F9DN4NKQ1GC] iPad Pro 12.9 Space Grey 1000GB (cellular connectivity: true): $(1709.00 - 220.00)", e.toString());

		Product p2 = new Product("iPad Air", 649.00);
		p2.setFinish("Gold");
		p2.setStorage(64); // 64GB
		p2.setHasCellularConnectivity(false);
		p2.setDiscountValue(100.00);

		e.setProduct(p2);

		assertEquals("F9DN4NKQ1GC", e.getSerialNumber());
		assertFalse(e.getProduct() == p);
		assertNotSame(e.getProduct(), p); 
		assertTrue(e.getProduct() == p2);
		assertSame(e.getProduct(), p2);
		assertEquals("[F9DN4NKQ1GC] iPad Air Gold 64GB (cellular connectivity: false): $(649.00 - 100.00)", e.toString());

		e.setProduct("iPad Air", 649.00);

		assertEquals("F9DN4NKQ1GC", e.getSerialNumber());
		assertFalse(e.getProduct() == p);
		assertNotSame(e.getProduct(), p); 
		assertFalse(e.getProduct() == p2);
		assertNotSame(e.getProduct(), p2);
		assertEquals("[F9DN4NKQ1GC] iPad Air null 0GB (cellular connectivity: false): $(649.00 - 0.00)", e.toString());
	}
	
	@Test
	public void test_refurbished_store_1() {
		RefurbishedStore rs = new RefurbishedStore(); // max 5 entries
		
		assertTrue(rs.getNumberOfEntries() == 0);
		assertTrue(rs.getPrivateEntriesArray().length == 5);
		assertTrue(rs.getPrivateEntriesArray()[0] == null);
		assertTrue(rs.getPrivateEntriesArray()[1] == null);
		assertTrue(rs.getPrivateEntriesArray()[2] == null);
		assertTrue(rs.getPrivateEntriesArray()[3] == null);
		assertTrue(rs.getPrivateEntriesArray()[4] == null);
		assertTrue(rs.getEntries().length == 0);
		
		Product p1 = new Product("iPad Pro 12.9", 1709.00);
		p1.setFinish("Space Grey");
		p1.setStorage(1000); // 1TB
		p1.setHasCellularConnectivity(true);
		p1.setDiscountValue(220.00);
		Entry e1 = new Entry("F9FDN4NKQ1GC", p1);
		
		rs.addEntry(e1);
		
		assertTrue(rs.getNumberOfEntries() == 1);
		assertTrue(rs.getPrivateEntriesArray().length == 5);
		assertTrue(rs.getPrivateEntriesArray()[0] == e1);
		assertTrue(rs.getPrivateEntriesArray()[1] == null);
		assertTrue(rs.getPrivateEntriesArray()[2] == null);
		assertTrue(rs.getPrivateEntriesArray()[3] == null);
		assertTrue(rs.getPrivateEntriesArray()[4] == null);
		assertTrue(rs.getEntries().length == 1);
		assertTrue(rs.getEntries()[0] == e1);
		
		Product p2 = new Product("iPad Air", 649.00);
		p2.setFinish("Gold");
		p2.setStorage(64); // 64GB
		p2.setHasCellularConnectivity(false);
		p2.setDiscountValue(100.00);

		rs.addEntry("C9FZN4J8QC82", p2);
		
		assertTrue(rs.getNumberOfEntries() == 2);
		assertTrue(rs.getPrivateEntriesArray().length == 5);
		assertTrue(rs.getPrivateEntriesArray()[0] == e1);
		assertTrue(rs.getPrivateEntriesArray()[1].getSerialNumber().equals("C9FZN4J8QC82"));
		assertTrue(rs.getPrivateEntriesArray()[1].getProduct() == p2);
		assertTrue(rs.getPrivateEntriesArray()[2] == null);
		assertTrue(rs.getPrivateEntriesArray()[3] == null);
		assertTrue(rs.getPrivateEntriesArray()[4] == null);
		assertTrue(rs.getEntries().length == 2);
		assertTrue(rs.getEntries()[0] == e1);
		assertTrue(rs.getEntries()[1].getSerialNumber().equals("C9FZN4J8QC82"));
		assertTrue(rs.getEntries()[1].getProduct() == p2);
		
		rs.addEntry("7YM4PFZ779UB", "iPad Pro 10.5", 929.00); 
		
		assertTrue(rs.getNumberOfEntries() == 3);
		assertTrue(rs.getPrivateEntriesArray().length == 5);
		assertTrue(rs.getPrivateEntriesArray()[0] == e1);
		assertTrue(rs.getPrivateEntriesArray()[1].getSerialNumber().equals("C9FZN4J8QC82"));
		assertTrue(rs.getPrivateEntriesArray()[1].getProduct() == p2);
		assertTrue(rs.getPrivateEntriesArray()[2].getSerialNumber().equals("7YM4PFZ779UB"));
		assertTrue(rs.getPrivateEntriesArray()[2].getProduct().getModel().equals("iPad Pro 10.5"));
		assertEquals(929.00, rs.getPrivateEntriesArray()[2].getProduct().getOriginalPrice(), 0.1);
		assertTrue(rs.getPrivateEntriesArray()[3] == null);
		assertTrue(rs.getPrivateEntriesArray()[4] == null);
		assertTrue(rs.getEntries().length == 3);
		assertTrue(rs.getEntries()[0] == e1);
		assertTrue(rs.getEntries()[1].getSerialNumber().equals("C9FZN4J8QC82"));
		assertTrue(rs.getEntries()[1].getProduct() == p2);
		assertTrue(rs.getEntries()[2].getSerialNumber().equals("7YM4PFZ779UB"));
		assertTrue(rs.getEntries()[2].getProduct().getModel().equals("iPad Pro 10.5"));
		assertEquals(929.00, rs.getEntries()[2].getProduct().getOriginalPrice(), 0.1);
	}
	
	@Test
	public void test_refurbished_store_2() {
		RefurbishedStore rs = new RefurbishedStore(); // max 5 entries 
		
		Product p1 = new Product("iPad Pro 12.9", 1709.00);
		p1.setFinish("Space Grey");
		p1.setStorage(1000); // 1TB
		p1.setHasCellularConnectivity(true);
		p1.setDiscountValue(220.00);
		Entry e1 = new Entry("F9FDN4NKQ1GC", p1);

		rs.addEntry(e1); 
		
		Product p2 = new Product("iPad Air", 649.00);
		p2.setFinish("Gold");
		p2.setStorage(64); // 64GB
		p2.setHasCellularConnectivity(false);
		p2.setDiscountValue(100.00);

		rs.addEntry("C9FZN4J8QC82", p2); 

		rs.addEntry("7YM4PFZ779UB", "iPad Pro 10.5", 929.00); 
		
		assertTrue(rs.getProduct("F9FDN4NKQ1GC") == p1);
		assertTrue(rs.getProduct("C9FZN4J8QC82") == p2);
		assertTrue(rs.getProduct("7YM4PFZ779UB").getModel().equals("iPad Pro 10.5"));
		assertTrue(rs.getProduct("7YM4PFZ779UB").getFinish() == null);
		assertTrue(rs.getProduct("7YM4PFZ779UB").getStorage() == 0);
		assertTrue(rs.getProduct("7YM4PFZ779UB").hasCellularConnectivity() == false);
		assertEquals(929.00, rs.getProduct("7YM4PFZ779UB").getOriginalPrice(), 0.1);
		assertEquals(0.0, rs.getProduct("7YM4PFZ779UB").getDiscountValue(), 0.1);
		
		rs.getProduct("7YM4PFZ779UB").setFinish("Silver");
		rs.getProduct("7YM4PFZ779UB").setStorage(256); // 256GB
		Product p3 = rs.getEntries()[2].getProduct();
		p3.setHasCellularConnectivity(false);
		p3.setDiscountValue(270.00);
		
		assertTrue(rs.getProduct("7YM4PFZ779UB").getModel().equals("iPad Pro 10.5"));
		assertTrue(rs.getProduct("7YM4PFZ779UB").getFinish().equals("Silver"));
		assertTrue(rs.getProduct("7YM4PFZ779UB").getStorage() == 256);
		assertTrue(rs.getProduct("7YM4PFZ779UB").hasCellularConnectivity() == false);
		assertEquals(929.00, rs.getProduct("7YM4PFZ779UB").getOriginalPrice(), 0.1);
		assertEquals(270.0, rs.getProduct("7YM4PFZ779UB").getDiscountValue(), 0.1);
	}
	
	@Test
	public void test_refurbished_store_3() {
		RefurbishedStore rs = new RefurbishedStore(); // max 5 entries 
		
		Product p1 = new Product("iPad Pro 12.9", 1709.00);
		p1.setFinish("Space Grey");
		p1.setStorage(1000); // 1TB
		p1.setHasCellularConnectivity(true);
		p1.setDiscountValue(220.00);
		Entry e1 = new Entry("F9FDN4NKQ1GC", p1);
		
		rs.addEntry(e1); 
		
		Product p2 = new Product("iPad Air", 649.00);
		p2.setFinish("Gold");
		p2.setStorage(64); // 64GB
		p2.setHasCellularConnectivity(false);
		p2.setDiscountValue(100.00);

		rs.addEntry("C9FZN4J8QC82", p2); 

		rs.addEntry("7YM4PFZ779UB", "iPad Pro 10.5", 929.00);

		rs.getProduct("7YM4PFZ779UB").setFinish("Silver");
		rs.getProduct("7YM4PFZ779UB").setStorage(256); // 256GB
		Product p3 = rs.getEntries()[2].getProduct();
		p3.setHasCellularConnectivity(false);
		p3.setDiscountValue(270.00);
		
		assertTrue(rs.getSpaceGreyOrPro().length == 2);
		assertTrue(
			rs.getSpaceGreyOrPro()[0].equals("F9FDN4NKQ1GC")
			&&
			rs.getSpaceGreyOrPro()[1].equals("7YM4PFZ779UB"));
		
		assertTrue(rs.getSpaceGreyPro().length == 1);
		assertTrue(rs.getSpaceGreyPro()[0].equals("F9FDN4NKQ1GC"));
	}
}