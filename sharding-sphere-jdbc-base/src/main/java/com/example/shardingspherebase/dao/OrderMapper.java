package com.example.shardingspherebase.dao;

import com.example.shardingspherebase.entity.tOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("SELECT * FROM t_order WHERE id=#{id} LIMIT 1")
    tOrder userById(Integer id);

    void insert(@Param("order") tOrder order);

}