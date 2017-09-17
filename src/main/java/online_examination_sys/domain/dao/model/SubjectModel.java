package online_examination_sys.domain.dao.model;

import java.util.List;

public class SubjectModel {
	private int id;
    private String title;
    private List<String> answer_str;
    private String answer_index;
    
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
	public List<String> getAnswer_str() {
		return answer_str;
	}
	public void setAnswer_str(List<String> answer_str) {
		this.answer_str = answer_str;
	}
	public String getAnswer_index() {
		return answer_index;
	}
	public void setAnswer_index(String answer_index) {
		this.answer_index = answer_index;
	}
    
    
}
