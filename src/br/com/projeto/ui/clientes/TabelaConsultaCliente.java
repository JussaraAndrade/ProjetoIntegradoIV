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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jussara Andrade
 */
public class TabelaConsultaCliente extends javax.swing.JInternalFrame {

    TelaEditarCliente formEditarCliente = new TelaEditarCliente();
    TelaEditarCliente formEditarEndereco = new TelaEditarCliente();

    String ultimaPesquisa = null;

    public TabelaConsultaCliente() {
        initComponents();
        //  setLocationRelativeTo(null);
        setResizable(false);

        tabelaDados.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setWidth(0);

        tabelaEndereco.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaEndereco.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaEndereco.getColumnModel().getColumn(0).setWidth(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPaneDados = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        jPanelEndereco = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEndereco = new javax.swing.JTable();
        ButtonFechar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        ButtonPesquisar = new javax.swing.JButton();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sexo", "Rg", "Cpf", "Data Nascimento", "E-mail", "Celular", "Telefone"
            }
        ));
        tabelaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosMouseClicked(evt);
            }
        });
        jScrollPaneDados.setViewportView(tabelaDados);

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        tabelaEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Rua ", "Número", "Bairro", "Cidade", "Cep", "Uf", "Complemento"
            }
        ));
        tabelaEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEnderecoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEndereco);

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ButtonFechar.setText("Fechar");
        ButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDados)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPaneDados, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblPesquisar.setText("Pesquisar:");

        ButtonPesquisar.setText("Pesquisar");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jPanelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed

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
        DefaultTableModel modelEndereco = (DefaultTableModel) tabelaEndereco.getModel();

        modelDados.setRowCount(0);
        modelEndereco.setRowCount(0);

        if (resultado == null || resultado.size() <= 0) {
            return false;
        }

        for (int i = 0; i < resultado.size(); i++) {
            Cliente cli = resultado.get(i);

            if (cli != null) {
                Object[] rowCli = new Object[10];
                rowCli[0] = cli.getIdCliente();
                rowCli[1] = cli.getNome();
                rowCli[2] = cli.getSexo();
                rowCli[3] = cli.getRg();
                rowCli[4] = cli.getCpf();
                DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                rowCli[5] = formatador.format(cli.getDataNasc());
                rowCli[6] = cli.getEmail();
                rowCli[7] = cli.getCelular();
                rowCli[8] = cli.getTelefone();
                rowCli[9] = cli.getEnable();
                modelDados.addRow(rowCli);

                Object[] rowEnd = new Object[8];
                rowEnd[0] = cli.getIdCliente();
                rowEnd[1] = cli.getRua();
                rowEnd[2] = cli.getNumero();
                rowEnd[3] = cli.getBairro();
                rowEnd[4] = cli.getCidade();
                rowEnd[5] = cli.getCep();
                rowEnd[6] = cli.getUf();
                rowEnd[7] = cli.getComplemento();
                modelEndereco.addRow(rowEnd);
            }
        }

        return true;


    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonFecharActionPerformed

    private void tabelaEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEnderecoMouseClicked
        if (evt.getClickCount() == 2) {
            try {

                final int row = tabelaEndereco.getSelectedRow();

                Integer idCli = (Integer) tabelaDados.getValueAt(row, 0);
                Integer idEnd = (Integer) tabelaEndereco.getValueAt(row, 0);

                Cliente cliente = ServicoCliente.getInstance().obterCliente(idCli, idEnd);

                formEditarEndereco.dispose();
                formEditarEndereco = new TelaEditarCliente();
                formEditarEndereco.setCliente(cliente);
                formEditarEndereco.setTitle(cliente.getRua());
                this.getParent().add(formEditarEndereco);
                this.openFrameInCenter(formEditarEndereco);
                formEditarEndereco.toFront();
            } catch (Exception e) {

                e.printStackTrace();

                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste Endereço",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
        }

        public void openFrameInCenter(TelaEditarCliente jif) {
            Dimension desktopSize = this.getParent().getSize();
            Dimension jInternalFrameSize = jif.getSize();
            int width = (desktopSize.width - jInternalFrameSize.width) / 2;
            int height = (desktopSize.height - jInternalFrameSize.height) / 2;
            jif.setLocation(width, height);
            jif.setVisible(true);
    }//GEN-LAST:event_tabelaEnderecoMouseClicked

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
        if (evt.getClickCount() == 2) {
            try {

                final int row = tabelaDados.getSelectedRow();

                Integer idCli = (Integer) tabelaDados.getValueAt(row, 0);
                Integer idEnd = (Integer) tabelaEndereco.getValueAt(row, 0);

                Cliente cliente = ServicoCliente.getInstance().obterCliente(idCli, idEnd);

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneDados;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTable tabelaEndereco;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
