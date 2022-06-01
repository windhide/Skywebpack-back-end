package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.Sprit_Anps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Sprit_Anps_Mapper extends BaseMapper<Sprit_Anps> {
    @Select("SELECT " +
            "a.id,a.SpritName," +
            "t.spritname Sprittype," +
            "a.lastTime," +
            "a.AllCount," +
            "a.littleimage," +
            "a.clickimage" +
            " from sprit_anps a,sprit_type t " +
            "where a.Sprittype = t.spritid " +
            "order by a.id desc")
    List<Sprit_Anps> findAll();
}
