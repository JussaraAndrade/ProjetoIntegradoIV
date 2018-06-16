/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.ui.clientes;

import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.service.cliente.ServicoCliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jussara Andrade
 */
public class TabelaConsultaCliente extends javax.swing.JFrame {

    TelaEditarCliente formEditarCliente = new TelaEditarCliente();
    
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEndereco = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        ButtonPesquisar = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(tabelaDados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

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
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonPesquisar)
                        .addGap(0, 923, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosMouseClicked
      
    }//GEN-LAST:event_tabelaDadosMouseClicked

    private void tabelaEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEnderecoMouseClicked
       
    }//GEN-LAST:event_tabelaEnderecoMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTable tabelaEndereco;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

   
    
    

}
