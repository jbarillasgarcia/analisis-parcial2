package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.view;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.BrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IBrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IVehicleReceiptService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.VehicleReceipt;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExecuteCombo1 = new javax.swing.JButton();
        btnExecuteCombo2 = new javax.swing.JButton();
        btnExecuteCombo3 = new javax.swing.JButton();
        btnExecuteComboExample = new javax.swing.JButton();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExecuteCombo1.setText("Ejecutar combo 1");
        btnExecuteCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo1(evt);
            }
        });

        btnExecuteCombo2.setText("Ejecutar combo 2");
        btnExecuteCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo2(evt);
            }
        });

        btnExecuteCombo3.setText("Ejecutar combo 3");
        btnExecuteCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo3(evt);
            }
        });

        btnExecuteComboExample.setText("Ejecutar combo Ejemplo");
        btnExecuteComboExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboExample(evt);
            }
        });

        lblLicenseNumber.setText("Placa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExecuteComboExample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLicenseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLicenseNumber)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNumber)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnExecuteComboExample)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo3)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeCombo1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo1
        System.out.println("Combo #1");
    }//GEN-LAST:event_executeCombo1

    private void executeCombo2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo2
        System.out.println("Combo #2");
    }//GEN-LAST:event_executeCombo2

    private void executeCombo3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo3
        System.out.println("Combo #3");
    }//GEN-LAST:event_executeCombo3

    private void executeComboExample(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboExample
        System.out.println("Combo Ejemplo");
        
        System.out.println("Se realizará un cambio de aceite y rotación de llantas. Por último, un lavado exterior.");
        
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
    }//GEN-LAST:event_executeComboExample

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteCombo1;
    private javax.swing.JButton btnExecuteCombo2;
    private javax.swing.JButton btnExecuteCombo3;
    private javax.swing.JButton btnExecuteComboExample;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}
