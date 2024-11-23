package xyz.ronella.template.javafx.desktop.common;

import javafx.scene.image.Image;

import java.util.Objects;

final public class Images {

    private static final String ICON_FILE = "icon.png";

    private Images() {
    }

    public static Image ICON = new Image(Objects.requireNonNull(
            Images.class.getClassLoader().getResourceAsStream(ICON_FILE)));
}
