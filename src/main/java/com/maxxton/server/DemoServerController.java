package com.maxxton.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by burgs.m on 7-3-2016.
 */
@RestController
public class DemoServerController {

    @RequestMapping(value="/greet",method= RequestMethod.GET)
    public String greet(@RequestParam String name) {
        return "Latest: Hello " + name;
    }
}
