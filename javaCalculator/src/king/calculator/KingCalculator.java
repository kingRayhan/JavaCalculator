package king.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kingRayhan
 * @url https://github.com/kingRayhan/javaCalculator
 */
public class KingCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("kingFXML.fxml"));
        
        Scene scene = new Scene(root);
        // Software Title
        stage.setTitle("King Calculator");
        // Make unresizeable
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
