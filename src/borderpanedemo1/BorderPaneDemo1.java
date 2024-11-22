/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package borderpanedemo1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

/**
 *
 * @author Jerry Behen
 */
public class BorderPaneDemo1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start( Stage primaryStage) {
        
        //Create some Buttons
        Button centerButton = new Button("This is Center");
        Button topButton = new Button("This is Top");
        Button bottomButton = new Button("This is Bottom");
        Button leftButton = new Button("This is Left");
        Button rightButton = new Button("This is Right");
        
        //Add each button to its own layout container
        HBox centerHBox = new HBox(centerButton);
        HBox topHBox = new HBox(topButton);
        HBox bottomHBox = new HBox(bottomButton);
        VBox leftVBox = new VBox(leftButton);
        VBox rightVBox = new VBox(rightButton);
        
        //Set the alignment
        topHBox.setAlignment(Pos.CENTER);
        bottomHBox.setAlignment(Pos.CENTER);
        
        //Create a border pane
        BorderPane borderPane = new BorderPane();
        
        //Add the buttons to the BorderPane's region
        borderPane.setCenter(centerHBox);
        borderPane.setTop(topHBox);
        borderPane.setBottom(bottomHBox);
        borderPane.setLeft(leftVBox);
        borderPane.setRight(rightVBox);
        
        //Create a scene with the BorderPane as its root node
        Scene scene = new Scene(borderPane);
        
        //Add the scene to the stage
        primaryStage.setScene(scene);
        
        //Show the window
        primaryStage.show();
    }
}
    
   