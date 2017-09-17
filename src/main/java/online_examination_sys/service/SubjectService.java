package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.SubjectListDTO;

public interface SubjectService {
	
	public BaseDTO addSubject(String title, String answerStr, int answerIndex);
	
	public BaseDTO deleteSubject(int id);
	
	public SubjectListDTO showSubjectList();

	public BaseDTO updateSubject(int id, String title, String answerStr, int answerIndex);
	
}
