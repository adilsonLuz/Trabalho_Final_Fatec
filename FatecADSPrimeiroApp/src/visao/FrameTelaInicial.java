package visao;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Sistema de Cadastro - Tela Inicial
 *Aula de Linguagem de Programação III
 *@author Alessandro de Sousa da Silva
 *@since Criada em 25/03/2021 as 10:00
 */

public class FrameTelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public FrameTelaInicial() {
        initComponents();
        //Adiciona Icone na barra de titulo
        URL iconeImagem = getClass().getResource("/imagem/iconePrincipal.png");
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

        jlImagemFundoTelaInicial = new javax.swing.JLabel();
        jPanelDataHoraTelaPrincipal = new javax.swing.JPanel();
        jLabelDireitosAutoraisTelaPrincipal = new javax.swing.JLabel();
        jLDataTelaPrincipal = new javax.swing.JLabel();
        jLHoraTelaPrincipal = new javax.swing.JLabel();
        jMenuTelaPrincipal = new javax.swing.JMenuBar();
        jMenuArquivoTelaPrincipal = new javax.swing.JMenu();
        jSubMenuEditarTelaPrincipal = new javax.swing.JMenuItem();
        jSubMenuISalvarTelaPrincipal = new javax.swing.JMenuItem();
        jMenuCadastroTelaPrincipal = new javax.swing.JMenu();
        jMenuClientesTelaPrincipal = new javax.swing.JMenu();
        jSubMenuPessoaFisicaTelaPrincipal = new javax.swing.JMenuItem();
        jSubMenuPessoaJuridicaTelaPrincipal = new javax.swing.JMenuItem();
        jMenuFerramentasTelaPrincipal = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSairTelaPrincipal = new javax.swing.JMenu();
        jSubMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FATEC Linguagem de Programação III  - Sistema de Cadastro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jlImagemFundoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TalaFundoCad.jpg"))); // NOI18N
        getContentPane().add(jlImagemFundoTelaInicial);
        jlImagemFundoTelaInicial.setBounds(0, 0, 850, 380);

        jLabelDireitosAutoraisTelaPrincipal.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jLabelDireitosAutoraisTelaPrincipal.setText("Desenvolvido por:. Alessandro de Sousa da Silva - Curso ADS - Fatec Santana de Parnaiba - SP        ");
        jPanelDataHoraTelaPrincipal.add(jLabelDireitosAutoraisTelaPrincipal);

        jLDataTelaPrincipal.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jPanelDataHoraTelaPrincipal.add(jLDataTelaPrincipal);

        jLHoraTelaPrincipal.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        jPanelDataHoraTelaPrincipal.add(jLHoraTelaPrincipal);

        getContentPane().add(jPanelDataHoraTelaPrincipal);
        jPanelDataHoraTelaPrincipal.setBounds(0, 380, 850, 20);

        jMenuArquivoTelaPrincipal.setText("Arquivo");

        jSubMenuEditarTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/editar.png"))); // NOI18N
        jSubMenuEditarTelaPrincipal.setText("Editar");
        jMenuArquivoTelaPrincipal.add(jSubMenuEditarTelaPrincipal);

        jSubMenuISalvarTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/salvar.png"))); // NOI18N
        jSubMenuISalvarTelaPrincipal.setText("Salvar");
        jMenuArquivoTelaPrincipal.add(jSubMenuISalvarTelaPrincipal);

        jMenuTelaPrincipal.add(jMenuArquivoTelaPrincipal);

        jMenuCadastroTelaPrincipal.setText("Cadastro");

        jMenuClientesTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Usuarios.jpg"))); // NOI18N
        jMenuClientesTelaPrincipal.setText("Clientes");

        jSubMenuPessoaFisicaTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Senhas1.png"))); // NOI18N
        jSubMenuPessoaFisicaTelaPrincipal.setText("Pessoa Fisica");
        jSubMenuPessoaFisicaTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuPessoaFisicaTelaPrincipalActionPerformed(evt);
            }
        });
        jMenuClientesTelaPrincipal.add(jSubMenuPessoaFisicaTelaPrincipal);

        jSubMenuPessoaJuridicaTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fornecedorico.png"))); // NOI18N
        jSubMenuPessoaJuridicaTelaPrincipal.setText("Pessoa Juridica");
        jSubMenuPessoaJuridicaTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuPessoaJuridicaTelaPrincipalActionPerformed(evt);
            }
        });
        jMenuClientesTelaPrincipal.add(jSubMenuPessoaJuridicaTelaPrincipal);

        jMenuCadastroTelaPrincipal.add(jMenuClientesTelaPrincipal);

        jMenuTelaPrincipal.add(jMenuCadastroTelaPrincipal);

        jMenuFerramentasTelaPrincipal.setText("Ferramentas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/calculadora.png"))); // NOI18N
        jMenuItem1.setText("Calculadora Swing");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFerramentasTelaPrincipal.add(jMenuItem1);

        jMenuTelaPrincipal.add(jMenuFerramentasTelaPrincipal);

        jMenuSairTelaPrincipal.setText("Sair");

        jSubMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/MenuSair.png"))); // NOI18N
        jSubMenuSair.setText("Sair");
        jSubMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuSairActionPerformed(evt);
            }
        });
        jMenuSairTelaPrincipal.add(jSubMenuSair);

        jMenuTelaPrincipal.add(jMenuSairTelaPrincipal);

        setJMenuBar(jMenuTelaPrincipal);

        setSize(new java.awt.Dimension(863, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSubMenuPessoaJuridicaTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuPessoaJuridicaTelaPrincipalActionPerformed
        // TODO add your handling code here:
        FramePessoaJuridica framePessoaJuridica = new FramePessoaJuridica();
        framePessoaJuridica.setVisible(true);
        
    }//GEN-LAST:event_jSubMenuPessoaJuridicaTelaPrincipalActionPerformed

    private void jSubMenuPessoaFisicaTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuPessoaFisicaTelaPrincipalActionPerformed
        // Chamada do frame Cadastro Pessoa Fisica
        FramePessoaFisica frameCadastro = new FramePessoaFisica();
        frameCadastro.setVisible(true);
    }//GEN-LAST:event_jSubMenuPessoaFisicaTelaPrincipalActionPerformed

    private void jSubMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuSairActionPerformed
        //Programação do botão Sair
        switch (JOptionPane.showConfirmDialog(null,
                "Deseja realmente sair do Sistema de Cadastro?",
                "Saindo do Sistema de Cadastro...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE )) {
            case 0:
                System.out.println("Saindo do Sistema de Cadastro...");
                System.exit(0);
                break;
            case 1:
                System.out.println("Voltando para o Sistema de Cadastro...");
                break;
            }        
    }//GEN-LAST:event_jSubMenuSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Chamada do frame Calculadora Swing
        FrameCalculadora frameCalculadora = new FrameCalculadora();
        frameCalculadora.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Programação para exibir data na jframe
        Date dataSistema = new Date (); 
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");//SimpleDateFormat é um formato que pega uma data e convert para uma string
        jLDataTelaPrincipal.setText(formato.format(dataSistema));
        
        // Programação para exibir hora na jframe
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLDataTelaPrincipal;
    private javax.swing.JLabel jLHoraTelaPrincipal;
    private javax.swing.JLabel jLabelDireitosAutoraisTelaPrincipal;
    private javax.swing.JMenu jMenuArquivoTelaPrincipal;
    private javax.swing.JMenu jMenuCadastroTelaPrincipal;
    private javax.swing.JMenu jMenuClientesTelaPrincipal;
    private javax.swing.JMenu jMenuFerramentasTelaPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuSairTelaPrincipal;
    private javax.swing.JMenuBar jMenuTelaPrincipal;
    private javax.swing.JPanel jPanelDataHoraTelaPrincipal;
    private javax.swing.JMenuItem jSubMenuEditarTelaPrincipal;
    private javax.swing.JMenuItem jSubMenuISalvarTelaPrincipal;
    private javax.swing.JMenuItem jSubMenuPessoaFisicaTelaPrincipal;
    private javax.swing.JMenuItem jSubMenuPessoaJuridicaTelaPrincipal;
    private javax.swing.JMenuItem jSubMenuSair;
    private javax.swing.JLabel jlImagemFundoTelaInicial;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
        Calendar now = Calendar.getInstance();
        jLHoraTelaPrincipal.setText(String.format("%1$tH:%1$tM:%1$tS", now));
    }//fim da actionPerformed
}//fim da class
}
