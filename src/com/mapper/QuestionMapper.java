package com.mapper;

import com.pojo.Question;
import com.pojo.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer questionID);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExample(QuestionExample example);

    Question selectByPrimaryKey(Integer questionID);

    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
    
    
    Question DuobiaoqueryByQuestionId(Integer questionID);
    
    List<Question> queryByLikeBychoice(String choice);
    
    List<Question> queryByLikeBypage(Integer page);
    
    List<Question> queryByLikeByall(@Param("keyword") String keyword, @Param("pageNO") int pageNO);
    
    int getTotalPage();
    
    int getTotalPageBychoice(String choice);
    
    List<Question> queryByShijuan(List<String> choice);
    
    
}