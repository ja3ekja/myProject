package com.epam.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

/**
 * Created by jacek on 25.04.17.
 */
@Aspect
public class LoggingAspect {

    @Before("execution(* com.epam.app.repository.CustomerRepository.get*(..))")
    public void logExecution() {
        Logger.getLogger(getClass().getName()).info("Metod exxecuting");

    }
}
