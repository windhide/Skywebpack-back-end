package com.sky.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("HomePageImageTable")
public class HomePageImageTable {

    private int id;
    private String homepageFirstImage;
    private String SayMesseage;

}
