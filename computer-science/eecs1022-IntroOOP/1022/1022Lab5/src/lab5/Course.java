package lab5;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : karenl05@my.yorku.ca
//Date : March 19, 2025
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


public class Course {
	
	//3 private fields
	int code;
	String name;
	Professor instructor;
	
	/**
	 * a custom constructor
	 * 
	 * @param code  code of the course
	 * @param name  name of the course
	 * @param prof instructor of the course
	 */
	// ... (int code, String name, Professor prof) {
	public Course(int codes, String names, Professor teach) {
		this.code = codes;
		this.name = names;
		this.instructor = teach;
	}
	//}
	
	// getters and setters for the 3 fields
	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	public Professor getInstructor() {
		return instructor;
	}
	/**
	 * string representation of this course.
	 * in the format of "Course [code=cc, name=nn, instructor=instrucorName]"
	 * e.g., Course [code=2011, name=Sue, instructor=Sam]
	 * 
	 * return string representation of above format
	 */
	
	@Override
	public boolean equals(Object other) {
		Course otherCourse = (Course) other;
		if ((otherCourse.getCode() == code) && ((otherCourse.getName()).equals(name))){
			return true;
		} return false;
	}
	@Override
	public String toString() {
		String result = "Course [code=" + getCode() + ", name=" + getName() + ", instructor=" + getInstructor().getName() + "]";
		return result;
	}
	
	/**
	 * two Courses are equal if they have the same code and same name.
	 * Assume obj is of class Course and is not null
	 * 
	 * @param other course object
	 * @return true if they have same code and same name. False otherwise
	 * 
	 */
	
}
