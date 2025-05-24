package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println(getClass().getResource("/testfile.fxml"));


        Parent root = FXMLLoader.load(getClass().getResource("/testfile.fxml"));

        primaryStage.setTitle("ASO Calculator");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}