package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.PaperDTO;
import online_examination_sys.domain.dao.dto.PaperListDTO;

public interface PaperService {

	public BaseDTO addPaper(String title, String subjectIds);
	
	public BaseDTO updatePaper(int paperId, String subjectIds);
	
	public PaperDTO showPaper(int paperId);
	
	public PaperListDTO showPaperList();
	
}
