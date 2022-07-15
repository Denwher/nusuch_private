package com.hopefuls.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
/**
 * @projectName:
 * @package:        ${PACKAGE_NAME}
 * @className:      ${NAME}
 * @author:     Denwher
 * @description:  TODO
 * @date:    2022-07-13
 * @version:    1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("login_id")
    private String loginId;

    @TableField("nick_name")
    private String nickName;

    private String email;

    private String password;

    private String headImg;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("login_time")
    private LocalDateTime loginTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;

    //用户关注的问题
    private List<Question> focusQuestions;

    //用户的提问
    private List<Question> myQuestions;

    //用户的回答
    private List<Answer> myAnswers;
}
