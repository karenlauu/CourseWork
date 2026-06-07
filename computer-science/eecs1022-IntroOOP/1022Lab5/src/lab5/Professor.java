package lab5;


///////////////////////////////////////////////////////////////////////////
//Full Name : Karen Lau
//Yorku Email : --
//Date : March 19, 2025

//////////////////////////////

public class Professor {
	
	//two private fields  String name and int year
	private String name;
	private int year;
	
	// customer constructor that takes name and year, and sets name and year accordingly. 
	//... (String name, int year) {
	
	public Professor(String names, int years) {
		this.name = names;
		this.year= years;
	}
	
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	public void setName(String names) {
		this.name = names;
	}
	public void setYear(int years) {
		this.year = years;
	}
	


	


}
