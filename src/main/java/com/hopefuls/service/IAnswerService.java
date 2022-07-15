package com.hopefuls.service;

import com.hopefuls.domain.Answer;
import com.hopefuls.domain.Question;
import com.hopefuls.domain.User;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 操作回答的服务类
 */
public interface IAnswerService {
    /**
     * @param aid: 问题列表
     * @return : 返回回答对象
     * @author Denwher
     * @description TODO 根据id获取回答
     * @date 2022/7/13
     */
    Answer getAnswerById(Integer aid);

    /**
     * @param question: 问题
     * @return : 返回回答列表
     * @author Denwher
     * @description TODO 根据采纳率获取回答列表
     * @date 2022/7/13
     */
    List<Answer> orderAnswerBySupport(Question question);

    /**
     * @param question: 问题
     * @return : 返回回答列表
     * @author Denwher
     * @description TODO 根据时间排序获取回答列表
     * @date 2022/7/13
     */
    List<Answer> orderAnswerByCreateTime(Question question);

    /**
     * @param answer: 添加的回答
     * @param question: 回答的问题
     * @param user: 回答问题的人
     * @return : 添加成功返回true，否则false
     * @author Denwher
     * @description
    TODO 在问题下添加回复
     * @date 2022/7/13
     */
    boolean addAnswer(Answer answer, Question question, User user);

    /**
     * @param answer: 更新点赞数的回答
     * @param user: 点赞或取消点赞的人
     * @return : 返回回答列表
     * @author Denwher
     * @description
    TODO 在问题下添加回复
     * @date 2022/7/13
     */
    boolean modifyAnswerSupport(Answer answer, User user);

}
