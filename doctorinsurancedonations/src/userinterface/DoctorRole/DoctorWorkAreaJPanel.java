/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;


import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankWorkRequest;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author dineshmurugesan
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private DoctorOrganization docOrg;
    private Enterprise entrpz;
    private UserAccount usrAcnt;
    //private Map<PatientTreatmentWorkRequest, LabTestWorkRequest> patientToLab = new HashMap<>();

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.docOrg = organization;
        this.entrpz = enterprise;
        this.usrAcnt = account;
        valueLabel.setText(enterprise.getName());
        pplReqTbl();
    }

    public void pplReqTbl() {

        DefaultTableModel model = (DefaultTableModel) wrkReqJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest req : docOrg.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[8];
            
            if(((PatientTreatmentWorkRequest) req).getPatient().getDoctorType().equals(usrAcnt.getType())){
            
            row[0] = ((PatientTreatmentWorkRequest) req).getRegistrationDate();
            row[1] = String.valueOf(((PatientTreatmentWorkRequest) req).getPatient().getPatientId());
            row[2] = ((PatientTreatmentWorkRequest) req).getPatient().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) req).getPatient().getPatientLastName();
            row[3] = ((PatientTreatmentWorkRequest) req);
            row[4] = ((PatientTreatmentWorkRequest) req).getAssignedDoctor();
            row[5] = ((PatientTreatmentWorkRequest) req).getLabAssistant();
            row[6] = ((PatientTreatmentWorkRequest) req).getLabResult();
            row[7] = req.getStatus();

            model.addRow(row);
            }
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        wrkReqJTable.setRowSorter(sorter);
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
        wrkReqJTable = new javax.swing.JTable();
        reqTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AsngToMeBtn = new javax.swing.JButton();
        prvdPrescrptnBtn = new javax.swing.JButton();
        cmpltBtn = new javax.swing.JButton();
        ViewPntBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bloodBankReqJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        wrkReqJTable.setBackground(new java.awt.Color(0, 153, 255));
        wrkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Registration Date", "Patient Id", "Patient Name", "Illness", "Assigned Doctor", "Lab Assistant", "Lab Result", "Treatment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wrkReqJTable);

        reqTestJButton.setBackground(new java.awt.Color(0, 153, 255));
        reqTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reqTestJButton.setText("Request Lab Test");
        reqTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Medical Test Work Queue");

        AsngToMeBtn.setBackground(new java.awt.Color(0, 153, 255));
        AsngToMeBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AsngToMeBtn.setText("Assign To Me");
        AsngToMeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsngToMeBtnActionPerformed(evt);
            }
        });

        prvdPrescrptnBtn.setBackground(new java.awt.Color(0, 153, 255));
        prvdPrescrptnBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prvdPrescrptnBtn.setText("Provide Prescription");
        prvdPrescrptnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prvdPrescrptnBtnActionPerformed(evt);
            }
        });

        cmpltBtn.setBackground(new java.awt.Color(0, 153, 255));
        cmpltBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmpltBtn.setText("Complete Treatment");
        cmpltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpltBtnActionPerformed(evt);
            }
        });

        ViewPntBtn.setBackground(new java.awt.Color(0, 153, 255));
        ViewPntBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewPntBtn.setText("View Patient");
        ViewPntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPntBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Doctor Work Area");

        bloodBankReqJButton.setBackground(new java.awt.Color(0, 153, 255));
        bloodBankReqJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bloodBankReqJButton.setText("Blood Bank Request");
        bloodBankReqJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodBankReqJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(241, 241, 241)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(enterpriseLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViewPntBtn)
                                .addGap(29, 29, 29)
                                .addComponent(AsngToMeBtn)
                                .addGap(31, 31, 31)
                                .addComponent(reqTestJButton)
                                .addGap(30, 30, 30)
                                .addComponent(prvdPrescrptnBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cmpltBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(bloodBankReqJButton)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsngToMeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prvdPrescrptnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reqTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPntBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bloodBankReqJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqTestJButtonActionPerformed

        int selectedRow = wrkReqJTable.getSelectedRow();
        PatientTreatmentWorkRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
            if (wrkReq.getAssignedDoctor() != null) {
                if (usrAcnt.equals(wrkReq.getAssignedDoctor())) {
                    if (wrkReq.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) jPanel.getLayout();
                        jPanel.add("RequestLabTestJPanel", new RequestLabTestJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                        layout.next(jPanel);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + wrkReq.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }


    }//GEN-LAST:event_reqTestJButtonActionPerformed

    private void AsngToMeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsngToMeBtnActionPerformed

        int selectedRow = wrkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            WorkRequest pntTrtmWrkReq = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
            if (((PatientTreatmentWorkRequest) pntTrtmWrkReq).getAssignedDoctor() == null) {

                if (pntTrtmWrkReq.getStatus().equalsIgnoreCase("Waiting for Doctor")) {
                    //patientTreatmentWorkRequest.setReceiver(userAccount);
                    ((PatientTreatmentWorkRequest) pntTrtmWrkReq).setAssignedDoctor(usrAcnt);
                    pntTrtmWrkReq.setStatus("Under Consultation");
                    pplReqTbl();
                    JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + pntTrtmWrkReq.getStatus());
                }

            } else {
                if(usrAcnt.equals(((PatientTreatmentWorkRequest) pntTrtmWrkReq).getAssignedDoctor())) {
                 JOptionPane.showMessageDialog(null, "Request is already assigned to you");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized");
                }
            }
        }
    }//GEN-LAST:event_AsngToMeBtnActionPerformed

    private void ViewPntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPntBtnActionPerformed
        int selectedRow = wrkReqJTable.getSelectedRow();
        PatientTreatmentWorkRequest patientWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            patientWorkRequest = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            jPanel.add("ViewPatientJPanel", new ViewPatientJPanel(jPanel, usrAcnt, entrpz, patientWorkRequest));
            layout.next(jPanel);
        }
    }//GEN-LAST:event_ViewPntBtnActionPerformed

    private void prvdPrescrptnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prvdPrescrptnBtnActionPerformed
        int selectedRow = wrkReqJTable.getSelectedRow();
        PatientTreatmentWorkRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
            if(wrkReq.getAssignedDoctor() != null)
            {
            if (usrAcnt.equals(wrkReq.getAssignedDoctor())) {
                if (wrkReq.getStatus().equalsIgnoreCase("Lab Test Completed") || wrkReq.getStatus().equalsIgnoreCase("Under Consultation")||wrkReq.getStatus().equalsIgnoreCase("Blood Bank Request Completed")) {

                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    jPanel.add("ProvidePrescriptionJPanel", new ProvidePrescriptionJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                    layout.next(jPanel);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot prescribe the Patient as the status is: " + wrkReq.getStatus());
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_prvdPrescrptnBtnActionPerformed

    private void cmpltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpltBtnActionPerformed
        int selectedRow = wrkReqJTable.getSelectedRow();
        PatientTreatmentWorkRequest wrkReq;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
            if(wrkReq.getAssignedDoctor() != null)
            {
            if (usrAcnt.equals(wrkReq.getAssignedDoctor())) {
                if (wrkReq.getStatus().equalsIgnoreCase("Prescription Provided")) {

                    CardLayout layout = (CardLayout) jPanel.getLayout();
                    jPanel.add("RequestBillingJPanel", new RequestBillingJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                    wrkReq.getPatient().setIsTreatmentFinished(true);
                    layout.next(jPanel);
                } else {
                    if(wrkReq.getStatus().equalsIgnoreCase("Consultation Completed"))
                    {
                        JOptionPane.showMessageDialog(null, "Treatment is already complete!");
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Cannot complete the treatment. Please provide Prescription first!");
                }
                }
            } else {

                JOptionPane.showMessageDialog(null, "Not Authorised");
            }
        }
            else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }
    }//GEN-LAST:event_cmpltBtnActionPerformed

    private void bloodBankReqJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodBankReqJButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = wrkReqJTable.getSelectedRow();
        PatientTreatmentWorkRequest wrkReq;
        

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            wrkReq = (PatientTreatmentWorkRequest) wrkReqJTable.getValueAt(selectedRow, 3);
           //request =(BloodBankWorkRequest) workRequestJTable.getValueAt(selectedRow, 3);
            if (wrkReq.getAssignedDoctor() != null) {
                if (usrAcnt.equals(wrkReq.getAssignedDoctor())) {
                    if (wrkReq.getStatus().equalsIgnoreCase("Under Consultation")) {

                        CardLayout layout = (CardLayout) jPanel.getLayout();
                        jPanel.add("RequestLabTestJPanel", new BloodBankRequestJPanel(jPanel, usrAcnt, entrpz, wrkReq));
                        layout.next(jPanel);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can not create the Lab request as the current status is " + wrkReq.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorised");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first");
            }
        }



    }//GEN-LAST:event_bloodBankReqJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsngToMeBtn;
    private javax.swing.JButton ViewPntBtn;
    private javax.swing.JButton bloodBankReqJButton;
    private javax.swing.JButton cmpltBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prvdPrescrptnBtn;
    private javax.swing.JButton reqTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable wrkReqJTable;
    // End of variables declaration//GEN-END:variables
}
