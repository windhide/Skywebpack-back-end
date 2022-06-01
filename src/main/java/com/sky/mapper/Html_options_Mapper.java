package com.sky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sky.entity.Html_options;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Html_options_Mapper extends BaseMapper<Html_options> {
    @Select("SELECT * from html_options")
    List<Html_options> FindAllHOptions();
}
