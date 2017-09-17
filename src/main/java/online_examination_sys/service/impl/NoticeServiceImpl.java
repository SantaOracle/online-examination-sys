package online_examination_sys.service.impl;

import org.springframework.stereotype.Service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.NoticeListDTO;
import online_examination_sys.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Override
	public BaseDTO addNotice(String title, String context, String publisherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseDTO deleteNotice(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoticeListDTO showNoticeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
