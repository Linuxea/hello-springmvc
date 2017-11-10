package com.linuxea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("this is controller");
        return "{name:linuxea}";
    }

    @ResponseBody
    @RequestMapping(value = "/person/get/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id) {
        return "get one :" + id;
    }

    @ResponseBody
    @RequestMapping(value = "/person/update/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable int id) {
        return "update one :" + id;
    }

    @RequestMapping(value = "/person/add/{id}", method = RequestMethod.POST)
    public String add(@PathVariable int id) {
        return "add one :" + id;
    }

    @ResponseBody
    @RequestMapping(value = "/person/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        return "delete one :" + id;
    }



}
