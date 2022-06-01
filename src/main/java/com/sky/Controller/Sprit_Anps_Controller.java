package com.sky.Controller;

import com.sky.entity.Sprit_Anps;
import com.sky.mapper.Sprit_Anps_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class Sprit_Anps_Controller {

    @Autowired
    Sprit_Anps_Mapper SaMapper;
    @ResponseBody
    @GetMapping("/Sprit_Anps")
    public List<Sprit_Anps> Hello(Model model){
        List<Sprit_Anps> list = SaMapper.findAll();
        return list;
    }



}
