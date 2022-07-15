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
@TableName("t_question")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String content;

    @TableField("subscribe_num")
    private Integer subscribeNum;

    private User author;

    @TableField("create_question_time")
    private LocalDateTime createQuestionTime;

    @TableField("answer_num")
    private Integer answerNum;

    @TableField("like_num")
    private Integer likeNum;

    @TableField("unlike_num")
    private Integer unlikeNum;

    //问题下的所有回答
    private List<Answer> answerList;

    //问题中所有标签
    private List<Tag> tagList;
}
