module template.javafx.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens xyz.ronella.template.javafx.desktop to javafx.fxml;
    exports xyz.ronella.template.javafx.desktop;
}