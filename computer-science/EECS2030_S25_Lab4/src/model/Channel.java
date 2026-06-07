package model;

public class Channel {
	private int nof;
	private int nov;
	private Follower[] followers;
	private String[] videos;
	private String name;

	public Channel(String name, int maxFollower, int maxVideo) {
		this.name = name;
		this.followers = new Follower[maxFollower];
		this.videos = new String[maxVideo];
	}

	public String getName() {
		return this.name;
	}

	public void releaseANewVideo(String name) {
		videos[nov] = name;
		nov++;
		for (int i=0; i<nof; i++) {
			Follower f = followers[i];
			if (f instanceof Subscriber) {
				((Subscriber) f).recommend(name);
			}
		}
	}
	
	public boolean findVideo(String s) {
		boolean result = false;
		for (int i=0; i<nov; i++) {
			if (videos[i].equals(s)) {
				result = true;
			}
		} return result;
	}

	public String videoList() {
		String result="";
		for (int i=0; i<nov; i++) {
			result += videos[i];
			if (i<nov-1) {
				result += ", ";
			}
		} return result;
	}

	public String followList() {
		String result = "";
		for (int i=0; i<nof; i++) {
			Follower f = followers[i];
			if (f instanceof Subscriber) {
				result += "Subscriber ";
			}else {
				result += "Monitor ";
			}
			result += f.getName();
			if (i<nof-1) {
				result += ", ";
			}
		} return result;
	}

	public String toString() {
		String result = null;
		if (nov==0 && nof==0) {
			result = String.format("%s released no videos and has no followers.", this.name);
		}else if (nov>0 && nof==0) {
			result = String.format("%s released <%s> and has no followers.", this.name, videoList());
		} else if (nov== 0 && nof>0){
			result = String.format("%s released no videos and is followed by [%s].", this.name, followList());
		} else {
			result = String.format("%s released <%s> and is followed by [%s].", this.name, videoList(), followList());
		}
		return result;
	}

	public void follow(Follower f) {
		followers[nof] = f;
		nof++;
		f.follow(this);
	}

	public int findFollower(Follower f) {
		int index = -1;
		for (int i=0; i<nof; i++) {
			if (followers[i] == f) {
				index=i;
			}
		} return index;
	}

	public void unfollow(Follower f) {
		int index = findFollower(f);
		if (index!= -1) {
			for (int i=index; i<nof-1; i++) {
				followers[i] = followers[i+1];
			} followers[nof-1] = null;
			nof--;
		}
		f.unfollow(this);
	}
	
	public void update(int time) {
		for (int i=0; i< nof; i++) {
			Follower f = followers[i];
			if (f instanceof Monitor) {
				((Monitor) f).update(this, time);
			}
		}
	}
}
