package model;

public class Follower {
	protected String name;
	protected int noc;
	protected Channel[] channels;

	public Follower(String name, int maxChannel) {
		this.name = name;
		this.channels = new Channel[maxChannel];	
	}
	
	public String getName() {
		return this.name;
	}
	
	public String channelList() {
		String result = "";
		for (int i=0; i<noc; i++) {
			result += channels[i].getName();
			if (i<noc-1) {
				result += ", ";
			}
		} return result;
	}
	
	public void follow(Channel c) {
		channels[noc] = c;
		noc++;
	}
	
	public int findChannel(Channel c) {
		int index = -1;
		for (int i=0; i<noc; i++) {
			if (channels[i] == c) {
				index=i;
			}
		} return index;
	}
	
	public void unfollow(Channel c) {
		int index = findChannel(c);
		if (index!= -1) {
			for (int i=index; i<noc-1; i++) {
				channels[i] = channels[i+1];
			} channels[noc-1] = null;
			noc--;
		}
	}
}
