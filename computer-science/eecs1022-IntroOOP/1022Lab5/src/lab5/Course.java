package lab5;

///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : -
//Date : March 19, 2025

//////////////////////////////


public class Course {
	
	//3 private fields
	private int code;  
	private String name;
	private Professor instructor;
	
	/**
	 * a custom constructor
	 * 
	 * @param code  code of the course
	 * @param name  name of the course
	 * @param prof instructor of the course
	 */
	// ... (int code, String name, Professor prof) {
	public Course(int codes, String names, Professor instruct) {
		this.code = codes;
		this.name = names;
		this.instructor = instruct;
	}
	//}
	
	// getters and setters for the 3 fields
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public Professor getInstructor() {
		return instructor;
	}
	public void setCode(int codes) {
		this.code = codes;
	}
	public void setName(String names) {
		this.name = names;
	}
	public void setInstructor(Professor instruct) {
		this.instructor = instruct;
	}
	
	@Override
	/**
	 * string representation of this course.
	 * in the format of "Course [code=cc, name=nn, instructor=instrucorName]"
	 * e.g., Course [code=2011, name=Sue, instructor=Sam]
	 * 
	 * return string representation of above format
	 */
	public String toString() {
		String result = "Course [code=" +code + ", name=" + name + ", instructor=" + instructor.getName() +"]";
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
	@Override
	public boolean equals(Object obj) {
		Course other = (Course) obj;
		 if (code != other.getCode()) {
			 return false;
		 } else if (name != other.getName()) {
			 return false;
		 } else
			 return true;
	}
}
