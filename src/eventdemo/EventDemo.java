/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package eventdemo;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *
 * @author jerry
 */
public class EventDemo extends Application {
    
    // field for the label control
    private Label myLabel;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        
        // Create a label control
        myLabel = new Label("Click the button to see a message");
        
        // Create a button control
        Button myButton = new Button("Click Me");
        
        // Register the event handler
        myButton.setOnAction(new ButtonClickHandler());
        
        // Put the label and the Button in the VBox with 10 pixels of spacing.
        VBox vbox = new VBox(10, myLabel, myButton);
        
        // Create a Scene with the VBox as the root node.
        Scene scene = new Scene(vbox, 300, 100);
        
        // Set the scene's alignment to center
        vbox.setAlignment(Pos.CENTER);
        
        //Add the scene to the stage.
        primaryStage.setScene(scene);
        
        //Set the stage title
        primaryStage.setTitle("Button Demo");
        
        // Show the window
        primaryStage.show();        
    }
    
    // Event handler class for my button
    class ButtonClickHandler implements EventHandler<ActionEvent> {        
    
        @Override
        public void handle(ActionEvent event) {
         myLabel.setText("Thanks for clicking the button");
        }
   }
}
        
    

     

    
    