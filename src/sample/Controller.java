package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 * WORK IN PROGRESS, Giuli
 */
public class Controller extends Shape {



    public GridPane playGround;
    int col0 = 5, col1 = 5, col2 = 5, col3 = 5, col4 = 5, col5 =5 , col6 = 5;

    public char[][] gameBoard = new char[][] {
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
    };


    @FXML
    private ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;


    public void col0(ActionEvent col0Event) { //method on click of Buttons (1-7)
        makeMoveCol0();
    }

    public void col1(ActionEvent col1Event) {
        makeMoveCol1();
    }
    public void col2(ActionEvent col2Event) {
        makeMoveCol2();
    }
    public void col3(ActionEvent col3Event) {
        makeMoveCol3();
    }
    public void col4(ActionEvent col4Event) {
        makeMoveCol4();
    }
    public void col5(ActionEvent col5Event) {
        makeMoveCol5();
    }
    public void col6(ActionEvent col6Event) {
        makeMoveCol6();
    }



    public void makeMoveCol0() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.GOLD); //change color according to player (if & getPlayer - color)
        GridPane.setRowIndex(newChip, col0);
        GridPane.setColumnIndex(newChip, 0);
        gameBoard[col0][0] = 'x'; // if - 1 for player 1 // if: 2 for player 2
        col0--; //fix: cant be less than 0

        //will be deleted
        for (int i = 0; i <= 5; i++) {
            System.out.println(gameBoard[i][0]);

        }

        System.out.println("click again");
    }

    public void makeMoveCol1() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.GREEN); //change color according to player
        GridPane.setRowIndex(newChip, col1);
        GridPane.setColumnIndex(newChip, 1);
        gameBoard[col1][1] = 'x'; // TO-DO change x to 1 or 2 depending the color/player
        col1--; //fix: cant be less than 0


        //will be deleted
        for (int i = 0; i <= 5; i++) {
            System.out.println(gameBoard[i][1]);

        }
    }

    public void makeMoveCol2() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.YELLOWGREEN); //change color according to player
        GridPane.setRowIndex(newChip, col2);
        GridPane.setColumnIndex(newChip, 2);
        gameBoard[col2][2] = 'x'; // TO-DO change x to 1 or 2 depending the color/player#
        col2--; //fix: cant be less than 0


        //will be deleted
        for (int i = 0; i <= 5; i++) {
            System.out.println(gameBoard[i][2]);

        }
    }

    public void makeMoveCol3() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.BLUE); //change color according to player
        GridPane.setRowIndex(newChip, col3);
        GridPane.setColumnIndex(newChip, 3);
        col3--; //fix: cant be less than 0
    }

    public void makeMoveCol4() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.RED); //change color according to player
        GridPane.setRowIndex(newChip, col4);
        GridPane.setColumnIndex(newChip, 4);
        col4--; //fix: cant be less than 0
    }

    public void makeMoveCol5() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.PINK); //change color according to player
        GridPane.setRowIndex(newChip, col5);
        GridPane.setColumnIndex(newChip, 5);
        col5--; //fix: cant be less than 0
    }

    public void makeMoveCol6() {
        Circle newChip = new Circle(25);
        playGround.getChildren().add(newChip);
        newChip.setFill(Color.KHAKI); //change color according to player
        GridPane.setRowIndex(newChip, col6);
        GridPane.setColumnIndex(newChip, 6);
        col6--; //fix: cant be less than 0

    }

/** IDEA:
 * in each makemove, it should save either 1 or 2 (1 for p1, 2 for p2) to then check if won
 * check if won: like tic tac toe (4 1s next to each other/ 4 2s next to each other)
 */


}
/**
 * WORK IN PROGRESS, Giuli
 */
