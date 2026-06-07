package model;

public class Registrar {
	private Transcript[] transcripts;
	private int not;

	public Registrar() {
		this.transcripts = new Transcript[10];
		this.not = 0;
	}
	
	public int getNot() {
		return this.not;
	}

	public Transcript[] getAllTranscripts() {
		Transcript[] result = new Transcript[not];
		if (not>0) {
			for (int i=0; i<not; i++) {
				result[i] = transcripts[i];
			}
		} return result;
	}
	
	public void addTranscript(Transcript t) {
		transcripts[not] = t;
		not++;
	}
	


}
