package com;

import com.wzy.SystemApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类功能说明:/**
 * SpringBoot测试类
 *@RunWith:启动器
 *SpringJUnit4ClassRunner.class：让junit与spring环境进行整合
 *
 *@SpringBootTest(classes={App.class}) 1,当前类为springBoot的测试类
 *@SpringBootTest(classes={App.class}) 2,加载SpringBoot启动类。启动springBoot
 *
 * 可以service层注入进来
 *
 *junit与spring整合 @Contextconfiguartion("classpath:applicationContext.xml")
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SystemApplication.class})
public class SpringJunit4Test {

    @Test
    public void test(){

    }

}
