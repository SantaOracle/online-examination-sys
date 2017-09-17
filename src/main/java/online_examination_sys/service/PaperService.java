package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.PaperDTO;
import online_examination_sys.domain.dao.dto.PaperListDTO;

public interface PaperService {

	/**
	 * 添加试卷
	 * @param title
	 * @param subjectIds
	 * @return
	 */
	public BaseDTO addPaper(String title, String subjectIds);
	
	/**
	 * 更改试卷
	 * @param paperId
	 * @param subjectIds
	 * @return
	 */
	public BaseDTO updatePaper(int paperId, String subjectIds);
	
	/**
	 * 展示试卷
	 * @param paperId
	 * @return
	 */
	public PaperDTO showPaper(int paperId);
	
	/**
	 * 展示试卷列表
	 * @return
	 */
	public PaperListDTO showPaperList();
	
}
