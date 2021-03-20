package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;


public class Main extends Application {
    private JLabel label;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent test = FXMLLoader.load(getClass().getResource("Test.fxml"));
        primaryStage.setTitle("Liste des étudiants de Gphy");



        primaryStage.setScene(new Scene(test));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
