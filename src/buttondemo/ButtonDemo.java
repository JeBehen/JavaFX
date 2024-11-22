/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package buttondemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;



/**
 *
 * @author jerry
 */
public class ButtonDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
        // Create a label control
        Label myLabel = new Label("Click the button to see a message");
        
        // Create a button control
        Button myButton = new Button("Click me");
        
        // Put the label ane the Button in a VBox with A 10 pixel spacing.
        VBox vbox = new VBox(10, myLabel, myButton);
        
        // Create a scene with the VBox as its root node.
        Scene scene = new Scene(vbox, 300, 100);
        
        // Set the scenes alignment to center
        vbox.setAlignment(Pos.CENTER);
        
        // Add the scene to the stage
        primaryStage.setScene(scene);
        
        // Set the stage title
        primaryStage.setTitle("Button demo");
        
        // Show the window
        primaryStage.show();
    }
    
}
    