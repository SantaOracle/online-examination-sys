package online_examination_sys.domain.dao.dto;

import java.util.List;

import online_examination_sys.domain.dao.po.Paper;

public class PaperListDTO extends BaseDTO {
	private List<Paper> paperList;

	public List<Paper> getPaperList() {
		return paperList;
	}

	public void setPaperList(List<Paper> paperList) {
		this.paperList = paperList;
	} 
}
