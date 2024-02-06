package TheSocialNetwork;

public class TextPost extends Post{

	private String textFromTextPost;
	
	public TextPost(String publisher, String title, String textFromTextPost, int numberOfLikes) {
		super(publisher, title, numberOfLikes);
		this.textFromTextPost = textFromTextPost;
	}

	public String getTextFromTextPost() {
		return textFromTextPost;
	}

	public void setTextFromTextPost(String textFromTextPost) {
		this.textFromTextPost = textFromTextPost;
	}
	
	
}
