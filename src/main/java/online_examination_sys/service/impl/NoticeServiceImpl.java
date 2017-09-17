package online_examination_sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.NoticeListDTO;
import online_examination_sys.domain.dao.po.Notice;
import online_examination_sys.mapper.NoticeMapper;
import online_examination_sys.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public BaseDTO addNotice(String title, String context, int publisherId) {
		BaseDTO baseDTO = new BaseDTO();
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContext(context);
		notice.setPublisher_id(publisherId);
		int result = noticeMapper.addNotice(notice);
		if(result > 0) {
			baseDTO.setResultCode(1);
			baseDTO.setResultMsg("成功");
		}
		return baseDTO;
	}

	@Override
	public BaseDTO deleteNotice(int id) {
		BaseDTO baseDTO = new BaseDTO();
		int result = noticeMapper.deleteNoticeById(id);
		if(result > 0) {
			baseDTO.setResultCode(1);
			baseDTO.setResultMsg("成功");
		}
		return baseDTO;
	}

	@Override
	public NoticeListDTO showNoticeList() {
		NoticeListDTO noticeListDTO = new NoticeListDTO();
		List<Notice> list = noticeMapper.getAllNotice();
		if(list != null) {
			noticeListDTO.setNoticeList(list);
			noticeListDTO.setResultCode(1);
			noticeListDTO.setResultMsg("成功");
		}
		return noticeListDTO;
	}

}
