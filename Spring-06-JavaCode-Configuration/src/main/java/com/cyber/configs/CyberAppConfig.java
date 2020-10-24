package com.cyber.configs;

import com.cyber.services.Java;
import com.cyber.services.OfficeHours;
import com.cyber.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;

@Configuration
@ComponentScan("com.cyber")
public class CyberAppConfig {

    @Bean
    public  Java java(){
        return new Java(officeHours());
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

}
