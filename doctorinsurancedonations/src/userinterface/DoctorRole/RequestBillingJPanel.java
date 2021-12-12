/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountantBillingRequest;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bunty 
 */
public class RequestBillingJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PatientTreatmentWorkRequest patientTreatmentWorkRequest;
    private EcoSystem ecoSystem;
    private double consultationCharges = 50;

    /**
     * Creates new form RequestBillingJPanel
     */
    RequestBillingJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientTreatmentWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.patientTreatmentWorkRequest = workRequest;
        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAssignedDoctor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConsultationCharges = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMedicationCharges = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLabCharges = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMiscellaneousCharges = new javax.swing.JTextField();
        btnSendBillingRequest = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Billing Request");
        add(jLabel1);
        jLabel1.setBounds(251, 16, 178, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PATIENT INFORMATION");
        add(jLabel6);
        jLabel6.setBounds(269, 89, 146, 15);

        txtFirstName.setEditable(false);
        add(txtFirstName);
        txtFirstName.setBounds(200, 122, 131, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Name :");
        add(jLabel7);
        jLabel7.setBounds(124, 124, 71, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Last Name :");
        add(jLabel10);
        jLabel10.setBounds(365, 124, 71, 15);

        txtLastName.setEditable(false);
        add(txtLastName);
        txtLastName.setBounds(440, 122, 131, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Assigned Doctor :");
        add(jLabel8);
        jLabel8.setBounds(87, 162, 109, 15);

        txtAssignedDoctor.setEditable(false);
        add(txtAssignedDoctor);
        txtAssignedDoctor.setBounds(200, 160, 130, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Patient Id:");
        add(jLabel2);
        jLabel2.setBounds(371, 162, 66, 15);

        txtPatientId.setEditable(false);
        add(txtPatientId);
        txtPatientId.setBounds(440, 160, 131, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("BILLING INFORMATION");
        add(jLabel3);
        jLabel3.setBounds(273, 225, 138, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Consultaion Charges (USD) :");
        add(jLabel4);
        jLabel4.setBounds(205, 258, 173, 21);

        txtConsultationCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultationChargesActionPerformed(evt);
            }
        });
        add(txtConsultationCharges);
        txtConsultationCharges.setBounds(388, 258, 82, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Medication Charges (USD):");
        add(jLabel5);
        jLabel5.setBounds(215, 325, 163, 21);
        add(txtMedicationCharges);
        txtMedicationCharges.setBounds(388, 323, 82, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Lab Test Charges (USD) :");
        add(jLabel11);
        jLabel11.setBounds(220, 290, 152, 21);

        txtLabCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabChargesActionPerformed(evt);
            }
        });
        add(txtLabCharges);
        txtLabCharges.setBounds(388, 290, 82, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Miscellaneous Charges (USD):");
        add(jLabel12);
        jLabel12.setBounds(199, 361, 179, 17);
        add(txtMiscellaneousCharges);
        txtMiscellaneousCharges.setBounds(388, 359, 82, 23);

        btnSendBillingRequest.setBackground(new java.awt.Color(0, 153, 255));
        btnSendBillingRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendBillingRequest.setText("Send Billing Request");
        btnSendBillingRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendBillingRequestActionPerformed(evt);
            }
        });
        add(btnSendBillingRequest);
        btnSendBillingRequest.setBounds(277, 410, 147, 32);

        backBtn.setBackground(new java.awt.Color(0, 153, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(45, 25, 77, 23);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billing6.gif"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel9);
        jLabel9.setBounds(158, 5, 560, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLabChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabChargesActionPerformed

    private void txtConsultationChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultationChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultationChargesActionPerformed

    private void btnSendBillingRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendBillingRequestActionPerformed
        String consultationCharge = txtConsultationCharges.getText().trim();
        String labChargesStr = txtLabCharges.getText();
        String miscellaneouschargesStr = txtMiscellaneousCharges.getText();
        String medicationChargesStr = txtMedicationCharges.getText();
        if (consultationCharge.equals("") || labChargesStr.equals("") || miscellaneouschargesStr.equals("") || medicationChargesStr.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            
            try {
                Double.parseDouble(consultationCharge);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide a Numeric value for Consultation Charges");
                return;
            }
            
            try {
                Integer.parseInt(labChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Lab Charges");
                return;
            }
            try {
                Integer.parseInt(miscellaneouschargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Miscellaneous charges");
                return;
            }
            try {
                Integer.parseInt(medicationChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Medication charges");
                return;
            }
            double labCharges = Double.parseDouble(labChargesStr);
            double miscellaneouscharges = Double.parseDouble(miscellaneouschargesStr);
            double medicationCharges = Double.parseDouble(medicationChargesStr);
            double billingAmount = labCharges + consultationCharges + medicationCharges + miscellaneouscharges;
            //request.setBillAmount(billingAmount);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setStatus("Consultation Completed");

                AccountantBillingRequest accountantBillingRequest = new AccountantBillingRequest();
                accountantBillingRequest.setBillingAmt(billingAmount);
                //  accountantBillingRequest.setPatientId(Integer.parseInt(txtPatientId.getText()));

                accountantBillingRequest.setSender(userAccount);
                accountantBillingRequest.setStatus("Sent");
                accountantBillingRequest.setPatient(patientTreatmentWorkRequest.getPat());

                Organization org = null;
                for (Organization organization : enterprise.getOrgDir().getOrganizations()) {
                    if (organization instanceof AccountantOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWrkQ().getWorkRequests().add(accountantBillingRequest);
                    userAccount.getWrkQ().getWorkRequests().add(accountantBillingRequest);
                }

                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                btnSendBillingRequest.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btnSendBillingRequestActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnSendBillingRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAssignedDoctor;
    private javax.swing.JTextField txtConsultationCharges;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLabCharges;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMedicationCharges;
    private javax.swing.JTextField txtMiscellaneousCharges;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        txtFirstName.setText(patientTreatmentWorkRequest.getPat().getPatFrstNm());
        txtLastName.setText(patientTreatmentWorkRequest.getPat().getPatLstNm());
        txtPatientId.setText(String.valueOf(patientTreatmentWorkRequest.getPat().getPatId()));
        txtAssignedDoctor.setText(patientTreatmentWorkRequest.getAssignedDoc().getEmp().getEmpName());
        txtConsultationCharges.setText(String.valueOf(consultationCharges));

    }
}
