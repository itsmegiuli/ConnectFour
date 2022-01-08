package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Connect Four ... by Puzzled");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
      //  Player p1 = new Player("#00FF00", "Kenooo");
     //   Player p2 = new Player("Yellow", "Ibrahimovic brate");
       // MakeMove MM = new MakeMove(Player, p2);
        launch(args);

    }
}
