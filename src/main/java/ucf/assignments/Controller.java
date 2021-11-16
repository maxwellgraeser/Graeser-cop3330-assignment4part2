/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final ObservableList<Item> overList = FXCollections.observableArrayList();
    final FileChooser fileChooser = new FileChooser();
    @FXML
    private DatePicker dateSelect;
    @FXML
    private TextField descriptionBox;
    @FXML
    private TableView<Item> listDisplay = new TableView<Item>();

    public void addItem() {
        // generates new variable with item
        // only if given a title and date
        // call setDate and setTitle
        // reset inputs

        // Creation
        if (descriptionBox.getText().equals("")) return;
        if (dateSelect.getValue().equals(null)) return;
        String descHolder = descriptionBox.getText();
        String dateHolder = String.valueOf(dateSelect.getValue());
        Item temp = new Item();
        temp.setTitle(descHolder);
        temp.setDate(dateHolder);

        // Adding to list
        listDisplay.setEditable(true);
        listDisplay.getItems().add(temp);
        overList.add(temp);

        // Reset inputs
        descriptionBox.clear();
        dateSelect.setValue(null);
        dateSelect.getEditor().clear();
    }

    public void removeItem() {
        // Removes the selected item from the list it is in
        ObservableList<Item> selected, temp;
        selected = listDisplay.getSelectionModel().getSelectedItems();
        temp = listDisplay.getItems();
        selected.forEach(temp::remove);
    }

    public void clearList() {
        ObservableList<Item> temp;
        temp = listDisplay.getItems();
        temp.removeAll();
    }

    public void displayAll() {
        // Displays all items in gui
        listDisplay.setEditable(true);
        listDisplay.setItems(overList);
    }

    public void displayIncomplete() {
        // displays list in gui
        // if item complete do not show
        listDisplay.setEditable(true);
    }

    public void displayComplete() {
        // displays list in gui
        // if item incomplete do not show
        listDisplay.setEditable(true);
    }

    public void exportList() {
        // exports a list to external storage using fileChooser
        File file = fileChooser.showOpenDialog(null);
        if (file == null) return;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < overList.size(); i++) {
                Item temp = overList.get(i);
                writer.write(temp.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {}
    }


    public void importList() {
        // imports a list from external storage
        File file = fileChooser.showOpenDialog(null);
        if (file == null) return;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            overList.removeAll();

            while (true) {
                try {
                    String temp = reader.readLine();
                    Item item = new Item();
                    item.setDate(temp);
                    item.setTitle(temp);
                    overList.add(item);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {}
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
        colComplete.setCellFactory( new PropertyValueFactory<Item, Boolean>("completed"));

        listDisplay.setItems(overList);
    }
}
