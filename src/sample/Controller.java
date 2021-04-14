package sample;
import com.sun.media.jfxmediaimpl.platform.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.stage.*;
import javafx.application.Application;


import java.io.IOException;

public class Controller {
    @FXML
    private Menu Ajout;

    @FXML
    private Menu Affichage;

    @FXML
    public void AffichagePressed(ActionEvent event) throws Exception {
        Stage nouveauStage = new Stage();

        Parent Affichage = FXMLLoader.load(getClass().getResource("Affichage.fxml"));
        nouveauStage.setScene(new Scene(Affichage, 300, 275));
        nouveauStage.setTitle("Liste des eleves");

        nouveauStage.show();
        


    }

    @FXML
    void AjoutPressed(ActionEvent event) throws Exception {


    Stage nouveauStage = new Stage();

    Parent Affichage = FXMLLoader.load(getClass().getResource("ajout.fxml"));
        nouveauStage.setScene(new Scene(Affichage, 300, 275));
        nouveauStage.setTitle("Ajout d'eleve");

        nouveauStage.show();



}}
