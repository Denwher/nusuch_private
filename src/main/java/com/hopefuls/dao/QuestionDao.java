package com.hopefuls.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hopefuls.domain.Question;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 */
@Repository
public interface QuestionDao extends BaseMapper<Question> {
    @Select("select * from t_question order by subscribe_num")
    List<Question> selectQuestionOrderBySubscribeNum();

    @Select("select * from t_question order by create_question_time")
    List<Question> selectQuestionOrderByCreateTime();

    //分页后根据create_time排序的List<Question>

    //分页后根据support_num排序的List<Question>

    //根据标签分页，再根据create_time排序的List<Question>

    //根据标签分页，再根据support_num排序的List<Question>

}
