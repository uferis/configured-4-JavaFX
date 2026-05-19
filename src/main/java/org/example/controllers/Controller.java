package org.example.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.models.TaskModel;

public class Controller {

    // Delete or change <from here
    @FXML public TextField taskTitle;
    @FXML public TextField dueDate;
    @FXML public ChoiceBox<String> priority;

    @FXML public Button addBtn;

    @FXML
    public TableView<TaskModel> todoTable;
    @FXML public TableColumn<TaskModel, String> tableTask;
    @FXML public TableColumn<TaskModel, String> tableDueDate;
    @FXML public TableColumn<TaskModel, String> tablePriority;
    //to here>

    @FXML
    public void initialize() { // the thing that will run first
        priority.getItems().addAll("Low", "Medium", "High");
        tableTask.setCellValueFactory(new PropertyValueFactory<>("taskTitle"));
        tableDueDate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        tablePriority.setCellValueFactory(new PropertyValueFactory<>("priority"));

        todoTable.setItems(tasks);
    }

    private ObservableList<TaskModel> tasks = FXCollections.observableArrayList();

    public void addTask(){
        // adds to the observable list
        tasks.add(new TaskModel(taskTitle.getText(), dueDate.getText(), priority.getValue()));

        // clears everything after
        taskTitle.clear();
        dueDate.clear();
        priority.getSelectionModel().clearSelection(); // In the teacher's code .clearSelection() wasn't added
    }



}
