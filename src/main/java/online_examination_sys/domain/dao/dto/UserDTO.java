package online_examination_sys.domain.dao.dto;

import online_examination_sys.domain.dao.po.User;

public class UserDTO extends BaseDTO{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
