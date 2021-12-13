/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.AdministrativeRole;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.NGOFundRequest;
import Business.WorkQueue.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dineshmurugesan
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOAdminOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class NGORequestFundsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form NGORequestFunds
     */
    public NGORequestFundsJPanel(JPanel jPanel, Enterprise enterprise, UserAccount userAccount, EcoSystem ecoSystem) {
        
        initComponents();
        this.userProcessContainer = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateNGORequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        lblRequestFunds = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgoFundsReceived = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hospitalAddr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hospitalAmt = new javax.swing.JTextField();
        hospitalName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        requestbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NGORequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 51));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblRequestFunds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRequestFunds.setText("Request Funds from NGO");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Total Contributions Received :");

        txtNgoFundsReceived.setEditable(false);
        txtNgoFundsReceived.setBackground(new java.awt.Color(204, 204, 204));
        txtNgoFundsReceived.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("All Contributions Requests");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Hospital Address");

        hospitalAddr.setBackground(new java.awt.Color(204, 204, 204));
        hospitalAddr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Hospital's required Amount");

        hospitalAmt.setBackground(new java.awt.Color(204, 204, 204));
        hospitalAmt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        hospitalName.setBackground(new java.awt.Color(204, 204, 204));
        hospitalName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Hospital Name");

        requestbutton.setBackground(new java.awt.Color(204, 204, 204));
        requestbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        requestbutton.setText("Request Funds from NGO");
        requestbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbuttonActionPerformed(evt);
            }
        });

        NGORequestJTable.setBackground(new java.awt.Color(204, 204, 204));
        NGORequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NGORequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Address", "Hospital Contribution", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(NGORequestJTable);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/financier request.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hospitalAmt)
                                .addComponent(hospitalAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgoFundsReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requestbutton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backJButton)
                                    .addGap(103, 103, 103)
                                    .addComponent(lblRequestFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(lblRequestFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hospitalAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hospitalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(requestbutton)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgoFundsReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbuttonActionPerformed
     // TODO add your handling code here:

        String hospname = hospitalName.getText();
        String hospaddress = hospitalAddr.getText();
        String neededamtreq = hospitalAmt.getText();

        if(hospname.equals("") || hospaddress.equals("")||neededamtreq.equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        }else {
            try {
                Integer.parseInt(neededamtreq);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer value for contribution");
                return;
            }

            NGOFundRequest ngoFundRequest = new NGOFundRequest(hospname,hospaddress, Integer.parseInt(neededamtreq));
            ngoFundRequest.setSender(userAccount);
            ngoFundRequest.setStatus("Sent");
            Organization org = null;

            List<Network> networks = ecoSystem.getNetworks();

            for (Network network : networks) {

                List<Enterprise> enterprises = network.getEntDir().getEntList();
                for (Enterprise enterprise : enterprises) {
                    List<Organization> organizations = enterprise.getOrgDir().getOrganizations();
                    for (Organization organization : organizations) {
                        if (organization instanceof NGOAdminOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }

            if (org != null) {
                org.getWrkQ().getWorkRequests().add(ngoFundRequest);
                userAccount.getWrkQ().getWorkRequests().add(ngoFundRequest);
            }
            populateNGORequestTable();
        }

    }//GEN-LAST:event_requestbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NGORequestJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField hospitalAddr;
    private javax.swing.JTextField hospitalAmt;
    private javax.swing.JTextField hospitalName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestFunds;
    private javax.swing.JButton requestbutton;
    private javax.swing.JTextField txtNgoFundsReceived;
    // End of variables declaration//GEN-END:variables

    private void populateNGORequestTable() {
        DefaultTableModel model = (DefaultTableModel) NGORequestJTable.getModel();
        int totalreqFunds = 0;
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWrkQ().getWorkRequests()) {
            if(request instanceof NGOFundRequest){
            Object[] row = new Object[4];
            row[0] = String.valueOf(((NGOFundRequest) request).getHospname());
            row[1] = String.valueOf(((NGOFundRequest) request).getHospaddress());
            row[2] = String.valueOf(((NGOFundRequest) request).getNeededamtreq());
            row[3] = request.getStatus();
            model.addRow(row);
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                totalreqFunds += ((NGOFundRequest) request).getNeededamtreq();
            }
            }
        }

        txtNgoFundsReceived.setText(String.valueOf(totalreqFunds));
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        NGORequestJTable.setRowSorter(sorter);
    }

}
