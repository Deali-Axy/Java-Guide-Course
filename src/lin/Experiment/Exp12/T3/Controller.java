package lin.Experiment.Exp12.T3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller extends Application {

    private static final int circleRadius = 45;
    private static final int sceneWidth = 500;
    private static final int sceneHeight = 300;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Circle circle1 = new Circle(circleRadius, circleRadius, circleRadius, Color.TRANSPARENT);
        Circle circle2 = new Circle(circleRadius * 3, circleRadius, circleRadius, Color.TRANSPARENT);
        Circle circle3 = new Circle(circleRadius * 5, circleRadius, circleRadius, Color.TRANSPARENT);
        Circle circle4 = new Circle(circleRadius * 2, circleRadius * 2, circleRadius, Color.TRANSPARENT);
        Circle circle5 = new Circle(circleRadius * 4, circleRadius * 2, circleRadius, Color.TRANSPARENT);

        // 设置画笔宽度
        circle1.setStrokeWidth(5);
        circle2.setStrokeWidth(5);
        circle3.setStrokeWidth(5);
        circle4.setStrokeWidth(5);
        circle5.setStrokeWidth(5);
        // 设置画笔颜色
        circle1.setStroke(Color.BLUE);
        circle2.setStroke(Color.BLACK);
        circle3.setStroke(Color.RED);
        circle4.setStroke(Color.YELLOW);
        circle5.setStroke(Color.GREEN);

        // 添加到根面板
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(circle3);
        root.getChildren().add(circle4);
        root.getChildren().add(circle5);

        root.setLayoutX(sceneWidth / 2 - circleRadius * 3);
        root.setLayoutY(sceneHeight / 2 - circleRadius * 1.5);

        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        primaryStage.setTitle("P338 T14.5 奥运五环");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
