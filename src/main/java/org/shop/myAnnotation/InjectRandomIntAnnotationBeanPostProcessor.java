package org.shop.myAnnotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field: fields){
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null){
                int min = annotation.min();
                int max = annotation.max();
                int value = (int) (Math.random()*(max-min) + min);
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, value);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        return bean;
    }
}
