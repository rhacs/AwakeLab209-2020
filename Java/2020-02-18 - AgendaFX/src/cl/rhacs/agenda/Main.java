package cl.rhacs.agenda;

import cl.rhacs.agenda.controllers.MainController;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {

    // Constants -------------------------------------------------------------------------------
    
    private static final String RESOURCE_MAIN = "/cl/rhacs/agenda/views/main.fxml";
    
    // Methods ---------------------------------------------------------------------------------

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource(Main.RESOURCE_MAIN));
        loader.setController(new MainController());
        
        Parent parent = (Parent) loader.load();
        
        primaryStage.setTitle("Agenda");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(parent));
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
