/**
 * @author iohan
 */
import java.util.ArrayList;
import java.util.List;
public class Tela extends javax.swing.JFrame {
    
    // Arrays ==================================================================
    ArrayList<Chamados> chamados;
    ArrayList<Equipamentos> equipamentos;
    
    // Inicia a Tela ===========================================================
    
    public Tela(ArrayList<Chamados> chamados, ArrayList<Equipamentos> equipamentos) {
       
        this.equipamentos = equipamentos;
        this.chamados = chamados;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Equipamentos = new javax.swing.JButton();
        jButton_Chamados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniMenu");
        setMinimumSize(new java.awt.Dimension(540, 250));

        jButton_Equipamentos.setText("Equipamentos");
        jButton_Equipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EquipamentosActionPerformed(evt);
            }
        });

        jButton_Chamados.setText("Chamados");
        jButton_Chamados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChamadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Chamados, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Chamados, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Inicia a tela de chamados ===============================================
    
    private void jButton_ChamadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChamadosActionPerformed
        
        java.awt.EventQueue.invokeLater(()->{
            new TelaChamados(chamados).setVisible(true);
        });
        
    }//GEN-LAST:event_jButton_ChamadosActionPerformed

    // Inicia a tela de equipamentos ===========================================
    private void jButton_EquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EquipamentosActionPerformed
        
        java.awt.EventQueue.invokeLater(()->{
            new TelaEquipamentos(equipamentos).setVisible(true);
        });
        
    }//GEN-LAST:event_jButton_EquipamentosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Chamados;
    private javax.swing.JButton jButton_Equipamentos;
    // End of variables declaration//GEN-END:variables
}
