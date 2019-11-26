package com.ning.test;



import org.apache.log4j.Logger;

import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Test.class);
        logger.debug("这是一个调试信息");
        logger.info("普通信息");

    }
}
