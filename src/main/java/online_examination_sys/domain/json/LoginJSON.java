package online_examination_sys.domain.json;

import online_examination_sys.domain.dao.po.Token;

public class LoginJSON extends BaseJSON {
	private Token token;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
	
	
	
	
}
