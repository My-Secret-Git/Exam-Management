package com.mapper;

import com.pojo.Banji;
import com.pojo.BanjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BanjiMapper {
    int countByExample(BanjiExample example);

    int deleteByExample(BanjiExample example);

    int deleteByPrimaryKey(String bjdh);

    int insert(Banji record);

    int insertSelective(Banji record);

    List<Banji> selectByExample(BanjiExample example);

    Banji selectByPrimaryKey(String bjdh);

    int updateByExampleSelective(@Param("record") Banji record, @Param("example") BanjiExample example);

    int updateByExample(@Param("record") Banji record, @Param("example") BanjiExample example);

    int updateByPrimaryKeySelective(Banji record);

    int updateByPrimaryKey(Banji record);
}