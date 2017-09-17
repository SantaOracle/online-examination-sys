package online_examination_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.PaperDTO;
import online_examination_sys.domain.dao.dto.PaperListDTO;
import online_examination_sys.service.PaperService;

@RestController
@RequestMapping("/paper")
public class PaperController {
	
	@Autowired
	private PaperService paperService;
	
	@RequestMapping(value = "/addPaper")
	@ResponseBody
	public BaseDTO addPaper(
		@RequestParam(value = "title", required = true)String title,
		@RequestParam(value = "subjectIds", required = true)String subjectIds
	) {
		return paperService.addPaper(title, subjectIds);
	}
	
	@RequestMapping(value = "/updatePaper")
	@ResponseBody
	public BaseDTO updatePaper(
		@RequestParam(value = "paperId", required = true)int paperId,
		@RequestParam(value = "subjectIds", required = true)String subjectIds		
	) {
		return paperService.updatePaper(paperId, subjectIds);
	}
	
	@RequestMapping(value = "/showPaper")
	@ResponseBody
	public PaperDTO showPaper(
		@RequestParam(value = "paperId", required = true)int paperId		
	) {
		return paperService.showPaper(paperId);
	}
	
	@RequestMapping(value = "/showPaperList")
	@ResponseBody
	public PaperListDTO showPaperList() {
		return paperService.showPaperList();
	}
	
}
