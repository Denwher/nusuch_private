package com.hopefuls.service;

import com.hopefuls.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 *  操作用户的服务类
 */

public interface IUserService {
    /**
     * @param user: 用户对象
     * @return : 添加成功返回true，否则返回false
     * @author Denwher
     * @description TODO 添加用户
     * @date 2022/7/13
     */
    boolean addUser(User user);

    /**
     * @param user: 封装了用户名和密码的User对象
     * @return : 成功找到用户返回true，否则返回false
     * @author Denwher
     * @description TODO 根据用户名和密码查找用户
     * @date 2022/7/13
     */
    boolean findByUsernameAndPassword(User user);

    /**
     * @param user: 封装了用户邮箱和密码的User对象
     * @return : 成功找到用户返回true，否则返回false
     * @author Denwher
     * @description TODO 根据用户邮箱和密码查找用户
     * @date 2022/7/13
     */
    boolean findByEmailAndPassword(User user);


    /**
     * @param id: 封装了用户邮箱和密码的User对象
     * @return : 成功找到用户返回true，否则返回false
     * @author Denwher
     * @description TODO 根据用户id查找用户
     * @date 2022/7/13
     */
    boolean getUserById(Integer id);


    /**
     * @param username: 注册信息中填写的用户名
     * @return : 修改成功返回true，否则返回false
     * @author Denwher
     * @description TODO 查找用户名是否已经被注册
     * @date 2022/7/13
     */
    boolean findUsername(String username);


    /**
     * @param email: 注册信息中填写的用户名
     * @return : 修改成功返回true，否则返回false
     * @author Denwher
     * @description TODO 查找邮箱是否已经被注册
     * @date 2022/7/13
     */
    boolean findEmail(String email);

    /**
     * @param user: 封装了用户信息的User对象
     * @return : 修改成功返回true，否则返回false
     * @author Denwher
     * @description TODO 修改用户个人信息
     * @date 2022/7/13
     */
    //boolean updateUserDetail(User user);
}
