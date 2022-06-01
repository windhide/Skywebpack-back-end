package com.sky.Controller;

import com.sky.entity.Seasson_Resum;
import com.sky.mapper.Seasson_Resum_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Controller
@RestController
public class Seasson_Resum_Controller {

    @Autowired
    Seasson_Resum_Mapper srm;

    @ResponseBody
    @GetMapping("/Seasson_Resum")
    public List<Seasson_Resum> Hello(Model model){
        List<Seasson_Resum> list = srm.findAll();
        return list;
    }

    @GetMapping("/Seasson_Blog")
    public Seasson_Resum Hello2(int id){
        Seasson_Resum sr = srm.Find_Seasson_Resum_ById(id).get(0);
        return sr;
    }



}
