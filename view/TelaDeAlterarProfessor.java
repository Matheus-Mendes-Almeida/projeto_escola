package view;

import controller.ProfessorDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Professor;

public class TelaDeAlterarProfessor extends javax.swing.JFrame {

    public static TelaDeAlterarProfessor tela;
    private ArrayList<Professor> professores;
    private String nome;
    
    public TelaDeAlterarProfessor() {
        initComponents();
    }
    
    public static TelaDeAlterarProfessor getTela(String nome, ArrayList<Professor> professores) {
        if(tela == null)
            tela = new TelaDeAlterarProfessor();
        
        tela.professores = professores;
        tela.nome = nome;
                
        tela.inserirDados();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        txtFormacao = new javax.swing.JLabel();
        ctFormacao = new javax.swing.JTextField();
        txtAreaDeAtuacao = new javax.swing.JLabel();
        ctAreaDeAtuacao = new javax.swing.JTextField();
        txtPeríodoEscolar1 = new javax.swing.JLabel();
        ctAnoDeIngresso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Atualizar cadastro do professor");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtTitulo)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(14, 14, 14))
        );

        txtNome.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtNome.setText("Nome:");

        txtFormacao.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtFormacao.setText("Formação:");

        txtAreaDeAtuacao.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtAreaDeAtuacao.setText("Área de Atuação");

        txtPeríodoEscolar1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtPeríodoEscolar1.setText("Ano de Ingresso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeríodoEscolar1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ctAnoDeIngresso, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaDeAtuacao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ctAreaDeAtuacao, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(txtFormacao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctFormacao, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAreaDeAtuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctAreaDeAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeríodoEscolar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctAnoDeIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if(!ctNome.getText().equals("") && !ctFormacao.getText().equals("") && !ctAreaDeAtuacao.getText().equals("") && !ctAnoDeIngresso.equals("")){
            new ProfessorDAO().alterarProfessor(nome, ctNome.getText(), ctFormacao.getText(), ctAreaDeAtuacao.getText(), Integer.parseInt(ctAnoDeIngresso.getText()));

            TelaDaListaDeProfessores.tela.gerarTabela();
            
            this.dispose();
        }else
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os espaços");
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            reiniciar();
            
            this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    public void reiniciar(){
        ctNome.setText("");
        ctFormacao.setText("");
        ctAreaDeAtuacao.setText("");
        ctAnoDeIngresso.setText("");
    }
    
    public void inserirDados(){
        for(Professor p: professores){
            if(p.getNome().equals(nome)){
                ctNome.setText(p.getNome());
                ctFormacao.setText(p.getFormação());
                ctAreaDeAtuacao.setText(p.getAreaDeAtuação());
                ctAnoDeIngresso.setText(Integer.toString(p.getAnoDeIngresso()));
                
                break;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctAnoDeIngresso;
    private javax.swing.JTextField ctAreaDeAtuacao;
    private javax.swing.JTextField ctFormacao;
    private javax.swing.JTextField ctNome;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtAreaDeAtuacao;
    private javax.swing.JLabel txtFormacao;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPeríodoEscolar1;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
