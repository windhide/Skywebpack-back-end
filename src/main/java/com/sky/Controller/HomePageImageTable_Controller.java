package com.sky.Controller;


import com.sky.entity.HomePageImageTable;
import com.sky.mapper.HomePageImageTable_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class HomePageImageTable_Controller{

    @Autowired
    HomePageImageTable_Mapper hitm;

    @ResponseBody
    @GetMapping("/HomePage_img")
    public List<HomePageImageTable> Hello(Model model){
        return hitm.SelectAllHomePageImageTable();
    }


}
