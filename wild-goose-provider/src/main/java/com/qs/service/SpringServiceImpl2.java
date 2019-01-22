package com.qs.service;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author FBin
 * @time 2019/1/22 17:15
 */
@Component
@Slf4j
@Service(version = "1.0.1", interfaceClass = SpringService.class, timeout = 3000)
public class SpringServiceImpl2 implements SpringService {
    @Override
    public String sayHello() {
        return "Hello world! Hello Dubbo!";
    }
}
