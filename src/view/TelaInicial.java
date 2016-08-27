
package view;

/**
 *
 * @author Vinícius Fernandes
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonCadastros = new javax.swing.JButton();
        jButtonElabCardapios = new javax.swing.JButton();
        jButtonRelatQuantit = new javax.swing.JButton();
        jButtonRelatNutricionais = new javax.swing.JButton();
        jLabelLogotipo = new javax.swing.JLabel();
        jLabelLogomarca = new javax.swing.JLabel();
        jLabelImgameFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanelBotoes.setOpaque(false);

        jButtonCadastros.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCadastros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_cadastros.png"))); // NOI18N
        jButtonCadastros.setText("Realizar Cadastros");
        jButtonCadastros.setToolTipText("Realizar Cadastros");
        jButtonCadastros.setBorder(null);
        jButtonCadastros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrosActionPerformed(evt);
            }
        });

        jButtonElabCardapios.setBackground(new java.awt.Color(0, 100, 0));
        jButtonElabCardapios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonElabCardapios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonElabCardapios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_elabCardapios.png"))); // NOI18N
        jButtonElabCardapios.setText("Elaborar Cardápios");
        jButtonElabCardapios.setToolTipText("Elaborar Cardápios");
        jButtonElabCardapios.setBorder(null);
        jButtonElabCardapios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonElabCardapios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonElabCardapios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElabCardapiosActionPerformed(evt);
            }
        });

        jButtonRelatQuantit.setBackground(new java.awt.Color(0, 100, 0));
        jButtonRelatQuantit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRelatQuantit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRelatQuantit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_relat_quant.png"))); // NOI18N
        jButtonRelatQuantit.setText("Relatórios Quantitativos");
        jButtonRelatQuantit.setToolTipText("Relatórios Quantitativos");
        jButtonRelatQuantit.setBorder(null);
        jButtonRelatQuantit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelatQuantit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonRelatQuantit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatQuantitActionPerformed(evt);
            }
        });

        jButtonRelatNutricionais.setBackground(new java.awt.Color(0, 100, 0));
        jButtonRelatNutricionais.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRelatNutricionais.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRelatNutricionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_relat_nutricionais_converted.png"))); // NOI18N
        jButtonRelatNutricionais.setText("Relatórios Nutricionais");
        jButtonRelatNutricionais.setToolTipText("Relatórios Nutricionais");
        jButtonRelatNutricionais.setBorder(null);
        jButtonRelatNutricionais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelatNutricionais.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonRelatNutricionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatNutricionaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonElabCardapios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRelatQuantit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRelatNutricionais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jButtonCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonElabCardapios, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRelatQuantit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRelatNutricionais, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelBotoes);
        jPanelBotoes.setBounds(440, 0, 320, 460);

        jLabelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logotipo_maca.png"))); // NOI18N
        getContentPane().add(jLabelLogotipo);
        jLabelLogotipo.setBounds(60, 40, 300, 280);

        jLabelLogomarca.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelLogomarca.setText("nutriSystem");
        getContentPane().add(jLabelLogomarca);
        jLabelLogomarca.setBounds(130, 310, 221, 30);

        jLabelImgameFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_Tela_Inicial.png"))); // NOI18N
        jLabelImgameFundo.setText("jLabel1");
        jLabelImgameFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabelImgameFundo);
        jLabelImgameFundo.setBounds(0, 0, 760, 460);

        setSize(new java.awt.Dimension(766, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrosActionPerformed
        new TelaCadastros().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrosActionPerformed

    private void jButtonElabCardapiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElabCardapiosActionPerformed
        new TelaElabCardapios().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonElabCardapiosActionPerformed

    private void jButtonRelatQuantitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatQuantitActionPerformed
        new TelaRelatQuantit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRelatQuantitActionPerformed

    private void jButtonRelatNutricionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatNutricionaisActionPerformed
        new TelaRelatNutricionais().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRelatNutricionaisActionPerformed

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
    private javax.swing.JButton jButtonCadastros;
    private javax.swing.JButton jButtonElabCardapios;
    private javax.swing.JButton jButtonRelatNutricionais;
    private javax.swing.JButton jButtonRelatQuantit;
    private javax.swing.JLabel jLabelImgameFundo;
    private javax.swing.JLabel jLabelLogomarca;
    private javax.swing.JLabel jLabelLogotipo;
    private javax.swing.JPanel jPanelBotoes;
    // End of variables declaration//GEN-END:variables
}
