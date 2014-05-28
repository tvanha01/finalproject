package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Maze extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Group root = new Group();
        Group subNode = new Group();
        primaryStage.setTitle("Maze game");
        primaryStage.setScene(new Scene(root, 500, 500, Color.BLACK));
        primaryStage.show();

        //background
        root.getChildren().add(subNode);

        Rectangle[] rectangles = {
                new Rectangle(50, 340, 400, 150),
                new Rectangle(50, 200, 50, 150),
                new Rectangle(50, 200, 370, 50),
                new Rectangle(370, 150, 50, 100),
                new Rectangle(50, 100, 370, 50),
                new Rectangle(50, 20, 50, 100),


        };

        for (Rectangle r : rectangles) {
            r.setFill(Color.BLUE);
            subNode.getChildren().add(r);
        }



//user cursor
        final Circle circle = new Circle(5, Color.RED);
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setCursor(Cursor.CLOSED_HAND);
        circle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });

        circle.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                circle.setCenterX(mouseEvent.getX());
                circle.setCenterY(mouseEvent.getY());
            }
        });

        root.getChildren().add(circle);
    }


    public static void main(String[] args) {
        launch(args);
    }
}









