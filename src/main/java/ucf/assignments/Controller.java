/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private final ObservableList<Item> overList = FXCollections.observableArrayList();
    final FileChooser fileChooser = new FileChooser();

    public void addList(String listName) {
        // Creates a new list
        // display new list in gui
    }

    public void removeList() {
        // Removes the list selected in gui
    }

    public void editListTitle(String newTitle) {
        // Amends the title of the list with newTitle
    }

    public void addItem() {
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

    public void exportAll() {
        // exports all lists to external storage
        // for (all lists) exportList();
    }

    public void importList() {
        // imports a list from external storage
    }

    public void importAll() {
        // imports multiple lists from external storage using fileChooser
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

    }
}
