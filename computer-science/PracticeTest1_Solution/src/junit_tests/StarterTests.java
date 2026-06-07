package junit_tests;

import static org.junit.Assert.*;
import org.junit.Test;

import model.*; 
/*
 * A Registrar system stores a list of up to 100 transcripts. 
 * 
 * Each transcript is characterized by a student’s unique name (e.g., "Sunhye") 
 * 	and a list of up to 60 current registrations.
 *   
 * Each registration is characterized by the course name (e.g., "CSE1"), 
 * 	its number of credits (e.g., 3), and the raw marks (out of 100) for that student (e.g., 78). 
 * 
 * For more details, see the in-line comments and test methods given to you below.
 */

public class StarterTests {

	@Test
	public void test_01() {
		/* Create a new registration for CSE114 with 4 credits and raw marks 59 (out of 100).
		 * Requirement: Credits and marks are both integers, NOT double. 
		 */
		Registration r1 = new Registration("CSE114", 4, 59);

		assertEquals("CSE114", r1.getCourseName());
		assertEquals(4, r1.getNumberOfCredits(), 0.01);
		assertEquals(59, r1.getMarks()); 
	}

	@Test
	public void test_02() {
		/* Create a new registration for CSE214 with 3 credits. */
		Registration r2 = new Registration("CSE214", 3);

		assertEquals("CSE214", r2.getCourseName());
		assertEquals(3, r2.getNumberOfCredits(), 0.01);
		assertEquals(0, r2.getMarks());
	}

	@Test
	public void test_03() {
		Registration r2 = new Registration("CSE214", 3);
		/* Change marks of the registration. */
		r2.setMarks(34);

		assertEquals("CSE214", r2.getCourseName());
		assertEquals(3, r2.getNumberOfCredits(), 0.01);
		assertEquals(34, r2.getMarks()); 
	}

	@Test
	public void test_04() {
		Registration r = new Registration("CSE214", 3, 49); 

		/* Here is the map from numerical raw marks to string letter grades:
		 * Marks >= 90			: "A+"
		 * 80 <= Marks <  90	: "A"
		 * 70 <= Marks <  80	: "B"
		 * 60 <= Marks <  70	: "C"
		 * 50 <= Marks <  60	: "D"
		 * Marks < 50			: "F"
		 */
		assertEquals("F", r.getLetterGrade());
		/* Your implemented `getLetterGrade` should also work for other input values. */
	}

	@Test
	public void test_05() {
		Registration r = new Registration("CSE214", 5, 49); 

		/*
		 * Weighted Grade Point: grade point * number of credits.
		 * Here is the map from string letter grades to numerical grade points:
		 * "A+"	: 9
		 * "A"	: 8
		 * "B"	: 7
		 * "C" 	: 6
		 * "D"	: 5
		 * "F"	: 0
		 * For example, for r1 with letter grade B (and hence grade point 7) and 3 credits, 
		 * its weighted grade point is 7 * 3. 
		 */
		assertEquals(0 * 5, r.getWeightedGradePoint()); 
		/* Your implemented `getWeightedGradePoint` should also work for other input values. */
	} 

	@Test
	public void test_06() {
		Transcript alan = new Transcript("Alan"); 
		/* Return, as an array, all the stored registrations in the transcript. 
		 * Initially, no registrations have been added to the transcript yet.
		 */
		Registration[] alanRegistrations = alan.getReport();

		assertEquals(0, alanRegistrations.length); 
	}

	@Test
	public void test_07() {
		Registration r1 = new Registration("CSE303", 6, 79);
		Transcript alan = new Transcript("Alan"); 
		/* Add a registration object to the transcript. */
		alan.addRegistration(r1);
		Registration[] alanRegistrations = alan.getReport();
		Registration alanRegistration1 = alanRegistrations[0];

		assertEquals(1, alanRegistrations.length);
		assertEquals("CSE303", alanRegistration1.getCourseName());
		assertEquals(6, alanRegistration1.getNumberOfCredits(), 0.01);
		assertEquals(79, alanRegistration1.getMarks());
	}

	@Test
	public void test_08() {
		Registration r1 = new Registration("CSE303", 6, 79);
		Transcript alan = new Transcript("Alan"); 
		alan.addRegistration(r1);
		/* Given information of a registration (course name and number of credits), add it
		 * to the transcript. */
		alan.addRegistration("CSE215", 6);

		Registration[] alanRegistrations = alan.getReport();

		assertEquals(2, alanRegistrations.length);
		Registration alanRegistration1 = alanRegistrations[0];

		assertEquals("CSE303", alanRegistration1.getCourseName());
		assertEquals(6, alanRegistration1.getNumberOfCredits(), 0.01);
		assertEquals(79, alanRegistration1.getMarks());

		Registration alanRegistration2 = alanRegistrations[1];
		assertEquals("CSE215", alanRegistration2.getCourseName());
		assertEquals(6, alanRegistration2.getNumberOfCredits(), 0.01);
		assertEquals(0, alanRegistration2.getMarks());
	}

