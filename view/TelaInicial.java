package view;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtInformação = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        topMenuArquivos = new javax.swing.JMenu();
        topMenuArquivosAlunos = new javax.swing.JMenuItem();
        topMenuArquivosProfessores = new javax.swing.JMenuItem();
        topMenuArquivosMaterias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Colégio Sólido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(21, 21, 21))
        );

        txtInformação.setText("Clique no menu acima para gerenciar");

        topMenuArquivos.setText("Arquivos");

        topMenuArquivosAlunos.setText("Alunos");
        topMenuArquivosAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenuArquivosAlunosActionPerformed(evt);
            }
        });
        topMenuArquivos.add(topMenuArquivosAlunos);

        topMenuArquivosProfessores.setText("Professores");
        topMenuArquivosProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenuArquivosProfessoresActionPerformed(evt);
            }
        });
        topMenuArquivos.add(topMenuArquivosProfessores);

        topMenuArquivosMaterias.setText("Matérias");
        topMenuArquivosMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenuArquivosMateriasActionPerformed(evt);
            }
        });
        topMenuArquivos.add(topMenuArquivosMaterias);

        jMenuBar1.add(topMenuArquivos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtInformação)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtInformação)
                .addGap(0, 228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topMenuArquivosMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenuArquivosMateriasActionPerformed
        TelaDaListaDeMaterias.getTela().setVisible(true);
    }//GEN-LAST:event_topMenuArquivosMateriasActionPerformed

    private void topMenuArquivosProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenuArquivosProfessoresActionPerformed
        TelaDaListaDeProfessores.getTela().setVisible(true);
    }//GEN-LAST:event_topMenuArquivosProfessoresActionPerformed

    private void topMenuArquivosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenuArquivosAlunosActionPerformed
        TelaDaListaDeAlunos.getTela().setVisible(true);
    }//GEN-LAST:event_topMenuArquivosAlunosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu topMenuArquivos;
    private javax.swing.JMenuItem topMenuArquivosAlunos;
    private javax.swing.JMenuItem topMenuArquivosMaterias;
    private javax.swing.JMenuItem topMenuArquivosProfessores;
    private javax.swing.JLabel txtInformação;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
