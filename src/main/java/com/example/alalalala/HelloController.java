package com.example.alalalala;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Orang dalam pencarian: ");
    }

    @FXML
    protected void onLaporButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Lapor.fxml"));
            Parent root = loader.load();


            Object secondController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onSigninButtonClick(ActionEvent event) {
        welcomeText.setText("Sign in ngab ");
    }
}