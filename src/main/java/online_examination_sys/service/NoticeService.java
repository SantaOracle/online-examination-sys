package online_examination_sys.service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.NoticeListDTO;

public interface NoticeService {

	public BaseDTO addNotice(String title, String context, String publisherId);
	
	public BaseDTO deleteNotice(String id);
	
	public NoticeListDTO showNoticeList();
	
}
