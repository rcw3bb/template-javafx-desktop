package xyz.ronella.template.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintText {
    final static Logger LOG = LogManager.getLogger(PrintText.class);

    public static void print(String text) {
        LOG.debug("public static void print(String text) [BEGIN]");
        System.out.println(text);
        LOG.debug("public static void print(String text) [END]");
    }
}
