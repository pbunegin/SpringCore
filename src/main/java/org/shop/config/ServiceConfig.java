package org.shop.config;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.shop.repository.ItemRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProposalRepository proposalRepository;


    @Bean
    public ItemService getItemServiceImpl(){
        return new ItemServiceImpl(itemRepository);
    }
    @Bean
    public OrderService getOrderServiceImpl(){
        return new OrderServiceImpl();
    }
    @Bean(name = "prodService")
    public ProductService getProductServiceImpl(){
        return new ProductServiceImpl(productRepository);
    }
    @Bean(name = "propService")
    public ProposalService getProposalServiceImpl(){
        return new ProposalServiceImpl(proposalRepository);
    }
    @Bean(name = "selService")
    public SellerService getSellerServiceImpl(){
        return new SellerServiceImpl();
    }
    @Bean
    public UserService getUserServiceImpl(){
        return new UserServiceImpl();
    }
}
