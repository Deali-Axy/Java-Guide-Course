package lin.Experiment.Exp13.P393T5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Application {
    public TextField txtNum1;
    public TextField txtNum2;
    public TextField txtResult;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        stage.setTitle("P337 T14.2");
        stage.setScene(new Scene(root, 500, 275));
        stage.show();
    }

    public void onAddAction(ActionEvent actionEvent) {
        float num1 = Float.valueOf(txtNum1.getText());
        float num2 = Float.valueOf(txtNum2.getText());
        txtResult.setText(String.valueOf(num1 + num2));
    }

    public void onMinusAction(ActionEvent actionEvent) {
        float num1 = Float.valueOf(txtNum1.getText());
        float num2 = Float.valueOf(txtNum2.getText());
        txtResult.setText(String.valueOf(num1 - num2));
    }

    public void onMultiplyAction(ActionEvent actionEvent) {
        float num1 = Float.valueOf(txtNum1.getText());
        float num2 = Float.valueOf(txtNum2.getText());
        txtResult.setText(String.valueOf(num1 * num2));
    }

    public void onDivideAction(ActionEvent actionEvent) {
        float num1 = Float.valueOf(txtNum1.getText());
        float num2 = Float.valueOf(txtNum2.getText());
        txtResult.setText(String.valueOf(num1 / num2));
    }
}
