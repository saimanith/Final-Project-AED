/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthCareOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rajesh
 */
public class RequestFundsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;

    /**
     * Creates new form RequestFundsJPanel
     */
    public RequestFundsJPanel(JPanel jPanel, Enterprise enterprise, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        double totalFunds = 0;
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequests()) {
            if(request instanceof GovernmentFundRequest){
            Object[] row = new Object[4];
            row[0] = String.valueOf(((GovernmentFundRequest) request).getLocation());
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = String.valueOf(((GovernmentFundRequest) request).getRequestAmount());
            model.addRow(row);
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                totalFunds += ((GovernmentFundRequest) request).getRequestAmount();
            }
            }
        }

        txtFundsReceived.setText(String.valueOf(totalFunds));
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRequestFunds = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpopulation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnSendFundRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFundsReceived = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblRequestFunds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRequestFunds.setText("Request Funds");
        add(lblRequestFunds);
        lblRequestFunds.setBounds(236, 11, 228, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Location: ");
        add(jLabel1);
        jLabel1.setBounds(67, 69, 59, 15);

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        add(txtLocation);
        txtLocation.setBounds(165, 67, 141, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Population:");
        add(jLabel2);
        jLabel2.setBounds(67, 107, 70, 15);

        txtpopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpopulationActionPerformed(evt);
            }
        });
        add(txtpopulation);
        txtpopulation.setBounds(165, 105, 143, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Amount:");
        add(jLabel3);
        jLabel3.setBounds(67, 145, 51, 15);

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        add(txtAmount);
        txtAmount.setBounds(165, 143, 143, 23);

        btnSendFundRequest.setBackground(new java.awt.Color(0, 153, 255));
        btnSendFundRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendFundRequest.setText("Send Fund Request");
        btnSendFundRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFundRequestActionPerformed(evt);
            }
        });
        add(btnSendFundRequest);
        btnSendFundRequest.setBounds(165, 174, 143, 38);

        workRequestJTable.setBackground(new java.awt.Color(0, 153, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Location", "Receiver", "Status", "Amount"
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(37, 296, 592, 97);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("All Funds Requests");
        add(jLabel4);
        jLabel4.setBounds(265, 254, 124, 36);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Funds Received :");
        add(jLabel5);
        jLabel5.setBounds(67, 225, 138, 15);

        txtFundsReceived.setEditable(false);
        add(txtFundsReceived);
        txtFundsReceived.setBounds(208, 223, 143, 23);

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(10, 11, 93, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Funds.gif"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(30, 0, 630, 290);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtpopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpopulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpopulationActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnSendFundRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFundRequestActionPerformed

        String location = txtLocation.getText().trim();
        String population = txtpopulation.getText();
        String amount = txtAmount.getText();
        if (location.equals("") || population.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            try {
                Integer.parseInt(population);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer for population");
                return;
            }
            try {
                Double.parseDouble(amount);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer value for amount");
                return;
            }
            GovernmentFundRequest governmentFundRequest = new GovernmentFundRequest(location, Integer.parseInt(population), Double.parseDouble(amount));
            governmentFundRequest.setSender(userAccount);
            governmentFundRequest.setStatus("Sent");

            Organization org = null;

            List<Network> networks = ecoSystem.getNetworks();

            for (Network network : networks) {

                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enterprise : enterprises) {
                    List<Organization> organizations = enterprise.getOrganizationDirectory().getOrganizations();
                    for (Organization organization : organizations) {
                        if (organization instanceof HealthCareOfficerOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                userAccount.getWorkQueue().getWorkRequests().add(governmentFundRequest);
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_btnSendFundRequestActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSendFundRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestFunds;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtFundsReceived;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtpopulation;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
