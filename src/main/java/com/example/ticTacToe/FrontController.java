package com.example.ticTacToe;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FrontController {
    @FXML
    Label c00;
    @FXML
    Label c01;
    @FXML
    Label c02;
    @FXML
    Label c10;
    @FXML
    Label c11;
    @FXML
    Label c12;
    @FXML
    Label c20;
    @FXML
    Label c21;
    @FXML
    Label c22;
    @FXML
    Label winText;
    private int num = 0;

    private void check() {
        if (c00.getText().equals(c01.getText()) && c00.getText().equals(c02.getText()) && !c00.getText().equals("")) {
            winText.setText(c00.getText() + " won!");
        } else if (c10.getText().equals(c11.getText()) && c10.getText().equals(c12.getText()) && !c10.getText().equals("")) {
            winText.setText(c10.getText() + " won!");
        } else if (c20.getText().equals(c21.getText()) && c20.getText().equals(c22.getText()) && !c20.getText().equals("")) {
            winText.setText(c20.getText() + " won!");
        } else if (c00.getText().equals(c11.getText()) && c00.getText().equals(c22.getText()) && !c00.getText().equals("")) {
            winText.setText(c00.getText() + " won!");
        } else if (c02.getText().equals(c11.getText()) && c02.getText().equals(c20.getText()) && !c02.getText().equals("")) {
            winText.setText(c02.getText() + " won!");
        } else if (c00.getText().equals(c10.getText()) && c00.getText().equals(c20.getText()) && !c00.getText().equals("")) {
            winText.setText(c00.getText() + " won!");
        } else if (c01.getText().equals(c11.getText()) && c01.getText().equals(c21.getText()) && !c01.getText().equals("")) {
            winText.setText(c01.getText() + " won!");
        } else if (c02.getText().equals(c12.getText()) && c02.getText().equals(c22.getText()) && !c02.getText().equals("")) {
            winText.setText(c02.getText() + " won!");
        }
    }

    @FXML
    private void on00MouseClicked() {
        if (num % 2 == 0) {
            c00.setText("O");
        } else {
            c00.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on01MouseClicked() {
        if (num % 2 == 0) {
            c01.setText("O");
        } else {
            c01.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on02MouseClicked() {
        if (num % 2 == 0) {
            c02.setText("O");
        } else {
            c02.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on10MouseClicked() {
        if (num % 2 == 0) {
            c10.setText("O");
        } else {
            c10.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on11MouseClicked() {
        if (num % 2 == 0) {
            c11.setText("O");
        } else {
            c11.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on12MouseClicked() {
        if (num % 2 == 0) {
            c12.setText("O");
        } else {
            c12.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on20MouseClicked() {
        if (num % 2 == 0) {
            c20.setText("O");
        } else {
            c20.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on21MouseClicked() {
        if (num % 2 == 0) {
            c21.setText("O");
        } else {
            c21.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void on22MouseClicked() {
        if (num % 2 == 0) {
            c22.setText("O");
        } else {
            c22.setText("X");
        }
        num++;
        check();
    }

    @FXML
    private void onResetButtonMouseClicked() {
        num = 0;
        c00.setText("");
        c01.setText("");
        c02.setText("");
        c10.setText("");
        c11.setText("");
        c12.setText("");
        c20.setText("");
        c21.setText("");
        c22.setText("");
        winText.setText("");
    }

}