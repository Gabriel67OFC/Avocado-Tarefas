package com.gabriel.avocado.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import com.gabriel.avocado.model.Tarefa;
import com.gabriel.avocado.model.TarefasDAO;

public class AdicionarTarefasController {

    @FXML
    private TextField campoNomeTarefa;

    @FXML
    private TextField campoDescricaoTarefa;

    @FXML
    private TextField botaoSalvar;
    
    @FXML
    private TextField botaoCancelar;
    
    private final TarefasDAO tarefasCriadas = TarefasDAO.getInstance();
    
    private Tarefa tarefaEmEdicao;
    
    public void preencherParaEdicao (Tarefa tarefa){
        this.tarefaEmEdicao = tarefa;
        campoNomeTarefa.setText(tarefa.getNome());
        campoDescricaoTarefa.setText(tarefa.getNome());
        botaoSalvar.setText("Salvar Tarefa");
            
    }
    
    @FXML
      private void mostrarErro(String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.ERROR,mensagem);
        alerta.setHeaderText(null);
        alerta.showAndWait();
    }}


