package com.wzy.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/18
 * 修改说明
 * <p>Title: TomcatConfig.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/

@Configuration
public class TomcatConfig {

    @Bean
    public AbstractServletWebServerFactory embeddedServletContainerFactory() {
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        /*tomcatServletWebServerFactory.setDocumentRoot(
                new File("F:\\googledownload\\SpringBoot01\\src\\main\\webapp\\"));
        tomcatServletWebServerFactory.setPort(8086);*/
        return  tomcatServletWebServerFactory;
    }
}
