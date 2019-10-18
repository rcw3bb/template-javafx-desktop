module template.javafx.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires template.business;

    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;

    opens xyz.ronella.template.javafx.desktop.controller to javafx.fxml;
    exports xyz.ronella.template.javafx.desktop;
}