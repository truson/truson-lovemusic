package com.truson.lovemusic.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pp on 2015/3/3.
 */
@Controller
@RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
public class BaseController {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "")
    public String index(HttpServletRequest request, HttpServletResponse response){

        return "index";
    }



}
