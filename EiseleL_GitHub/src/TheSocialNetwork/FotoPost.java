package TheSocialNetwork;

public class FotoPost extends Post {
	
	private String linkToPicure;
	
	public FotoPost(String publisher, String title, int numberOfLikes, String linkToPicure) {
		super(publisher, title, numberOfLikes);
		
		this.linkToPicure = linkToPicure;
	}

	public String getLinkToPicure() {
		return linkToPicure;
	}

	public void setLinkToPicure(String linkToPicure) {
		this.linkToPicure = linkToPicure;
	}

	
	
	
}
