package sample;
import com.sun.media.jfxmediaimpl.platform.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.Node;
import javafx.stage.*;
import javafx.application.Application;
import javafx.util.Callback;


import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class Controller {
    private Button Modif;
    @FXML
    private Menu Ajout;

    @FXML
    private Menu Affichage;
    private final TableView<modelClass> table = new TableView<>();


    @FXML
    public void AffichagePressed(ActionEvent event) throws Exception {

        table.setEditable(true);

        // Create column UserName (Data type of String).
        TableColumn<modelClass, String> FirstNameCol = new TableColumn<modelClass, String>("First Name");

        // Create column Email (Data type of String).
        TableColumn<modelClass, String> LastNameCol = new TableColumn<modelClass, String>("Last Name");

        // Create column FullName (Data type of String).
        TableColumn<modelClass, LocalDate> BirthdayCol = new TableColumn<modelClass, LocalDate>("Birthday");

        TableColumn<modelClass, LocalDate> PromoCol = new TableColumn<modelClass, LocalDate>("Année");

        TableColumn<modelClass, String> OptionCol = new TableColumn<modelClass, String>("Option");

        TableColumn<modelClass, Button> ModifCol = new TableColumn<modelClass, Button>("Modification");













        FirstNameCol.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        FirstNameCol.setCellFactory(TextFieldTableCell.<modelClass>forTableColumn());

        FirstNameCol.setMinWidth(200);

        // On Cell edit commit (for FullName column)
        FirstNameCol.setOnEditCommit((TableColumn.CellEditEvent<modelClass, String> Tevent) -> {
            TablePosition<modelClass, String> pos = Tevent.getTablePosition();

            String newFullName = Tevent.getNewValue();

            int row = pos.getRow();
            modelClass person = Tevent.getTableView().getItems().get(row);

            person.setFirstName(newFullName);
        });



        LastNameCol.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        BirthdayCol.setCellValueFactory(new PropertyValueFactory<>("Birthday"));
        PromoCol.setCellValueFactory(new PropertyValueFactory<>("annee"));
        OptionCol.setCellValueFactory(new PropertyValueFactory<>("Option"));







        ObservableList<modelClass> list = getUserList();
        table.setItems(list);
        table.getColumns().addAll(FirstNameCol, LastNameCol, BirthdayCol, PromoCol,OptionCol,ModifCol);

        StackPane root = new StackPane();
        root.getChildren().add(table);


        Stage nouveauStage = new Stage();

       // Parent Affichage = FXMLLoader.load(getClass().getResource("Affichage.fxml"));
        nouveauStage.setScene(new Scene(root, 300, 275));
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



}
    private ObservableList<modelClass> getUserList() {

        modelClass user1 = new modelClass("Tristan", "Allain", LocalDate.of(1998, Month.AUGUST,2),"Biotech","M1");
        modelClass user2 = new modelClass("Ewan", "Sylvestre", LocalDate.of(1998, Month.AUGUST,9),"Biotech","M1");
        modelClass user3 = new modelClass("Baptiste", "Briziou", LocalDate.of(1998, Month.AUGUST,21),"Biotech","M1");

        ObservableList<modelClass> list = FXCollections.observableArrayList(user1, user2, user3);
        return list;
    }

        }