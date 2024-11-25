/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package listviewdemo4;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jerry
 */
public class ListViewDemo4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        // Constants with ListView sizes
        final double WIDTH = 200, HEIGHT = 140;
        
        //Create a ListView of the names of the months
        ListView<String> listView1 = new ListView<>();
        listView1.setPrefSize(WIDTH, HEIGHT);
        listView1.getSelectionModel().setSelectionMode(
            SelectionMode.MULTIPLE);
        listView1.getItems().addAll(
               "January", "February", "March", "April", "May", 
               "June", "July", "August", "September", "October",
               "November", "December");
        
        //Create an empty ListView to show the selections
        ListView<String> listView2 = new ListView<>();
        listView2.setPrefSize(WIDTH, HEIGHT);
        
        //Create a Button to get the selections
        Button getButton = new Button("Get Selections");
        
        //Register an event handler for the button
        getButton.setOnAction(event ->{
            
            //Get the ObservableList of selected items
            ObservableList<String> selections =
                    listView1.getSelectionModel().getSelectedItems();
            
            // Add the selections to the second list
               for (int i = 0; i < selections.size(); i++ )
                   listView2.getItems().addAll(selections.get(i));
                    
                });
        
        //Add controls to the VBox
        VBox vbox = new VBox(10, listView1, listView2, getButton);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        
        // Create a Scene and display it
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
}
   