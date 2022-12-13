/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulok;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tcses
 */
public class Task {

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
    
    private String Name; 
    private String Description;
    private Date DeadLine;
    private String State; // VÁRAKOZÓ,BEFEJEZETT vagy HALASZTOTT


    public Task() {
    }

    public String getDescription() {
        return Description;
    }
    public String GetDeadLineToString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        return  dateFormat.format(DeadLine);  
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getDeadLine() {
        return DeadLine;
    }

    public void setDeadLine(Date DeadLine) {
        this.DeadLine = DeadLine;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public Task(String Name, String Description, Date DeadLine, String State) {
        this.Name=Name;
        this.Description = Description;
        this.DeadLine = DeadLine;
        this.State = State;
    }

    @Override
    public String toString() {
        return Description + ";" + DeadLine + ";" + State + ';';
    }   
}
