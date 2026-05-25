module co.edu.poli.Examen2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.poli.Examen2.controlador to javafx.fxml;
    opens co.edu.poli.Examen2.vista to javafx.fxml;
    opens co.edu.poli.Examen3.model to javafx.fxml;

    exports co.edu.poli.Examen2.vista;
    exports co.edu.poli.Examen2.controlador;
    exports co.edu.poli.Examen3.model;
    exports co.edu.poli.Examen3.servicios;
   
}
