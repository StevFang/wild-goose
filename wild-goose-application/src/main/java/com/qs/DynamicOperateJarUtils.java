package com.qs;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 动态加载jar工具类
 *
 * @author FBin
 * @time 2019/1/24 15:01
 */
@Slf4j
public class DynamicOperateJarUtils {

    /**
     * 加载指定路径的jar文件
     *
     * @param jarPath jar包的绝对路径
     */
    public static void loadJar(String jarPath) {
        File jarFile = new File(jarPath);
        // 从URLClassLoader类中获取类所在文件夹的方法，jar也可以认为是一个文件夹
        Method method = null;
        try {
            method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        } catch (NoSuchMethodException | SecurityException e) {
            log.error(e.getMessage(), e);
        }
        // 获取方法的访问权限以便写回
        boolean accessible = method.isAccessible();
        try {
            method.setAccessible(true);
            // 获取系统类加载器
            URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            URL url = jarFile.toURI().toURL();
            method.invoke(classLoader, url);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            method.setAccessible(accessible);
        }
    }

}
