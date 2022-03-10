/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class frm_arbol_binario extends javax.swing.JFrame {
    Random aleatorio = new Random();
     Arbol_binario arbol = new Arbol_binario();
    /**
     * Creates new form frm_arbol_binario
     */
    public frm_arbol_binario() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        btninOrder = new javax.swing.JButton();
        btnpreOrder = new javax.swing.JButton();
        btnpostOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        btn_generar.setBackground(new java.awt.Color(255, 255, 255));
        btn_generar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        btninOrder.setBackground(new java.awt.Color(102, 153, 255));
        btninOrder.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btninOrder.setForeground(new java.awt.Color(255, 255, 255));
        btninOrder.setText("inOrder");
        btninOrder.setEnabled(false);
        btninOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninOrderActionPerformed(evt);
            }
        });

        btnpreOrder.setBackground(new java.awt.Color(255, 102, 102));
        btnpreOrder.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnpreOrder.setText("preOrder");
        btnpreOrder.setEnabled(false);
        btnpreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreOrderActionPerformed(evt);
            }
        });

        btnpostOrder.setBackground(new java.awt.Color(102, 255, 102));
        btnpostOrder.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnpostOrder.setText("postOrder");
        btnpostOrder.setEnabled(false);
        btnpostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpreOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btninOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpostOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpostOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
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

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            try {
                arbol.agregarNodo(value, value);
            } catch (Exception e) {
                System.out.println("ERROR..."+e);
            }  
        }
        JOptionPane.showMessageDialog(rootPane, "Los numeros han sido generados exitosamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        btninOrder.setEnabled(true);
        btnpreOrder.setEnabled(true);
        btnpostOrder.setEnabled(true);
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btninOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninOrderActionPerformed
        System.out.println("Recorrido inOrder");
        arbol.inOrder(arbol.raiz);
        JOptionPane.showMessageDialog(rootPane, "Se ha mostrado el recorrido inOrder en la consola","Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btninOrderActionPerformed

    private void btnpreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreOrderActionPerformed
        System.out.println("Recorrido preOrder");
        arbol.preOrder(arbol.raiz);
        JOptionPane.showMessageDialog(rootPane, "Se ha mostrado el recorrido preOrder en la consola","Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnpreOrderActionPerformed

    private void btnpostOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostOrderActionPerformed
        System.out.println("Recorrido postOrder");
        arbol.postOrder(arbol.raiz);
        JOptionPane.showMessageDialog(rootPane, "Se ha mostrado el recorrido postOrder en la consola","Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnpostOrderActionPerformed

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
            java.util.logging.Logger.getLogger(frm_arbol_binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_binario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_arbol_binario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btninOrder;
    private javax.swing.JButton btnpostOrder;
    private javax.swing.JButton btnpreOrder;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
