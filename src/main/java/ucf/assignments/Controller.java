/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final ObservableList<Item> overList = FXCollections.observableArrayList();
    final FileChooser fileChooser = new FileChooser();
    @FXML
    private Button allButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button completeButton;

    @FXML
    private DatePicker dateSelect;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField descriptionBox;

    @FXML
    private Button editButton;

    @FXML
    private Button exportButton;

    @FXML
    private Button importButton;

    @FXML
    private Button incompleteButton;

    @FXML
    private TableView<Item> listDisplay = new TableView<Item>();

    @FXML
    public void addItem(ActionEvent actionEvent) {
        // generates new variable with item
        // if given a title and date call setDate and setTitle

        // Creation
        String descHolder = descriptionBox.getText();
        if (descHolder.equals("")) return;
        if (dateSelect.getValue().equals(null)) return;
        String dateHolder = String.valueOf(dateSelect.getValue());
        Item temp = new Item();
        temp.setTitle(descHolder);
        temp.setDate(dateHolder);

        // Adding to list
        listDisplay.setEditable(true);
        //listDisplay.getItems().add(temp);
        overList.add(temp);

        // Reset inputs
        descriptionBox.clear();
        dateSelect.setValue(null);
        dateSelect.getEditor().clear();
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
        TableColumn colDescription = new TableColumn("Description");
        TableColumn colDate = new TableColumn("Date");
        TableColumn colComplete = new TableColumn("Completed");
        listDisplay.getColumns().addAll(colDescription, colDate, colComplete);

        colDescription.setCellValueFactory( new PropertyValueFactory<Item, String>("title"));
        colDate.setCellValueFactory( new PropertyValueFactory<Item,String>("date"));
        colComplete.setCellFactory( new PropertyValueFactory<Item, String>("completed"));

        listDisplay.setItems(overList);
    }
}
