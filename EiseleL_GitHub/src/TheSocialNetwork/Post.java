package TheSocialNetwork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.UUID;

public abstract class Post {
	
	private UUID id;
	private String publisher;
	private String title;
	private int numberOfLikes;
	private LocalDateTime timeStamp;
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
	
	/**
	 * Method add like to Command
	 */
	public void addLike() {
		this.setNumberOfLikes(this.getNumberOfLikes()+1);
	}

	/**
	 * Method remove like from Command
	 */
	public void removeLike() {
		if(!((this.getNumberOfLikes() - 1) < 0)) {
			this.setNumberOfLikes(this.getNumberOfLikes()-1);
		}
	}
	
	/**
	 * Method add a comment to ArrayList Comments from Post
	 * @param comment
	 */
	public void addCommant(Post comment) {
		if(!this.comments.contains(comment)) {
			this.comments.add(comment);
		}
	}
	
	/**
	 * Method remove a comment from ArrayList Comments from Post
	 * @param comment
	 */
	public void removeCommant(int INdex) {
			this.comments.remove(numberOfLikes);
	}
	
	
	/**
	 * Method calculate
	 * @return
	 */
	public String getTimeStamp() {
		
		String time;
		Duration zeitraum = Duration.between(timeStamp, LocalDateTime.now());
		
		if(zeitraum.toDays() > 0) {
			time = zeitraum.toDays() + " Tage";	
		}else if(zeitraum.toHours() > 0){
			time = zeitraum.toHours() + " Stunden";	
		}else if(zeitraum.toMinutes() > 0){
			time = zeitraum.toMinutes() + " Minuten";	
		}else{
		time = "Gerade eben";	
		}	
		
		return time;
	}
	
	
	
	
	
	
}
