package org.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({DataInitConfig.class,FactoryConfig.class,RepositoryConfig.class,ServiceConfig.class})
@PropertySource("classpath:/orderRepository.properties")
public class MainConfig {
}
