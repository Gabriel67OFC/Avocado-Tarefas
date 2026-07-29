package com.gabriel.avocado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaLogin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TelaLogin.class.getResource("tela-login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 1000);
        stage.setTitle("RESPONDA SOZINHO !!!!!!!! ");
        stage.setScene(scene);
        stage.show();
    }
}
