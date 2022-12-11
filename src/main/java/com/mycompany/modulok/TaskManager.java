/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author tcses
 */
public class TaskManager {
    private  ArrayList<Task> Tasks;
    //For testing
    public TaskManager() {
        //For testing
        //Save()
        
    }
    public void Save(){
    };
    public void Load(){
       BufferedReader bufferedReader;
       try {
           bufferedReader = new BufferedReader(new FileReader("Taskok.csv"));
           String[] tmp;
           while ((tmp = bufferedReader.readLine().split(";")) != null) {
             int kolcsonzesId=Integer.parseInt(tmp[0]);
             Tasks.add(new Task());
           } 
       } catch (FileNotFoundException ex) {

       } catch (IOException | NullPointerException ex) {

       }  
    };
}
