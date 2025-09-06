module com.aragon.adt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aragon.adt to javafx.fxml;
    exports com.aragon.adt;
}