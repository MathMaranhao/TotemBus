/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerItemItinerario;
import java.util.Vector;
import model.ModelItemItinerario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josem
 */
public class TelaCadastroItensItinerario extends javax.swing.JFrame {

    ModelItemItinerario ModelItemItinerario = new ModelItemItinerario();
    ControllerItemItinerario controllerItemItinerario = new ControllerItemItinerario();
    List<ModelItemItinerario> listaItemItinerario = new ArrayList<>();

    /**
     * Creates new form TelaCadastroItensItinerario
     */
    public TelaCadastroItensItinerario() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        restaurarDadosComboBoxTipoTitemItinerario();
        carregarTabelaItensItinerario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItensItinerario = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        cbxTipoItemItinerario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrarItemItinerario = new javax.swing.JButton();
        btnAlterarItemItinerario = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnExcluirItemItinerario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtfPesquisa = new javax.swing.JTextField();
        bntPesquisarItemItinerario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro | Itens Itinerario");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 33, 41));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("TotemBus");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cadastro de Itens de Itnerario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeMapa.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoTotemBus.png"))); // NOI18N

        tbItensItinerario.setAutoCreateRowSorter(true);
        tbItensItinerario.setBackground(new java.awt.Color(25, 33, 41));
        tbItensItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbItensItinerario.setForeground(new java.awt.Color(204, 204, 204));
        tbItensItinerario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TIPO", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbItensItinerario.setRowHeight(30);
        tbItensItinerario.setShowGrid(true);
        tbItensItinerario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbItensItinerarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbItensItinerario);
        if (tbItensItinerario.getColumnModel().getColumnCount() > 0) {
            tbItensItinerario.getColumnModel().getColumn(0).setMinWidth(100);
            tbItensItinerario.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbItensItinerario.getColumnModel().getColumn(0).setMaxWidth(100);
            tbItensItinerario.getColumnModel().getColumn(1).setMinWidth(200);
            tbItensItinerario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbItensItinerario.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Itens Cadastrados");

        jPanel3.setBackground(new java.awt.Color(25, 33, 41));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("ID:");

        jtfId.setEditable(false);

        jtfDescricao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        cbxTipoItemItinerario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxTipoItemItinerario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxTipoItemItinerario.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Descrição:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Tipo:");

        btnCadastrarItemItinerario.setBackground(new java.awt.Color(39, 47, 54));
        btnCadastrarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarItemItinerario.setForeground(new java.awt.Color(204, 204, 204));
        btnCadastrarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnCadastrar.png"))); // NOI18N
        btnCadastrarItemItinerario.setText("Salvar");
        btnCadastrarItemItinerario.setBorder(null);
        btnCadastrarItemItinerario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrarItemItinerario.setMaximumSize(new java.awt.Dimension(90, 35));
        btnCadastrarItemItinerario.setMinimumSize(new java.awt.Dimension(90, 35));
        btnCadastrarItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarItemItinerarioActionPerformed(evt);
            }
        });

        btnAlterarItemItinerario.setBackground(new java.awt.Color(39, 47, 54));
        btnAlterarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarItemItinerario.setForeground(new java.awt.Color(204, 204, 204));
        btnAlterarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgBtnEditar.png"))); // NOI18N
        btnAlterarItemItinerario.setText("Alterar");
        btnAlterarItemItinerario.setBorder(null);
        btnAlterarItemItinerario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlterarItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemItinerarioActionPerformed(evt);
            }
        });

        btnLimparCampos.setBackground(new java.awt.Color(39, 47, 54));
        btnLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimparCampos.setForeground(new java.awt.Color(204, 204, 204));
        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgLimparCampos.png"))); // NOI18N
        btnLimparCampos.setText("Limpar");
        btnLimparCampos.setToolTipText("");
        btnLimparCampos.setBorder(null);
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnExcluirItemItinerario.setBackground(new java.awt.Color(39, 47, 54));
        btnExcluirItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirItemItinerario.setForeground(new java.awt.Color(204, 204, 204));
        btnExcluirItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnExcluir.png"))); // NOI18N
        btnExcluirItemItinerario.setText("Excluir");
        btnExcluirItemItinerario.setBorder(null);
        btnExcluirItemItinerario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluirItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemItinerarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCadastrarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnAlterarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbxTipoItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTipoItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfId))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluirItemItinerario, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterarItemItinerario, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(btnCadastrarItemItinerario, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(25, 33, 41));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jtfPesquisa.setToolTipText("");
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyReleased(evt);
            }
        });

        bntPesquisarItemItinerario.setBackground(new java.awt.Color(39, 47, 54));
        bntPesquisarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntPesquisarItemItinerario.setForeground(new java.awt.Color(204, 204, 204));
        bntPesquisarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgBtnLimparPesquisa.png"))); // NOI18N
        bntPesquisarItemItinerario.setText("Limpar pesquisa");
        bntPesquisarItemItinerario.setBorder(null);
        bntPesquisarItemItinerario.setBorderPainted(false);
        bntPesquisarItemItinerario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntPesquisarItemItinerario.setMaximumSize(new java.awt.Dimension(90, 35));
        bntPesquisarItemItinerario.setMinimumSize(new java.awt.Dimension(90, 35));
        bntPesquisarItemItinerario.setPreferredSize(new java.awt.Dimension(90, 35));
        bntPesquisarItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarItemItinerarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Digite um argumento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(bntPesquisarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Metodos para validar os campos do formulario
     */
    public boolean validarCampoIdParaCadastro() {

        if (jtfId.getText().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possivel cadastrar pois um item está selecionado, favor limpar os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;

        }

    }

    public boolean validarCampoIdParaAlteracao() {

        if (jtfId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não foi possivel alterar, pois nenhum item foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }

    }

    public boolean validarCampoDescricao() {
        if (jtfDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "A descrição não pode ser vazia", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }

    }

    public boolean validarCampoTipo() {
        if (cbxTipoItemItinerario.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "O campo tipo não pode ser vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    private void btnCadastrarItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarItemItinerarioActionPerformed

        if (validarCampoIdParaCadastro() == true && validarCampoDescricao() == true && validarCampoTipo() == true) {
            ModelItemItinerario = new ModelItemItinerario();
            ModelItemItinerario.setDescricaoItem(jtfDescricao.getText());
            ModelItemItinerario.setIdTipoItem(idTipoItemItinerario.get(cbxTipoItemItinerario.getSelectedIndex() - 1));

            if (controllerItemItinerario.cadastrarItemItinerarioController(ModelItemItinerario)) {
                JOptionPane.showMessageDialog(this, "Item cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                limparItensDeCadastro();
                carregarTabelaItensItinerario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnCadastrarItemItinerarioActionPerformed

    private void limparItensDeCadastro() {
        jtfId.setText("");
        jtfDescricao.setText("");
        cbxTipoItemItinerario.setSelectedIndex(0);
    }

    private void carregarTabelaItensItinerario() {

        listaItemItinerario = controllerItemItinerario.getListaItensItineraioController();

        DefaultTableModel tabelaItemItinerario = (DefaultTableModel) tbItensItinerario.getModel();
        tabelaItemItinerario.setRowCount(0);

        for (int i = 0; i < listaItemItinerario.size(); i++) {
            tabelaItemItinerario.addRow(new Object[]{
                listaItemItinerario.get(i).getId(),
                listaItemItinerario.get(i).getDescricaoTipoItem(),
                listaItemItinerario.get(i).getDescricaoItem()
            });
        }

    }

    private void carregarTabelaItensItinerarioComArgumento(String argumento) {
        listaItemItinerario = controllerItemItinerario.getListaItensItineraioComArgumentoController(argumento);

        DefaultTableModel tabelaItemItinerario = (DefaultTableModel) tbItensItinerario.getModel();
        tabelaItemItinerario.setRowCount(0);

        for (int i = 0; i < listaItemItinerario.size(); i++) {
            tabelaItemItinerario.addRow(new Object[]{
                listaItemItinerario.get(i).getId(),
                listaItemItinerario.get(i).getDescricaoTipoItem(),
                listaItemItinerario.get(i).getDescricaoItem()
            });
        }
    }

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparItensDeCadastro();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void tbItensItinerarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItensItinerarioMouseClicked
        int linha = tbItensItinerario.getSelectedRow();

        if (linha != -1) {

            jtfDescricao.setText((String) tbItensItinerario.getValueAt(linha, 2));
            cbxTipoItemItinerario.setSelectedItem(tbItensItinerario.getValueAt(linha, 1));
            jtfId.setText(tbItensItinerario.getValueAt(linha, 0).toString());

        }
    }//GEN-LAST:event_tbItensItinerarioMouseClicked

    private void btnAlterarItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemItinerarioActionPerformed

        if (validarCampoIdParaAlteracao() == true && validarCampoDescricao() == true && validarCampoTipo() == true) {
            ModelItemItinerario = new ModelItemItinerario();
            ModelItemItinerario.setDescricaoItem(jtfDescricao.getText());
            ModelItemItinerario.setIdTipoItem(idTipoItemItinerario.get(cbxTipoItemItinerario.getSelectedIndex() - 1));

            int id = Integer.parseInt(jtfId.getText());

            if (controllerItemItinerario.atualizarItemItinerarioController(id, ModelItemItinerario)) {
                JOptionPane.showMessageDialog(this, "Item alterado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                carregarTabelaItensItinerario();
                limparItensDeCadastro();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_btnAlterarItemItinerarioActionPerformed

    private void btnExcluirItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemItinerarioActionPerformed
        int linha = tbItensItinerario.getSelectedRow(); // Retornar a linha que o usuario selecionou na tabela

        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Favor seleceione um item na tabela para excluir");
        } else {

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse item", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                int id = (int) tbItensItinerario.getValueAt(linha, 0);

                if (controllerItemItinerario.excluirItemItinerarioController(id)) {
                    JOptionPane.showMessageDialog(this, "Item excluido com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    carregarTabelaItensItinerario();
                    limparItensDeCadastro();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir o item", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_btnExcluirItemItinerarioActionPerformed

    private void bntPesquisarItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarItemItinerarioActionPerformed
        jtfPesquisa.setText("");
        carregarTabelaItensItinerario();
    }//GEN-LAST:event_bntPesquisarItemItinerarioActionPerformed

    private void jtfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyReleased

        String argumento = jtfPesquisa.getText();
        carregarTabelaItensItinerarioComArgumento(argumento);
    }//GEN-LAST:event_jtfPesquisaKeyReleased

    Vector<Integer> idTipoItemItinerario = new Vector<Integer>();

    public void restaurarDadosComboBoxTipoTitemItinerario() {

        try {
            ResultSet rs = controllerItemItinerario.listarDescricaoTipoItemItinerarioController();

            while (rs.next()) {
                idTipoItemItinerario.add(rs.getInt(1));
                cbxTipoItemItinerario.addItem(rs.getString(2));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaCadastroItensItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItensItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroItensItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPesquisarItemItinerario;
    private javax.swing.JButton btnAlterarItemItinerario;
    private javax.swing.JButton btnCadastrarItemItinerario;
    private javax.swing.JButton btnExcluirItemItinerario;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cbxTipoItemItinerario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTable tbItensItinerario;
    // End of variables declaration//GEN-END:variables
}
