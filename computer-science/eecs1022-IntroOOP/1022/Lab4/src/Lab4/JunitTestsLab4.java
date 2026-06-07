package Lab4;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class JunitTestsLab4 {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	@Test
	public void testPb_01_01() {
		assertEquals("Test 01_01 failed", "fan is off, Color: blue, Radius: 5.0", (new Fan()).toString());
	}

	@Test
	public void testPb_01_02() {
		Fan f = new Fan(Fan.FAST, Fan.ON, 3.0, "red");
		assertEquals("Test 01_02 failed", "Speed: FAST, Color: red, Radius: 3.0", f.toString());
	}
	@Test
	public void testPb_02_01() {
		assertEquals("Test 02_01 failed", "Length: 5.0, Width: 5.0", (new RoomDimension(5.0, 5.0)).toString());
	}

	@Test
	public void testPb_02_02() {
		assertEquals("Test 02_02 failed", true, (new RoomDimension(5.0, 5.0)).equals(new RoomDimension(5.0, 5.0)));
	}
	@Test
	public void testPb_02_03() {
		assertEquals("Test 02_03 failed", true, (new RoomDimension(5.0, 5.0)).isFanSuitable(new Fan(Fan.FAST, Fan.ON, 15.0, "red")));
	}
	@Test
	public void testPb_03_01() {
		assertEquals("Test 03_01 failed", 0.0, (new HouseCarpet(1, 0.0)).getCarpetCost(), 0.0);
	}

	@Test
	public void testPb_03_02() {
		assertArrayEquals("Test 03_02 failed", new double []{0.0}, (new HouseCarpet(1, 0.0)).getRoomCosts(), 0.0);
	}

	@Test
	public void testPb_03_03() {
		HouseCarpet h = new HouseCarpet(1, 2.0);
		RoomDimension [] rs = new RoomDimension [1];
		rs[0] = new RoomDimension(5.0, 4.0);
		h.setRooms(rs);
		assertEquals("Test 03_03 failed", 40.0, h.getCarpetCost(), 0.0);
	}
	@Test
	public void testPb_03_04() {
		HouseCarpet h = new HouseCarpet(1, 2.0);
		RoomDimension [] rs = new RoomDimension [1];
		rs[0] = new RoomDimension(5.0, 5.0);
		h.setRooms(rs);
		assertEquals("Test 03_03 failed", 1, h.isFanSuitable(new Fan(Fan.FAST, Fan.ON, 15.0, "red")));
	}
	
}