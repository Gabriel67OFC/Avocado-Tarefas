package com.gabriel.avocado.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TarefasDAO {
    private static TarefasDAO intancia;
    private final ObservableList<Tarefa> listaTarefas;


    private TarefasDAO(){
        this.listaTarefas = FXCollections.observableArrayList();
    }


    public static TarefasDAO getInstance(){
        if (intancia==null){
            intancia = new TarefasDAO();
        }
        return intancia;
    }
    public void adicionar(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }

    public ObservableList<Tarefa> listarTarefas(){
        return listaTarefas;
    }

    public void remover (Tarefa tarefa){
        listaTarefas.remove(tarefa);
    }
}
