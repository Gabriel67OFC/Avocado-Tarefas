package com.gabriel.avocado.controller;

import com.gabriel.avocado.TelaLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField senha;

    @FXML
    private TextField email;

    @FXML
    private TextFlow senhaIncorreta;

    private String emailCadastrado = "Gabriel@123";
    private String senhaCadastrada = "1234";


    @FXML
    public void aoLogar(ActionEvent event) throws IOException {
        if (emailCadastrado.equalsIgnoreCase(email.getText()) && senhaCadastrada.equals(senha.getText())){
            FXMLLoader fxmlLoader = new FXMLLoader(TelaLogin.class.getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1300, 1000);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Home");
            stage.setScene(scene);
            stage.show();
        }else {
            senhaIncorreta.setVisible(true);
        }

    }
}
