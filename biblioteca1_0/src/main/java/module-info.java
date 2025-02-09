module co.edu.uniquindio.poo.biblioteca1_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.biblioteca1_0 to javafx.fxml;
    exports co.edu.uniquindio.poo.biblioteca1_0;
}