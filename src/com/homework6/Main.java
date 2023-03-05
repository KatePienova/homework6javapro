package com.homework6;

import com.homework6.FileLogger;
import com.homework6.FileLoggerConfiguration;
import com.homework6.FileLoggerConfigurationLoader;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader =
                new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = fileLoggerConfigurationLoader.load("src/load_config.txt");
        FileLogger logger = new FileLogger(config);

        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.debug("test debug");
        logger.info("test info");
    }
}
