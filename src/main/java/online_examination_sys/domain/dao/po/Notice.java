package online_examination_sys.domain.dao.po;

public class Notice {
    private int  id;
    private String title;
    private String context;
    private int publisher_id;

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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "Id=" + id +
                ", Title='" + title + '\'' +
                ", Context='" + context + '\'' +
                ", Publisher_id=" + publisher_id +
                '}';
    }
}
