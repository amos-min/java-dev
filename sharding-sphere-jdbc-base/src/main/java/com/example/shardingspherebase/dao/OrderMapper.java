package com.example.shardingspherebase.dao;

import com.example.shardingspherebase.entity.tOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("SELECT * FROM t_order WHERE id=#{id} LIMIT 1")
    tOrder userById(Integer id);

    @Insert("INSERT INTO t_order (user_id) VALUES (#{userId})")
    void insert(@Param("userId") Long userId);

}