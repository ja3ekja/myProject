package com.epam.app.beans.impl;

import com.epam.app.beans.SimpleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jacek on 24.04.17.
 */

public class SimpleBeanImpl implements SimpleBean {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void doSomething() {
        logger.info("Ryba pila a pies jadł");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
    }
}
