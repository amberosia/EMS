
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jenna
 */

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;

public class LocationJFrame extends javax.swing.JFrame {
    
    private MainJFrame mainFrame;
    private ArrayList<String> locArray;
    final DefaultListModel listModel;
    
    /**
     * Creates new form LocationJFrame 
     */
    
    public LocationJFrame() {
        initComponents();
        
        locMsg.setVisible(false);
        
        listModel = new DefaultListModel();
        locList.setModel(listModel);
        locList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        pack();        
    }
    
    //allows LocationJFrame to use MainJFrame's updateTable method
    public void passMainFrame(MainJFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    //gets the array of locations from MainJFrame and puts them in the list
    public void setLocArray(ArrayList<String> locArrayRef) {
        locArray = locArrayRef;
        
        for (String loc : locArray) {
            listModel.addElement(loc);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        locList = new javax.swing.JList<>();
        addLocButton = new javax.swing.JButton();
        removeLocButton = new javax.swing.JButton();
        addLocField = new javax.swing.JTextField();
        saveLocButton = new javax.swing.JButton();
        locMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jScrollPane1.setViewportView(locList);

        addLocButton.setText("ADD");
        addLocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocButtonActionPerformed(evt);
            }
        });

        removeLocButton.setText("TOGGLE SELECTED STATUS");
        removeLocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLocButtonActionPerformed(evt);
            }
        });

        saveLocButton.setText("SAVE");
        saveLocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLocButtonActionPerformed(evt);
            }
        });

        locMsg.setForeground(new java.awt.Color(255, 0, 0));
        locMsg.setText("________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeLocButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLocField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addLocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(locMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveLocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLocButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeLocButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveLocButton)
                    .addComponent(locMsg))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void addLocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocButtonActionPerformed
        locMsg.setVisible(false);
        locMsg.setForeground(Color.red);
        
        String locToAdd = addLocField.getText();
        if (locToAdd.isEmpty()) {
            locMsg.setText("Input location to add.");
            locMsg.setVisible(true);
        } else if (listModel.contains(locToAdd)) {
            locMsg.setText("Location already exists.");
            locMsg.setVisible(true);
        } else if (locToAdd.contains("|")) {
            locMsg.setText("Cannot contain | character.");
            locMsg.setVisible(true);
        } else {
            listModel.addElement(locToAdd);
            addLocField.setText(null);
        }
    }//GEN-LAST:event_addLocButtonActionPerformed

    private void removeLocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLocButtonActionPerformed
        locMsg.setVisible(false);
        locMsg.setForeground(Color.red);
        
        String selectedLoc = locList.getSelectedValue();
        if (selectedLoc == null) {
            locMsg.setText("Select a location to remove.");
            locMsg.setVisible(true);
        } else if (selectedLoc.contains(" [CLOSED]")) {
            listModel.setElementAt(selectedLoc.replace(" [CLOSED]", ""), locList.getSelectedIndex());
        } else {
            listModel.setElementAt(selectedLoc + " [CLOSED]", locList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeLocButtonActionPerformed

    private void saveLocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLocButtonActionPerformed
        //updates the array of locations
        locArray.clear();
        for (int i = 0; i < listModel.getSize(); i++) {
             locArray.add(String.valueOf(listModel.getElementAt(i)));
        }
        locMsg.setForeground(new Color(102, 153, 0));
        locMsg.setText("Locations saved!");
        locMsg.setVisible(true);
        mainFrame.updateTable();
    }//GEN-LAST:event_saveLocButtonActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        locMsg.setVisible(false);
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(LocationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocButton;
    private javax.swing.JTextField addLocField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> locList;
    private javax.swing.JLabel locMsg;
    private javax.swing.JButton removeLocButton;
    private javax.swing.JButton saveLocButton;
    // End of variables declaration//GEN-END:variables
}
