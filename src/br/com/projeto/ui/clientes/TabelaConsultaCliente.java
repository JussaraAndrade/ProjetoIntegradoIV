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
public class TabelaConsultaCliente extends javax.swing.JInternalFrame {

    TelaEditarCliente formEditarCliente = new TelaEditarCliente();
    TelaEditarCliente formEditarEndereco = new TelaEditarCliente();

    String ultimaPesquisa = null;

    public TabelaConsultaCliente() {
        initComponents();
        //  setLocationRelativeTo(null);
        this.setResizable(false);

        tabelaDados.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaDados.getColumnModel().getColumn(0).setWidth(0);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPaneDados = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        ButtonFechar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        ButtonPesquisar = new javax.swing.JButton();

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
        jScrollPaneDados.setViewportView(tabelaDados);

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
                .addComponent(jScrollPaneDados, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPaneDados, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblPesquisar.setText("Pesquisar:");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

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


    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void ButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonFecharActionPerformed

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFechar;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JScrollPane jScrollPaneDados;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
