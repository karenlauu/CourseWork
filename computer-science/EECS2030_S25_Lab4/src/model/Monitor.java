package model;

public class Monitor extends Follower {
	private double average[];
	private int total[];
	private int views[];
	private boolean[] initialized;
	private int max[];

	public Monitor(String name, int num) {
		super(name, num);
		this.views = new int[num];
		this.total = new int[num];
		this.max = new int[num];
		this.average = new double[num];
		this.initialized = new boolean[num];
	}

	public String toString() {
		String result = null;
		if (this.noc == 0) {
			result = String.format("Monitor %s follows no channels.", this.name);
		} else {
			result = String.format("Monitor %s follows [%s].", this.name, channelList());
		} return result;
	}

	public String channelList() {
		String result = "";
		for (int i=0; i<noc; i++) {
			result += channels[i].getName();
			if (initialized[i]) {
				result += String.format(" {#views: %d, max watch time: %d, avg watch time: %.2f}", 
						views[i], max[i], average[i]);
			}
			if (i<noc-1) {
				result += ", ";
			}
		} return result;
	}

	public void update(Channel c, int time) {
		int index = findChannel(c);
		if (index!= -1) {
			if (! initialized[index]) {
				initialized[index] = true;
			}
			if (max[index]< time) {
				max[index] = time;
			}
			views[index]++;
			total[index] += time;
			average[index] = (double) total[index]/views[index];

		}
	}

}
