/**
 * The module-info.java file is the module descriptor file that describes the module.
 *
 * @since 1.0.0
 * @author Ron Webb
 */
module template.javafx.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires template.business;

    requires org.slf4j;
    requires ch.qos.logback.classic;
    requires java.naming;

    requires xyz.ronella.casual.trivial;
    requires xyz.ronella.logging.logger.plus;

    opens xyz.ronella.template.javafx.desktop.controller to javafx.fxml;
    exports xyz.ronella.template.javafx.desktop;
}