package com.etc.controller;

import com.etc.entity.OneType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.etc.service.TypeService;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeController {

    @Resource
    private TypeService typeService;

    @RequestMapping("/query")
    public ModelAndView query(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("list",typeService.query());
        return mv;
    }

    @RequestMapping("/ajaxquery")
    @ResponseBody
    public List<OneType> ajaxquery(){
        return typeService.query();
    }
}
