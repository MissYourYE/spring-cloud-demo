package com.adnice.provider;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dubaoming
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        logger.info("执行了provider的Hello接口");
        return "Hello Word!";
    }
}
