package visao;

/**
 *Sistema de Cadastro - Tela Cad Pessoa Fisica
 *Aula de Linguagem de Programação III
 *@author Alessandro de Sousa da Silva
 *@since Criada em 25/03/2021 as 10:00
 */

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class FramePessoaJuridica extends javax.swing.JFrame {

/**
 *Sistema de Cadastro - Tela Inicial
 *Aula de Linguagem de Programação III
 *@author Alessandro de Sousa da Silva
 *@since Criada em 25/03/2021 as 10:00
 */
    
    public FramePessoaJuridica() {
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

        buttonGroupoSexoCadPJ = new javax.swing.ButtonGroup();
        jLabelImagemFundoBordaPaineisCadPJ = new javax.swing.JLabel();
        jPanelTelaCadastroPj = new javax.swing.JPanel();
        lbEnderecoCadPJ = new javax.swing.JLabel();
        txNomeCadPJ = new javax.swing.JTextField();
        txEnderecoCadPJ = new javax.swing.JTextField();
        lbRazaoSocialCadPJ = new javax.swing.JLabel();
        lbDtInauguracaoCadPJ = new javax.swing.JLabel();
        lbSexoCadPJ = new javax.swing.JLabel();
        txNomeCidadeCadPJ = new javax.swing.JTextField();
        lbEstadoCadCadPJ = new javax.swing.JLabel();
        cbEstadoCadPJ = new javax.swing.JComboBox<>();
        lbCidadeCadPJ = new javax.swing.JLabel();
        jRadioButtonMasculinoCadPJ = new javax.swing.JRadioButton();
        jRadioButtonFemininoCadPJ = new javax.swing.JRadioButton();
        jLNumeroCadPJ = new javax.swing.JLabel();
        txNumeroCadPJ = new javax.swing.JTextField();
        jFormattedTextFieldDtINascimentoCadPJ = new javax.swing.JFormattedTextField();
        jLCNPJCadPJ = new javax.swing.JLabel();
        jFCNPJCadPJ = new javax.swing.JFormattedTextField();
        jlCapitalGiroCadPJ = new javax.swing.JLabel();
        jtRendaCadPJ = new javax.swing.JTextField();
        jPanelCadastroPJ2 = new javax.swing.JPanel();
        jCheckBoxLeituraCadPJ = new javax.swing.JCheckBox();
        jCheckBoxFutebolCadPJ = new javax.swing.JCheckBox();
        jCheckBoxPescariaCadPJ = new javax.swing.JCheckBox();
        jCheckBoxDancaCadPJ = new javax.swing.JCheckBox();
        jCheckBoxGamesCadPJ = new javax.swing.JCheckBox();
        jCheckBoxCorrerCadPJ = new javax.swing.JCheckBox();
        jCheckBoxCozinharCadPJ = new javax.swing.JCheckBox();
        jCheckBoxMusicaCadPJ = new javax.swing.JCheckBox();
        jbTituloCadPJ = new javax.swing.JLabel();
        jPanelBotoesCadPJ = new javax.swing.JPanel();
        btSalvarCadPJ = new javax.swing.JButton();
        btCancelarCadPJ = new javax.swing.JButton();
        btEditarCadPJ = new javax.swing.JButton();
        btExcluirCadPJ = new javax.swing.JButton();
        btSairCadPJ = new javax.swing.JButton();
        jLImgFundoCadPJ = new javax.swing.JLabel();

        jLabelImagemFundoBordaPaineisCadPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TalaFundoCadPaineis.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FATEC Linguagem de Programação III  - Sistema de Cadastro");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelTelaCadastroPj.setBackground(new java.awt.Color(222, 222, 210));
        jPanelTelaCadastroPj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", 2, 0));

        lbEnderecoCadPJ.setText("Endereço:.");

        txNomeCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeCadPJActionPerformed(evt);
            }
        });

        txEnderecoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEnderecoCadPJActionPerformed(evt);
            }
        });

        lbRazaoSocialCadPJ.setText("Razão Social:.");

        lbDtInauguracaoCadPJ.setText("Dt. Inauguração:.");

        lbSexoCadPJ.setText("Sexo:.");

        txNomeCidadeCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeCidadeCadPJActionPerformed(evt);
            }
        });

        lbEstadoCadCadPJ.setText("Estado:.");

        cbEstadoCadPJ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "AC - Acre", "AL - Alagoas", "AP - Amapá", "AM - Amazonas", "BA - Bahia ", "CE - Ceará", "DF - Distrito Federal", "ES - Espírito Santo", "GO - Goiás", "MA - Maranhão", "MT - Mato Grosso", "MS - Mato Grosso do Sul", "MG - Minas Gerais", "PA - Pará", "PB - Paraíba", "PR - Paraná", "PE - Pernambuco", "PI - Piauí", "RR - Roraima", "RO - Rondônia", "RJ - Rio de Janeiro", "RN - Rio Grande do Norte", "RS - Rio Grande do Sul", "SC - Santa Catarina", "SP - São Paulo", "SE - Sergipe", "TO - Tocantins" }));

        lbCidadeCadPJ.setText("Cidade:.");

        buttonGroupoSexoCadPJ.add(jRadioButtonMasculinoCadPJ);
        jRadioButtonMasculinoCadPJ.setText("Masculino");
        jRadioButtonMasculinoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoCadPJActionPerformed(evt);
            }
        });

        buttonGroupoSexoCadPJ.add(jRadioButtonFemininoCadPJ);
        jRadioButtonFemininoCadPJ.setText("Feminino");
        jRadioButtonFemininoCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemininoCadPJActionPerformed(evt);
            }
        });

        jLNumeroCadPJ.setText("Numero:.");

        txNumeroCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNumeroCadPJActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDtINascimentoCadPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLCNPJCadPJ.setText("CNPJ:.");

        try {
            jFCNPJCadPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCNPJCadPJ.setText("  .   .   /    - ");

        jlCapitalGiroCadPJ.setText("Renda:.");

        javax.swing.GroupLayout jPanelTelaCadastroPjLayout = new javax.swing.GroupLayout(jPanelTelaCadastroPj);
        jPanelTelaCadastroPj.setLayout(jPanelTelaCadastroPjLayout);
        jPanelTelaCadastroPjLayout.setHorizontalGroup(
            jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbRazaoSocialCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txNomeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDtInauguracaoCadPJ)
                .addGap(0, 0, 0)
                .addComponent(jFormattedTextFieldDtINascimentoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLNumeroCadPJ)
                .addGap(5, 5, 5)
                .addComponent(txNumeroCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txNomeCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEstadoCadCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cbEstadoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbSexoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jRadioButtonMasculinoCadPJ)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonFemininoCadPJ)
                .addGap(19, 19, 19)
                .addComponent(jlCapitalGiroCadPJ)
                .addGap(7, 7, 7)
                .addComponent(jtRendaCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLCNPJCadPJ)
                .addGap(5, 5, 5)
                .addComponent(jFCNPJCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTelaCadastroPjLayout.setVerticalGroup(
            jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNomeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDtINascimentoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRazaoSocialCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDtInauguracaoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNumeroCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEnderecoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNumeroCadPJ))))
                .addGap(12, 12, 12)
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txNomeCidadeCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbEstadoCadCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbEstadoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanelTelaCadastroPjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbSexoCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtonMasculinoCadPJ)
                    .addComponent(jRadioButtonFemininoCadPJ)
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jlCapitalGiroCadPJ))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtRendaCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLCNPJCadPJ))
                    .addGroup(jPanelTelaCadastroPjLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jFCNPJCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanelTelaCadastroPj);
        jPanelTelaCadastroPj.setBounds(0, 50, 830, 170);

        jPanelCadastroPJ2.setBackground(new java.awt.Color(222, 222, 210));
        jPanelCadastroPJ2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hobbies do Cliente", 2, 0));

        jCheckBoxLeituraCadPJ.setText("Leitura");

        jCheckBoxFutebolCadPJ.setText("Futebol");

        jCheckBoxPescariaCadPJ.setText("Pescaria");

        jCheckBoxDancaCadPJ.setText("Dança");

        jCheckBoxGamesCadPJ.setText("Games");

        jCheckBoxCorrerCadPJ.setText("Correr");

        jCheckBoxCozinharCadPJ.setText("Cozinhar");

        jCheckBoxMusicaCadPJ.setText("Musica");

        javax.swing.GroupLayout jPanelCadastroPJ2Layout = new javax.swing.GroupLayout(jPanelCadastroPJ2);
        jPanelCadastroPJ2.setLayout(jPanelCadastroPJ2Layout);
        jPanelCadastroPJ2Layout.setHorizontalGroup(
            jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroPJ2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxLeituraCadPJ)
                    .addComponent(jCheckBoxGamesCadPJ))
                .addGap(163, 163, 163)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxFutebolCadPJ)
                    .addComponent(jCheckBoxCorrerCadPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPescariaCadPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxCozinharCadPJ, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(166, 166, 166)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxDancaCadPJ)
                    .addComponent(jCheckBoxMusicaCadPJ))
                .addGap(27, 27, 27))
        );
        jPanelCadastroPJ2Layout.setVerticalGroup(
            jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroPJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDancaCadPJ)
                    .addComponent(jCheckBoxPescariaCadPJ)
                    .addComponent(jCheckBoxFutebolCadPJ)
                    .addComponent(jCheckBoxLeituraCadPJ))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroPJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxGamesCadPJ)
                    .addComponent(jCheckBoxCorrerCadPJ)
                    .addComponent(jCheckBoxCozinharCadPJ)
                    .addComponent(jCheckBoxMusicaCadPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastroPJ2);
        jPanelCadastroPJ2.setBounds(0, 230, 831, 100);

        jbTituloCadPJ.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbTituloCadPJ.setText("Tela de Cadastro de Clientes Pessoa Juridica ");
        getContentPane().add(jbTituloCadPJ);
        jbTituloCadPJ.setBounds(31, 12, 410, 24);

        jPanelBotoesCadPJ.setBackground(new java.awt.Color(222, 222, 210));
        jPanelBotoesCadPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btSalvarCadPJ.setText("Salvar");
        btSalvarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCadPJActionPerformed(evt);
            }
        });

        btCancelarCadPJ.setText("Cancelar");
        btCancelarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCadPJActionPerformed(evt);
            }
        });

        btEditarCadPJ.setText("Editar");
        btEditarCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCadPJActionPerformed(evt);
            }
        });

        btExcluirCadPJ.setText("Excluir");
        btExcluirCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCadPJActionPerformed(evt);
            }
        });

        btSairCadPJ.setText("Voltar");
        btSairCadPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairCadPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesCadPJLayout = new javax.swing.GroupLayout(jPanelBotoesCadPJ);
        jPanelBotoesCadPJ.setLayout(jPanelBotoesCadPJLayout);
        jPanelBotoesCadPJLayout.setHorizontalGroup(
            jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCadPJLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btSalvarCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarCadPJ)
                .addGap(18, 18, 18)
                .addComponent(btExcluirCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(btSairCadPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesCadPJLayout.setVerticalGroup(
            jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesCadPJLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesCadPJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarCadPJ)
                    .addComponent(btExcluirCadPJ)
                    .addComponent(btEditarCadPJ)
                    .addComponent(btSalvarCadPJ)
                    .addComponent(btSairCadPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotoesCadPJ);
        jPanelBotoesCadPJ.setBounds(0, 332, 831, 60);

        jLImgFundoCadPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TalaFundoCad.jpg"))); // NOI18N
        getContentPane().add(jLImgFundoCadPJ);
        jLImgFundoCadPJ.setBounds(0, 0, 840, 530);

        setSize(new java.awt.Dimension(836, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarCadPJActionPerformed

    private void txNomeCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeCadPJActionPerformed

    private void txEnderecoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEnderecoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEnderecoCadPJActionPerformed

    private void txNomeCidadeCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeCidadeCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeCidadeCadPJActionPerformed

    private void jRadioButtonFemininoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemininoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemininoCadPJActionPerformed

    private void txNumeroCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNumeroCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNumeroCadPJActionPerformed

    private void btCancelarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarCadPJActionPerformed

    private void btEditarCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarCadPJActionPerformed

    private void btExcluirCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirCadPJActionPerformed

    private void btSairCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairCadPJActionPerformed
        // TODO add your handling code here:
       this.dispose();
        
    }//GEN-LAST:event_btSairCadPJActionPerformed

    private void jRadioButtonMasculinoCadPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoCadPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoCadPJActionPerformed

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
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new FramePessoaJuridica().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarCadPJ;
    private javax.swing.JButton btEditarCadPJ;
    private javax.swing.JButton btExcluirCadPJ;
    private javax.swing.JButton btSairCadPJ;
    private javax.swing.JButton btSalvarCadPJ;
    private javax.swing.ButtonGroup buttonGroupoSexoCadPJ;
    private javax.swing.JComboBox<String> cbEstadoCadPJ;
    private javax.swing.JCheckBox jCheckBoxCorrerCadPJ;
    private javax.swing.JCheckBox jCheckBoxCozinharCadPJ;
    private javax.swing.JCheckBox jCheckBoxDancaCadPJ;
    private javax.swing.JCheckBox jCheckBoxFutebolCadPJ;
    private javax.swing.JCheckBox jCheckBoxGamesCadPJ;
    private javax.swing.JCheckBox jCheckBoxLeituraCadPJ;
    private javax.swing.JCheckBox jCheckBoxMusicaCadPJ;
    private javax.swing.JCheckBox jCheckBoxPescariaCadPJ;
    private javax.swing.JFormattedTextField jFCNPJCadPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtINascimentoCadPJ;
    private javax.swing.JLabel jLCNPJCadPJ;
    private javax.swing.JLabel jLImgFundoCadPJ;
    private javax.swing.JLabel jLNumeroCadPJ;
    private javax.swing.JLabel jLabelImagemFundoBordaPaineisCadPJ;
    private javax.swing.JPanel jPanelBotoesCadPJ;
    private javax.swing.JPanel jPanelCadastroPJ2;
    private javax.swing.JPanel jPanelTelaCadastroPj;
    private javax.swing.JRadioButton jRadioButtonFemininoCadPJ;
    private javax.swing.JRadioButton jRadioButtonMasculinoCadPJ;
    private javax.swing.JLabel jbTituloCadPJ;
    private javax.swing.JLabel jlCapitalGiroCadPJ;
    private javax.swing.JTextField jtRendaCadPJ;
    private javax.swing.JLabel lbCidadeCadPJ;
    private javax.swing.JLabel lbDtInauguracaoCadPJ;
    private javax.swing.JLabel lbEnderecoCadPJ;
    private javax.swing.JLabel lbEstadoCadCadPJ;
    private javax.swing.JLabel lbRazaoSocialCadPJ;
    private javax.swing.JLabel lbSexoCadPJ;
    private javax.swing.JTextField txEnderecoCadPJ;
    private javax.swing.JTextField txNomeCadPJ;
    private javax.swing.JTextField txNomeCidadeCadPJ;
    private javax.swing.JTextField txNumeroCadPJ;
    // End of variables declaration//GEN-END:variables
}
