module com.harik.mcpclientwebflux {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.harik.mcpclientwebflux to javafx.fxml;
    exports com.harik.mcpclientwebflux;
}