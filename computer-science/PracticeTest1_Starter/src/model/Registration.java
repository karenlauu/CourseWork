package model;

public class Registration {
	private String courseName;
	private int noc;
	private int marks;
	
	public Registration(String course, int credits, int mark) {
		this.courseName = course;
		this.noc = credits;
		this.marks = mark;
	}
	
	public Registration(String course, int credit) {
		this.courseName = course;
		this.noc = credit;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumberOfCredits() {
		return noc;
	}

	public void setNumberOfCredits(int noc) {
		this.noc = noc;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getLetterGrade() {
		String grade = null;
		if (this.marks >= 90) {
			grade = "A+";
		} else if (this.marks >= 80) {
			grade = "A";
		}else if (this.marks >= 70) {
			grade = "B";
		}else if (this.marks >= 60) {
			grade = "C";
		}else if (this.marks >= 50) {
			grade = "D";
		} else {
			grade = "F";
		} return grade;
	}
	
	public int getWeightedGradePoint() {
		String grade = getLetterGrade();
		int result = 0;
		if (grade.equals("A+")) {
			result = 9*this.noc;
		} else if (grade.equals("A")) {
			result = 8*this.noc;
		}else if (grade.equals("B")) {
			result = 7*this.noc;
		}else if (grade.equals("C")) {
			result = 6*this.noc;
		}else if (grade.equals("D")) {
			result = 5*this.noc;
		}return result;
	}
	
}
