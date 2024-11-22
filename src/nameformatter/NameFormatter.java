/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package nameformatter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jerry
 */
public class NameFormatter extends Application {
    
    private StringBuilder nameList = new StringBuilder();
    
        @Override
        public void start(Stage primaryStage) {
            
            //Create textFields
            TextField firstNameField = new TextField();
            firstNameField.setPromptText("Enter your first name");
            
            TextField middleNameField = new TextField();
            middleNameField.setPromptText("Enter your middle name");
            
            TextField lastNameField = new TextField();
            lastNameField.setPromptText("Enter your last name");
            
            //Create a combobox for titles
            ComboBox<String> titleBox = new ComboBox<>();
            titleBox.getItems().addAll("Mr.", "Mrs.", "Dr.", "Ms.", "prof.");
            titleBox.setPromptText("Select title");           
            
            //Create a Button to format the name            
            Button formatButton = new Button("Add name,");
            
            //List view to display the names in cursive
            ListView<String> nameListView = new ListView<>();
            nameListView.setStyle("-fx-font-family: 'Serif'; -fx-font-size");
            
           // observablelist to share the names
           ObservableList<String> nameList = FXCollections.observableArrayList();
           nameListView.setItems(nameList);
            
            
            //Set button action to format and display the name
            formatButton.setOnAction(e -> {
                System.out.println("Add name button clicked");
                //Collect data from input fields
                String firstName = firstNameField.getText();
                String middleName = middleNameField.getText();
                String lastName = lastNameField.getText();
                String title = titleBox.getValue();
                
                
                System.out.println("First Name: " + firstName);
                System.out.println("Middle Name: " + middleName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Title: " + title);
                
                //Construct and display the formatted name
                if (title != null && !firstName.isEmpty()&& !lastName.isEmpty()){
                    String formattedName = String.format("%s %s %s %s",
                            title, firstName, middleName.isEmpty() ? "" : middleName, lastName);
                // Append the new name to the name list
                
                
                //Update the label with a new list of names
               nameList.add(formattedName);
                
                //Clear input fields after adding the names
                firstNameField.clear();
                middleNameField.clear();
                lastNameField.clear();
                titleBox.getSelectionModel().clearSelection();                    
                }else{
                    nameList.add("Please fill in all required fields");                
                }
            });
            
            //Create a layout and add components
            
            VBox layout = new VBox(10, titleBox, firstNameField, middleNameField,
                                   lastNameField,
                                   formatButton, nameListView);
            
            // Set the scene
            Scene scene = new Scene(layout, 700, 500);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Name Formatter with a List");
            primaryStage.show();
        }    
            public static void main(String[] args){
                launch(args);
            }
        }
            
            
                

    
    