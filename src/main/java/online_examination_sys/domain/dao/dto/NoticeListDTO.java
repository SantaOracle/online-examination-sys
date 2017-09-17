package online_examination_sys.domain.dao.dto;

import java.util.List;

import online_examination_sys.domain.dao.po.Notice;

public class NoticeListDTO extends BaseDTO{
	
	private List<Notice> noticeList;

	public List<Notice> getNoticeList() {
		return noticeList;
	}

	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	
	
}
