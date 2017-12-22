package com.iel.endoscope.service;

import com.iel.endoscope.dao.RoleDAO;
import com.iel.endoscope.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色接口的实现类
 * Created by wwg on 2017/12/1.
 * @author wwg
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        roleDAO.deleteByPrimaryKey(roleId);
        return 1;
    }

    @Override
    public void insert(Role record) {
        roleDAO.insert(record);
    }

    @Override
    public void insertSelective(Role record) {
        roleDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<Role> records) {
        roleDAO.insertBatch(records);
    }

    @Override
    public Role selectByPrimaryKey(Long roleId) {
        Role role = roleDAO.selectByPrimaryKey(roleId);
        return role;
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        roleDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        roleDAO.updateByPrimaryKey(record);
        return 1;
    }
}
