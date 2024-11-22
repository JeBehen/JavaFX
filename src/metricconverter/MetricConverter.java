/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package metricconverter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;




/**
 *
 * @author Jerry Behen
 */
public class MetricConverter extends Application {
    
    //Feilds
    private TextField kiloTextField;
    private Label resultLabel;
    private RadioButton milesButton;
    private RadioButton feetButton;
    private RadioButton inchesButton;
    
    public static void main(String[] args){
    
    //launch App
    launch(args);    
   }

    @Override
    public void start(Stage primaryStage) {
        // Ctreate a label to display a prompt
        Label promptLabel = new Label("Enter a distance in kilometers:");
        
        //Create a Text feild for user input
        kiloTextField = new TextField();
        
        //Create a radio button
        milesButton = new RadioButton("Convert to Miles");
        feetButton = new RadioButton("Convert to Feet");
        inchesButton = new RadioButton(" Convert to Inches");
        
        // Select the milesButton controll
        milesButton.setSelected(true);
        
        // add the RadioButton controls to a Togglegroup
        ToggleGroup radioGroup = new ToggleGroup();
        milesButton.setToggleGroup(radioGroup);
        feetButton.setToggleGroup(radioGroup);
        inchesButton.setToggleGroup(radioGroup);
        
        //Create a button to perform the conversion
        Button calcButton = new Button("Convert");
        
        //Register the event handler
        calcButton.setOnAction(new CalcButtonHandler());

        //Create an empty label to display the result     
        resultLabel = new Label();
        
        //put the promptLabel and the kiloTextField in an HBox
        HBox promptHBox = new HBox(20, promptLabel, kiloTextField);
        
        //Put thr RadioButton in an HBox
        HBox radioHBox = new HBox(50, milesButton, feetButton, 
                                  inchesButton);
        
        //Put everything in a VBox
        VBox mainVBox = new VBox(20, promptHBox, radioHBox, calcButton,
                                 resultLabel);
        
        //Set the VBox's alignment to center
        mainVBox.setAlignment(Pos.CENTER);
        
        //Set the VBox's padding to 10 pixels
        mainVBox.setPadding(new Insets(30));
        
        //Create a Scene
        Scene scene = new Scene(mainVBox);
        
        //Add the Scene to the Stage
        primaryStage.setScene(scene);
        
        //Set the stage title
        primaryStage.setTitle("Metric Converter");
        
        //Show the window
        primaryStage.show();        
        
    }
    
    /** Event handler class for calcButton
     * 
     */
class CalcButtonHandler implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent event) {
        
        //Constants for the conversion factors
        final double MILES_CONVERSION = 0.6214;
        final double FEET_CONVERSION = 3281.0;
        final double INCHES_CONVERSION = 39370.0;
        
        //Variable to hold the result
        double result = 0;
        
        //get the kilometers
        double kilometers = Double.parseDouble(kiloTextField.getText());
        
        //Perform the selected conversion
        if (milesButton.isSelected())
        result = kilometers * MILES_CONVERSION;
        
        if (feetButton.isSelected())
        result = kilometers * FEET_CONVERSION;
        
        if (inchesButton.isSelected())
        result = kilometers * INCHES_CONVERSION;    
        
        //Display the results
        resultLabel.setText(String.format("%,.2f", result));
    }
  }
}
    
  