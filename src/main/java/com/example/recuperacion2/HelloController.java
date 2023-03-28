package com.example.recuperacion2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloController {
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
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
    private Label etiqueta=new Label("Turno del Jugador X");
    boolean turnoX=true;
    int turnos=0;

    int[][] tablero = {{0,0,0},{0,0,0},{0,0,0}};

    @FXML
    public void botonclick(ActionEvent actionEvent) {
        handleClickRaton(btn1,0,0);
    }
    public void botonclick1(ActionEvent actionEvent) {
        handleClickRaton(btn2,0,1);
    }
    public void botonclick2(ActionEvent actionEvent) {
        handleClickRaton(btn3, 0,2);
    }
    public void botonclick3(ActionEvent actionEvent) {
        handleClickRaton(btn4,1,0);
    }
    public void botonclick4(ActionEvent actionEvent) {
        handleClickRaton(btn5,1,1);
    }
    public void botonclick5(ActionEvent actionEvent) {
        handleClickRaton(btn6,1,2);
    }
    public void botonclick6(ActionEvent actionEvent) {
        handleClickRaton(btn7,2,0);
    }
    public void botonclick7(ActionEvent actionEvent) {
        handleClickRaton(btn8,2,1);
    }
    public void botonclick8(ActionEvent actionEvent) {
        handleClickRaton(btn9,2,2);
    }

    private void handleClickRaton(Button btn, int X, int Y){
        if (turnoX){
            btn.setStyle("-fx-background-color: #ff0000;");
            btn.setText("X");
            turnoX=!turnoX;
            etiqueta.setText("Turno Jugador O");
            int i = X;
            int j = Y;
           btn.setDisable(true);

        }else{
            btn.setStyle("-fx-background-color: #0080ff;");
            btn.setText("O");
            turnoX=!turnoX;
            etiqueta.setText("Turno Jugador X");
            btn.setDisable(true);
        };
        turnos=++turnos;
        if (turnos>=9){

                //fin partida
                etiqueta.setText("Fin de Partida");

        }

    }
    private void comprobacion(){
    tablero.toString();
    }



}