package br.com.projeto.ui.vendedor;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jussara Andrade
 */
public class PrincipalVendedor extends javax.swing.JFrame {
    private TelaClienteCadastro cadastrarCliente = null;
    private TelaClienteConsulta consultarClientes = null;
    private TelaClienteVendas vendas = null;
    /**
     * Creates new form CadastroCliente
     */
    public PrincipalVendedor() {
        initComponents();
         //Center   
         setLocationRelativeTo(null);
         this.setExtendedState(MAXIMIZED_BOTH);
   
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Cadastrar Cliente.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        menuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Cadastro Cliente.png"))); // NOI18N
        menuCadastrarCliente.setText("Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(menuCadastrarCliente);

        jMenuBar1.add(jMenuCadastro);

        jMenuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Venda.png"))); // NOI18N
        jMenuVenda.setText("Venda");
        jMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendaActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Caixa.png"))); // NOI18N
        jMenuItem1.setText("Caixa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItem1);

        jMenuBar1.add(jMenuVenda);

        jMenuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Lupa_1.png"))); // NOI18N
        jMenuConsulta.setText("Consulta");

        jMenuItemConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Arquivo Cliente.png"))); // NOI18N
        jMenuItemConsulta.setText("Cliente");
        jMenuItemConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsulta);

        jMenuBar1.add(jMenuConsulta);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Opções.png"))); // NOI18N
        jMenu4.setText("Opções");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Ajuda.png"))); // NOI18N
        jMenuItem2.setText("Ajuda");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Botão Desligar 4.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
     //Chama a janela TelaClienteCadastro 
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new TelaClienteCadastro();
            cadastrarCliente.setVisible(true);
        }
        cadastrarCliente.toFront();
        
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
         
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaActionPerformed
        
    }//GEN-LAST:event_jMenuVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if (vendas == null || !vendas.isDisplayable()) {
                 vendas = new TelaClienteVendas();
                 vendas.setVisible(true);
        }
        vendas.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaActionPerformed
         if(consultarClientes == null || !consultarClientes.isDisplayable()){
        
        consultarClientes = new TelaClienteConsulta();
        consultarClientes.setVisible(true);
        
       }
       consultarClientes.toFront();
    }//GEN-LAST:event_jMenuItemConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemConsulta;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JMenuItem menuCadastrarCliente;
    // End of variables declaration//GEN-END:variables
}
