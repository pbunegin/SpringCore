package org.shop.config;

import org.shop.api.ItemService;
import org.shop.api.impl.ItemServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public ItemService getItemServiceImpl(){
        return new ItemServiceImpl();
    }
}
