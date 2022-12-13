/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author tcses
 */
public class TaskManager {


    private  ArrayList<Task> Tasks=new ArrayList<Task>();
    private  Task editedTask;

    public Task getEditedTask() {
        return editedTask;
    }

    public void setEditedTask(Task editedTask) {
        this.editedTask = editedTask;
    }

    public ArrayList<Task> getTasks() {
        return Tasks;
    }
    
    public static ListModel<String> getTasksForListFx(ArrayList<Task> tasks) {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        tasks.forEach( (Task task)->{
            listModel.addElement(task.getName()+" | Hatarido: "+ task.GetDeadLineToString()+" ("+task.getState()+")" );
        });
        return listModel;
    }
        public static ArrayList<String> getTaskNames (ArrayList<Task> tasks) {
        ArrayList<String> listModel = new ArrayList<String>();
        tasks.forEach( (Task task)->{
            listModel.add(task.getName());
        });
        return listModel;
    }

    public void setTasks(ArrayList<Task> Tasks) {
        this.Tasks = Tasks;
    }
 
    //For testing
    public TaskManager() {
        
            try {
                //For testing
                //Save()
                Load();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void Save(){
        System.out.println("SAVE");
        
        Gson gson = new Gson();
        
        try {//Ennek mintajara auto utanfuto es felhasznalo
        FileWriter myWriter = new FileWriter("Taskok.JSON");
        gson.newJsonWriter(myWriter);
        gson.toJson(Tasks,myWriter);
        
        myWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
    }
        
    };
    public void Load() throws FileNotFoundException{
        
       Gson gson = new Gson();        
        FileReader myFileReader =new FileReader("Taskok.JSON");
        Type listType = new TypeToken<ArrayList<Task>>(){}.getType();
        Tasks=gson.fromJson(myFileReader,listType);
    };

    public void addOrEditTask(String Name, String description, Date datum, String state) {
        if (editedTask!=null){
            editedTask.setDescription(description);
            editedTask.setName(Name);
            editedTask.setDeadLine(datum);
            editedTask.setState(state);
        } else {
            Tasks.add(new Task(Name, description,datum,state));
        }
        editedTask=null;
    }
    public Task getTaskByIndex(int index) {
        return Tasks.get(index);
    }
    public Task getTaskByName(String name) {
        editedTask=Tasks.stream().filter((Task t)->{
            return t.getName().equals(name);
        }).findFirst().orElse(null);
        return editedTask;
    }
}
