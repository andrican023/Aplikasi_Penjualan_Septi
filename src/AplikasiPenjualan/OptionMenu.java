/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenjualan;

import java.awt.Dimension;

/**
 *
 * @author User
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toPaymentButton = new javax.swing.JButton();
        showDataButton = new javax.swing.JButton();

        setTitle("OPTION MENU");

        toPaymentButton.setText("PENJUALAN RUMAH");
        toPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPaymentButtonActionPerformed(evt);
            }
        });

        showDataButton.setText("TAMPILKAN DATA");
        showDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toPaymentButton)
                    .addComponent(showDataButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPaymentButtonActionPerformed
        PaymentForm paymentForm = new PaymentForm();
        this.getDesktopPane().add(paymentForm);
        Dimension gs = this.getDesktopPane().getSize();
        Dimension cs = paymentForm.getSize();

        paymentForm.setLocation((gs.width - cs.width) / 2, (gs.height - cs.height) / 2);
        
        paymentForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toPaymentButtonActionPerformed

    private void showDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataButtonActionPerformed
        DataForm dataForm = new DataForm();
        this.getDesktopPane().add(dataForm);
        Dimension gs = this.getDesktopPane().getSize();
        Dimension cs = dataForm.getSize();

        dataForm.setLocation((gs.width - cs.width) / 2, (gs.height - cs.height) / 2);
        
        dataForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_showDataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton showDataButton;
    private javax.swing.JButton toPaymentButton;
    // End of variables declaration//GEN-END:variables
}
