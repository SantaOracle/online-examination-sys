package online_examination_sys.mapper;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeMapper {
    public List<Notice> getAllNotice();

    public Notice getNoticeById(@Param("Id") int id);

    public int addNotice( RegisterDTO notice);

    public int updateNoticeById(Notice notice);

    public int deleteNoticeById(@Param("Id") int id);


}
