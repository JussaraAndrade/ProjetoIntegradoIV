/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.ui.gerente;

import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.produto.Produto;
import br.com.projeto.service.cliente.ServicoCliente;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jussara Andrade
 */
public class TelaConsultaProduto extends javax.swing.JInternalFrame {

    //TelaEditarGerente formEditarProduto = new TelaEditarGerente();
//    private TelaEditarProduto  formEditarProduto = null;
    TelaEditarProduto formEditarProduto = new TelaEditarProduto();
    String ultimaPesquisa = null;

    /**
     * Creates new form Pesquisa
     */
    public TelaConsultaProduto() {
        initComponents();

        setResizable(false);

        tabelaProduto.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaProduto.getColumnModel().getColumn(0).setWidth(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        ButtonFechar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        ButtonPesquisar.setText("Pesquisar");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo de Barras", "Produto", "Departamento", "Cor", "Tamanho", "Descrição", "Preço", "Estoque"
            }
        ));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonPesquisar)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ButtonFechar.setText("Fechar");
        ButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFecharActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        if (tabelaProduto.getSelectedRow() >= 0) {

            final int row = tabelaProduto.getSelectedRow();

            String codigo = (String) tabelaProduto.getValueAt(row, 1);

            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + codigo + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try {

                    Integer id = (Integer) tabelaProduto.getValueAt(row, 0);

                    ServicoCliente.getInstance().excluirProduto(id);

                    this.refreshListProduto();
                } catch (Exception e) {

                    e.printStackTrace();

                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        try {
            final int row = tabelaProduto.getSelectedRow();

            if (row >= 0) {

                Integer id = (Integer) tabelaProduto.getValueAt(row, 0);

                Produto produto = ServicoCliente.getInstance().obterProduto(id);

                formEditarProduto.dispose();
                formEditarProduto = new TelaEditarProduto();
                formEditarProduto.setProduto(produto);
                formEditarProduto.setTitle(produto.getNome());
                this.getParent().add(formEditarProduto);
                this.openFrameInCenter(formEditarProduto);
                formEditarProduto.toFront();
            }
        } catch (Exception e) {

            e.printStackTrace();

            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste produto.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonFecharActionPerformed

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        if (evt.getClickCount() == 2) {
            try {

                final int row = tabelaProduto.getSelectedRow();

                Integer id = (Integer) tabelaProduto.getValueAt(row, 0);

                Produto produto = ServicoCliente.getInstance().obterProduto(id);

                formEditarProduto.dispose();
                formEditarProduto = new TelaEditarProduto();
                formEditarProduto.setProduto(produto);
                formEditarProduto.setTitle(produto.getNome());
                this.getParent().add(formEditarProduto);
                this.openFrameInCenter(formEditarProduto);
                formEditarProduto.toFront();
            } catch (Exception e) {

                e.printStackTrace();

                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste produto.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed

        boolean resultSearch = false;

        ultimaPesquisa = txtPesquisar.getText();

        try {

            resultSearch = refreshListProduto();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean refreshListProduto() throws ClienteException, Exception {

        List<Produto> resultado = ServicoCliente.getInstance().procurarProduto(ultimaPesquisa);

        DefaultTableModel modelProduto = (DefaultTableModel) tabelaProduto.getModel();

        modelProduto.setRowCount(0);

        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        for (int i = 0; i < resultado.size(); i++) {
            Produto produto = resultado.get(i);

            if (produto != null) {

                Object[] row = new Object[10];

                row[0] = produto.getIdProduto();
                row[1] = produto.getCodigobarras();
                row[2] = produto.getNome();
                row[3] = produto.getDepartamento();
                row[4] = produto.getCor();
                row[5] = produto.getTamanho();
                row[6] = produto.getDescricao();
                row[7] = produto.getPreco();
                row[8] = produto.getQuantidade();
                row[9] = produto.getEnable();

                modelProduto.addRow(row);
            }
        }

        return true;
    }

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);

    }//GEN-LAST:event_ButtonPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

}
