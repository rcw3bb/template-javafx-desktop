package xyz.ronella.template.business;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;

/**
 * A simple class implementation.
 */
public final class PrintText {

    private final static LoggerPlus LOG = new LoggerPlus(LoggerFactory.getLogger(PrintText.class));

    private PrintText() {}

    /**
     * A sample print implementation with logging.
     * @param text The text to print.
     */
    public static void print(String text) {
        LOG.debug("public static void print(String text) [BEGIN]");
        System.out.println(text);
        LOG.debug("public static void print(String text) [END]");
    }
}
