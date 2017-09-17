package online_examination_sys.domain.dao.dto;

import java.util.List;

import online_examination_sys.domain.dao.model.SubjectModel;

public class SubjectListDTO extends BaseDTO {
	
	private List<SubjectModel> subjectList;

	public List<SubjectModel> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<SubjectModel> subjectList) {
		this.subjectList = subjectList;
	}
	
	
}
