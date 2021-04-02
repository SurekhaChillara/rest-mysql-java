package com.surechil.rest.mysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlController {
    @GetMapping("controller")
    public String test(){
        return "This is from MysqlController!!";
    }
}
