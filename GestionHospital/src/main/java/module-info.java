module co.edu.uniquindio.poo.gestionhospital {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.gestionhospital to javafx.fxml;
    exports co.edu.uniquindio.poo.gestionhospital;
}