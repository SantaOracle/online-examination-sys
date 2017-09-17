package online_examination_sys.domain.dao.po;

import java.util.Date;

public class Token {
	
	private int tokenId;
	private String token;
	private Date startTime;
	private Date endTime;
	private int userId;
	public Token() {
		
	}
	
	
	public int getTokenId() {
		return tokenId;
	}


	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getToken() {
		return token;
	}
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
