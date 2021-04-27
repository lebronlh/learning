package com.lh.bootdemo.dao;

import com.lh.bootdemo.domain.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface OrderDao {

    /**
     * 插入订单
     * 注意: order表是关键字，需要`order`
     * @param order
     */
    @Insert("INSERT INTO `order` (uid, gid) VALUES (#{uid}, #{gid})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertOrder(Order order);
}