	@Test
	public void test_09() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 2));
		alan.addRegistration(new Registration("EECS2", 2));
		alan.addRegistration(new Registration("EECS3", 2));
		Registration[] registrations = {new Registration("EECS4", 2)};
		alan.addRegistrations(registrations);
		assertEquals(4, alan.getReport().length);
	}

	@Test
	public void test_10() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 2));
		alan.addRegistration(new Registration("EECS2", 2));
		alan.addRegistration(new Registration("EECS3", 2));
		Registration[] registrations = {new Registration("EECS4", 2), new Registration("EECS5", 2)};
		alan.addRegistrations(registrations);
		assertEquals(5, alan.getReport().length);
	}

	@Test
	public void test_11() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 1, 50));//D: 5
		alan.addRegistration(new Registration("EECS2", 2, 60));//C: 6
		alan.addRegistration(new Registration("EECS3", 3, 70));//B: 7
		alan.addRegistration(new Registration("EECS4", 4, 80));//A: 8
		/* Given the name of some existing course, return its current marks on the transcript.
		 */
		assertEquals(50, alan.getMarks("EECS1"));
	}

	@Test
	public void test_12() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 1, 50));//D: 5
		alan.addRegistration(new Registration("EECS2", 2, 60));//C: 6
		alan.addRegistration(new Registration("EECS3", 3, 70));//B: 7
		alan.addRegistration(new Registration("EECS4", 4, 80));//A: 8

		/* When attempting to get marks for some non-existing course, simply return -1.
		 */
		assertEquals(-1, alan.getMarks("EECS5"));
	}

	@Test
	public void test_13() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 1, 50));//D: 5
		alan.addRegistration(new Registration("EECS2", 2, 60));//C: 6
		alan.addRegistration(new Registration("EECS3", 3, 70));//B: 7
		alan.addRegistration(new Registration("EECS4", 4, 80));//A: 8

		/* Given the name of some existing course, set new marks for it on the transcript.
		 */
		alan.setMarks("EECS1", 55);
		assertEquals(55, alan.getMarks("EECS1"));
	}

	@Test
	public void test_14() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 1, 50));//D: 5
		alan.addRegistration(new Registration("EECS2", 2, 60));//C: 6
		alan.addRegistration(new Registration("EECS3", 3, 70));//B: 7
		alan.addRegistration(new Registration("EECS4", 4, 80));//A: 8

		/* When attempting to set marks for some non-existing course, simply do nothing.
		 */
		alan.setMarks("EECS5", 100);
		assertEquals(50, alan.getMarks("EECS1"));
		assertEquals(60, alan.getMarks("EECS2"));
		assertEquals(70, alan.getMarks("EECS3"));
		assertEquals(80, alan.getMarks("EECS4"));
		/* Given the name of some non-existing course, return -1 as it marks.
		 */
		assertEquals(-1, alan.getMarks("EECS5"));
	}

	@Test
	public void test_15() {
		Transcript alan = new Transcript("Alan");
		alan.addRegistration(new Registration("EECS1", 1, 50));//D: 5

		/* Weighted GPA denotes the Weighted Grade Point Average, which is calculated by
		 * first calculating the sum of the WEIGHTED grade points of all registrations on the transcript,
		 * then by dividing the sum by the number of registrations. 
		 * For example, t1 has two registrations: 
		 * 	CSE1 (with weighted grade point 7 * 3) and CSE3 (with weighed grade point 5 * 4),
		 *  then t1's weighed GPA is calculated by (21 + 20) / 2. 
		 * Requirement: When the number of registrations on the transcript is zero, then
		 * return 0 as the weighted GPA.
		 */
		assertEquals((5 * 1) / (double) 1, alan.getWeightedGPA(), 0.01);
	}

	@Test
	public void test_16() {
		Transcript t = new Transcript("Alice");
		/*
		 * Add two registrations.
		 */
		t.addRegistration(new Registration("MATH2030", 3));
		t.addRegistration(new Registration("EECS2101", 3));

		/* 
		 * Delete the first registration (i.e., at index 0).
		 */
		t.deleteRegistration(0); 

		Registration[] result = t.getReport();
		assertEquals(1, result.length);
		assertEquals("EECS2101", result[0].getCourseName());
		
		/*
		 * Right now there is one registration.
		 * Add three more registrations.
		 */
		Registration r3 = new Registration ("EECS2030",3);
		t.addRegistration(r3);
		t.addRegistration("EECS2001",3);
		t.addRegistration("EECS2031",3);
		
		result = t.getReport();
		assertEquals(4, result.length);
		assertEquals("EECS2101", result[0].getCourseName());
		assertEquals("EECS2030", result[1].getCourseName());
		assertEquals("EECS2001", result[2].getCourseName());
		assertEquals("EECS2031", result[3].getCourseName());
		
		/* 
		 * Delete the third registration (i.e., at index 2).
		 */
		t.deleteRegistration(2);

		result = t.getReport();
		assertEquals(3, result.length);
		assertEquals("EECS2101", result[0].getCourseName());
		assertEquals("EECS2030", result[1].getCourseName());
		assertEquals("EECS2031", result[2].getCourseName());

		/* 
		 * Delete the last registration (i.e., at index 2).
		 */
		t.deleteRegistration(2);
		result = t.getReport();
		assertEquals(2, result.length);
		assertEquals("EECS2101", result[0].getCourseName());
		assertEquals("EECS2030", result[1].getCourseName());
	}
	
	@Test
	public void test_17() {
		Registrar reg = new Registrar();
		/* 
		 * Return as an array of all the stored transcripts in the registrar. 
		 * Initially, no transcripts have been added to the registrar yet.
		 */
		Transcript[] transcripts = reg.getAllTranscripts();
		assertEquals(0,transcripts.length);
	}

	@Test
	public void test_18() {
		Registrar reg = new Registrar();
		/* 
		 * Add transcripts to the registrar
		 */
		Transcript t1 = new Transcript("Alice");
		Transcript t2 = new Transcript("Bob");

		reg.addTranscript(t1);
		reg.addTranscript(t2);

		Transcript[] all = reg.getAllTranscripts();
		assertEquals(2, all.length);
		assertEquals("Alice", all[0].getStudentName());
		assertEquals("Bob", all[1].getStudentName());
	}	

	@Test
	public void test_19() {
		Registrar r = new Registrar();
		
		Transcript a = new Transcript("Alice");
		a.addRegistration(new Registration("Math", 3)); 
		/* 
		 * Link Alice's transcript to the registrar.
		 */
		a.setRegistaraOffice(r);
		r.addTranscript(a);

		Transcript b = new Transcript("Ali");
		b.addRegistration(new Registration("Coding", 3));
		/* 
		 * Link Ali's transcript to the same registrar.
		 */
		b.setRegistaraOffice(r);
		r.addTranscript(b);
		
		/*
		 * Return all transcripts added to the registrar.
		 */
		Transcript[] t = r.getAllTranscripts();
		assertEquals(2, t.length);
		assertEquals(t[0],a);
		assertEquals(t[1],b);
		
		/*
		 * Return a String array of student's names who are enrolled in a specified course.
		 * Assume: A student is able to inquire about the list of students enrolled in a course.
		 */
		String[] result = a.getStudents("Coding");
		assertEquals(1, result.length);
		assertTrue(result[0].equals("Ali"));
	}

	@Test
	public void test_20() {
		Registrar r = new Registrar();
		
		Transcript a = new Transcript("Alice");
		a.addRegistration(new Registration("Math", 3));
		a.setRegistaraOffice(r);
		r.addTranscript(a);

		Transcript b = new Transcript("Ali");
		b.addRegistration(new Registration("Math", 3));
		b.setRegistaraOffice(r);
		r.addTranscript(b);

		Transcript c = new Transcript("Kyle");
		c.addRegistration(new Registration("Math", 3));
		c.setRegistaraOffice(r);
		r.addTranscript(c);

		Transcript d = new Transcript("Jackie");
		d.addRegistration(new Registration("Coding", 3));
		d.setRegistaraOffice(r);
		r.addTranscript(d);

		Transcript[] t = r.getAllTranscripts();
		assertEquals(4,t.length);
		assertEquals(t[0],a);
		assertEquals(t[1],b);
		assertEquals(t[2],c);
		assertEquals(t[3],d);

		/*
		 * Return a String array of student's names who are enrolled in a specified course.
		 * The "Math" class has: Alice, Ali, Kyle
		 */
		String[] result = a.getStudents("Math");
		assertEquals(3, result.length);
		assertTrue(result[0].equals("Alice"));
		assertTrue(result[1].equals("Ali"));
		assertTrue(result[2].equals("Kyle"));
	}

	@Test
	public void test_21() {
		Registrar r = new Registrar();
		
		Transcript a = new Transcript("Alice");
		a.addRegistration(new Registration("Math", 3));
		a.setRegistaraOffice(r);
		r.addTranscript(a);

		Transcript b = new Transcript("Bob");
		b.addRegistration(new Registration("Math", 3));
		b.setRegistaraOffice(r);
		r.addTranscript(b);

		Transcript c = new Transcript("Jim");
		c.addRegistration(new Registration("Math", 3));
		c.setRegistaraOffice(r);
		r.addTranscript(c);

		Transcript d = new Transcript("Jackie");
		d.addRegistration(new Registration("Coding", 3));
		d.setRegistaraOffice(r);
		r.addTranscript(d);

		Transcript[] t = r.getAllTranscripts();
		assertEquals(4, t.length);
		assertEquals(t[0],a);
		assertEquals(t[1],b);
		assertEquals(t[2],c);
		assertEquals(t[3],d); 
		
		/*
		 * Return a String array of student's names who are enrolled in a specified course.
		 * The "Coding" class has: Jackie
		 */
		String[] result = a.getStudents("Coding");
		assertEquals(1, result.length);
		assertTrue(result[0].equals("Jackie"));
	}
 
	@Test
	public void test_22() {
		Registrar r = new Registrar();
		Transcript a = new Transcript("Alice");
		a.addRegistration(new Registration("Math", 3));
		a.setRegistaraOffice(r);
		r.addTranscript(a);

		Transcript b = new Transcript("Bob");
		b.addRegistration(new Registration("Math", 3));
		b.setRegistaraOffice(r);
		r.addTranscript(b);

		Transcript c = new Transcript("Jim");
		c.addRegistration(new Registration("Math", 3));
		c.setRegistaraOffice(r);
		r.addTranscript(c);

		Transcript d = new Transcript("Jackie");
		d.addRegistration(new Registration("Coding", 3));
		d.setRegistaraOffice(r);
		r.addTranscript(d);

		Transcript[] t = r.getAllTranscripts();
		assertEquals(4,t.length);
		assertEquals(t[0],a);
		assertEquals(t[1],b);
		assertEquals(t[2],c);
		assertEquals(t[3],d);
		
		/*
		 * Return a String array of student's names who are enrolled in a specified course.
		 * The "CS" class has no one enrolled at the moment.
		 */
		String[] result = a.getStudents("CS");
		assertEquals(0, result.length);
	}
	
	@Test
	public void test_23(){
		/*
		 * Create two distinct Registrar offices.
		 */
		Registrar r1 = new Registrar();
		Registrar r2 = new Registrar();
		
		Transcript a = new Transcript("Alice");
		a.addRegistration(new Registration("Math", 3));
		Transcript b = new Transcript("Ali");
		b.addRegistration(new Registration("Math", 3));
		Transcript c = new Transcript("Kyle");
		c.addRegistration(new Registration("Coding", 3));
	
		/*
		 * Add some transcripts to registrar r1.
		 */
		a.setRegistaraOffice(r1);
		r1.addTranscript(a);
		b.setRegistaraOffice(r1);
		r1.addTranscript(b);
		c.setRegistaraOffice(r1);
		r1.addTranscript(c); 
		
		Transcript[] ts1 = r1.getAllTranscripts();
		assertEquals(3,ts1.length);
		assertEquals(ts1[0],a);
		assertEquals(ts1[1],b);
		assertEquals(ts1[2],c);
		
		Transcript d = new Transcript("Jackie");
		d.addRegistration(new Registration("Math", 3));
		Transcript e = new Transcript("Jen");
		e.addRegistration(new Registration("Math", 3));
		Transcript f = new Transcript("Tahmeed");
		f.addRegistration(new Registration("English", 3));
		
		/*
		 * Add some transcripts to registrar r2.
		 */
		d.setRegistaraOffice(r2);
		r2.addTranscript(d);
		e.setRegistaraOffice(r2);
		r2.addTranscript(e);
		f.setRegistaraOffice(r2);
		r2.addTranscript(f);  
		
		Transcript[] ts2 = r2.getAllTranscripts();
		assertEquals(3,ts2.length);
		assertEquals(ts2[0],d);
		assertEquals(ts2[1],e);
		assertEquals(ts2[2],f);
		
		/*
		 * Here the "Math" class is under registrar r1.
		 */
		String[] result1 = a.getStudents("Math");
		assertEquals(2, result1.length);
		assertTrue(result1[0].equals("Alice"));
		assertTrue(result1[1].equals("Ali"));
		
		/*
		 * Here the "Math" class is under registrar r2.
		 */
		String[] result2 = e.getStudents("Math");
		assertEquals(2, result2.length);
		assertTrue(result2[0].equals("Jackie"));
		assertTrue(result2[1].equals("Jen"));
	}
 
	@Test
	public void test_24() {
		Transcript.resetIdCounter();
		
		Transcript t1 = new Transcript("Alice");
		assertEquals("Alice's ID is 1", t1.getId());

		Transcript t2 = new Transcript("Kyle");
		assertEquals("Kyle's ID is 2", t2.getId());
		
		Transcript t3 = new Transcript("Ali");
		assertEquals("Ali's ID is 3", t3.getId());
	}
}