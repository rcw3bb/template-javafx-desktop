package xyz.ronella.template.business;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;

public class PrintText {

    private final static LoggerPlus LOG = new LoggerPlus(LoggerFactory.getLogger(PrintText.class));

    public static void print(String text) {
        LOG.debug("public static void print(String text) [BEGIN]");
        System.out.println(text);
        LOG.debug("public static void print(String text) [END]");
    }
}
