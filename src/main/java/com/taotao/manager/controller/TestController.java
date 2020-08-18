package com.taotao.manager.controller;

import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 查询当前时间
     *
     * @return
     */
    @RequestMapping("date")
    @ResponseBody
    public String queryDate() {
        return this.testService.queryDate();
    }



}
