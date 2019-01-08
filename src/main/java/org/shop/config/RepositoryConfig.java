package org.shop.config;

import org.shop.repository.*;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {
    @Value("${initialSequence}")
    private long initialSequence;

    @Bean
    public ItemRepository getItemMapRepository(){
        return new ItemMapRepository();
    }
    @Bean
    public OrderRepository getOrderMapRepository(){
        OrderMapRepository orderRepository = new OrderMapRepository();
        orderRepository.setSequence(initialSequence);
        return orderRepository;
    }
    @Bean
    public ProductRepository getProductMapRepository(){
        return new ProductMapRepository();
    }
    @Bean
    public ProposalRepository getProposalMapRepository(){
        return new ProposalMapRepository();
    }
    @Bean
    public SellerRepository getSellerMapRepository(){
        return new SellerMapRepository();
    }
}
