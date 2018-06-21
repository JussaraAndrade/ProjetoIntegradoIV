/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.ui.principal;


import br.com.projeto.ui.clientes.TabelaConsultaCliente;
import br.com.projeto.ui.gerente.TelaConsultaProduto;
import br.com.projeto.ui.gerente.TelaCadastrarProduto;
import br.com.projeto.ui.login.TelaLogin;
import java.awt.Dimension;
import javax.swing.JInternalFrame;



/**
 *
 * @author Jussara Andrade
 */
public class PrincipalGerente extends javax.swing.JFrame {
    //Sem botão de Editar e Excluir somente consulta dados de CLIENTES
    private TabelaConsultaCliente clienteConsulta = null;
 
    //Com botão de Editar e Excluir e também consulta dados de PRODUTO GERENTE
    private TelaConsultaProduto produtoConsulta = null;
    //Tela Login de Usuário e Gerente
    private TelaLogin login = null;
    //Tela de cadastro do Gerente PRODUTO
    private TelaCadastrarProduto cadastroProduto = null;
    
    
    /**
     * Creates new form AdmGerente
     */
    public PrincipalGerente() {
        initComponents();
       setLocationRelativeTo(null);
       this.setExtendedState(MAXIMIZED_BOTH);
//        this.setLocationRelativeTo(null);
         
    }
     
    //Consulta a tela de CLIENTE sem o Botão de Editar e Excluir
    public TabelaConsultaCliente getConsultaCliente() {
        return clienteConsulta;
    }
    //Consulta a tela de CLIENTE sem o Botão de Editar e Excluir
    public void setConsultaCliente(TabelaConsultaCliente consultarClientes) {
        this.clienteConsulta= consultarClientes;
    }   
    
     public TelaConsultaProduto getConsultaProdutos() {
        return produtoConsulta;
    }

    public void setConsultaProdutos(TelaConsultaProduto vendas) {
        this.produtoConsulta = vendas;    
      }    
    public TelaLogin getLogin() {
        return login;
    }

    public void setLogin(TelaLogin login) {
        this.login = login;      
    }
    public TelaCadastrarProduto getCadastro() {
        return cadastroProduto;
    }

    public void setCadastro(TelaCadastrarProduto cadastro) {
        this.cadastroProduto = cadastro;      
      
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jMenuBarMenus = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemVendas = new javax.swing.JMenuItem();
        jMenuItemEstoque = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsultaCliente = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenuItem();
        jMenuOpções = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1036, 644));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().add(jLabel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Cadastrar Cliente.png"))); // NOI18N
        jMenuCadastro.setText("Cadastro");

        jMenuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Carrinho Adicionar.png"))); // NOI18N
        jMenuItemProdutos.setText("Produto");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProdutos);

        jMenuBarMenus.add(jMenuCadastro);

        jMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Relátorio 3.png"))); // NOI18N
        jMenuRelatorios.setText("Relatório");

        jMenuItemVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Venda.png"))); // NOI18N
        jMenuItemVendas.setText("Venda");
        jMenuRelatorios.add(jMenuItemVendas);

        jMenuItemEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Estoque 1.png"))); // NOI18N
        jMenuItemEstoque.setText("Estoque");
        jMenuItemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstoqueActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemEstoque);

        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Arquivo Cliente.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemCliente);

        jMenuBarMenus.add(jMenuRelatorios);

        jMenuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Lupa.png"))); // NOI18N
        jMenuConsulta.setText("Consulta");

        jMenuItemConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Procura Cliente.png"))); // NOI18N
        jMenuItemConsultaCliente.setText("Cliente");
        jMenuItemConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaClienteActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsultaCliente);

        jMenuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Carrinho Mercado.png"))); // NOI18N
        jMenuProduto.setText("Produto");
        jMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutoActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuProduto);

        jMenuBarMenus.add(jMenuConsulta);

        jMenuOpções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Opções.png"))); // NOI18N
        jMenuOpções.setText("Opções");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Botão Desligar 4.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpções.add(jMenuItemSair);

        jMenuBarMenus.add(jMenuOpções);

        setJMenuBar(jMenuBarMenus);

        getAccessibleContext().setAccessibleName("Principal Produto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEstoqueActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed

    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       this.dispose();


    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaClienteActionPerformed
     if (clienteConsulta == null || !clienteConsulta.isDisplayable()) {
           clienteConsulta = new TabelaConsultaCliente();
            desktop.add(clienteConsulta);
            this.openFrameInCenter(clienteConsulta);
        }
        clienteConsulta.toFront();
    }//GEN-LAST:event_jMenuItemConsultaClienteActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
         
        if (cadastroProduto == null || !cadastroProduto.isDisplayable()) {
            cadastroProduto = new TelaCadastrarProduto();
            desktop.add(cadastroProduto);
            this.openFrameInCenter(cadastroProduto);
        }
        cadastroProduto.toFront();
        
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutoActionPerformed
         if (produtoConsulta == null || !produtoConsulta.isDisplayable()) {
            produtoConsulta = new TelaConsultaProduto();
            desktop.add(produtoConsulta);
            this.openFrameInCenter(produtoConsulta);
        }
        produtoConsulta.toFront();
        }
     public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
        
    
    }//GEN-LAST:event_jMenuProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarMenus;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultaCliente;
    private javax.swing.JMenuItem jMenuItemEstoque;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVendas;
    private javax.swing.JMenu jMenuOpções;
    private javax.swing.JMenuItem jMenuProduto;
    private javax.swing.JMenu jMenuRelatorios;
    // End of variables declaration//GEN-END:variables

    
}
