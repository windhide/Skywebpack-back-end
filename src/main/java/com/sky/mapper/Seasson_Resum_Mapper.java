package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.Seasson_Resum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Seasson_Resum_Mapper extends BaseMapper<Seasson_Resum> {
    @Select("select * from Seasson_resum")
    List<Seasson_Resum> findAll();

    @Select("select * from Seasson_resum where seassonResumId = #{resumid}")
    List<Seasson_Resum> Find_Seasson_Resum_ById(int resumid);
}
