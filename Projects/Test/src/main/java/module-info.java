module com.test.layout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.test to javafx.fxml;
//    exports com.test.test;
    exports com.test.label;
    exports com.test.layout;
    exports com.test.event;
}