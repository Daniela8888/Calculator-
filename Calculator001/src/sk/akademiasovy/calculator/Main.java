package sk.akademiasovy.calculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator001");
        Scene scene = new Scene(root);
        primaryStage.setScene(new Scene(root, 250, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
