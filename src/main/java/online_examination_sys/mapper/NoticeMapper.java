package online_examination_sys.mapper;

import online_examination_sys.domain.dao.po.Notice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeMapper {
    public List<Notice> getAllNotice();

    public Notice getNoticeById(@Param("Id") int id);

    public int addNotice( Notice notice);

    public int updateNoticeById(Notice notice);

    public int deleteNoticeById(@Param("Id") int id);


}
