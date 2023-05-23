package com.test_1.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private void initialize() {
        button1.setOnAction(event -> {
            // Ouvrir une nouvelle fenêtre
            Stage stage = new Stage();
            stage.setTitle("PostgreSQL Status");
            VBox root = new VBox();
            addMenu(root);
            Label label = new Label("A remplire dans la BD");
            root.getChildren().add(label);
            Scene scene = new Scene(root, 400, 400);
            stage.setScene(scene);
            label1.setText("Ouverture de laBD PostgreSQL");
            stage.show();
        });

        button2.setOnAction(event -> {
            // Ouvrir une nouvelle fenêtre
            Stage stage = new Stage();
            stage.setTitle("Mysql Status");
            VBox root = new VBox();
            addMenu(root);
            Label label = new Label("A remplire dans la BD");
            root.getChildren().add(label);
            Scene scene = new Scene(root, 400, 400);
            stage.setScene(scene);
            label2.setText("Ouverture de la BD Mysql");
            stage.show();
        });

        button3.setOnAction(event -> {
            // Ouvrir une nouvelle fenêtre
            Stage stage = new Stage();
            stage.setTitle("Mysql Status");
            VBox root = new VBox();
            addMenu(root);
            Label label = new Label("A remplire dans la BD");
            root.getChildren().add(label);
            Scene scene = new Scene(root, 400, 400);
            stage.setScene(scene);
            label3.setText("Ouverture de la BD Oracle");
            stage.show();
        });
    }
    // Méthode pour ajouter un menu à un conteneur
    private void addMenu(VBox container) {
        // Créer un nouveau menu
        Menu menu = new Menu("Menu");
        MenuItem menuItem1 = new MenuItem("Today");
        MenuItem menuItem2 = new MenuItem("This Week");
        MenuItem menuItem3 = new MenuItem("This Month");
        menu.getItems().addAll(menuItem1, menuItem2, menuItem3);

        // Créer une barre de menu et ajouter le menu
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        // Ajouter la barre de menu au conteneur
        container.getChildren().add(menuBar);
    }
}