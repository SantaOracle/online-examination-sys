package online_examination_sys.domain.dao.dto;

import java.util.List;

import online_examination_sys.domain.dao.po.Subject;

public class SubjectListDTO extends BaseDTO {
	
	private List<Subject> subjectList;

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	
}
