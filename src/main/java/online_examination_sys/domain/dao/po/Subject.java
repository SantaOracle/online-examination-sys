package online_examination_sys.domain.dao.po;

public class Subject {
	
    private int id;
    private String title;
    private String answerStr;
    private int answerIndex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer_str() {
        return answerStr;
    }

    public void setAnswer_str(String answer_str) {
        this.answerStr = answer_str;
    }

    public int getAnswer_index() {
        return answerIndex;
    }

    public void setAnswer_index(int answer_index) {
        this.answerIndex = answer_index;
    }
    @Override
    public String toString(){
        return "Subject [Id=" + id + ", Title=" + title + ", Answer_str=" + answerStr + ", Answer_index="
                + answerIndex
                + "]";
    }
}
