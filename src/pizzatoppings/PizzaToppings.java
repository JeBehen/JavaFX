/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pizzatoppings;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jerry
 */
public class PizzaToppings extends Application {
    CheckBox pepperoniCheckBox;
    CheckBox cheeseCheckBox;
    CheckBox anchoviesCheckBox;
    Label totalLabel;
    
    public static void main(String[] args) {
        launch(args);        
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create the CheckBoxes
        pepperoniCheckBox = new CheckBox("Pepperoni $3.00");
        cheeseCheckBox = new CheckBox("Cheese $2.00");  
        anchoviesCheckBox = new CheckBox("Anchovies $1.00");
        
        //Create the Button control
        Button totalButton = new Button("Get Total");
        
        //Register the event handler
        totalButton.setOnAction(new TotalButtonHandler());
        
        //Create a Label for the Total
        totalLabel = new Label("$0.00");
        
        //Put the CheckBoxes in a VBox
        VBox checkBoxVBox = new VBox(10, pepperoniCheckBox,
                             cheeseCheckBox, anchoviesCheckBox);
        
        //Create another VBox to use as the root node
        VBox mainVBox = new VBox(10, checkBoxVBox, totalButton,
                             totalLabel);
        
        //Set the main VBox's allignment to center
        mainVBox.setAlignment(Pos.CENTER);
        
        //Set the main VBox's padding to 10 pixels
        mainVBox.setPadding(new Insets(100));

        // Create a Scene
        Scene scene = new Scene(mainVBox);
        
        //Add the Stage to the scene
        primaryStage.setScene(scene);
        
        //Show the window
        primaryStage.show();        
               
    }
    
    /**
     * Event handler class for totalButton
     */
    
    class TotalButtonHandler implements EventHandler<ActionEvent> {
        
        @Override 
        public void handle(ActionEvent event) {
            // Variable to hold the result
            double result = 0;
            
            //Add up the toppings
            if (pepperoniCheckBox.isSelected())
                result += 3.0;
            
            if (cheeseCheckBox.isSelected())
                result += 2.0;
            
            if (anchoviesCheckBox.isSelected())
                result += 1.0;
            
            //Display the results
            totalLabel.setText(String.format("$%,.2f", result));
        }
    }
}
    
  

   