/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MedicoCtrl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Medico;

/**
 *
 * @author leogo
 */
public class CadastroAcessView extends javax.swing.JInternalFrame {

    Medico medico = new Medico();
    MedicoCtrl medicoCtrl = new MedicoCtrl();
    ArrayList<Medico> listarMedico = new ArrayList<>();

    /**
     * Creates new form CadastroAcessView
     */
    public CadastroAcessView() {
        initComponents();
        carregarMedico();
        preencherMedicoComboBox();
        habilitarDesabiliar(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcb_medico = new componentes.UJComboBox();
        jLabel5 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();
        txt_conf_senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jcb_permissao = new componentes.UJComboBox();
        btn_salvar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome do Médico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Confirmar Senha");

        jcb_medico.setMaximumRowCount(10);
        jcb_medico.setToolTipText("");
        jcb_medico.setAutocompletar(true);
        jcb_medico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcb_medico.setMinimumSize(new java.awt.Dimension(126, 25));
        jcb_medico.setPreferredSize(new java.awt.Dimension(126, 26));
        jcb_medico.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcb_medicoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Código");

        txt_codigo.setEditable(false);
        txt_codigo.setBackground(new java.awt.Color(204, 204, 204));

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txt_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txt_conf_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Permissão");

        jcb_permissao.setEditable(true);
        jcb_permissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Comum" }));
        jcb_permissao.setAutocompletar(true);
        jcb_permissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_salvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_24px.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_novo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Create_24px.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_24px.png"))); // NOI18N
        btn_cancelar.setText("Fechar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btn_cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_novo)
                                .addGap(18, 18, 18)
                                .addComponent(btn_salvar))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_conf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcb_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jcb_permissao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_permissao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_conf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(300, 100, 663, 252);
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_medicoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcb_medicoPopupMenuWillBecomeInvisible
        if (jcb_medico.isPopupVisible()) {
            try {
                String nome = (String) jcb_medico.getSelectedItem();

                //recuperar dados do banco
                medico = medicoCtrl.retoMedicoNomeCtrl(nome);

                //setar na interface
                if (txt_usuario.getText().equals("null") && txt_senha.getText().equals("null")) {
                    txt_usuario.setText("");
                    txt_senha.setText("");
                } else {
                    txt_usuario.setText(medico.getUsuario());
                    txt_senha.setText(medico.getSenha());
                }
                jcb_permissao.setSelectedItem(medico.getPermissao());
                habilitarDesabiliar(true);
                preencherMedicoComboBox();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar Usuário!", "AVISO", JOptionPane.ERROR_MESSAGE);
                this.habilitarDesabiliar(false);
            }
        }
    }//GEN-LAST:event_jcb_medicoPopupMenuWillBecomeInvisible

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        carregarDadosMedico();
        habilitarDesabiliar(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (!txt_conf_senha.getText().equals(txt_senha.getText())) {
            JOptionPane.showMessageDialog(null, "Senhas são diferentes", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else if (txt_senha.getText().equals("") || txt_conf_senha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Senhas devem ser preenchidas", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }else{
            alterarMedico();
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

private void carregarDadosMedico() {
        String nome = (String) jcb_medico.getSelectedItem();

        //recuperar dados do banco
        medico = medicoCtrl.retoMedicoNomeCtrl(nome);

        //setar na interface
        if (txt_usuario.getText().equals("null") && txt_senha.getText().equals("null")) {
            txt_usuario.setText("");
            txt_senha.setText("");
        } else {
            txt_usuario.setText(medico.getUsuario());
            txt_senha.setText(medico.getSenha());
        }
        jcb_permissao.setSelectedItem(medico.getPermissao());
        habilitarDesabiliar(true);
        preencherMedicoComboBox();
    }

    private void limparCampos() {
        txt_usuario.setText("");
        txt_senha.setText("");
        jcb_permissao.setSelectedIndex(0);
        jcb_medico.setSelectedIndex(0);
        txt_conf_senha.setText("");
    }

    private void alterarMedico() {
        medico.setUsuario(txt_usuario.getText().toUpperCase());
        medico.setPermissao(jcb_permissao.getSelectedItem().toString());
        medico.setSenha(txt_senha.getText().toUpperCase());

        if (medicoCtrl.updateMedicoCtrl(medico)) {
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            carregarMedico();
            habilitarDesabiliar(false);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Tentar Cadastrar", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void habilitarDesabiliar(boolean condicao) {

        txt_usuario.setEnabled(condicao);
        txt_senha.setEnabled(condicao);
        jcb_permissao.setEnabled(condicao);
        jcb_medico.setEnabled(condicao);
        txt_conf_senha.setEnabled(condicao);
        btn_salvar.setEnabled(condicao);
    }

    private void preencherMedicoComboBox() {
        if (jcb_medico.getItemCount() == 0) {
            jcb_medico.setSelectedItem("Sem Registro");
        } else {
            medico = medicoCtrl.retoMedicoNomeCtrl(jcb_medico.getSelectedItem().toString());
            txt_codigo.setText(String.valueOf(medico.getIdMedico()));
        }
    }

    private void carregarMedico() {
        listarMedico = medicoCtrl.retoListMedicoCrtl();
        jcb_medico.removeAllItems();
        for (int i = 0; i < listarMedico.size(); i++) {
            jcb_medico.addItem(listarMedico.get(i).getNome());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private componentes.UJComboBox jcb_medico;
    private componentes.UJComboBox jcb_permissao;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JPasswordField txt_conf_senha;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
