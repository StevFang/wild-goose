package com.qs.service;

/**
 * 注册服务接口
 *
 * @author FBin
 * @time 2019/1/22 17:39
 */
public interface RegisterService {

    /**
     * 注册服务
     *
     * @param interfaceClass 服务接口
     * @param version 服务版本
     * @return
     */
    boolean register(Class<?> interfaceClass, String version);

    /**
     * 注销服务
     *
     * @param interfaceClass
     * @param version
     * @return
     */
    boolean unregister(Class<?> interfaceClass, String version);

}
