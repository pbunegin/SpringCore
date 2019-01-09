package org.shop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @After("execution(* org.shop.*.init*(..)) && !within(is(FinalType))")
    public void logInit(JoinPoint jp) {
        if (jp.getTarget() != null){
            LOGGER.info(jp.getTarget().toString());
        }
        LOGGER.info(jp.toLongString());
    }
//    @Before("execution(* org.shop.*.create*(..)) && execution(* org.shop.*.register*(..)) && !within(is(FinalType))")
//    public void logCreate(JoinPoint jp) {
//        LOGGER.info(jp.toLongString());
//    }
//    @Before("execution(* org.shop.*.init*(..)) && !within(is(FinalType))")
//    public void log(JoinPoint jp) {
//        LOGGER.info(jp.toLongString());
//    }
}