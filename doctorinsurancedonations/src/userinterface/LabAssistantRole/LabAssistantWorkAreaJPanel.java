/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bunty
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganization) organization;

        popLabAsstTbl();
    }

    public void popLabAsstTbl() {
        DefaultTableModel model = (DefaultTableModel) wrkReqJTbl.getModel();

        model.setRowCount(0);

        for (WorkRequest request : labOrganization.getWrkQ().getWorkRequests()) {
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getEmp().getEmpName();
            row[2] = ((PatientTreatmentWorkRequest) request).getLabAst();
            row[3] = request.getStatus();
            row[4] = ((PatientTreatmentWorkRequest) request).getPat().getPatFrstNm() + " " + ((PatientTreatmentWorkRequest) request).getPat().getPatLstNm();
            row[5] = ((PatientTreatmentWorkRequest) request).getPat().getPatId();
            row[6] = ((PatientTreatmentWorkRequest) request).getTestType();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReqJTbl.setRowSorter(sorter);
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
        wrkReqJTbl = new javax.swing.JTable();
        assignJBtn = new javax.swing.JButton();
        prcssJBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        assignJBtn2 = new javax.swing.JButton();
        assignJBtn1 = new javax.swing.JButton();
        assignJBtn3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        wrkReqJTbl.setBackground(new java.awt.Color(0, 153, 255));
        wrkReqJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Name", "Patient Id", "Test Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wrkReqJTbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 730, 90);

        assignJBtn.setBackground(new java.awt.Color(0, 153, 255));
        assignJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJBtn.setText("Assign to me");
        assignJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJBtnActionPerformed(evt);
            }
        });
        add(assignJBtn);
        assignJBtn.setBounds(10, 130, 140, 40);

        prcssJBtn.setBackground(new java.awt.Color(0, 153, 255));
        prcssJBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prcssJBtn.setText("Process");
        prcssJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prcssJBtnActionPerformed(evt);
            }
        });
        add(prcssJBtn);
        prcssJBtn.setBounds(600, 130, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab.gif"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(10, 180, 740, 360);

        assignJBtn2.setBackground(new java.awt.Color(0, 153, 255));
        assignJBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJBtn2.setText("Blood Test");
        assignJBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJBtn2ActionPerformed(evt);
            }
        });
        add(assignJBtn2);
        assignJBtn2.setBounds(150, 130, 140, 40);

        assignJBtn1.setBackground(new java.awt.Color(0, 153, 255));
        assignJBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJBtn1.setText("MRI scan");
        assignJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJBtn1ActionPerformed(evt);
            }
        });
        add(assignJBtn1);
        assignJBtn1.setBounds(450, 130, 140, 40);

        assignJBtn3.setBackground(new java.awt.Color(0, 153, 255));
        assignJBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJBtn3.setText("X Ray");
        assignJBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJBtn3ActionPerformed(evt);
            }
        });
        add(assignJBtn3);
        assignJBtn3.setBounds(290, 130, 140, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void assignJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJBtnActionPerformed

        int selectedRow = wrkReqJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTbl.getValueAt(selectedRow, 0);
        if (request.getLabAst() == null) {
            if (request.getStatus().equalsIgnoreCase("SentToLab")) {
                request.setLabAst(userAccount);
                request.setStatus("Pending on Lab Assistant");
                //  request.setReceiver(userAccount);
                popLabAsstTbl();
                JOptionPane.showMessageDialog(null, "The request is assigned to You!");
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this lab request as the current status is: " + request.getStatus());
            }
        }
        else
        {
            if(userAccount.equals(request.getLabAst()))
            {
                JOptionPane.showMessageDialog(null,"Request is already assigned to you");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Request is assigned to other Lab Assistant");
            }
        }

    }//GEN-LAST:event_assignJBtnActionPerformed

    private void prcssJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prcssJBtnActionPerformed

        int selectedRow = wrkReqJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTbl.getValueAt(selectedRow, 0);

       // request.setStatus("Processing");
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        if (request.getLabAst() != null) {
            if (userAccount.equals(request.getLabAst())) {
                if (request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")) {

                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getStatus());
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please assign the request first");
        }
    }//GEN-LAST:event_prcssJBtnActionPerformed

    private void assignJBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJBtn2ActionPerformed

        int selectedRow = wrkReqJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getLabAst()))
            {   
                if(request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")){
                    request.setTestType("Blood Test");
                }else{
                    JOptionPane.showMessageDialog(null, "Test is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Lab assistant is not assigned cannot modify the type of test");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_assignJBtn2ActionPerformed

    private void assignJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJBtn1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = wrkReqJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getLabAst()))
            {   
                if(request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")){
                    request.setTestType("MRI Scan");
                }else{
                    JOptionPane.showMessageDialog(null, "Test is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Lab assistant is not assigned cannot modify the type of blood test");
        }
    }//GEN-LAST:event_assignJBtn1ActionPerformed

    private void assignJBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJBtn3ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = wrkReqJTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) wrkReqJTbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getLabAst()))
            {   
                if(request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")){
                    request.setTestType("X Ray");
                }else{
                    JOptionPane.showMessageDialog(null, "Test is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Lab assistant is not assigned cannot modify the type of blood test");
        }
    }//GEN-LAST:event_assignJBtn3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJBtn;
    private javax.swing.JButton assignJBtn1;
    private javax.swing.JButton assignJBtn2;
    private javax.swing.JButton assignJBtn3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prcssJBtn;
    private javax.swing.JTable wrkReqJTbl;
    // End of variables declaration//GEN-END:variables
}
