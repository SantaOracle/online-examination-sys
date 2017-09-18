package online_examination_sys.mapper;

import online_examination_sys.domain.dao.dto.RegisterDTO;
import online_examination_sys.domain.dao.po.Achivement;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchivementMapper {
    public List<Achivement> getAllAchivement();

    public Achivement getNoticeById(@Param("Id") int id);

    public int addAchivement( RegisterDTO achivement);

    public int updateAchivementById(Achivement achivement);

    public int deleteAchivementById(@Param("Id") int id);


}
