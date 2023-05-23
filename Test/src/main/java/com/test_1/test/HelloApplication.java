package com.test_1.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("SODECOTON BD STATUS READER");
        // Charger l'icône de la fenêtre à partir d'un fichier image
        primaryStage.getIcons().add(new Image("C:\\Users\\DOHICOU KOPSE\\IdeaProjects\\Test\\src\\main\\java\\com\\test_1\\test\\163394-programmeur_python-python-langage_de_programmation-permanent-le_code_source-3840x2160.png"));        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}