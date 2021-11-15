/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final ObservableList<Item> overList = FXCollections.observableArrayList();
    final FileChooser fileChooser = new FileChooser();

    @FXML
    private DatePicker dateSelect;

    @FXML
    private TableView listDisplay;

    @FXML
    public void addButton(ActionEvent actionEvent) {
        // generates new variable with item
        // if given a title and date call setDate and setTitle
    }

    public void removeItem() {
        // Removes the selected item from the list it is in
    }

    public void displayList() {
        // displays the list in the gui, makes no filtration of items
    }

    public void displayIncomplete() {
        // displays list in gui
        // if item complete do not show
    }

    public void displayComplete() {
        // displays list in gui
        // if item incomplete do not show
    }

    public void exportList() {
        // exports a list to external storage using fileChooser
    }


    public void importList() {
        // imports a list from external storage
    }


    // Item control
    // notation cSetBlank refers to controller set blank, as the Item class has setDate classes
    public void cSetDate() {
        // sets the date of an item by calling the method in Item called setDate
    }

    public void cSetTitle() {
        // sets the title of an item by calling the method in Item called setTitle
    }

    public void cSetCompleted() {
        // sets the completion of an item by calling the method in Item called setComplete
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Table setup
        listDisplay.setEditable(true);
        TableColumn colDescription = new TableColumn("Item Description");
        TableColumn colDate = new TableColumn("Item Date");
        TableColumn colComplete = new TableColumn("Item Complete");
        listDisplay.getColumns().addAll(colDescription, colDate, colComplete);

        colDescription.setCellValueFactory( new PropertyValueFactory<Item, String>("title"));
        colDescription.setCellFactory(TextFieldTableCell.forTableColumn());
        colDate.setCellValueFactory( new PropertyValueFactory<Item,String>("date"));
        colDate.setCellFactory(TextFieldTableCell.forTableColumn());
        colComplete.setCellFactory( new PropertyValueFactory<Item,String>("selectComplete"));
    }
}
