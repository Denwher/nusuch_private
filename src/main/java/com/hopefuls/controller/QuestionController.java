package com.hopefuls.controller;


import com.hopefuls.domain.Question;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 问题控制器
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    /**
     * @param question: 用户提问信息
     * @param session: 保存了用户信息的session
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户提问的方法
     * @date 2022/7/13
     */
    @PostMapping
    public Result askQuestion(@RequestBody Question question, HttpSession session){
        //用户提出的问题封装为对象，使用setter方法添加必要的属性（如提问时间），也可以由前端完成
        //从session域中获取User对象，将User对象映射到问题user属性中
        //question表和t_user_question关联表添加数据
        return null;
    }


    /**
     * @param : null
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 访问首页时，自动刷新难题榜和最近问题榜单
     * @date 2022/7/13
     */
    @GetMapping("getBillBoard")
    public Result initBillBoard(){
        //难题榜通过用户关注问题数进行排序，得到Question集合对象
        //最近问题榜通过提问创建时间排序，得到Question集合对象
        return null;
    }


    /**
     * @param tags: 表示按照标签筛选展示榜单
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 点击标签后即时更新榜单，可以选择多个标签，组合查询
     * @date 2022/7/13
     */
    @GetMapping("/byTag")
    public Result updateBillBoardByTags(@RequestBody String[] tags){
        //通过标签查询符合要求的问题
        //难题榜和最近回答问题榜根据此结果进行展示
        return null;
    }


    /**
     * @param key: 搜索的关键词
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 展示按关键词查找结果
     * @date 2022/7/13
     */
    @GetMapping("/{key}")
    public Result searchQuestionByKey(@PathVariable String key){
        //通过关键字匹配问题的标题或正文，返回问题集合并展示
        //默认使用问题回答数来排序
        return null;
    }


    /**
     * @param qid: 问题的id
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 点击标题，获取问题详情
     * @date 2022/7/13
     */
    @GetMapping("/{qid}")
    public Result questionDetail(@PathVariable Integer qid){
        //通过id查询到Question对象，封装到result类中，在页面上展示
        //通过t_tag_question关联表查询到该问题的tag，并展示在问题列表中
        return null;
    }

    /**
     * @param qid: 问题id
     * @param flag: 0-表示用户关注问题； 1-表示用户取消关注
     * @param session: session域，保存了当前登录的用户对象
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户关注/取消问题的方法
     * @date 2022/7/13
     */
    @PutMapping("/{qid}/{flag}")
    public Result subscribeQuestion(@PathVariable Integer qid, @PathVariable Integer flag, HttpSession session){
        //根据qid获取到当前Question对象
        //根据flag的值，判断对subscribeNum做何种运算
        //运算之后，更新t_question表中的subscribeNum属性和增删t_user_question中的数据
        return null;
    }


    /**
     * @param : null
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 获取标签列表的方法
     * @date 2022/7/13
     */
    @GetMapping("/getTag")
    public Result getTagList(){
        //获取所有的标签列表，页面展示
        //tagService
        return null;
    }
}

