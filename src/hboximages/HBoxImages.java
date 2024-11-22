/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package hboximages;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author Jerry Behen
 */
public class HBoxImages extends Application {
    
    public static void main(String[] args) {
        
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        //Create the Image objects
        Image moonImage = new Image("file:C:\\Users\\jerry\\Desktop\\Moon.jfif");
        Image shipImage = new Image("file:C:\\Users\\jerry\\Desktop\\Ship.jfif");
        Image sunsetImage = new Image("file:C:\\Users\\jerry\\Desktop\\Sunset.jfif");
        
        //Create the ImageView objects
        ImageView moonView = new ImageView(moonImage);
        ImageView shipView = new ImageView(shipImage);
        ImageView sunsetView = new ImageView(sunsetImage);
        
        //Resize the moon image, preserving its aspect ratio.
        moonView.setFitWidth(500);
        moonView.setPreserveRatio(true);
        
        //Resize the ship image, preserving its aspect ratio.
        shipView.setFitWidth(500);
        shipView.setPreserveRatio(true);
        
        //Resize the sunset Image, preserving its aspect ratio.
        sunsetView.setFitWidth(500);
        sunsetView.setPreserveRatio(true);
        
        //Put the ImageView in a HBox
        HBox hbox = new HBox(10, moonView, shipView, sunsetView);
        
        //Put 30 pixels of padding around the box.
        hbox.setPadding(new Insets(30));
        
        //Create a scene with the HBox as its root node.
        Scene scene = new Scene(hbox);
        
        //Add the Scene to the Stage
        primaryStage.setScene(scene);
        
        //Set the stage title
        primaryStage.setTitle("Images");
        
        //Show the window
        primaryStage.show();
    }
}
    
   