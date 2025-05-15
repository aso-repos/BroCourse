package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.GREY);

        Image icon = new Image("as_logo.png");
        stage.getIcons().add(icon);
        stage.setTitle("ASO Calculator");


        stage.setScene(scene);
        stage.show();
    }
}