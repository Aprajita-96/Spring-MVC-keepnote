package com.stackroute.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute"})
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vw= new InternalResourceViewResolver();
        vw.setPrefix("/WEB-INF/views/");
        vw.setSuffix(".jsp");
        return vw;

    }
}
