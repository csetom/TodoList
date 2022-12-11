/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package com.mycompany.beadando2;

import com.mycompany.modulok.Task;
import com.mycompany.modulok.TaskManager;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author tcses
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    private TaskManager taskManager = new TaskManager();
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TaskEditFrame = new javax.swing.JFrame();
        TaskHeaderLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaskDescription = new javax.swing.JTextArea();
        TaskSaveButton = new javax.swing.JButton();
        TaskCancelButton = new javax.swing.JButton();
        TaskDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaskList = new javax.swing.JList<>();
        NewTask = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        listMenu = new javax.swing.JMenu();
        sortByNameMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        TaskEditFrame.setTitle("Task Edit");
        TaskEditFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TaskEditFrame.setFont(new java.awt.Font("aakar", 0, 24)); // NOI18N
        TaskEditFrame.pack();

        TaskHeaderLabel.setText("New Task:");

        TaskDescription.setColumns(20);
        TaskDescription.setRows(5);
        jScrollPane2.setViewportView(TaskDescription);

        TaskSaveButton.setText("Save");
        TaskSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskSaveButtonActionPerformed(evt);
            }
        });

        TaskCancelButton.setText("Cancel");
        TaskCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskCancelButtonActionPerformed(evt);
            }
        });

        TaskDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TaskEditFrameLayout = new javax.swing.GroupLayout(TaskEditFrame.getContentPane());
        TaskEditFrame.getContentPane().setLayout(TaskEditFrameLayout);
        TaskEditFrameLayout.setHorizontalGroup(
            TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskEditFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TaskEditFrameLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(TaskSaveButton)
                            .addGap(18, 18, 18)
                            .addComponent(TaskCancelButton))
                        .addGroup(TaskEditFrameLayout.createSequentialGroup()
                            .addGroup(TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TaskHeaderLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskEditFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TaskEditFrameLayout.setVerticalGroup(
            TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskEditFrameLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TaskHeaderLabel)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TaskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(TaskEditFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaskSaveButton)
                    .addComponent(TaskCancelButton))
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaskList.setModel(GetTaskList());
        TaskList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TaskList);

        NewTask.setText("New Task");
        NewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        listMenu.setText("List");

        sortByNameMenu.setText("Sort By Name");
        sortByNameMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameMenuActionPerformed(evt);
            }
        });
        listMenu.add(sortByNameMenu);

        menuBar.add(listMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NewTask)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewTask, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        taskManager.Save();

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        try {
            taskManager.Load();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    
    private String Today() {
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        return  dateFormat.format(date);  
    }
    
    private void NewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTaskActionPerformed
        TaskEditFrame.setVisible(true);
        TaskHeaderLabel.setText("New Task");
        TaskDescription.setText("");
        TaskEditFrame.pack();
        TaskEditFrame.toFront();
        TaskDate.setText(Today());
    }//GEN-LAST:event_NewTaskActionPerformed

    private void TaskSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskSaveButtonActionPerformed
        taskManager.addOrEditTask(TaskDescription.getText());
        TaskEditFrame.setVisible(false);
        UpdateTaskList();
    }//GEN-LAST:event_TaskSaveButtonActionPerformed

    private void TaskCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskCancelButtonActionPerformed
        // TODO add your handling code here:
        TaskEditFrame.setVisible(false);

    }//GEN-LAST:event_TaskCancelButtonActionPerformed

    private void TaskListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskListMouseClicked
        // TODO add your handling code here:       
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            // Double-click detected
            int index = list.locationToIndex(evt.getPoint());
            EditTask(index);
        }  
    }//GEN-LAST:event_TaskListMouseClicked

    private void sortByNameMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameMenuActionPerformed
        taskManager.getTasks().sort((Task t1, Task t2)->{
            return t1.getDescription().compareTo(t2.getDescription());
        });
        UpdateTaskList();
    }//GEN-LAST:event_sortByNameMenuActionPerformed

    private void TaskDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaskDateActionPerformed
    private void EditTask(int index){
             Task task=taskManager.getTaskByIndex(index);
            taskManager.setEditedTask(index);
            TaskHeaderLabel.setText("Edit Task");
            TaskDescription.setText(task.getDescription());
            TaskDate.setText(task.GetDeadLineToString());
            TaskEditFrame.setVisible(true);
            TaskEditFrame.pack();
            TaskEditFrame.toFront();
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public ListModel<String> GetTaskList() {
        return taskManager.getTasksForListFx();
        
    }
    public void UpdateTaskList() {
        TaskList.setModel(GetTaskList());
        TaskList.updateUI();
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewTask;
    private javax.swing.JButton TaskCancelButton;
    private javax.swing.JTextField TaskDate;
    private javax.swing.JTextArea TaskDescription;
    private javax.swing.JFrame TaskEditFrame;
    private javax.swing.JLabel TaskHeaderLabel;
    private javax.swing.JList<String> TaskList;
    private javax.swing.JButton TaskSaveButton;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu listMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem sortByNameMenu;
    // End of variables declaration//GEN-END:variables

}