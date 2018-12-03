package lin.Experiment.Exp12.T2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Controller extends Application {

    private static final int rectangleWidth = 45;
    private static final int rectangleHeight = 45;
    private static final int sceneWidth = 500;
    private static final int sceneHeight = 300;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        int vertical = sceneHeight / rectangleHeight;
        int horizontal = sceneWidth / rectangleWidth;

        for (int x = 0; x < horizontal; x++) {
            for (int y = 0; y < vertical; y++) {
                Rectangle rectangle = new Rectangle(rectangleWidth * x, rectangleHeight * y, 45, 45);
                // 设置填充颜色
                if ((x + y) % 2 != 0)
                    rectangle.setFill(Color.BLACK);
                else
                    rectangle.setFill(Color.WHITE);
                // 设置画笔颜色
                rectangle.setStroke(Color.WHITE);
                // 添加到根面板
                root.getChildren().add(rectangle);
            }
        }

        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        primaryStage.setTitle("P338 T14.4 显示象棋盘");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
