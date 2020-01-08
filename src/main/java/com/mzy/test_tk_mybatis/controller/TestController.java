package com.mzy.test_tk_mybatis.controller;

import com.mzy.test_tk_mybatis.mapper.TestMapper;
import com.mzy.test_tk_mybatis.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @GetMapping("/test")
    public List<Test> test() {
        return testMapper.selectAll();
    }
}
