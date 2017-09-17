package online_examination_sys.domain.dao.dto;

import java.util.List;

import online_examination_sys.domain.dao.po.Subject;

public class PaperDTO extends BaseDTO {
	private int paperId;
	private String title;
	private List<Subject> SubjectList;
	
	
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Subject> getSubjectList() {
		return SubjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		SubjectList = subjectList;
	}
	
	
}
