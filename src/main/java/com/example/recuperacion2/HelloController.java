package com.example.recuperacion2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button brn3;
    @FXML
    private Button btn6;
    @FXML
    private Button btn5;
    @FXML
    private Button btn4;
    @FXML
    private Button btn7;
    @FXML
    private Button btn9;
    @FXML
    private Button btn8;


    @FXML
    public void botonclick(ActionEvent actionEvent) {
        btn1.setStyle("-fx-background-color: #ff0000;");
        btn1.setText("X");
    }
    public void botonclick1(ActionEvent actionEvent) {
        btn2.setStyle("-fx-background-color: #0080ff;");
        btn2.setText("X");
    }
    public void botonclick2(ActionEvent actionEvent) {
        brn3.setStyle("-fx-background-color: #00ffc4;");
        brn3.setText("0");
    }
    public void botonclick3(ActionEvent actionEvent) {
        btn4.setStyle("-fx-background-color: #ff6a00;");
        btn4.setText("X");
    }
    public void botonclick4(ActionEvent actionEvent) {
        btn5.setStyle("-fx-background-color: #ff00b7;");
        btn5.setText("O");
    }
    public void botonclick5(ActionEvent actionEvent) {
        btn6.setStyle("-fx-background-color: #ff006a;");
        btn6.setText("X");
    }
    public void botonclick6(ActionEvent actionEvent) {
        btn7.setStyle("-fx-background-color: #ffea00;");
        btn7.setText("O");
    }
    public void botonclick7(ActionEvent actionEvent) {
        btn8.setStyle("-fx-background-color: #ffd500;");
        btn8.setText("O");
    }
    public void botonclick8(ActionEvent actionEvent) {
        btn9.setStyle("-fx-background-color: #00eaff;");
        btn9.setText("X");
    }
}