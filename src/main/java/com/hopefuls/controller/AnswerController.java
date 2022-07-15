package com.hopefuls.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 回答控制器
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {
    /**
     * @param content: 回答的内容
     * @param qid: 回答的问题id
     * @param session: session域对象
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户添加回答的方法
     * @date 2022/7/13
     */
    @PostMapping
    public Result addAnswer(@RequestParam("content") String content, @RequestParam("qid") Integer qid, HttpSession session){
        //将用户输入的回答内容封装为一个Answer对象
        //在t_answer中新增一条记录
        //通过qid找到Question对象，新增一条回答
        return null;
    }


    /**
     * @param flag: 1-表示按照时间顺序展示回答列表, 2-表示按照采纳率展示回答列表
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 根据条件获取回答列表的方法
     * @date 2022/7/13
     */
    @GetMapping("/{qid}")
    public Result answerListByCondition(@PathVariable Integer qid, @RequestParam("flag") Integer flag){
        //根据flag判断通过何种方式展示回答列表
        return null;
    }


    /**
     * @param flag: 0-表示踩回答，1-表示点赞回答
     * @param aid: 该回答
     * @param uid: 支持的用户
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户支持回答的方法
     * @date 2022/7/13
     */
    @PutMapping("/{flag}/{aid}/{uid}")
    public Result likeAnswer(@PathVariable Integer flag, @PathVariable Integer aid, @PathVariable Integer uid){
        //根据flag判断是点赞还是踩回答
        //根据id获取回答，得到回答的点赞数，加一或者减一
        //调用service层的方法
        return null;
    }


    /**
     * @param aid: 题主回复的回答id
     * @param content: 题主回复的内容
     * @param session: session域
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 题主回复回答的方法
     * @date 2022/7/13
     */
    @PostMapping("/{aid}")
    public Result addHostAnswer(@PathVariable Integer aid, @RequestParam("content") String content, HttpSession session){
        //通过aid找到对应的Answer
        //判断session域中的user是不是当前问题的提问的人，如果不是，退出方法并提示用户无权限
        //将题主的回复封装成HostAnswer对象，添加到数据库中，并封装到Answer对象中
        return null;
    }
}

