package model;

public class App {
	private String name;
	private int[] ratings;
	private int nor;
	private Log[] updates;
	private int nou;

	public App(String s, int maxRate) {
		this.name = s;
		this.ratings = new int[maxRate];
		this.nor = 0;
		this.updates = new Log[10];
		this.nou = 0;
	}

	public String getName() {
		return this.name;
	}
	
	public int getNou() {
		return this.nou;
	}

	public String getRatingReport() {
		String result = null;
		if (this.nor == 0) {
			result = "No ratings submitted so far!";
		} else {
			int[] tally = new int[5];
			for (int i=0; i<nor; i++) {
				if (ratings[i] == 1) {
					tally[0]++;
				} else if (ratings[i] == 2) {
					tally[1]++;
				}else if (ratings[i] == 3) {
					tally[2]++;
				}else if (ratings[i] == 4) {
					tally[3]++;
				} else {
					tally[4]++;
				}
			}

			result = String.format("Average of %d ratings: %s (Score 5: %d, "
					+ "Score 4: %d, Score 3: %d, Score 2: %d, Score 1: %d)", 
					this.nor, average(), tally[4], tally[3], tally[2], tally[1], tally[0]);

		}
		return result;
	}

	public void releaseUpdate(String version) {
		updates[nou] = new Log(version);
		nou++;
	}

	public Log getVersionInfo(String s) {
		Log result = null;
		for (int i=0; i< nou; i++) {
			if (updates[i].getVersion().equals(s)) {
				result = updates[i];
			}
		} return result;
	}

	public Log[] getUpdateHistory() {
		Log[] result = new Log[nou];
		for (int i=0; i<nou; i++) {
			result[i] = updates[i];
		} return result;
	}

	public String getWhatIsNew() {
		if (nou==0) {return "n/a";}
		return updates[nou-1].toString();
	}

	public String average() {
		String result = null;
		if (nor == 0) {
			result = "n/a";
		} else {
			double avg=0.0;
			for (int i=0; i<nor;i++) {
				avg += ratings[i];
			} avg = (double) avg/nor;


			result = String.format("%.1f", avg);

		}
		return result;
	}

	public void submitRating(int num) {
		ratings[nor] = num;
		nor++;
	}

	public String toString() {
		String result = String.format("%s (Current Version: %s; Average Rating:"
				+ " %s)", this.name, getWhatIsNew(), average());
		return result;
	}

}
