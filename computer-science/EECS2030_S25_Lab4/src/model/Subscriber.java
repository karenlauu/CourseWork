package model;

public class Subscriber extends Follower {
	private int nor;
	private String[] recommended; 
	
	public Subscriber(String name, int maxChannel, int maxRec) {
		super(name, maxChannel);
		this.recommended = new String[maxRec];
	}
	
	public void recommend(String s) {
		recommended[nor] =s;
		nor++;
	}
	
	public String recommendList() {
		String result="";
		for (int i=0; i<nor; i++) {
			result += recommended[i];
			if (i<nor-1) {
				result += ", ";
			}
		} return result;
	}
	
	public String toString() {
		String result = null;
		if (this.noc == 0 && nor==0) {
			result = String.format("Subscriber %s follows no channels and has no recommended videos.", this.name);
		} else if (noc >0 && nor == 0){
			result = String.format("Subscriber %s follows [%s] and has no recommended videos.", this.name, channelList());
		} else  {
			result = String.format("Subscriber %s follows [%s] and is recommended <%s>.", this.name, channelList(), recommendList());
		}return result;
	}
	
	public void watch(String video, int time) {
		Channel c = null;
		for (int i=0; i<noc; i++) {
			if (channels[i].findVideo(video)) {
				c = channels[i];
			}
		}
		c.update(time);
		
		
		
		
	}
}
