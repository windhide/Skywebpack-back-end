package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.HomePageImageTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HomePageImageTable_Mapper extends BaseMapper<HomePageImageTable> {

    @Select("select * from HomePageImageTable")
    List<HomePageImageTable> SelectAllHomePageImageTable();
}
