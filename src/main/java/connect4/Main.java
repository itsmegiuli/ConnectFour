package connect4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {


    protected static char[][] gameBoard = new char[][]{   // gameBoard is a 2D char array with 42 different characters.
            {'a', 'b', 'c', 'd', 'e', 'f', 'g'},
            {'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'o', 'p', 'q', 'r', 's', 't', 'u'},
            {'v', 'w', 'x', 'y', 'z', 'A', 'B'},
            {'C', 'D', 'E', 'F', 'G', 'H', 'I'},
            {'J', 'K', 'L', 'M', 'N', 'P', 'Q'},
            {'R', 'S', 'T', 'U', 'V', 'W', 'Y'},
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/graphicInterface.fxml"));
        primaryStage.setTitle("Connect Four by Puzzled");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.getIcons().add(new Image("file:src/main/resources/icon.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
