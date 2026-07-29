module com.gabriel.avocado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gabriel.avocado to javafx.fxml;
    exports com.gabriel.avocado;
    exports com.gabriel.avocado.controller;
    opens com.gabriel.avocado.controller to javafx.fxml;
}