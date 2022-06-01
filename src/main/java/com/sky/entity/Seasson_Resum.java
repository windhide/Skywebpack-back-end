package com.sky.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("seasson_resum")
public class Seasson_Resum {

    @TableId(value = "seasson_resum_id",type = IdType.AUTO)
    private int seassonResumId;
    private String seassonResumImg;
    private String seassonResumName;
    private String seassonResumDate;
    private String seassonResumSumday;
    private String seassonResumIntroduce;
    private String seassonResumOutImage;
    private String seassonResumPriceImage;
    private String seassonResumTexT;
    private int seassonResumTypeid;




}
