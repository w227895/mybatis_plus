package com.kebo.mybatis_plus.controller;

import com.kebo.mybatis_plus.mapper.UserMapper;
import com.kebo.mybatis_plus.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @description:
 * @author: kb
 * @create: 2019-12-22 20:18
 **/
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userMapper.selectList(null);
    }

    @GetMapping("/insert")
    public void insert(){
        User user = new User();
        user.setName("Helen");
        user.setAge(18);
        user.setEmail("55317332@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
    }

    @GetMapping("/update")
    public void update(){
        User user = new User();
        user.setId(1L);
        user.setName("Helen");
        //user.setAge(18);
        user.setEmail("55317332@qq.com");
        int result = userMapper.updateById(user);
        System.out.println(user);
        System.out.println(result);
    }
}

