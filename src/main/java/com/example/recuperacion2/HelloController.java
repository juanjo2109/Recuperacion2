pacpackage com.example.recuperacion2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


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

    char[][] tablero = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

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
            btn.setDisable(true);
            btn.setStyle("-fx-background-color: #ff0000;");
            btn.setText("X");
            turnoX=!turnoX;
            etiqueta.setText("Turno Jugador O");
            this.tablero[X][Y]='X';
        }else{
            btn.setDisable(true);
            btn.setStyle("-fx-background-color: #0080ff;");
            btn.setText("O");
            turnoX=!turnoX;
            etiqueta.setText("Turno Jugador X");
            this.tablero[X][Y]='O';
        };
        turnos=++turnos;
        boolean ganaX=ganador('X');
        boolean ganaO=ganador('O');
        if (turnos>=9 || ganaX || ganaO) {
            //fin partida
            if (ganaX) {
                etiqueta.setText("Ha ganado el jugador X");
            } else if (ganaO) {
                etiqueta.setText("Ha ganado el jugador O");
            } else {
                etiqueta.setText("Fin de Partida - Empate");
            }
            btn9.setDisable(true);
            btn8.setDisable(true);
            btn7.setDisable(true);
            btn6.setDisable(true);
            btn5.setDisable(true);
            btn4.setDisable(true);
            btn3.setDisable(true);
            btn2.setDisable(true);
            btn1.setDisable(true);
        }
    }
    private boolean ganador(char a) {
        // comprobar filas
        for (int n = 0; n < 3; n++) {
            if (tablero[n][0] == a && tablero[n][1] == a && tablero[n][2] == a) {
                return true;
            }
        }
        //comprobar columnas
        for (int n = 0; n < 3; n++) {
            if (tablero[0][n] == a && tablero[1][n] == a && tablero[2][n] == a) {
                return true;
            }
        }
        // comprobar diagonal 1
        if (tablero[0][0] == a && tablero[1][1] == a && tablero[2][2] == a) {
            return true;
        }
        // comprobar diagonal 2
        if (tablero[0][2] == a && tablero[1][1] == a && tablero[2][0] == a) {
            return true;
        }
        // no hay ninguna linea completa
        return false;
    }
}kage com.example.recuperacion2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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

    private int handleClickRaton(Button btn, int X, int Y){
        if (turnoX){
            btn.setStyle("-fx-background-color: #ff0000;");
            btn.setText("X");
            turnoX=!turnoX;
            etiqueta.setText("Turno Jugador O");
            int i = X;
            int j = Y;
            int[] turno={X,Y};
            int inicial = 0;
            for (int n = 0; n < 3; n++) {
                inicial = tablero[n][0];
                boolean iguales = true;
                for (int x = 1; x < 3; x++) {
                    if (inicial != tablero[n][x]) {
                        iguales = false;
                    }
                    if (iguales) {
                        return inicial;
                    }
                }

            }

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

        return X;
    }
    private int comprobacion() {

        var inicial = 0;
        for (int n = 0; n < 3; n++) {
            inicial = tablero[n][0];
            boolean iguales = true;
            for (int x = 1; x < 3; x++) {
                if (inicial != tablero[n][x]) {
                    iguales = false;
                }
                if (iguales) {
                    return inicial;
                }
            }

        }
        return 0;
    }



}
