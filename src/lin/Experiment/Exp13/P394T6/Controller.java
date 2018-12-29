package lin.Experiment.Exp13.P394T6;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

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

        Circle circle = new Circle(circleRadius, circleRadius, circleRadius, Color.TRANSPARENT);
        // 设置画笔宽度
        circle.setStrokeWidth(5);
        // 设置画笔和填充颜色
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.RED);
        // 添加到根面板
        root.getChildren().add(circle);

        PathTransition pt = new PathTransition(Duration.seconds(5),
                new Ellipse(sceneWidth / 2, sceneHeight / 2, circleRadius*3, circleRadius * 1.5), circle);
        pt.setCycleCount(Animation.INDEFINITE);
        pt.play();

        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        primaryStage.setTitle("P394 T15.6 行星运动");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
