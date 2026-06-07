package model;

public class Transcript {
	private String name;
	private Registration[] courses;
	private int noc;
	private Registrar registrar;
	private static int idCounter = 1;
	private int id;

	public Transcript(String name) {
		this.name = name;
		this.noc = 0;
		this.courses = new Registration[5];
		this.id = idCounter;
		idCounter++;
	}
	
	public String getId() {
		String result = String.format("%s's ID is %d", this.name, this.id);
		return result;
	}
	
	public void setRegistaraOffice(Registrar r) {
		this.registrar = r;
	}
	
	public String[] getStudents(String course) {
		Registrar r = this.registrar;
		String[] temp = new String[r.getNot()];
		int counter = 0;
		for (int i=0;i<r.getNot(); i++) {
			if (r.getAllTranscripts()[i].findCourse(course)!= -1) {
				temp[counter] = r.getAllTranscripts()[i].getStudentName();
				counter++;
			}
		} String[] result = new String[counter]; 
		for (int i=0; i<counter; i++) {
			result[i] = temp[i];
		}return result;
	}
	
	public static void resetIdCounter() {
		idCounter =1;
	}
	
	public String getStudentName() {
		return this.name;
	}

	public Registration[] getReport() {
		Registration[] result = new Registration[noc];
		if (noc>0) {
			for (int i=0; i<noc; i++) {
				result[i]=courses[i];

			}
		} return result;
	}
	
	public void addRegistration(Registration r) {
		courses[noc] = r;
		noc++;
	}
	
	public void  addRegistration(String s, int cred) {
		addRegistration(new Registration(s,cred));
	}
	public void addRegistrations(Registration[] r) {
		for (int i=0; i<r.length; i++) {
			addRegistration(r[i]);
		}
	}
	public int findCourse(String course) {
		int index = -1;
		for (int i=0; i<noc; i++) {
			if (courses[i].getCourseName().equals(course)) {
				index = i;
			}
		}return index;
	}
	
	public int getMarks(String course) {
		int index = findCourse(course);
		int result = -1;
		if (index!= -1) {
			result = courses[index].getMarks();
		} return result;
	}
	public void setMarks(String course, int mark) {
		int index = findCourse(course);
		if (index!= -1) {
			courses[index].setMarks(mark);
		} 
	}
	public double getWeightedGPA() {
		double result = 0;
		if (noc>0) {
			for (int i=0; i<noc; i++) {
				result+= courses[i].getWeightedGradePoint();
			} result = result/noc;
		} return result;
	}
	public void deleteRegistration(int index) {
		for (int i=index; i<noc-1;i++) {
			courses[i]=courses[i+1];
		} courses[noc-1]=null;
		noc--;
	}
	
	
}
