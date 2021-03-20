package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;



import java.io.IOException;

public class Controller {
    @FXML
    private Menu Ajout;

    @FXML
    private Menu Affichage;

    @FXML
    public void AffichagePressed(ActionEvent event) throws IOException {
        Stage nouveauStage = new Stage();
        Parent Affichage = FXMLLoader.load(getClass().getResource("Affichage.fxml"));
        nouveauStage.setScene(new Scene(Affichage, 300, 275));
        nouveauStage.setTitle("Liste des eleve");
        nouveauStage.show();



    }

    @FXML
    void AjoutPressed(ActionEvent event) {
        System.out.println("bad");
    }




}
