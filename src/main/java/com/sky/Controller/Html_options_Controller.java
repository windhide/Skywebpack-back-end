package com.sky.Controller;

import com.sky.entity.Html_options;
import com.sky.mapper.Html_options_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class Html_options_Controller {

    @Autowired
    Html_options_Mapper Ohm;

    @ResponseBody
    @GetMapping("/Options_html")
    public List<Html_options> Hello(Model model){
        return  Ohm.FindAllHOptions();
    }



}
