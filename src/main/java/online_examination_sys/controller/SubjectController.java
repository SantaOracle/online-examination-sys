package online_examination_sys.controller;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.SubjectListDTO;
import online_examination_sys.domain.dao.dto.TestDTO;
import online_examination_sys.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
    @RequestMapping(value = "/addSubject")
    @ResponseBody
    public BaseDTO addSubject(
        @RequestParam(value = "title", required = true)String title,
        @RequestParam(value = "answerStr", required = true)String answerStr,
        @RequestParam(value = "answerIndex", required = true)int answerIndex
    ){
        return subjectService.addSubject(title, answerStr, answerIndex);
    }

    @RequestMapping(value = "/updateSubject")
    @ResponseBody
    public BaseDTO updateSubject(
        @RequestParam(value = "id", required = true)int id,
        @RequestParam(value = "title", required = false)String title,
        @RequestParam(value = "answerStr", required = false)String answerStr,
        @RequestParam(value = "answerIndex", required = false)int answerIndex
    ){
        return subjectService.updateSubject(id, title, answerStr, answerIndex);
    }

    @RequestMapping(value = "/deleteSubject")
    @ResponseBody
    public BaseDTO deleteSubject(
        @RequestParam(value = "id", required = true)int id
    ) {
    	return subjectService.deleteSubject(id);
    }
    
    @RequestMapping(value = "/showSubjectList")
    @ResponseBody
    public SubjectListDTO showSubjectList() {
    	return subjectService.showSubjectList();
    }
    
}
