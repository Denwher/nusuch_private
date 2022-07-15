package com.hopefuls.service;

import com.hopefuls.domain.Tag;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Denwher
 * @since 2022-07-13
 * 操作标签的服务类
 */
public interface ITagService {
    /**
     * @param id: 标签对象主键id值
     * @return : 返回单个标签对象
     * @author Denwher
     * @description TODO 根据单个id查询标签
     * @date 2022/7/13
     */
    //Tag getById(Integer id);

    /**
     * @param : null
     * @return : 返回标签集合
     * @author Denwher
     * @description TODO 获取全部标签
     * @date 2022/7/13
     */
    Tag getAllTags();

    /**
     * @param ids: 标签对象id数组
     * @return : 返回标签集合
     * @author Denwher
     * @description TODO 根据id数组查询标签
     * @date 2022/7/13
     */
    List<Tag> getByIds(Integer[] ids);

    /**
     * @param tag: 标签对象
     * @return : 添加成功返回true，否则返回false
     * @author Denwher
     * @description TODO 添加标签
     * @date 2022/7/13
     */
    boolean addTag(Tag tag);
}
