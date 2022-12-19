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
        restaurarDadosComboBoxTipoTitemItinerario();
        carregarItensItinerario();
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
        cbxTipoItemItinerario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbItensItinerario = new javax.swing.JTable();
        btnCadastrarItemItinerario = new javax.swing.JButton();
        btnAlterarItemItinerario = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        bntPesquisarItemItinerario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        btnExcluirItemItinerario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro | Itens Itinerario");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(88, 153, 157));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TotemBus");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Itens de Itnerario");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pin.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoTotemBus.png"))); // NOI18N

        cbxTipoItemItinerario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxTipoItemItinerario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxTipoItemItinerario.setToolTipText("");

        tbItensItinerario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "TIPO", "DESCRIÇÂO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        btnCadastrarItemItinerario.setBackground(new java.awt.Color(88, 153, 157));
        btnCadastrarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnCadastrar.png"))); // NOI18N
        btnCadastrarItemItinerario.setText("Salvar");
        btnCadastrarItemItinerario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCadastrarItemItinerario.setMaximumSize(new java.awt.Dimension(90, 35));
        btnCadastrarItemItinerario.setMinimumSize(new java.awt.Dimension(90, 35));
        btnCadastrarItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarItemItinerarioActionPerformed(evt);
            }
        });

        btnAlterarItemItinerario.setBackground(new java.awt.Color(88, 153, 157));
        btnAlterarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnAlterar.png"))); // NOI18N
        btnAlterarItemItinerario.setText("Alterar");
        btnAlterarItemItinerario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAlterarItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemItinerarioActionPerformed(evt);
            }
        });

        btnLimparCampos.setBackground(new java.awt.Color(88, 153, 157));
        btnLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnLimpar.png"))); // NOI18N
        btnLimparCampos.setText("Limpar");
        btnLimparCampos.setToolTipText("");
        btnLimparCampos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        bntPesquisarItemItinerario.setBackground(new java.awt.Color(88, 153, 157));
        bntPesquisarItemItinerario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntPesquisarItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnPesquisar.png"))); // NOI18N
        bntPesquisarItemItinerario.setText("Pesquisar");
        bntPesquisarItemItinerario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntPesquisarItemItinerario.setBorderPainted(false);
        bntPesquisarItemItinerario.setMaximumSize(new java.awt.Dimension(90, 35));
        bntPesquisarItemItinerario.setMinimumSize(new java.awt.Dimension(90, 35));
        bntPesquisarItemItinerario.setPreferredSize(new java.awt.Dimension(90, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Itens Cadastrados");

        jtfDescricao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnExcluirItemItinerario.setBackground(new java.awt.Color(88, 153, 157));
        btnExcluirItemItinerario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ImgBtnExcluir.png"))); // NOI18N
        btnExcluirItemItinerario.setText("Excluir");
        btnExcluirItemItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemItinerarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jtfId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxTipoItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluirItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnAlterarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(bntPesquisarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxTipoItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfDescricao)
                    .addComponent(jtfId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntPesquisarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirItemItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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

            if (controllerItemItinerario.cadastrarItemItinerario(ModelItemItinerario)) {
                JOptionPane.showMessageDialog(this, "Item cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                limparItensDeCadastro();
                carregarItensItinerario();
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

    private void carregarItensItinerario() {

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

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparItensDeCadastro();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnExcluirItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemItinerarioActionPerformed
        int linha = tbItensItinerario.getSelectedRow(); // Retornar a linha que o usuario selecionou na tabela

        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Favor seleceione um item na tabela para excluir");
        } else {
            int id = (int) tbItensItinerario.getValueAt(linha, 0);

            if (controllerItemItinerario.excluirItemItinerarioController(id)) {
                JOptionPane.showMessageDialog(this, "Item excluido com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                carregarItensItinerario();
                limparItensDeCadastro();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o item", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnExcluirItemItinerarioActionPerformed

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

            if (controllerItemItinerario.atualizarItemItinerario(id, ModelItemItinerario)) {
                JOptionPane.showMessageDialog(this, "Item alterado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                carregarItensItinerario();
                limparItensDeCadastro();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item", "Erro", JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_btnAlterarItemItinerarioActionPerformed

    Vector<Integer> idTipoItemItinerario = new Vector<Integer>();

    public void restaurarDadosComboBoxTipoTitemItinerario() {

        try {
            ResultSet rs = controllerItemItinerario.listarDescricaoTipoItemItinerario();

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTable tbItensItinerario;
    // End of variables declaration//GEN-END:variables
}
