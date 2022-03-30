package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linking
 * @date 2022-03-31 01:11
 */
@Mapper
public interface UserMapper {
    /**
     * 保存
     */
    void save(User user);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    User get(Long id);

    List<User> getBysex(Integer sex);
}
