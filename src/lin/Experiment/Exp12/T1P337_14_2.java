package lin.Experiment.Exp12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class T1P337_14_2 extends Application {
    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label1 = new Label("第一页");
        Label label2 = new Label("第二页");
        Label label3 = new Label("第三页");
        Label label4 = new Label("第四页");
        // 创建面板作为根节点
        StackPane rootNode=new StackPane();
        // 将label控件添加到根节点上
        rootNode.getChildren().add(label1);
        // 创建场景对象，指定根节点对象和大小
        Scene scene=new Scene(rootNode,200,60);
        stage.setTitle("Hello JavaFx");
        // 将场景添加到舞台中
        stage.setScene(scene);
        // 显示舞台
        stage.show();
    }
}
