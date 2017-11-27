package com.iel.endoscope.service;

import com.iel.endoscope.entity.User;

import java.util.List;

/**
 * Created by wwg on 2017/11/13.
 * @author wwg
 */
public interface IUserService {

    /**
     * 通过userId删除User
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 新增User
     * @param record
     */
    void insert(User record);

    /**
     * 根据传进来的参数插入User
     * @param record
     */
    void insertSelective(User record);

    /**
     * 插入多个User
     * @param records
     */
    void insertBatch(List<User> records);

    /**
     * 根据userId查找User
     * @param userId
     * @return
     */
    User selectByPrimaryKey(Long userId);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}
