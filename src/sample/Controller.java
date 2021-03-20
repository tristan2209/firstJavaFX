package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;

public class Controller {
    @FXML
    private Menu Ajout;

    @FXML
    private Menu Affichage;

    @FXML
    void AffichagePressed(ActionEvent event) {
        System.out.println("good");

    }

    @FXML
    void AjoutPressed(ActionEvent event) {
        System.out.println("bad");
    }




}
