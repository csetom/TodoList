/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beadando2;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author tcses
 */

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Menu menu = new Menu();
        menu.setVisible(true);
        primaryStage.close();
    }
}