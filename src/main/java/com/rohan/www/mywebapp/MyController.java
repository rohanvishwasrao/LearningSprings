package com.rohan.www.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rvishwasrao on 4/14/15.
 */
@Controller
public class MyController {

    @RequestMapping("/sayhello")
    @ResponseBody
    public String helloWorldFromRohan()
    {
        return "Hello World from Rohan";
    }

    @RequestMapping("/saybye")
    @ResponseBody
    public String byeFromRohan()
    {
        return "Good Bye from Rohan!";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addOps()
    {
        MathOperations ops = new MathOperations();
        Integer val = ops.addOperations(4 , 4).intValue();
        return val.toString();
    }

    @RequestMapping(value="/addparams", method = RequestMethod.GET)
    @ResponseBody
    public String addOps(@RequestParam("val1")String val1, @RequestParam("val2") String val2)
    {
        MathOperations ops = new MathOperations();
        int val1FromParameter = Integer.parseInt(val1);
        int val2FromParameter = Integer.parseInt(val2);
        Integer val = ops.addOperations(val1FromParameter, val2FromParameter).intValue();
        return val.toString();
    }



}
