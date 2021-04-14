package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import javax.swing.*;


public class Main extends Application {

    @Override
    public  void start(Stage primaryStage) throws Exception{
        Parent Acceuil = FXMLLoader.load(getClass().getResource("Test.fxml"));
        Parent Ajout = FXMLLoader.load(getClass().getResource("ajout.fxml"));
        Parent Affichage = FXMLLoader.load(getClass().getResource("Affichage.fxml"));
        primaryStage.setTitle("Liste des étudiants de Gphy");

        primaryStage.setScene(new Scene(Acceuil, 300, 275));
        //primaryStage.setScene(new Scene(Ajout, 300, 275));
        //primaryStage.setScene(new Scene(Affichage, 300, 275));

        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
