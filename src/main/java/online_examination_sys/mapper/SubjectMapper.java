package online_examination_sys.mapper;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectMapper {
    public List<Subject> getAllSubject();

    public Subject getSubjectById(@Param("Id") int id);

    public int addSubject(Subject subject);

    public int updateSubjectById(Subject subject);

    public int deleteSubjectById(@Param("Id") int id);

}
