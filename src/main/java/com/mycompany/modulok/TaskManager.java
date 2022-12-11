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
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


/**
 *
 * @author tcses
 */
public class TaskManager {
        private  ArrayList<Task> Tasks=new ArrayList<Task>();


    public ArrayList<Task> getTasks() {
        return Tasks;
    }
    
    public ListModel<String> getTasksForListFx() {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        Tasks.forEach( (Task task)->{
            listModel.addElement(task.getDescription());
        });
        return listModel;
    }

    public void setTasks(ArrayList<Task> Tasks) {
        this.Tasks = Tasks;
    }
 
    //For testing
    public TaskManager() {
        
        //For testing
        //Save()
        Tasks.add(new Task("1",new Date(2023,01,01), "1"));
        Tasks.add(new Task("2",new Date(2023,01,01), "1"));
        Tasks.add(new Task("3",new Date(2023,01,01), "1"));
        
    }
    public void Save(){
        System.out.println("SAVE");
    };
    public void Load(){
       BufferedReader bufferedReader;
       try {
           bufferedReader = new BufferedReader(new FileReader("Taskok.csv"));
           String[] tmp;
           while ((tmp = bufferedReader.readLine().split(";")) != null) {
             int kolcsonzesId=Integer.parseInt(tmp[0]);
           } 
       } catch (FileNotFoundException ex) {

       } catch (IOException | NullPointerException ex) {

       }  
    };
}
