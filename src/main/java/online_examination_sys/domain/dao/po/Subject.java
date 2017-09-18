package online_examination_sys.domain.dao.po;

public class Subject {
	
    private int id;
    private String title;
    private String answer_str;
    private int answer_index;

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
        return answer_str;
    }

    public void setAnswer_str(String answer_str) {
        this.answer_str = answer_str;
    }

    public int getAnswer_index() {
        return answer_index;
    }

    public void setAnswer_index(int answer_index) {
        this.answer_index = answer_index;
    }
    @Override
    public String toString(){
        return "Subject [Id=" + id + ", Title=" + title + ", Answer_str=" + answer_str + ", Answer_index="
                + answer_index
                + "]";
    }
}
