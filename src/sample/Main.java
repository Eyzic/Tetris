package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.geometry.VerticalDirection;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.beans.EventHandler;

public class Main extends Application {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {
       /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
     */

       //Set window size
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);

        //Create welcomeText
        Text welcomeText = new Text(150, 150, "Welcome to Tetris!");
        welcomeText.setFill(Color.BLACK);
        welcomeText.setStyle("-fx-font: 32 Arial;");


        //Create startButton
        Button startButton = new Button("Start");
        startButton.setFont(new Font(20));
        startButton.setLayoutX(250);
        startButton.setLayoutY(200);

        //Create pane and add welcomeText to firstScreen
        Pane welcomeScreen = new Pane(welcomeText);

        //Add startButton to welcomeScreen
        welcomeScreen.getChildren().add(startButton);

        Group gameArea = new Group();
        Canvas canvas = new Canvas(WIDTH,HEIGHT);

        GraphicsContext g = canvas.getGraphicsContext2D();

        Rectangle rect = new Rectangle(40,40,Color.RED);
        gameArea.getChildren().add(rect);

        Scene scene = new Scene(welcomeScreen, primaryStage.getWidth(), primaryStage.getHeight());
        Scene game = new Scene(gameArea, primaryStage.getWidth(), primaryStage.getHeight());

        primaryStage.setTitle("Tetris");
        primaryStage.setScene(scene);
        primaryStage.show();


        while(true){
            if(startButton.isPressed()){
                primaryStage.setScene(game);
            }

            //startButton.addEventHandler(MouseEvent.MOUSE_CLICKED, );

        }

        // primaryStage.setScene(scene2);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
