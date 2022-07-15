package com.hopefuls.dao;

import com.hopefuls.domain.Answer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 */
public interface AnswerDao extends BaseMapper<Answer> {
    //先分页，再根据create_time排序的List<Answer>
}
