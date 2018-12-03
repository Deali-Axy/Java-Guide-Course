package lin.Learning.JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("the first label");
        // 创建面板作为根节点
        StackPane rootNode=new StackPane();
        // 将label控件添加到根节点上
        rootNode.getChildren().add(label);
        // 创建场景对象，指定根节点对象和大小
        Scene scene=new Scene(rootNode,200,60);
        primaryStage.setTitle("Hello JavaFx");
        // 将场景添加到舞台中
        primaryStage.setScene(scene);
        // 显示舞台
        primaryStage.show();
    }
}
