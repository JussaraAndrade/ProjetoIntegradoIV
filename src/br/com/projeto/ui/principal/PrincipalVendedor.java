package br.com.projeto.ui.principal;


import br.com.projeto.ui.clientes.TelaCadastrarCliente;
import br.com.projeto.ui.clientes.TelaConsultaCliente;
import br.com.projeto.ui.gerente.TelaConsultaProduto;
import br.com.projeto.ui.login.TelaLogin;
import br.com.projeto.ui.venda.TelaClienteVenda;
import br.com.projeto.ui.venda.TelaConsultaProdutos;
import java.awt.Dimension;
import javax.swing.JInternalFrame;




/**
 *
 * @author Jussara Andrade
 */
public class PrincipalVendedor extends javax.swing.JFrame {
    //Cadastrar cliente 
    private TelaCadastrarCliente cadastrarCliente = null; 
    //Consultar Cliente Botão Editar e Excluir
    private TelaConsultaCliente consultaCliente = null;
    //Cliente vendas 
    private TelaClienteVenda vendasCliente = null;
    //Consultar Tabela Gerente PRODUTO EDTIAR E EXCLUIR
    private TelaConsultaProduto Consultaproduto = null;
    //Login de Vendas de Usuario
    private TelaLogin login = null;
    //Tela consultar cliente sem Editar e Excluir
    private TelaConsultaProdutos tabelaProduto= null;
    
    /**
     * Creates new form CadastroCliente
     */
    public PrincipalVendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        
             
    }    
    
    //Métodos de acesso para os formulários abertos pela tela principal
    public TelaCadastrarCliente getCadastrarCliente() {
        return cadastrarCliente;
    }

    public void setCadastrarCliente(TelaCadastrarCliente cadastrarCliente) {
        this.cadastrarCliente = cadastrarCliente;
    }

    public TelaConsultaCliente getConsultarClientes() {
        return consultaCliente;
    }

    public void setConsultarClientes(TelaConsultaCliente consultaCliente) {
        this.consultaCliente = consultaCliente;
    }   
    public TelaConsultaProduto getConsultaGerente() {
        return Consultaproduto;
    }

    public void setConsultarGerente(TelaConsultaProduto Consultaproduto) {
        this.Consultaproduto = Consultaproduto;  
    }    
     public TelaClienteVenda getClienteVenda() {
        return vendasCliente;
    }

    public void setClienteVenda(TelaClienteVenda vendasCliente) {
        this.vendasCliente = vendasCliente;    
      }    
     public TelaLogin getLogin() {
        return login;
    }

    public void setLogin(TelaLogin login) {
        this.login = login;     
    }
         public TelaConsultaProdutos getConsultaProduto() {
        return tabelaProduto;
    }

    public void setCadastrarCliente(TelaConsultaProdutos tabelaProduto) {
        this.tabelaProduto = tabelaProduto;
    
    
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsulta = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

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

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/32x32 Tamanho Estoque 1.png"))); // NOI18N
        jMenuItem4.setText("Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItem4);

        jMenuBar1.add(jMenuConsulta);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48 Tamanho Opções.png"))); // NOI18N
        jMenu4.setText("Opções");

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
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
     //Chama a janela TelaCadastrarCliente 
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new TelaCadastrarCliente();
            desktop.add(cadastrarCliente);
            this.openFrameInCenter(cadastrarCliente);
        }
        cadastrarCliente.toFront();
        
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
         
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendaActionPerformed
        
    }//GEN-LAST:event_jMenuVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if (vendasCliente == null || !vendasCliente.isDisplayable()) {
                 vendasCliente = new TelaClienteVenda();
                 desktop.add(vendasCliente);
                 this.openFrameInCenter(vendasCliente);
        }
        vendasCliente.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       this.dispose();
      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaActionPerformed
         if(consultaCliente == null || !consultaCliente.isDisplayable()){
            consultaCliente = new TelaConsultaCliente();
            desktop.add(consultaCliente);
            this.openFrameInCenter(consultaCliente);
      
       }
         consultaCliente.toFront();
    

    }//GEN-LAST:event_jMenuItemConsultaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(tabelaProduto== null || !tabelaProduto.isDisplayable()){
        tabelaProduto = new TelaConsultaProdutos();
        desktop.add(tabelaProduto);
        this.openFrameInCenter(tabelaProduto);
      
       }
         tabelaProduto.toFront();
         
    }
         
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    
    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemConsulta;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JMenuItem menuCadastrarCliente;
    // End of variables declaration//GEN-END:variables
}
