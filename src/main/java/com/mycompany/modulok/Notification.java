/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulok;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author tcses
 */
public class Notification  extends Thread {
    private Vector<MyTask> notifyingTasks=new Vector<MyTask>();
    private TaskManager taskmanager;

    public Notification(TaskManager taskmanager) {
       this.taskmanager = taskmanager;
    }

    public Vector<MyTask> getNotifyingTasks() {
        return notifyingTasks;
    }

    public void setNotifyingTasks(Vector <MyTask> notifyingTasks) {
        this.notifyingTasks = notifyingTasks;
    }
   
    public void run() {
        while (true) {
            try {
                ArrayList<MyTask> removable=new ArrayList<MyTask>();
                taskmanager.getNotifications().forEach( (t,i)->{
                    if (i<=0) {
                        notifyingTasks.add(t);
                        removable.add(t);
                        
                    } else {
                        i--;
                        taskmanager.getNotifications().replace(t,i);
                    };
                });
                removable.forEach(t->{
                    taskmanager.getNotifications().remove(t);
                });
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Notification.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    
}
 