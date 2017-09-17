package online_examination_sys.mapper;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.Paper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperMapper {

    public String getTitleById(@Param("Id") int id);

    public Paper getPaperById(@Param("Id") int id);

    public int updatePaperById(Paper paper);

    public int deletePaperById(@Param("Id") int id);

    public Paper addPaper(RegisterDTO Paper);

    public Paper getSubject_ids_strById(@Param("Id") int id);

    public List<Paper> getAllPaper();

}
