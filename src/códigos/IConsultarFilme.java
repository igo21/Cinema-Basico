/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package códigos;

import java.awt.Container;
import java.security.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor Ramos
 */
public class IConsultarFilme extends javax.swing.JInternalFrame {
        private JPanel painel;
        private FPrincipal p = new FPrincipal();
        
         public static void limpaPainel(JPanel painel){
            painel.removeAll();
            painel.setVisible(true);
            painel.setVisible(false);
            painel.setVisible(true);
        }
        public void preencheJtable(String acao,String nome){
            DefaultTableModel modelo = (DefaultTableModel) tbFilme.getModel();
            ControleFilme cf= new ControleFilme();
            while(modelo.getRowCount()!=0){
                modelo.removeRow(0);
            }
            try {
                if (acao=="popular"){
                    cf.popular(modelo);
                }else{
                    cf.Consultar(nome, modelo);
                }
            } catch (SQLException ex) {
                Logger.getLogger(IConsultarFilme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    /**
     * Creates new form ConsultaFilme
     */
    public IConsultarFilme(JPanel painel) {
        this.painel=painel;
        initComponents();
        this.setLocation(0,0); 
        BasicInternalFrameUI f = (BasicInternalFrameUI) this.getUI();
        Container n = (Container) f.getNorthPane();
        n.remove(0);
        n.validate();
        n.repaint();
        this.preencheJtable("popular",null);
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFilme = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Consultar Filme");
        setPreferredSize(new java.awt.Dimension(532, 335));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbFilme.setAutoCreateRowSorter(true);
        tbFilme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Filme", "Ano", "Categoria", "Diretor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFilme.setGridColor(new java.awt.Color(255, 255, 255));
        tbFilme.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbFilme);

        btnBusca.setBackground(new java.awt.Color(255, 255, 255));
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_32-Search_2123956.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome do Filme");

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rubbish-bin.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(282, 282, 282))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBusca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir)
                            .addGap(41, 41, 41)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
        this.setLocation(0,0);
    }//GEN-LAST:event_formComponentMoved

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        String nome_filme=txtBusca.getText();
        if(nome_filme.equals("") || nome_filme.equals(" ") || nome_filme.equals("  ") || nome_filme.equals("   ")){
            this.preencheJtable("popular",null);
        }else{
            this.preencheJtable("buscar",nome_filme);
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        //excluir
        int linha = tbFilme.getSelectedRow();
         if (linha < 0) {
             DSelecioneLinha alerta = new DSelecioneLinha(this.p, rootPaneCheckingEnabled);
             alerta.setVisible(true);
        } else {
            DConfExcluir excluir = new DConfExcluir(p, rootPaneCheckingEnabled);
            excluir.setVisible(true);
            //verificação de condição onde opção de alerta foi executada para excluir um item.
            if(excluir.acao==true){
                int colId = Integer.parseInt(String.valueOf(tbFilme.getValueAt(linha, 0)));
                ControleFilme cf = new ControleFilme();
                    try {
                        cf.Excluir(colId);
                        //filme excluido com sucesso.
                        DefaultTableModel modelo = (DefaultTableModel) tbFilme.getModel();
                        // Remove a linha.
                        modelo.removeRow(linha);
                        DFilmeExcluido alerta = new DFilmeExcluido(p, rootPaneCheckingEnabled);
                        alerta.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(IConsultarFilme.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        //editar
        int linha = tbFilme.getSelectedRow();
         if (linha < 0) {
             DSelecioneLinha alerta = new DSelecioneLinha(this.p, rootPaneCheckingEnabled);
             alerta.setVisible(true);
        } else {
            Filme f = new Filme();
            int colId = Integer.parseInt(String.valueOf(tbFilme.getValueAt(linha, 0)));
            String colNome = String.valueOf(tbFilme.getValueAt(linha,1));
            String colAno = String.valueOf(tbFilme.getValueAt(linha,2));
            String colCategoria = String.valueOf(tbFilme.getValueAt(linha,3));
            String colDiretor = String.valueOf(tbFilme.getValueAt(linha,4));
            f.setId(colId);
            f.setNome(colNome);
            f.setAno(colAno);
            f.setCategoria(colCategoria);
            f.setDiretor(colDiretor);
            IEditarFilme ie = new IEditarFilme(f);
            limpaPainel(this.painel);
            this.dispose();
            ie.setVisible(true);
            this.painel.add(ie);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFilme;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
