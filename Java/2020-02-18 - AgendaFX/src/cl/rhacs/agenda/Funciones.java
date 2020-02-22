package cl.rhacs.agenda;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Funciones {

    // Constants -------------------------------------------------------------------------------
    
    private static final String ERROR_TITLE = "Error";
    
    // Methods ---------------------------------------------------------------------------------
    
    public static void showErrorDialog(String mensaje) {
        Alert alert = new Alert(AlertType.ERROR);
        
        alert.setTitle(ERROR_TITLE);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        
        alert.showAndWait();
    }
    
    public static Optional<ButtonType> showConfirmationDialog(String mensaje) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        
        alert.setTitle("Confirmación");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        
        return alert.showAndWait();
    }
    
}
