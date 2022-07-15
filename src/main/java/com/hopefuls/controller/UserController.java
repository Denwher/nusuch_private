package com.hopefuls.controller;


import com.hopefuls.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 用户控制器
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * @param user: 封装了用户登录信息的User类
     * @param session: 保存了用户信息的session域
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户登录验证的方法
     * @date 2022/7/13
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user, HttpSession session){
        //判断email或loginId是否为空
        //使用用户名+密码或邮箱+密码的方式，查找User对象
        //并将user对象封装到session域中
        return null;
    }

    /**
     * @param session: 保存了用户信息的session域
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户登出的方法
     * @date 2022/7/13
     */
    @GetMapping("/logout")
    public Result logout(HttpSession session){
        //从session域中移除User对象
        return null;
    }


    /**
     * @param user: 保存用户信息的User类
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 新用户注册的方法
     * @date 2022/7/13
     */
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        //t_user表中新增数据
        return null;
    }



    /**
     * @param user: 封装了用户修改信息的User类
     * @return : 返回给前台的结果
     * @author Denwher
     * @description TODO 用户修改个人资料的方法
     * @date 2022/7/13
     */
//    @PutMapping
//    public Result updateUserDetail(@RequestBody User user){
//        return null;
//    }

}

