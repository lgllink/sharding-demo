package com.example.controller;/**
 * @author linking
 * @date 2022-03-31 01:09
 */

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author linking
 * @date 2022/3/31
 */

@RestController
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/save")
    @ResponseBody
    public String save() {
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setName("test" + i);
            user.setCityId(i % 2 == 0 ? 1 : 2);
            user.setCreateTime(new Date());
            user.setSex(i % 2 == 0 ? 1 : 2);
            user.setPhone("11111111" + i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("eeeeeeeeeeee");
            userMapper.save(user);
        }

        return "success";
    }

    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public User get(@PathVariable Long id) {
        User user = userMapper.get(id);
        System.out.println(user.getId());
        return user;
    }

    @RequestMapping("/user/sex/{sex}")
    @ResponseBody
    public List<User> getBySex(@PathVariable Integer sex) {
        List<User> userList = userMapper.getBysex(sex);
        System.out.println(userList);

        return userList;
    }

}
