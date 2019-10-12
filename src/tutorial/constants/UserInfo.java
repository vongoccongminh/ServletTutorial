package tutorial.constants;

public class UserInfo {
	public String userName;
	private int post;
	private String country;
	
	public UserInfo(String userName, int post, String country) {
		super();
		this.userName = userName;
		this.post = post;
		this.country = country;
	}
	public UserInfo(String userName) {
		super();
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
