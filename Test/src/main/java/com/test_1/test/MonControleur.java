package com.test_1.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MonControleur {

    @FXML
    private Button monBouton;

    @FXML
    private void onHelloButtonClick() {
        // Masquer le bouton
        monBouton.setVisible(false);
    }
}
