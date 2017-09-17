package online_examination_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import online_examination_sys.domain.dao.dto.BaseDTO;
import online_examination_sys.domain.dao.dto.NoticeListDTO;
import online_examination_sys.service.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "/addNotice")
	@ResponseBody
	public BaseDTO addNotice(
			@RequestParam(value = "title", required = true)String title,
			@RequestParam(value = "context", required = true)String context,
			@RequestParam(value = "publisherId", required = true)int publisherId
	) {
		return noticeService.addNotice(title, context, publisherId);
	}
	
	@RequestMapping(value = "/deleteNotice")
	@ResponseBody
	public BaseDTO deleteNotice(
			@RequestParam(value = "id", required = true)int id			
	) {
		return noticeService.deleteNotice(id);
	}
	
	@RequestMapping(value = "/showNoticeList")
	@ResponseBody
	public NoticeListDTO showNoticeList() {
		return noticeService.showNoticeList();
	}
	
}
