package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.AlunoDAO;
import model.Aluno;

public class TelaDaListaDeAlunos extends javax.swing.JFrame {

    public static TelaDaListaDeAlunos tela;
    
    public TelaDaListaDeAlunos() {
        initComponents();
    }
    
    public static TelaDaListaDeAlunos getTela() {
        if(tela == null)
            tela = new TelaDaListaDeAlunos();
        
        
        tela.gerarTabela();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaDeAlunos = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Lista de Alunos");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tblListaDeAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Período", "Ano de ingresso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaDeAlunos);
        if (tblListaDeAlunos.getColumnModel().getColumnCount() > 0) {
            tblListaDeAlunos.getColumnModel().getColumn(0).setResizable(false);
            tblListaDeAlunos.getColumnModel().getColumn(1).setResizable(false);
            tblListaDeAlunos.getColumnModel().getColumn(2).setResizable(false);
        }

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            this.dispose();
        
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        String nome = JOptionPane.showInputDialog("Nome do aluno");
        
        if(nome != null && new AlunoDAO().excluirAluno(nome)){
            this.gerarTabela();
            
            JOptionPane.showMessageDialog(rootPane, "Aluno excluido com sucesso");
        }else
            JOptionPane.showMessageDialog(rootPane, "Aluno não existente");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        TelaDeAdicionarAluno.getTela().setVisible(true);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        String nome = JOptionPane.showInputDialog("Nome do aluno");
        Aluno alunoExiste = new AlunoDAO().encontrarAluno(nome);
        
        if(nome != null && alunoExiste != null){
            TelaDeAlterarAluno.getTela(nome, alunoExiste).setVisible(true);
        }else
            JOptionPane.showMessageDialog(rootPane, "Aluno não existente");
    }//GEN-LAST:event_btAlterarActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblListaDeAlunos.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Aluno a: new AlunoDAO().exibirAlunos()){
            modelo.insertRow(posicaoDaLinha, new Object []{a.getNome(), a.getPeriodoEscolar(), a.getAnoDeIngresso()});
            
            posicaoDaLinha ++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTable tblListaDeAlunos;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
