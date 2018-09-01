/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ConsultaCtrl;
import controller.GenericCtrl;
import controller.PacienteCtrl;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Consulta;
import model.Generic;
import model.Paciente;

/**
 *
 * @author leogo
 */
public class GrafricoPacienteView extends javax.swing.JInternalFrame {

    Consulta consulta = new Consulta();
    ConsultaCtrl consultaCtrl = new ConsultaCtrl();

    Paciente paciente = new Paciente();
    PacienteCtrl pacienteCtrl = new PacienteCtrl();
    ArrayList<Paciente> listarPaciente = new ArrayList<>();

    ArrayList<Generic> listaConsultaMedPac = new ArrayList<>();
    GenericCtrl genericCtrl = new GenericCtrl();

    /**
     * Creates new form GrafricoPacienteView
     */
    public GrafricoPacienteView() {
        initComponents();
        carregarConsulta();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_data = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_data2 = new javax.swing.JFormattedTextField();
        btn_pesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txt_nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_consulta = new javax.swing.JTable();
        btn_grafo = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gráfico de Consultas Realizadas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setText("Paciente");

        jLabel2.setText("Data da Consulta");

        try {
            txt_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_data.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txt_data.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setText("a");

        try {
            txt_data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_data2.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txt_data2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_pesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_24px.png"))); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("Consultar Realizadas");

        jPanel9.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_data2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_pesquisar)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisar)))
        );

        jt_consulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jt_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Paciente", "Médico", "Sistólica", "Diastólica", "Frequência", "Data da Consulta", "Consulta Realizada?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_consulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jt_consulta);
        if (jt_consulta.getColumnModel().getColumnCount() > 0) {
            jt_consulta.getColumnModel().getColumn(1).setMinWidth(150);
            jt_consulta.getColumnModel().getColumn(1).setPreferredWidth(200);
            jt_consulta.getColumnModel().getColumn(2).setMinWidth(150);
            jt_consulta.getColumnModel().getColumn(2).setPreferredWidth(200);
            jt_consulta.getColumnModel().getColumn(3).setMinWidth(90);
            jt_consulta.getColumnModel().getColumn(3).setPreferredWidth(100);
            jt_consulta.getColumnModel().getColumn(4).setMinWidth(90);
            jt_consulta.getColumnModel().getColumn(4).setPreferredWidth(100);
            jt_consulta.getColumnModel().getColumn(5).setMinWidth(90);
            jt_consulta.getColumnModel().getColumn(5).setPreferredWidth(100);
            jt_consulta.getColumnModel().getColumn(6).setMinWidth(90);
            jt_consulta.getColumnModel().getColumn(6).setPreferredWidth(100);
            jt_consulta.getColumnModel().getColumn(7).setMinWidth(110);
            jt_consulta.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        btn_grafo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_grafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-gráfico-de-pizza-24.png"))); // NOI18N
        btn_grafo.setText("Gráfico");
        btn_grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grafoActionPerformed(evt);
            }
        });

        btn_fechar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_24px.png"))); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_fechar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_grafo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_grafo)
                    .addComponent(btn_fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setBounds(300, 100, 697, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        if (txt_data.getText().equals("  /  /    ") && txt_data2.getText().equals("  /  /    ")) {
            txt_data.getText().replaceAll("[  /  /    ]", "");
            txt_data2.getText().replaceAll("  /  /    ", "");
        } else {
            listaConsultaMedPac = genericCtrl.getListaConsultaGrafico(txt_nome.getText().toUpperCase(), txt_data.getText(), txt_data2.getText());
            DefaultTableModel modeloConsulta = (DefaultTableModel) jt_consulta.getModel();

            modeloConsulta.setNumRows(0);
            int cont = listaConsultaMedPac.size();
            for (int i = 0; i < cont; i++) {
                modeloConsulta.addRow(new Object[]{
                    listaConsultaMedPac.get(i).getConsulta().getId_consulta(),
                    listaConsultaMedPac.get(i).getPaciente().getNome(),
                    listaConsultaMedPac.get(i).getMedico().getNome(),
                    listaConsultaMedPac.get(i).getConsulta().getSistolica(),
                    listaConsultaMedPac.get(i).getConsulta().getDiastolica(),
                    listaConsultaMedPac.get(i).getConsulta().getFrequencia(),
                    listaConsultaMedPac.get(i).getConsulta().getData_consulta(),
                    listaConsultaMedPac.get(i).getConsulta().getStatus()
                });
            }
            CorDataLinha();
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grafoActionPerformed
        final AguardView carregar = new AguardView();
        carregar.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    consultaCtrl.gerarGraficoConsultaNomeData(txt_nome.getText().toUpperCase(), txt_data.getText(), txt_data2.getText());
                    //consultaCtrl.gerarGraficoConsultaRealizadas();
                    carregar.setVisible(false);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar Gráfico! /n " + e, "AVISO", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        t.start();
    }//GEN-LAST:event_btn_grafoActionPerformed

    private void carregarConsulta() {
        DefaultTableModel modelo = (DefaultTableModel) jt_consulta.getModel();
        listaConsultaMedPac = genericCtrl.getListaConsultaRealizadaCtrl();
        int cont = listaConsultaMedPac.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaConsultaMedPac.get(i).getConsulta().getId_consulta(),
                listaConsultaMedPac.get(i).getPaciente().getNome(),
                listaConsultaMedPac.get(i).getMedico().getNome(),
                listaConsultaMedPac.get(i).getConsulta().getSistolica(),
                listaConsultaMedPac.get(i).getConsulta().getDiastolica(),
                listaConsultaMedPac.get(i).getConsulta().getFrequencia(),
                listaConsultaMedPac.get(i).getConsulta().getData_consulta(),
                listaConsultaMedPac.get(i).getConsulta().getStatus()
            });
        }
        CorDataLinha();
    }

    private void CorDataLinha() {
        String status = "SIM";
        jt_consulta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable tabela, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel label = (JLabel) super.getTableCellRendererComponent(tabela, value, isSelected, hasFocus, row, column);
                Color c = Color.WHITE;
                Object texto = tabela.getValueAt(row, 7);
                if (texto != null && status.equals(texto.toString())) {
                    c = Color.CYAN;
                }
                label.setBackground(c);
                jt_consulta.setSelectionForeground(Color.BLACK);

                return label;
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_grafo;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_consulta;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JFormattedTextField txt_data2;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}