package com.cdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: MyMall
 * @description: ${description}
 * @author: cdx
 * @create: 2018-07-29 19:53
 **/
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/{page}")
    public String ShowPage(@PathVariable String page) {
        return page;
    }
}
