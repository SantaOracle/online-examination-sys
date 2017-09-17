package online_examination_sys.domain.dao.po;

public class Achivement {
    private int id;
    private int user_id;
    private int paper_id;
    private int score;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(int paper_id) {
        this.paper_id = paper_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Achivement{" +
                "Id=" + id +
                ", User_id=" + user_id +
                ", Paper_id=" + paper_id +
                ", Score=" + score +
                ", Status=" + status +
                '}';
    }
}
