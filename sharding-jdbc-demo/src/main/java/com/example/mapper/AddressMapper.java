package com.example.mapper;

import com.example.entity.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linking
 * @date 2022-03-31 01:10
 */
@Mapper
public interface AddressMapper {
    /**
     * 保存
     */
    void save(Address address);

    /**
     * 查询
     * @param id
     * @return
     */
    Address get(Long id);
}
