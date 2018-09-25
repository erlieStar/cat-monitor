package com.st.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {


    // 当num=1时，不报异常。当num!=1时，会报异常
    @RequestMapping(value = "printnum", method = RequestMethod.GET)
    public Map login(@RequestParam("num") Integer num) {

        Map<String, Object> map = new HashMap<>();
        if (num == 1) {
            map.put("num", 1);
        } else {
            map.put("num", num / 0);
        }
        return map;
    }

}
