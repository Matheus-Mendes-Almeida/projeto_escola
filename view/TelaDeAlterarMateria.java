package view;

import controller.MateriaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Materia;

public class TelaDeAlterarMateria extends javax.swing.JFrame {

    public static TelaDeAlterarMateria tela;
    private ArrayList<Materia> materias;
    private String nome;
    
    public TelaDeAlterarMateria() {
        initComponents();
    }
    
    public static TelaDeAlterarMateria getTela(String nome, ArrayList<Materia> materias) {
        if(tela == null)
            tela = new TelaDeAlterarMateria();
        
        tela.materias = materias;
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
        txtAreaDeConhecimento = new javax.swing.JLabel();
        ctAreaDeConhecimento = new javax.swing.JTextField();
        txtPeríodoEscolar = new javax.swing.JLabel();
        ctPeríodoEscolar = new javax.swing.JTextField();

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
        txtTitulo.setText("Atualizar cadastro da matéria");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtTitulo)
                .addContainerGap(138, Short.MAX_VALUE))
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

        txtAreaDeConhecimento.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtAreaDeConhecimento.setText("Área de Conhecimento");

        txtPeríodoEscolar.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        txtPeríodoEscolar.setText("Período Escolar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeríodoEscolar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ctPeríodoEscolar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addComponent(txtAreaDeConhecimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctAreaDeConhecimento, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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
                        .addComponent(txtAreaDeConhecimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctAreaDeConhecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeríodoEscolar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctPeríodoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if(!ctNome.getText().equals("") && !ctAreaDeConhecimento.getText().equals("") && !ctPeríodoEscolar.getText().equals("")){
            new MateriaDAO().alterarMateria(nome, ctNome.getText(), ctAreaDeConhecimento.getText(), Integer.parseInt(ctPeríodoEscolar.getText()));

            TelaDaListaDeMaterias.tela.gerarTabela();
            
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
        ctAreaDeConhecimento.setText("");
        ctPeríodoEscolar.setText("");
    }
    
    public void inserirDados(){
        for(Materia m: materias){
            if(m.getNome().equals(nome)){
                ctNome.setText(m.getNome());
                ctAreaDeConhecimento.setText(m.getAreaDeConhecimento());
                ctPeríodoEscolar.setText(Integer.toString(m.getPeriodoEscolar()));
                
                break;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctAreaDeConhecimento;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPeríodoEscolar;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtAreaDeConhecimento;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPeríodoEscolar;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
