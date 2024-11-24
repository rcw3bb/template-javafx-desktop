package xyz.ronella.template.business;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;

/**
 * A simple class implementation.
 *
 * @since 1.0.0
 * @author Ron Webb
 */
public final class PrintText {

    private final static LoggerPlus LOGGER = new LoggerPlus(LoggerFactory.getLogger(PrintText.class));

    private PrintText() {}

    /**
     * A sample print implementation with logging.
     * @param text The text to print.
     */
    public static void print(String text) {
        try (final var mLOG = LOGGER.groupLog("print")) {
            mLOG.info("Printing text: %s", text);
            System.out.println(text);
        }
    }
}
