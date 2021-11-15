/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Maxwell Graeser
 */

package ucf.assignments;

public class Item {
    private String date;
    private String title;
    private String completed;

    // Generate new item
    public Item() {
        this.date = "No Date";
        this.title = "No Title";
        this.completed = "No";
    }


    // Getters
    public String getTitle() { return title; }

    public String getDate() { return date; }

    public String getComplete() { return completed; }


    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
