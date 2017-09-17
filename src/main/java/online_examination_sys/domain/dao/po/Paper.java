package online_examination_sys.domain.dao.po;

public class Paper {
    private int id;
    private String title;
    private String subject_ids_str;

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

    public String getSubject_ids_str() {
        return subject_ids_str;
    }

    public void setSubject_ids_str(String subject_ids_str) {
        this.subject_ids_str = subject_ids_str;
    }
    @Override
    public String toString(){
        return "paper [Id=" + id + ", Title=" + title + ", Subject_ids_str=" + subject_ids_str + "]";
    }
}
