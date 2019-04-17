package com.adnice.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dubaoming
 */
@RefreshScope
@RestController
public class TestController {

    @Autowired
    private Environment env;

    @RequestMapping("/from")
    public String from(){
        return env.getProperty("from");
    }

}
