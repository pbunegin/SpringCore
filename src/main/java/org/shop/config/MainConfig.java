package org.shop.config;

import org.shop.myAnnotation.InjectRandomIntAnnotationBeanPostProcessor;
import org.shop.aspects.LoggingAspect;
import org.shop.myAnnotation.TestInjectRandomInt;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import({DataInitConfig.class,FactoryConfig.class,RepositoryConfig.class,ServiceConfig.class})
@PropertySource("classpath:orderRepository.properties")
@EnableAspectJAutoProxy
public class MainConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public LoggingAspect getLoggingAspect(){
        return new LoggingAspect();
    }
    @Bean
    public BeanPostProcessor getInjectRandomIntAnnotationBeanPostProcessor(){
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }
    @Bean
    public TestInjectRandomInt getTestInjectRandomInt(){
        return new TestInjectRandomInt();
    }
}
