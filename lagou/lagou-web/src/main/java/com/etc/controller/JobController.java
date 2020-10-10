package com.etc.controller;

import com.etc.entity.Job;
import com.etc.service.JobService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/job")
public class JobController {

    @Resource
    private JobService jobService;

    @RequestMapping("/query")
    public ModelAndView query(Job j, @RequestParam(value = "pageNum",required = true,defaultValue = "1") Integer pageNum,
                              @RequestParam(value = "pageSize",required = true,defaultValue = "5") Integer pageSize){
        ModelAndView mv = new ModelAndView("joblist");
        mv.addObject("p",jobService.query(j,pageNum,pageSize));
        return mv;
    }

    @RequestMapping("/ajaxquery")
    @ResponseBody
    public PageInfo<Job> ajaxquery(Job j, @RequestParam(value = "pageNum",required = true,defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize",required = true,defaultValue = "5") Integer pageSize){
        return jobService.query(j,pageNum,pageSize);
    }
}
