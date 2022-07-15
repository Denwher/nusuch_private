package com.hopefuls.service;

import com.hopefuls.domain.Question;
import com.hopefuls.domain.Tag;
import com.hopefuls.domain.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 操作提问的服务类
 */
public interface IQuestionService {

    /**
     * @param question: 提问
     * @return : 添加提问成功，返回true，否则返回false
     * @author Denwher
     * @description TODO 添加提问
     * @date 2022/7/13
     */
    boolean addQuestion(Question question);

    /**
     * @param qid: 问题的id
     * @return : 返回对应id的问题对象
     * @author Denwher
     * @description TODO 根据id获取问题详情
     * @date 2022/7/13
     */
    Question getQuestionById(Integer qid);

    /**
     * @param qid: 问题的id
     * @param subscribeNum: 关注问题的人数
     * @param user: 取消或关注问题的用户
     * @return : 操作成功，返回true，否则返回false
     * @author Denwher
     * @description TODO 修改问题关注量
     * @date 2022/7/13
     */
    boolean updateQuestionSubscribeNum(Integer qid, Integer subscribeNum, User user);


    /**
     * @param : null
     * @return : 返回根据关注量排序的问题
     * @author Denwher
     * @description TODO 根据关注量排序
     * @date 2022/7/13
     */
    List<Question> orderQuestionBySubscribeNum();


    /**
     * @param : null
     * @return : 返回按发布时间排序后的问题
     * @author Denwher
     * @description TODO 根据问题发布时间排序
     * @date 2022/7/13
     */
    List<Question> orderQuestionByCreateTime();


    /**
     * @param tags: 用户选择的标签
     * @return : 返回根据发布时间排序的问题
     * @author Denwher
     * @description TODO 根据标签更新最近问题榜单
     * @date 2022/7/13
     */
    List<Question> orderQuestionByCreateTimeWithTag(String[] tags);

    /**
     * @param tags: 用户选择的标签
     * @return : 返回根据问题关注量排序的问题
     * @author Denwher
     * @description TODO 根据标签更新难题榜单
     * @date 2022/7/13
     */
    List<Question> orderQuestionBySubscribeNumWithTag(String[] tags);


    /**
     * @param key: 搜索的关键字
     * @return : 返回与关键字相关的问题
     * @author Denwher
     * @description TODO 根据关键字搜素相关的问题，默认用问题回答数排序
     * @date 2022/7/13
     */
    List<Question> getQuestionByKey(String key);

    /**
     * @param qid: 当前问题的id
     * @return : 返回该问题下的所有回答
     * @author Denwher
     * @description TODO 获取当前问题所有标签的方法
     * @date 2022/7/13
     */
    List<Tag> questionTagList(Integer qid);
}
