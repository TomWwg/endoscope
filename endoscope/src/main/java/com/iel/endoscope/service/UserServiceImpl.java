package com.iel.endoscope.service;

import com.iel.endoscope.dao.UserDAO;
import com.iel.endoscope.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/11/13.
 * @author wwg
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public int deleteByPrimaryKey(Long userId) {
        userDAO.deleteByPrimaryKey(userId);
        return 1;
    }

    @Override
    public void insert(User record) {

    }

    @Override
    public void insertSelective(User record) {
        userDAO.insertSelective(record);
    }

    @Override
    public void insertBatch(List<User> records) {

    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        User user = userDAO.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        userDAO.updateByPrimaryKeySelective(record);
        return 1;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 1;
    }

    @Override
    public User findByUsername(String username) {
        User user = userDAO.findByUsername(username);
        return user;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
