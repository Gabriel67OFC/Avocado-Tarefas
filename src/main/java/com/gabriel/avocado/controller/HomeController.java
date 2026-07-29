package com.gabriel.avocado.controller;

import com.gabriel.avocado.TelaLogin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    public void aoVizualizarHome(MouseEvent mouseEvent) {
    }

    @FXML
    public void aoVizualizarTarefas(MouseEvent mouseEvent) throws IOException {
        String telaFXML = "";
        FXMLLoader fxmlLoader = new FXMLLoader(TelaLogin.class.getResource("/com/gabriel/tarefas"+telaFXML));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.setTitle("Tarefas");
        stage.setScene(scene);
        stage.show();
    }

    public void aoTarefas() {
    }
}