package org.shop.config;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DataInitConfig {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @Bean(initMethod="initData")
    public DataInitializer getDataInitializer(){
        return new DataInitializer();
    }

    @Bean
    public ProductInitializer getProductInitializer(){
        return new ProductInitializer(productService);
    }

    @Bean
    public ProposalInitializer getProposalInitializer(){
        return new ProposalInitializer();
    }

    @Bean
    public SellerInitializer getSellerInitializer(){
        return new SellerInitializer();
    }

    @Bean
    public UserInitializer getUserInitializer(){
        return new UserInitializer(userService);
    }
}
