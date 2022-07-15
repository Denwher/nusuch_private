package com.hopefuls.dao;

import com.hopefuls.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 */
@Repository
public interface UserDao extends BaseMapper<User> {
    @Select("select * from t_user where login_id = #{li} and password = #{pwd}")
    User selectByLoginIdAndPassword(@Param("li") String loginId, @Param("pwd") String password);

    @Select("select * from t_user where email = #{em} and password = #{pwd}")
    User selectByEmailAndPassword(@Param("em") String email, @Param("pwd") String password);
}
