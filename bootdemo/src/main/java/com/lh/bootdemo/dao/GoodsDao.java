package com.lh.bootdemo.dao;

import com.lh.bootdemo.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface GoodsDao {

    /**
     * 查询商品库存
     * @param id 商品id
     * @return
     */
    @Select("SELECT * FROM goods WHERE id = #{id}")
    Goods getStock(@Param("id") int id);

    /**
     * 乐观锁方案扣减库存
     * @param id 商品id
     * @param version 版本号
     * @return
     */
    @Update("UPDATE goods SET stock = stock - 1, version = version + 1 WHERE id = #{id} AND stock > 0 AND version = #{version}")
    int decreaseStockForVersion(@Param("id") int id, @Param("version") int version);
}

