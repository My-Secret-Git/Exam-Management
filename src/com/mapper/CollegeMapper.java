package com.mapper;

import com.pojo.College;
import com.pojo.CollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(String xydh);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(String xydh);

    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}