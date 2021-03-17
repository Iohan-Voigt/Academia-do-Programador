/**
 * @author iohan
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
public class TelaChamados extends javax.swing.JFrame {
    
    ArrayList<Chamados> chamados;
    
    
    public TelaChamados(ArrayList<Chamados> chamados) {
        this.chamados = chamados;
        initComponents();
        atualizaLista();
       
    }
    
    // Atualizar a lista =======================================================
    public void atualizaLista(){
        DefaultListModel<Chamados> dlm = new DefaultListModel<>();
        chamados.forEach(c ->{
            dlm.addElement(c);
        });
        jList_Chamados.setModel(dlm);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jScrollPane_listaChamados = new javax.swing.JScrollPane();
        jList_Chamados = new javax.swing.JList<>();
        jPanel_EdicaoDados = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Descricao = new javax.swing.JLabel();
        jLabel_Equipamento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Titulo = new javax.swing.JTextField();
        jTextField_DataAbertura = new javax.swing.JTextField();
        jTextField_Equipamento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Descricao = new javax.swing.JTextArea();
        jButton_CriarChamado = new javax.swing.JButton();
        jButton_SalvarEdicao = new javax.swing.JButton();
        jButton_ExcluirSelecionado = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chamados");
        setMinimumSize(new java.awt.Dimension(700, 600));

        jList_Chamados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList_Chamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ChamadosMouseClicked(evt);
            }
        });
        jScrollPane_listaChamados.setViewportView(jList_Chamados);

        jPanel_EdicaoDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel_Titulo.setText("Título:");

        jLabel_Descricao.setText("Descrição:");

        jLabel_Equipamento.setText("Equipamento:");

        jLabel1.setText("Data da abertura:");

        jTextArea_Descricao.setColumns(20);
        jTextArea_Descricao.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Descricao);

        jButton_CriarChamado.setText("Criar chamado");
        jButton_CriarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CriarChamadoActionPerformed(evt);
            }
        });

        jButton_SalvarEdicao.setText("Salvar edição");
        jButton_SalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarEdicaoActionPerformed(evt);
            }
        });

        jButton_ExcluirSelecionado.setText("Excluir selecionado");
        jButton_ExcluirSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirSelecionadoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_EdicaoDadosLayout = new javax.swing.GroupLayout(jPanel_EdicaoDados);
        jPanel_EdicaoDados.setLayout(jPanel_EdicaoDadosLayout);
        jPanel_EdicaoDadosLayout.setHorizontalGroup(
            jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jTextField_Equipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_DataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Titulo)
                            .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                                .addComponent(jLabel_Titulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jLabel_Equipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jLabel_Descricao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jButton_CriarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_ExcluirSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel_EdicaoDadosLayout.setVerticalGroup(
            jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Equipamento)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Equipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CriarChamado)
                    .addComponent(jButton_SalvarEdicao)
                    .addComponent(jButton_ExcluirSelecionado)
                    .addComponent(jButtonAtualizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_listaChamados)
            .addComponent(jPanel_EdicaoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jScrollPane_listaChamados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_EdicaoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Botão para criar chamado ================================================
    
    private void jButton_CriarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CriarChamadoActionPerformed
        
        // não deixa criar chamados vazios =====================================

        if(jTextField_Titulo.getText().length() != 0 & jTextArea_Descricao.getText().length() != 0 & jTextField_Equipamento.getText().length() != 0 & jTextField_DataAbertura.getText().length() != 0){
        chamados.add(new Chamados(jTextField_Titulo.getText(),
                                     jTextArea_Descricao.getText(),
                                    jTextField_Equipamento.getText(),
                                   jTextField_DataAbertura.getText()));
        }
        atualizaLista();
    }//GEN-LAST:event_jButton_CriarChamadoActionPerformed
    
    // Botão para salvar a edição realizada ====================================
    
    private void jButton_SalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarEdicaoActionPerformed
        
        // previne erros caso não seja selecionado variáveis no jList ==========
        
        if(jList_Chamados.getSelectedValue() != null){
            Chamados auxChamados = (Chamados) jList_Chamados.getSelectedValue();
            auxChamados.setTituloChamado(jTextField_Titulo.getText());
            auxChamados.setEquipamento(jTextField_Equipamento.getText());
            auxChamados.setDescricao(jTextArea_Descricao.getText());
            auxChamados.setDataAbertura(jTextField_DataAbertura.getText());
            System.out.println(auxChamados);
            atualizaLista();

            // Limpa os campos =================================================

            jTextField_Titulo.setText("");
            jTextField_DataAbertura.setText("");
            jTextField_Equipamento.setText("");
            jTextArea_Descricao.setText("");
        }
    }//GEN-LAST:event_jButton_SalvarEdicaoActionPerformed
    
    // Botão para atualizar a lista ============================================
    
    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        
        atualizaLista();
        jTextField_Titulo.setText("");
        jTextField_DataAbertura.setText("");
        jTextField_Equipamento.setText("");
        jTextArea_Descricao.setText("");
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    
    // botão que exclui o Selecionado
    private void jButton_ExcluirSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirSelecionadoActionPerformed
        
        Chamados auxChamados = (Chamados) jList_Chamados.getSelectedValue();
        chamados.remove(auxChamados);
        atualizaLista();
        
    }//GEN-LAST:event_jButton_ExcluirSelecionadoActionPerformed

    // preencher os campos quando clica na lista ===============================
    
    private void jList_ChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ChamadosMouseClicked
        
        jTextField_Titulo.setText(jList_Chamados.getSelectedValue().getTituloChamado());
        jTextField_Equipamento.setText(jList_Chamados.getSelectedValue().getEquipamento());
        jTextArea_Descricao.setText(jList_Chamados.getSelectedValue().getDescricao());
        jTextField_DataAbertura.setText(jList_Chamados.getSelectedValue().getDataAbertura());
        
    }//GEN-LAST:event_jList_ChamadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButton_CriarChamado;
    private javax.swing.JButton jButton_ExcluirSelecionado;
    private javax.swing.JButton jButton_SalvarEdicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_Equipamento;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JList<Chamados> jList_Chamados;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanel_EdicaoDados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane_listaChamados;
    private javax.swing.JTextArea jTextArea_Descricao;
    private javax.swing.JTextField jTextField_DataAbertura;
    private javax.swing.JTextField jTextField_Equipamento;
    private javax.swing.JTextField jTextField_Titulo;
    // End of variables declaration//GEN-END:variables
}
