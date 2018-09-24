package com.st.controller;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {


    @RequestMapping(value = "printnum", method = RequestMethod.GET)
    public Map login(@RequestParam("num") Integer num) {

        Transaction t = Cat.newTransaction("URL", "haha");
        t.setStatus(Transaction.SUCCESS);
        Cat.logEvent("hello", "haha");
        Map<String, Object> map = new HashMap<>();
        map.put("num", num);
        return map;
    }

}
