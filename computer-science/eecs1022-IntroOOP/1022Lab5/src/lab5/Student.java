package lab5;
import java.util.ArrayList;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 19, 2025

//////////////////////////////

public class Student {
	
    private String yorkID;
	private String name;
	private int year;
	private ArrayList<Course> courses; // list of courses completed or completing
	private static int idCounter = 1;
	
	
	
	/** customer constructor that takes name and year
	 *  sets name and year
	 *  
	 *  also creates a unique yorkID of form "York-xx" where xx is a serial number 
	 * 
	 * @param name  name of the course
	 * @param year  year of study
	 */
	 public Student(String names, int years){
		 this.name = names;
		 this.year = years;
		 this.yorkID = "York-" + idCounter++;
		 this.courses = new ArrayList<>();
	 }
	 
	 
	
	// getters, setters for the 4 fields.
	//.....
	 public String getName() {
		 return name;
	 }
	 public int getYear() {
		 return year;
	 }
	public String getYorkID() {
		return yorkID;
	}
	
	public ArrayList<Course> getCourses(){
		return new ArrayList<>(courses);
	}
	public void setName(String names) {
		 this.name = names;
	 }
	 public void setYear(int years) {
		 this.year = years;
	 }
	public void setYorkID(String id) {
		this.yorkID = id;
	}
	
	public void setCourses(ArrayList<Course> courses){
		this.courses = new ArrayList<>(courses);
	}
	
	/**
	    * enroll course c 
	    * @param c  the course to enroll
	    * 
	    */
	public void enrollCourse(Course c){
		 courses.add(c);
	}
	
	/**
	 * drop course c. Return true if course is dropped. return false if no such
	 * course exist in the list.
	 * 
	 * @param c  the course to drop
	 * @return true if the course is removed, false if has not taken the course
	 */
	public boolean dropCourse (Course c) {
		return courses.remove(c);
	}
	
	/**
	 * drop the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to drop
	 * @return the course that is being dropped
	 */	
	public Course dropCourse (int i) { 
			return courses.remove(i);

	}
	
	/**
	 * get the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the course at the position
	 */
	public Course getCourse(int i) {
		 return courses.get(i);
	}
	
	 
	/**
	 * get the title of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the title of course at the position
	 */
	
	public String getCourseTitle(int i) {
		 return courses.get(i).getName();
	}
	
	
	
	/**
	 * get the instructor's name of the i'th course in the list. 
	 * assume i is valid, i.e., 0 <= i < number of courses
	 * 
	 * @param i  the index of course to get
	 * @return the name of instructor of course at the position
	 */
	
	public String getInstrucorName(int i) {
		return courses.get(i).getInstructor().getName();
	}
	
	 
	/**
	 * get total number of courses has taken or is taking
	 *
	 * @return the number of courses taken or taking
	 */
	public int totalCourses() {
		 return courses.size();
	}
	
	 
	
	/**
	 * return true if course c has been completed or is taking, return false otherwise
	 *
	 * @return if the course has been taken or is taking
	 */
	public boolean hasTaken (Course c){
		 return courses.contains(c);
	}


	@Override
	/**
	 * return a string representation of the student
	 * in the form of ID name year [course codes]
	 * e.g., 
	 * York-02 Sue 2 []
	 * York-02 Sue 2 [1022]
	 * York-02 Sue 2 [1012 1022 2011]
	 * 
	 * @return a string representation of above format
	 **/
	public String toString() {
		String courseCodes = "[";
		
		if (courses.size() > 0) {
		for (int i = 0; i< courses.size(); i++) {
			Course current = getCourse(i);
			courseCodes += current.getCode() + "-";
		}
		courseCodes = courseCodes.substring(0, courseCodes.length()-1);
		}
		courseCodes += "]";
		
		String result = yorkID + " " + name + " " + year + " " + courseCodes;
			
		return result;
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
