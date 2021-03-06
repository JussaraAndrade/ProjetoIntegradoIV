/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.ui.gerente;

import br.com.projeto.model.produto.Produto;
import br.com.projeto.service.cliente.ServicoCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Jussara Andrade
 */
public class TelaCadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Produtos
     */
    public TelaCadastrarProduto() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        Desktop = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblCodigoBarra = new javax.swing.JLabel();
        txtCodigoBarra = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblTamanho = new javax.swing.JLabel();
        jComboBoxTamanho = new javax.swing.JComboBox<>();
        lblCor = new javax.swing.JLabel();
        jComboBoxCor = new javax.swing.JComboBox<>();
        ButtonSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jToggleButton1.setText("jToggleButton1");

        Desktop.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Produtos"));

        lblNome.setText("Nome:");

        lblValor.setText("Valor:");

        lblQuantidade.setText(" Estoque:");

        lblCodigoBarra.setText("Código de Barra:");

        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });

        lblGenero.setText("Departamento:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Infantil", "Adulto", "Íntimo" }));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        lblDescricao.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        lblTamanho.setText("Tamanho:");

        jComboBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho...", "P", "M", "G", "GG" }));

        lblCor.setText("Cor:");

        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cor...", "Preto", "Branco", "Azul", "Vermelho" }));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenero)
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTamanho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor)
                            .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(lblDescricao))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoBarra)
                            .addGroup(DesktopLayout.createSequentialGroup()
                                .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuantidade))))
                        .addContainerGap(64, Short.MAX_VALUE))))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(lblTamanho)
                    .addComponent(lblCor)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoBarra)
                    .addComponent(lblQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        Produto produto = new Produto();
        produto.setNome(txtNome.getText());
        produto.setDepartamento((String) jComboBoxGenero.getSelectedItem());
        produto.setTamanho((String) jComboBoxTamanho.getSelectedItem());
        produto.setCor((String) jComboBoxCor.getSelectedItem());
        produto.setPreco(txtPreco.getText());
        produto.setCodigobarras(txtCodigoBarra.getText());
        produto.setDescricao((String) txtDescricao.getText());
        produto.setQuantidade(txtQuantidade.getText());

        try {

            ServicoCliente.getInstance().cadastrarProduto(produto);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

        txtNome.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        jComboBoxTamanho.setSelectedIndex(0);
        jComboBoxCor.setSelectedIndex(0);
        txtPreco.setText("");
        txtCodigoBarra.setText("");
        txtQuantidade.setText("");
        txtDescricao.setText("");

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JPanel Desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCor;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxTamanho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCodigoBarra;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
