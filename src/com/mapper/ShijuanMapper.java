package com.mapper;

import com.pojo.Shijuan;
import com.pojo.ShijuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShijuanMapper {
    int countByExample(ShijuanExample example);

    int deleteByExample(ShijuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shijuan record);

    int insertSelective(Shijuan record);

    List<Shijuan> selectByExample(ShijuanExample example);

    Shijuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shijuan record, @Param("example") ShijuanExample example);

    int updateByExample(@Param("record") Shijuan record, @Param("example") ShijuanExample example);

    int updateByPrimaryKeySelective(Shijuan record);

    int updateByPrimaryKey(Shijuan record);
}