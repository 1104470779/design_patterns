package com.ljm.study;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.ljm"})
public class App 
{


    public static void main( String[] args ) throws Exception {
        Logger errorLog = LogManager.getLogger("errorLogger");
        Logger infoLog = LogManager.getLogger("infoLogger");
        Logger debugLog = LogManager.getLogger("debugLogger");
        errorLog.error("error");
        infoLog.info("info");
        debugLog.debug("debug");

    }



}
