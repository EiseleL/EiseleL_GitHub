package TheSocialNetwork;

import java.util.ArrayList;

public class Newsfeed {
	
	private ArrayList<Post>posts;

	public Newsfeed(ArrayList<Post> posts) {
		super();
		this.posts = new ArrayList<Post>();
	}

	
	public ArrayList<Post> getPosts() {
		return posts;
	}

	/**
	 * Method add Post to NewsFeed
	 * @param INdex
	 */
	public void addPostToNewsFeed(Post post) {
		if(!posts.contains(post)) {
			posts.add(post);
		}
	}
	
	/**
	 * Method remove Post from NewsFeed
	 * @param INdex
	 */
	public void removePostFromNewsfeed(int INdex) {
		posts.remove(INdex);
	}
	
	
	
	
}
