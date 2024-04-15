package view;

import controller.MateriaDAO;
import javax.swing.JOptionPane;
import model.Materia;

public class TelaDeAdicionarMateria extends javax.swing.JFrame {

    public static TelaDeAdicionarMateria tela;
    
    public TelaDeAdicionarMateria() {
        initComponents();
    }
    
    public static TelaDeAdicionarMateria getTela() {
        if(tela == null)
            tela = new TelaDeAdicionarMateria();
        
        tela.reiniciar();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        txtAreaDeConhecimento = new javax.swing.JLabel();
        ctAreaDeConhecimento = new javax.swing.JTextField();
        txtPeríodoEscolar = new javax.swing.JLabel();
        ctPeríodoEscolar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Cadastrar matéria");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(17, 17, 17))
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
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(!ctNome.getText().equals("") && !ctAreaDeConhecimento.getText().equals("") && !ctPeríodoEscolar.getText().equals("")){
            new MateriaDAO().cadastrarMateria(new Materia(ctNome.getText(), ctAreaDeConhecimento.getText(), Integer.parseInt(ctPeríodoEscolar.getText())));

            TelaDaListaDeMaterias.tela.gerarTabela();
            
            this.dispose();
        }else
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os espaços");
    }//GEN-LAST:event_btSalvarActionPerformed

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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
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
