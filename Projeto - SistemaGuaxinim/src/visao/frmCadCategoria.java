/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


/**--------------------------------------------------------------------------
 * Sistema Guaxinim                                                         |
 * Descrição: Trabalho TG                                                   |
 * Sistema de inventario feito como conclusão do curso de ADS               |
 * na Fatec de Santana de Parnaiba.                                         |
 * @author Alessandro de Sousa da Silva                                     |
 * Data: 08/03/2020                                                         |
/----------------------------------------------------------------------------
 */

public class frmCadCategoria extends javax.swing.JFrame {

    /**
     * Creates new form frmFornecedor
     */
    public frmCadCategoria() {
        initComponents();
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagens/63d15fc0193fd496d2484a161652f676.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeImagem);
        this.setIconImage(iconeTitulo);
        //Fim - Adiciona Icone na barra de titulo
    
    
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNomeCadCategoria = new javax.swing.JTextField();
        jTextFieldCodigoCadCategoria = new javax.swing.JTextField();
        jTextFieldDescricaoCadCategoria = new javax.swing.JTextField();
        jComboBoxStatusCadCategoria = new javax.swing.JComboBox<>();
        jButtonLupaCadCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSairCadCategoria = new javax.swing.JButton();
        jButtonAnteriorCadCategoria = new javax.swing.JButton();
        jButtonNovoCadCategoria = new javax.swing.JButton();
        jButtonAlterarCadCategoria = new javax.swing.JButton();
        jButtonCancelarCadCategoria = new javax.swing.JButton();
        jButtonExcluirCadCategoria = new javax.swing.JButton();
        jButtonProximoCadCategoria = new javax.swing.JButton();
        jButtonSalvarCadCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Guaxinim - Cadastro Categoria");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Status:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 150, 110, 19);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Descrição:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 110, 120, 19);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Nome da Categ:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 70, 120, 19);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Codigo da Categoria:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(450, 30, 160, 20);
        jPanel1.add(jTextFieldNomeCadCategoria);
        jTextFieldNomeCadCategoria.setBounds(150, 60, 570, 30);

        jTextFieldCodigoCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoCadCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigoCadCategoria);
        jTextFieldCodigoCadCategoria.setBounds(600, 20, 150, 30);

        jTextFieldDescricaoCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoCadCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDescricaoCadCategoria);
        jTextFieldDescricaoCadCategoria.setBounds(150, 100, 600, 30);

        jComboBoxStatusCadCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Opção...", "Ativo", "Inativo", "Pausado" }));
        jPanel1.add(jComboBoxStatusCadCategoria);
        jComboBoxStatusCadCategoria.setBounds(150, 140, 190, 30);

        jButtonLupaCadCategoria.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLupaCadCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButtonLupaCadCategoria.setToolTipText("Clique aqui para fazer a consulta da Categoria.");
        jButtonLupaCadCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLupaCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLupaCadCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLupaCadCategoria);
        jButtonLupaCadCategoria.setBounds(720, 60, 30, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Categoria");

        jButtonSairCadCategoria.setText("Voltar");
        jButtonSairCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonSairCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCadCategoriaActionPerformed(evt);
            }
        });

        jButtonAnteriorCadCategoria.setText("Anterior");
        jButtonAnteriorCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAnteriorCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonNovoCadCategoria.setText("Novo");
        jButtonNovoCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));
        jButtonNovoCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCadCategoriaActionPerformed(evt);
            }
        });

        jButtonAlterarCadCategoria.setText("Alterar");
        jButtonAlterarCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonAlterarCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonCancelarCadCategoria.setText("Cancelar");
        jButtonCancelarCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonCancelarCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonExcluirCadCategoria.setText("Excluir");
        jButtonExcluirCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonExcluirCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        jButtonProximoCadCategoria.setText("Proximo");

        jButtonSalvarCadCategoria.setText("Salvar");
        jButtonSalvarCadCategoria.setMaximumSize(new java.awt.Dimension(82, 26));
        jButtonSalvarCadCategoria.setMinimumSize(new java.awt.Dimension(82, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnteriorCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovoCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximoCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jButtonSairCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSairCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnteriorCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProximoCadCategoria)
                    .addComponent(jButtonSalvarCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(796, 280));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoCadCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoCadCategoriaActionPerformed

    private void jTextFieldDescricaoCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoCadCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoCadCategoriaActionPerformed

    private void jButtonSairCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCadCategoriaActionPerformed
        // TODO add your handling code here:
        this.dispose(); //fecha somente o jFrame do frmCadUsuario
         
    }//GEN-LAST:event_jButtonSairCadCategoriaActionPerformed

    private void jButtonNovoCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCadCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoCadCategoriaActionPerformed

    private void jButtonLupaCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLupaCadCategoriaActionPerformed
        // TODO add your handling code here:
        frmConsultaCadCategoria ConsultaCadCategoria = new frmConsultaCadCategoria();
        ConsultaCadCategoria.setVisible(true);
    }//GEN-LAST:event_jButtonLupaCadCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarCadCategoria;
    private javax.swing.JButton jButtonAnteriorCadCategoria;
    private javax.swing.JButton jButtonCancelarCadCategoria;
    private javax.swing.JButton jButtonExcluirCadCategoria;
    private javax.swing.JButton jButtonLupaCadCategoria;
    private javax.swing.JButton jButtonNovoCadCategoria;
    private javax.swing.JButton jButtonProximoCadCategoria;
    private javax.swing.JButton jButtonSairCadCategoria;
    private javax.swing.JButton jButtonSalvarCadCategoria;
    private javax.swing.JComboBox<String> jComboBoxStatusCadCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoCadCategoria;
    private javax.swing.JTextField jTextFieldDescricaoCadCategoria;
    private javax.swing.JTextField jTextFieldNomeCadCategoria;
    // End of variables declaration//GEN-END:variables
}
