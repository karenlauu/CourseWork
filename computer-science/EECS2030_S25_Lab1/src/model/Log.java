package model;

public class Log {
	private String version;
	private int nof;
	private String[] fixes;

	public Log(String version) {
		this.version = version;
		this.nof = 0;
		this.fixes = new String[10];
	}

	public int getNumberOfFixes() {
		return nof;
	}
	public String getVersion() {
		return this.version;
	}
	public String getFixes() {
		String result = null;
		if (nof==0) {
			result = "[]";
		} else {
			result = "[";
			for (int i=0; i<nof; i++) {
				result += fixes[i];
				if (i<nof-1) {
					result += ", ";
				}
			} result += "]";	
		}
		return result;
	}
	
	public void addFix(String s) {
		fixes[nof] = s;
		nof++;
	}
	
	public String toString() {
		String result = String.format("Version %s contains %d fixes %s",
				this.version, this.nof, this.getFixes());
		return result;
	}


}
