package com.iel.endoscope.service;

import com.iel.endoscope.entity.Role;

import java.util.List;

/**
 * 角色的接口
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
public interface RoleService {

    /**
     *根据主键删除对应的角色信息
     * @param roleId
     * @return
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     *插入角色信息
     * @param record
     */
    void insert(Role record);

    /**
     *选择性插入角色信息
     * @param record
     */
    void insertSelective(Role record);

    /**
     *批量插入
     * @param records
     */
    void insertBatch(List<Role> records);

    /**
     *根据主键查找对应的角色信息
     * @param roleId
     * @return
     */
    Role selectByPrimaryKey(Long roleId);

    /**
     *选择性更新角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Role record);
}
