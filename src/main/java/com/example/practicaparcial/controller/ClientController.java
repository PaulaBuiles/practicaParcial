package com.example.practicaparcial.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
    import javafx.fxml.Initializable;
    import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField edad;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField nombre;

    @FXML
    private Button verButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

