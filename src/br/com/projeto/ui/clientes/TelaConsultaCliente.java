/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.ui.clientes;

import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.service.cliente.ServicoCliente;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jussara Andrade
 */
public class TelaConsultaCliente extends javax.swing.JInternalFrame {

    TelaEditarCliente formEditarCliente = new TelaEditarCliente();

    String ultimaPesquisa = null;

    public TelaConsultaCliente() {
        initComponents();
//      //  setLocationRelativeTo(null);
        this.setResizable(false);

        tabelaDados.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setWidth(0);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sexo", "Rg", "Cpf", "Data Nascimento", "E-mail", "Celular", "Telefone", "Rua", "Número", "Bairro", "Cidade", "Cep", "Uf", "Complemento"
            }
        ));
        tabelaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setText("Pesquisar:");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 836, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean resultSearch = false;

        ultimaPesquisa = txtPesquisar.getText();

        try {

            resultSearch = refreshListCliente();
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

    public boolean refreshListCliente() throws ClienteException, Exception {

        List<Cliente> resultado = ServicoCliente.getInstance().procurarCliente(ultimaPesquisa);

        DefaultTableModel modelDados = (DefaultTableModel) tabelaDados.getModel();

        modelDados.setRowCount(0);

        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        for (int i = 0; i < resultado.size(); i++) {
            Cliente cli = resultado.get(i);

            if (cli != null) {
                Object[] rowCli = new Object[16];
                rowCli[0] = cli.getId();
                rowCli[1] = cli.getNome();
                rowCli[2] = cli.getSexo();
                rowCli[3] = cli.getRg();
                rowCli[4] = cli.getCpf();
                DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                rowCli[5] = formatador.format(cli.getDataNasc());
                rowCli[6] = cli.getEmail();
                rowCli[7] = cli.getCelular();
                rowCli[8] = cli.getTelefone(); 
                rowCli[9] = cli.getRua();
                rowCli[10] = cli.getNumero();
                rowCli[11] = cli.getBairro();
                rowCli[12] = cli.getCidade();
                rowCli[13] = cli.getCep();
                rowCli[14] = cli.getUf();
                rowCli[15] = cli.getComplemento();
                modelDados.addRow(rowCli);
            }
        }

        return true;


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked

        if (evt.getClickCount() == 2) {
            try {

                final int row = tabelaDados.getSelectedRow();

                Integer id = (Integer) tabelaDados.getValueAt(row, 0);

                Cliente cliente = ServicoCliente.getInstance().obterCliente(id);

                formEditarCliente.dispose();
                formEditarCliente = new TelaEditarCliente();
                formEditarCliente.setCliente(cliente);
                formEditarCliente.setTitle(cliente.getNome());
                this.getParent().add(formEditarCliente);
                this.openFrameInCenter(formEditarCliente);
                formEditarCliente.toFront();
            } catch (Exception e) {
              
                e.printStackTrace();
          
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste cliente.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

        if (tabelaDados.getSelectedRow() >= 0) {

            final int rowCli = tabelaDados.getSelectedRow();

            String nome = (String) tabelaDados.getValueAt(rowCli, 1);

            int resposta = JOptionPane.showConfirmDialog(rootPane,
                "Excluir o cliente \"" + nome + "\"?",
                "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

           

            if (resposta == JOptionPane.YES_OPTION ) {
                try {
                    Integer id = (Integer) tabelaDados.getValueAt(rowCli, 0);
                    ServicoCliente.getInstance().excluirCliente(id);

                    this.refreshListCliente();
                } catch (Exception e) {

                    e.printStackTrace();

                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);

                }
            }
        }

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            final int rowCli = tabelaDados.getSelectedRow();

            if (rowCli >= 0) {
                Integer id = (Integer) tabelaDados.getValueAt(rowCli, 0);
                Cliente cliente = ServicoCliente.getInstance().obterCliente(id);

                formEditarCliente.dispose();
                formEditarCliente = new TelaEditarCliente();
                formEditarCliente.setCliente(cliente);
                formEditarCliente.setTitle(cliente.getNome());
                this.getParent().add(formEditarCliente);
                this.openFrameInCenter(formEditarCliente);
                formEditarCliente.toFront();
            }
        } catch (Exception e) {

            e.printStackTrace();

            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                + "exibir os detalhes deste cliente.",
                "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
    }
  
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    
    }//GEN-LAST:event_txtPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

}
