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
@TableName("MainTable")
public class Sprit_Anps {

    @TableId(type= IdType.AUTO)
    private int id;
    private String SpritName;
    private String Sprittype;
    private String lastTime;
    private String AllCount;
    private String littleimage;
    private String clickimage;
}
