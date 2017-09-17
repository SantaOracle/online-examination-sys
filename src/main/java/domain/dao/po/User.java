package domain.dao.po;

public class User {
	
	private int userId;
	private String username;
	private String password;
	private String phone;
	public User() {
		
	}
	
//	public User(int userId, String username, String password, String phone) {
//		userId = this.userId;
//		username = this.username;
//		password = this.password;
//		phone = this.phone;
//	}
//	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ "]";
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
