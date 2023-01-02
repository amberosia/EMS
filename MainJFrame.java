
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jenna
 */

import java.util.*;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MainJFrame extends javax.swing.JFrame {
    
    private MyHashTable theHT;
    private ArrayList<String> locArray;
    private File file;
    private String fileName;
    

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setExtendedState(MainJFrame.MAXIMIZED_BOTH); 
        
        theHT = new MyHashTable(10);
        locArray = new ArrayList<>();

        saveMsg.setVisible(false); 
        fileErrorMsg.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        editEmpsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fteTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pteTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        totalText = new javax.swing.JLabel();
        fteText = new javax.swing.JLabel();
        pteText = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        locButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        saveAsButton = new javax.swing.JButton();
        fileText = new javax.swing.JLabel();
        saveMsg = new javax.swing.JLabel();
        fileErrorMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(640, 360));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });

        editEmpsButton.setText("EDIT EMPLOYEES");
        editEmpsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpsButtonActionPerformed(evt);
            }
        });

        fteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Add Date", "Profile Picture", "Employee Number", "First Name", "Last Name", "Gender", "Yearly Salary", "Deduction Rate", "Net Income", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fteTable.setRowHeight(53);
        fteTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(fteTable);

        pteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Add Date", "Profile Picture", "Employee Number", "First Name", "Last Name", "Gender", "Hourly Wage", "Hours/Week", "Weeks/Year", "Deduction Rate", "Net Income", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pteTable.setRowHeight(53);
        pteTable.setShowVerticalLines(true);
        jScrollPane3.setViewportView(pteTable);

        refreshButton.setText("⟳");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        totalText.setText("Total Employees: 0");

        fteText.setText("Full Time Employees");

        pteText.setText("Part Time Employees");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE MANAGEMENT SYSTEM");

        locButton.setText("LOCATIONS");
        locButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locButtonActionPerformed(evt);
            }
        });

        loadButton.setText("LOAD");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveAsButton.setText("SAVE AS");
        saveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsButtonActionPerformed(evt);
            }
        });

        fileText.setText("No File");

        saveMsg.setForeground(new java.awt.Color(102, 153, 0));
        saveMsg.setText("Saved!");

        fileErrorMsg.setForeground(new java.awt.Color(255, 0, 0));
        fileErrorMsg.setText("Invalid file data. Loaded data may be incomplete or incorrect.");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(fteText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(loadButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fileText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalText)
                                            .addComponent(fileErrorMsg))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                                        .addComponent(refreshButton)
                                        .addGap(5, 5, 5)))
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                        .addComponent(locButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editEmpsButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                        .addComponent(saveMsg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveAsButton)))))
                        .addGap(19, 19, 19))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pteText)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton)
                            .addComponent(saveAsButton)
                            .addComponent(saveMsg)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadButton)
                            .addComponent(fileText))))
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editEmpsButton)
                        .addComponent(refreshButton)
                        .addComponent(locButton))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(fileErrorMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fteText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pteText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //renderer that allows table cell to display an ImageIcon
    static class ImageRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setText(null);
            label.setIcon((ImageIcon)value);
            return label;
        }
    }

    //displays hashtable data to fteTable and pteTable
    public void updateTable() {
        totalText.setText("Total Employees: " + theHT.getNumInHashTable());
        fileText.setText(fileName);
        
        DefaultTableModel fteModel = (DefaultTableModel) fteTable.getModel();
        fteTable.setModel(fteModel);
        fteModel.setRowCount(0);
        fteTable.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        
        DefaultTableModel pteModel = (DefaultTableModel) pteTable.getModel();
        pteTable.setModel(pteModel);
        pteModel.setRowCount(0);
        pteTable.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
                
        for (int i = 0; i < 10; i++) {            
            for (int j = 0; j < theHT.buckets[i].size(); j++) {
                ArrayList<EmployeeInfo> theBucket = theHT.buckets[i];
                EmployeeInfo empToDisplay = theBucket.get(j);
                
                Image empImage = empToDisplay.pfp.getImage().getScaledInstance(fteTable.getRowHeight(), fteTable.getRowHeight(), Image.SCALE_DEFAULT);
                ImageIcon empPfp = new ImageIcon(empImage);
                    
                if (empToDisplay instanceof FTE fte) {
                    Object[] row = { fte.date, empPfp, fte.empNumber, fte.firstName, fte.lastName, fte.gender, fte.yearlySalary, fte.deductRate, fte.calcNetIncome(), locArray.get(fte.workLoc)};
                    fteModel.addRow(row);
                    
                } else if (empToDisplay instanceof PTE pte) {
                    Object[] row = { pte.date, empPfp, pte.empNumber, pte.firstName, pte.lastName, pte.gender, pte.hourlyWage, pte.hoursPerWeek, pte.weeksPerYear, pte.deductRate, pte.calcNetIncome(), locArray.get(pte.workLoc)};
                    pteModel.addRow(row);
                }
            }
        }
    }
    
    //saves hashtable data to fileToSaveTo
    public void saveToFile(File fileToSaveTo) {
        BufferedWriter output = null;
        String outputString = "";
        
        try {
            FileWriter saveFile = new FileWriter(fileToSaveTo);
            output = new BufferedWriter(saveFile);

            //writes locations
            for (String loc : locArray) {
                outputString = outputString + loc + ",";
            }
            
            //writes employees
            outputString = outputString + "\n" + theHT.getNumInHashTable() + "\n";
            for (int i = 0; i < 10; i++) {            
                for (int j = 0; j < theHT.buckets[i].size(); j++) {
                    ArrayList<EmployeeInfo> theBucket = theHT.buckets[i];
                    EmployeeInfo theEmp = theBucket.get(j);
                    if (theEmp instanceof FTE fte) {
                        outputString = outputString + "F," + fte.yearlySalary + ",";
                    } else if (theEmp instanceof PTE pte) {
                        outputString = outputString + "P," + pte.hourlyWage + "," + pte.hoursPerWeek + "," + pte.weeksPerYear + ",";
                    }
                    outputString = outputString + theEmp.date + "," + theEmp.pfp.getDescription() + "," + theEmp.empNumber + "," + theEmp.firstName + "," + theEmp.lastName + "," + theEmp.gender + "," + theEmp.workLoc + "," + theEmp.deductRate + "\n";
                }
            }
            output.write(outputString);
            saveMsg.setVisible(true);
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
            
	} finally { 
            try{
                if(output!=null)
		 output.close();
                
            }catch(Exception ex){
                System.out.println("Error closing the BufferedWriter " + ex);
	    }
        }
    }
    
    private void editEmpsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpsButtonActionPerformed
        EditJFrame editFrame = new EditJFrame();
        editFrame.passMainFrame(this);
        editFrame.setHT(theHT);
        editFrame.setEditLocArray(locArray);
        editFrame.setVisible(true);
    }//GEN-LAST:event_editEmpsButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void locButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locButtonActionPerformed
        LocationJFrame locationFrame = new LocationJFrame();
        locationFrame.passMainFrame(this);
        locationFrame.setLocArray(locArray);
        locationFrame.setVisible(true);
    }//GEN-LAST:event_locButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (file != null) {
            //saves to the loaded file
            saveToFile(file);
            
        } else {
            //if no file is loaded, makes new file
            SaveAsJFrame saveAsFrame = new SaveAsJFrame();
            saveAsFrame.passMainFrame(this);
            saveAsFrame.setVisible(true);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        fileErrorMsg.setVisible(false);
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File("C:\\Users\\jammy\\Documents\\NetBeansProjects\\JennasEMS\\src\\save_files"));
        
        int selected = fileChooser.showOpenDialog(this);        
        if (selected == JFileChooser.APPROVE_OPTION) {
            theHT = new MyHashTable(10);
            locArray.clear();
            
            file = fileChooser.getSelectedFile();
            fileName = file.getName();
            //if there is an error while loading the file, this ensures that the loaded file name still displays
            fileText.setText(fileName);
            
            BufferedReader input = null;
            try {
                FileReader saveFile = new FileReader(file);
                input = new BufferedReader(saveFile);
                
                try {
                    //read locations
                    String strLoc = input.readLine();
                    locArray = new ArrayList<>(Arrays.asList(strLoc.split(",")));
                    
                    //read employees
                    int numOfEmp = Integer.parseInt(input.readLine());
                    for (int i = 0 ; i < numOfEmp ; i++) {
                        String strTheEmp = input.readLine();
                        String[] theEmpArray = strTheEmp.split(",");

                        if (theEmpArray[0].equals("F")) {
                            FTE theFTE = new FTE(theEmpArray[2], new ImageIcon(theEmpArray[3]), Integer.parseInt(theEmpArray[4]), theEmpArray[5], theEmpArray[6], theEmpArray[7], Integer.parseInt(theEmpArray[8]), Double.parseDouble(theEmpArray[9]), Double.parseDouble(theEmpArray[1]));
                            theHT.addEmployee(theFTE); 
                        } else if (theEmpArray[0].equals("P")) {
                            PTE thePTE = new PTE(theEmpArray[4], new ImageIcon(theEmpArray[5]), Integer.parseInt(theEmpArray[6]), theEmpArray[7], theEmpArray[8], theEmpArray[9], Integer.parseInt(theEmpArray[10]), Double.parseDouble(theEmpArray[11]), Double.parseDouble(theEmpArray[1]), Double.parseDouble(theEmpArray[2]), Integer.parseInt(theEmpArray[3]));
                            theHT.addEmployee(thePTE);
                        } else {
                            fileErrorMsg.setVisible(true);
                        }
                    }
                    updateTable();
                } catch (Exception e) {
                    fileErrorMsg.setVisible(true);
                }               
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                try {
                    if (input != null) {
                        input.close();
                    }
                } catch (Exception ex) {
                    System.out.println("Error closing the BufferedReader " + ex);
                }
            }   
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void saveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsButtonActionPerformed
        //makes new file
        SaveAsJFrame saveAsFrame = new SaveAsJFrame();
        saveAsFrame.passMainFrame(this);
        saveAsFrame.setVisible(true);
    }//GEN-LAST:event_saveAsButtonActionPerformed

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        saveMsg.setVisible(false);
        fileErrorMsg.setVisible(false);
    }//GEN-LAST:event_backgroundMousePressed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true); 
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton editEmpsButton;
    private javax.swing.JLabel fileErrorMsg;
    private javax.swing.JLabel fileText;
    private javax.swing.JTable fteTable;
    private javax.swing.JLabel fteText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton locButton;
    private javax.swing.JTable pteTable;
    private javax.swing.JLabel pteText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveAsButton;
    private javax.swing.JButton saveButton;
    public javax.swing.JLabel saveMsg;
    private javax.swing.JLabel totalText;
    // End of variables declaration//GEN-END:variables
}
