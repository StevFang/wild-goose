package com.qs;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
@Slf4j
public class AppTest {

    @Test
    public void loadJar() throws Exception{
        String path1 = "E:\\wild_goose_jars\\wild-goose-model-1.0.2-SNAPSHOT.jar";
        DynamicOperateJarUtils.loadJar(path1);
        Class<?> aClass = Class.forName("com.qs.App");
        Object instance = aClass.newInstance();
        aClass.getDeclaredMethod("sayHello").invoke(instance);

//        String path2 = "E:\\wild_goose_jars\\wild-goose-model-1.0.2-SNAPSHOT.jar";
//        DynamicOperateJarUtils.loadJar(path2);
//        aClass = Class.forName("com.qs.App");
//        instance = aClass.newInstance();
//        aClass.getDeclaredMethod("sayHello").invoke(instance);
    }
}
