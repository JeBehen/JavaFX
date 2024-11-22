/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package anoninnerclasskiloconverter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
//import javafx.event.EventHandler;
//import javafx.event.ActionEvent;



 // author Jerry Behen
// 11/5/2024
 //Kilometer Converter application that uses an 
// anonymous inner class to create an event handler.

public class AnonInnerClassKiloConverter extends Application {
    
    // Fields
    private TextField kiloTextField;
    private Label resultLabel;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){        
     
        // Create a Label to display a prompt
        Label promptLabel = new Label("Enter a distance in kilometers");
        
        // Create a TextField
        kiloTextField = new TextField();
        
        // Create a Button to perform the calculation
        Button calcButton = new Button("Convert");
        
        // Create an event handler Using Lambda
        calcButton.setOnAction(event -> {
                
                   
            // Get the kilometers
            Double kilometers = Double.parseDouble(kiloTextField.getText());
            
            // Convert the kilometers to miles
            Double miles = kilometers * 0.6214;
            
            // Display the results
            resultLabel.setText(String.format("%,.2f miles", miles));
        
    });
        
           // Create an empty labelto display the result
           resultLabel = new Label();
           
           // Put the promptLabel and the kiloTedxtField in a HBox
           HBox hbox = new HBox(75, promptLabel, kiloTextField);
           
           //Put the HBox, calcButton, and resultLabel in a VBox
           VBox vbox = new VBox(75, hbox, calcButton, resultLabel);
           
           // Set the VBox's alignment to center
           vbox.setAlignment(Pos.CENTER);
           
           // Set the VBox's padding to 10 pixels
           vbox.setPadding(new Insets (10));
           
           // Create a scene
           Scene scene = new Scene(vbox);
           
           //Add the scene to the stage
           primaryStage.setScene(scene);
           
           // Set the stage title
           primaryStage.setTitle("Kilometer Converter");
           
           // Show the window
           primaryStage.show();
        }
}       
  
           
               
           
           
           
    
 