/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Moiane Family
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
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

        jButton_Removerr = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Certificacao = new javax.swing.JButton();
        jButton_Pesquisar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton_Removerr.setText("Remover Processos");
        jButton_Removerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoverrActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Removerr);
        jButton_Removerr.setBounds(10, 300, 170, 40);

        jButton_Actualizar.setText("Actualizar Processos");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar);
        jButton_Actualizar.setBounds(10, 240, 170, 40);

        jButton_Certificacao.setText("Cadastrar Novo Processo");
        jButton_Certificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CertificacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Certificacao);
        jButton_Certificacao.setBounds(10, 120, 170, 40);

        jButton_Pesquisar.setText("Pesquisar Processos");
        jButton_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pesquisar);
        jButton_Pesquisar.setBounds(10, 180, 170, 40);

        jButton6.setText("Sair");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(470, 370, 51, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/4.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-16, -16, 600, 450);

        setSize(new java.awt.Dimension(581, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_PesquisarActionPerformed

    private void jButton_RemoverrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoverrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RemoverrActionPerformed

    private void jButton_CertificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CertificacaoActionPerformed
        // TODO add your handling code here:
        Certificacao certificacao = new Certificacao();
           certificacao.setVisible(true);
           
           dispose();
 
    }//GEN-LAST:event_jButton_CertificacaoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Deseja sair da Aplicacao?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Certificacao;
    private javax.swing.JButton jButton_Pesquisar;
    private javax.swing.JButton jButton_Removerr;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
