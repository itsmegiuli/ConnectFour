package connect4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    public static char[][] gameBoard = new char[][]{
            {'a', 'b', 'c', 'd', 'e', 'f', 'g'},
            {'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'o', 'p', 'q', 'r', 's', 't', 'u'},
            {'v', 'w', 'x', 'y', 'z', 'A', 'B'},
            {'C', 'D', 'E', 'F', 'G', 'H', 'I'},
            {'J', 'K', 'L', 'M', 'N', 'P', 'Q'},
            {'R', 'S', 'T', 'U', 'V', 'W', 'Y'},
    };

    // gameBoard is a 2d char array with 42 different characters.

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/graphicInterface.fxml"));
        primaryStage.setTitle("Connect Four ... by Puzzled");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

    }
}
