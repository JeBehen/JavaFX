/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package gridpaneimages;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



/**
 *
 * @author jerry
 */
public class GridPaneImages extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
        //Create the Image components
        Image moonImage = new Image("file:C:\\Users\\jerry\\Desktop\\Moon.jfif");
        Image shipImage = new Image("file:C:\\Users\\jerry\\Desktop\\Ship.jfif");
        Image sunsetImage = new Image("file:C:\\Users\\jerry\\Desktop\\Sunset.jfif");
        Image HotAirBalloonImage = new Image("file:C:\\Users\\jerry\\Desktop\\HotAirBalloon.jpg");
        
        //Create the ImageView objects
        ImageView moonView = new ImageView(moonImage);
        ImageView shipView = new ImageView(shipImage);
        ImageView sunsetView = new ImageView(sunsetImage);
        ImageView HotAirBalloonView = new ImageView(HotAirBalloonImage);
        
        //Resize the moon image, preserving its aspect ratio.
        moonView.setFitWidth(250);
        moonView.setPreserveRatio(true);
        
        //Resize the ship image, preserving its aspect ratio.
        shipView.setFitWidth(250);
        shipView.setPreserveRatio(true);
        
        //Resize the sunset Image, preserving its aspect ratio.
        sunsetView.setFitWidth(250);
        sunsetView.setPreserveRatio(true);
        
        //resize the HotAirBalloon image, preserving its aspect ratio.
        HotAirBalloonView.setFitWidth(250);
        HotAirBalloonView.setPreserveRatio(true);
        
        // Create a GridPane
        GridPane gridpane = new GridPane();
        
        // Add the imageViews to the GridPane
        gridpane.add(shipView, 0, 0); // Col 0, Row 0
        gridpane.add(moonView, 1, 0); // Col 1, Row 0
        gridpane.add(sunsetView, 0, 1); // Col 0, Row 1
        gridpane.add(HotAirBalloonView, 1, 1); // Col 1, Row 1
        
        // Set the gap size
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        
        // Set the Gridpane's padding
        gridpane.setPadding(new Insets(30));
        
        // Create a scene with the GridPane as its root node
        Scene scene = new Scene(gridpane);
        
        // Add the scene to the stage
        primaryStage.setScene(scene);
        
        // Set the stage title
        primaryStage.setTitle("Images");
        
        // Show the window
        primaryStage.show();
        
    }
}
    
    