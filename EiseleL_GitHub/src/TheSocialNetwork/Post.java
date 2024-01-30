package TheSocialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Post {
	
	private UUID id;
	private String publisher;
	private String title;
	private int numberOfLikes;
	private ArrayList<Post> comments;
	public Post(String publisher, String title, int numberOfLikes) {
		super();
		this.id = UUID.randomUUID();
		this.publisher = publisher;
		this.title = title;
		this.comments = new ArrayList<Post>();
	
	}
	public UUID getId() {
		return id;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getTitle() {
		return title;
	}
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	public ArrayList<Post> getComents() {
		return comments;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}
	public void setPost(ArrayList<Post> comments) {
		this.comments = comments;
	}
	
	

	
	
	
	
}
