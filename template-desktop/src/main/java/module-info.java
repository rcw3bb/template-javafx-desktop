module template.javafx.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires template.business;

    requires org.slf4j;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    requires org.apache.logging.log4j.slf4j2.impl;

    requires xyz.ronella.casual.trivial;
    requires xyz.ronella.logging.logger.plus;

    opens xyz.ronella.template.javafx.desktop.controller to javafx.fxml;
    exports xyz.ronella.template.javafx.desktop;
}