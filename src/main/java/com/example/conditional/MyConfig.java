package com.example.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
	@Bean
    @Conditional(WindowsCondition.class)
    public ListService windowListService() {
        return new WindowsListService();
    }
    
    
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}