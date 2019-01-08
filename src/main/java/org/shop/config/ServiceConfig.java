package org.shop.config;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.shop.repository.ItemRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public ItemService getItemServiceImpl(ItemRepository repository){
        return new ItemServiceImpl(repository);
    }
    @Bean
    public OrderService getOrderServiceImpl(){
        return new OrderServiceImpl();
    }
    @Bean
    public ProductService getProductServiceImpl(ProductRepository repository){
        return new ProductServiceImpl(repository);
    }
    @Bean
    public ProposalService getProposalServiceImpl(ProposalRepository repository){
        return new ProposalServiceImpl(repository);
    }
    @Bean
    public SellerService getSellerServiceImpl(){
        return new SellerServiceImpl();
    }
    @Bean
    public UserService getUserServiceImpl(){
        return new UserServiceImpl();
    }
}
