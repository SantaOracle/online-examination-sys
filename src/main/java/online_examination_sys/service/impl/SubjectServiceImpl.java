package online_examination_sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.SubjectListDTO;
import online_examination_sys.domain.dao.po.Subject;
import online_examination_sys.mapper.SubjectMapper;
import online_examination_sys.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public BaseDTO addSubject(String title, String answerStr, int answerIndex) {
		Subject subject = new Subject();
		subject.setTitle(title);
		subject.setAnswer_str(answerStr);
		subject.setAnswer_index(answerIndex);
		int result = subjectMapper.addSubject(subject);
		if(result > 0) {
			return new BaseDTO(1, "成功");
		}
		return new BaseDTO();
	}

	@Override
	public BaseDTO deleteSubject(int id) {
		int result = subjectMapper.deleteSubjectById(id);
		if(result > 0) {
			return new BaseDTO(1, "成功");
		}
		return new BaseDTO();
	}

	@Override
	public SubjectListDTO showSubjectList() {
		SubjectListDTO subjectListDTO = new SubjectListDTO();
		List<Subject> list = subjectMapper.getAllSubject();
		if(list != null) {
			subjectListDTO .setSubjectList(list);
			subjectListDTO.setResultCode(1);
			subjectListDTO.setResultMsg("成功");
		}
		return subjectListDTO;
	}

	@Override
	public BaseDTO updateSubject(int id, String title, String answerStr, int answerIndex) {
		Subject subject = new Subject();
		subject.setId(id);
		subject.setTitle(title);
		subject.setAnswer_str(answerStr);
		subject.setAnswer_index(answerIndex);
		int result = subjectMapper.updateSubjectById(subject);
		if(result > 0) {
			return new BaseDTO(1, "成功");
		}
		return new BaseDTO();
	}

}
