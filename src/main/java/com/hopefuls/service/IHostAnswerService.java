package com.hopefuls.service;

import com.hopefuls.domain.Answer;
import com.hopefuls.domain.HostAnswer;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 操作题主回复的服务类
 */
public interface IHostAnswerService {
    /**
     * @param aid: 问题下的回答
     * @param hostAnswer: 题主的回复
     * @return : 操作成功返回true，否则为false
     * @author Denwher
     * @description TODO 在问题下添加回复
     * @date 2022/7/13
     */
    boolean addHostAnswer(Integer aid, HostAnswer hostAnswer);


    /**
     * @param aid: 问题下的回答
     * @return : 返回HostAnswer对象
     * @author Denwher
     * @description TODO 获取题主的回复
     * @date 2022/7/13
     */
    HostAnswer getHostAnswer(Integer aid);
}
