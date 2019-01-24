package com.qs.service;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author FBin
 * @time 2019/1/22 17:42
 */
@Slf4j
@Component
@Service(version = "1.0.0", interfaceClass = RegisterService.class, timeout = 3000)
public class RegisterServiceImpl implements RegisterService {

    @Override
    public boolean register(Class<?> interfaceClass, String version) {
        return false;
    }

    @Override
    public boolean unregister(Class<?> interfaceClass, String version) {
        return false;
    }
}
