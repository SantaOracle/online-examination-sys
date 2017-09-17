package online_examination_sys.domain.json;

import java.util.List;

import online_examination_sys.domain.dao.po.User;


public class FindUserJSON extends BaseJSON{
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
