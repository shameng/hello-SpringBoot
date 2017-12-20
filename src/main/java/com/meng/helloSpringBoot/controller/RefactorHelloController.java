package com.meng.helloSpringBoot.controller;

import com.meng.api.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meng
 * @create 2017-12-13 19:59
 **/
@RestController
public class RefactorHelloController implements HelloService {

    private final Logger logger = LoggerFactory.getLogger(RefactorHelloController.class);

    @Override
    public String hello4(@RequestParam String name) {
        return "hello, " +name;
    }

    @Override
    public com.meng.dto.User hello5(@RequestHeader String name, @RequestHeader Integer id) {
        return new com.meng.dto.User(id, name);
    }

    @Override
    public String hello6(@RequestBody com.meng.dto.User user) {
        return "hello, " + user.getName() + ", " + user.getId();
    }

}
