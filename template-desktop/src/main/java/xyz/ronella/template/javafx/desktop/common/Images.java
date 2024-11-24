package xyz.ronella.template.javafx.desktop.common;

import javafx.scene.image.Image;

import java.util.Objects;

/**
 * The Images class is the class that provides the images used in the application.
 *
 * @since 1.0.0
 * @author Ron Webb
 */
final public class Images {

    private static final String ICON_FILE = "icon.png";

    private Images() {
    }

    /**
     * The ICON is the application icon.
     */
    public static Image ICON = new Image(Objects.requireNonNull(
            Thread.currentThread().getContextClassLoader().getResourceAsStream(ICON_FILE)));
}
