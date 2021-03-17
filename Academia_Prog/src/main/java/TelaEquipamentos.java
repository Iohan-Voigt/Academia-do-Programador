/**
 * @author iohan
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
public class TelaEquipamentos extends javax.swing.JFrame {
    
    ArrayList<Equipamentos> equipamentos;
    
    
    public TelaEquipamentos(ArrayList<Equipamentos> equipamentos) {
        
        this.equipamentos = equipamentos;
        
        initComponents();
        atualizaLista();
    }
    
    // Atualiza tela ===========================================================
    
    public void atualizaLista(){
        
        DefaultListModel<Equipamentos> dlm = new DefaultListModel<>();
        equipamentos.forEach(e ->{
            
            dlm.addElement(e);
        });
        jList_Equipamentos.setModel(dlm);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Equipamentos = new javax.swing.JList<>();
        jPanel_EdicaoDados = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel_Preco = new javax.swing.JLabel();
        jTextField_Preco = new javax.swing.JTextField();
        jLabel_NumeroSerie = new javax.swing.JLabel();
        jTextField_NumeroSerie = new javax.swing.JTextField();
        jLabel_DataFabricacao = new javax.swing.JLabel();
        jTextField_DataFabricacao = new javax.swing.JTextField();
        jLabel_Fabricante = new javax.swing.JLabel();
        jTextField_Fabricante = new javax.swing.JTextField();
        jButton_CriarEquipamento = new javax.swing.JButton();
        jButton_SalvarEdicao = new javax.swing.JButton();
        jButton_Atualizar = new javax.swing.JButton();
        jButtonExcluirSelecionado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipamentos");
        setMinimumSize(new java.awt.Dimension(700, 600));

        jList_Equipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_EquipamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_Equipamentos);

        jPanel_EdicaoDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_Nome.setText("Nome:");

        jLabel_Preco.setText("Preço de aquisição:");

        jLabel_NumeroSerie.setText("Numero de série:");

        jLabel_DataFabricacao.setText("Data de Fabricação:");

        jLabel_Fabricante.setText("Fabricante:");

        jButton_CriarEquipamento.setText("Criar equipamento");
        jButton_CriarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CriarEquipamentoActionPerformed(evt);
            }
        });

        jButton_SalvarEdicao.setText("Salvar edição");
        jButton_SalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarEdicaoActionPerformed(evt);
            }
        });

        jButton_Atualizar.setText("Atualizar");
        jButton_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtualizarActionPerformed(evt);
            }
        });

        jButtonExcluirSelecionado.setText("Excluir selecionado");
        jButtonExcluirSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSelecionadoActionPerformed(evt);
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
                        .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Fabricante)
                            .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Preco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_NumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_NumeroSerie))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_DataFabricacao)
                                    .addComponent(jTextField_DataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField_Fabricante))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                        .addComponent(jButton_CriarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_EdicaoDadosLayout.setVerticalGroup(
            jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EdicaoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nome)
                    .addComponent(jLabel_Preco)
                    .addComponent(jLabel_NumeroSerie)
                    .addComponent(jLabel_DataFabricacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_NumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Fabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel_EdicaoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CriarEquipamento)
                    .addComponent(jButton_SalvarEdicao)
                    .addComponent(jButton_Atualizar)
                    .addComponent(jButtonExcluirSelecionado))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_BackgroundLayout = new javax.swing.GroupLayout(jPanel_Background);
        jPanel_Background.setLayout(jPanel_BackgroundLayout);
        jPanel_BackgroundLayout.setHorizontalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel_EdicaoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_BackgroundLayout.setVerticalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_EdicaoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Botão para criar novo equipamento =======================================
    private void jButton_CriarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CriarEquipamentoActionPerformed
        if(jTextField_Nome.getText().length() != 0 & jTextField_NumeroSerie.getText().length() != 0 & jTextField_Fabricante.getText().length() != 0 & jTextField_Preco.getText().length() != 0 & jTextField_DataFabricacao.getText().length() != 0){
            equipamentos.add(new Equipamentos(jTextField_Nome.getText(),
                                       jTextField_NumeroSerie.getText(),
                                         jTextField_Fabricante.getText(),
                                             Float.parseFloat(jTextField_Preco.getText()),
                                      jTextField_DataFabricacao.getText()));
        } 
        atualizaLista();
    }//GEN-LAST:event_jButton_CriarEquipamentoActionPerformed

    
    
    // Botão para salvar a edição ==============================================
    private void jButton_SalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarEdicaoActionPerformed
        
        // previne erros caso não seja selecionado variáveis no jList ==========
        
        if(jList_Equipamentos.getSelectedValue() != null){
        
            Equipamentos auxEquipamentos = (Equipamentos) jList_Equipamentos.getSelectedValue();
            auxEquipamentos.setNome(jTextField_Nome.getText());
            auxEquipamentos.setNumeroSerie(jTextField_NumeroSerie.getText());
            auxEquipamentos.setFabricante(jTextField_Fabricante.getText());
            auxEquipamentos.setPreco(Float.parseFloat(jTextField_Preco.getText()));
            auxEquipamentos.setDataFabricacao(jTextField_DataFabricacao.getText());
            atualizaLista();

            // Limpa os campos =====================================================

            jTextField_Nome.setText("");
            jTextField_NumeroSerie.setText("");
            jTextField_Fabricante.setText("");
            jTextField_Preco.setText("");
            jTextField_DataFabricacao.setText("");
        }
        
    }//GEN-LAST:event_jButton_SalvarEdicaoActionPerformed

        // Botão para atualizar a tela =========================================
        
    private void jButton_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtualizarActionPerformed
        
        atualizaLista();
        jTextField_Nome.setText("");
        jTextField_NumeroSerie.setText("");
        jTextField_Fabricante.setText("");
        jTextField_Preco.setText("");
        jTextField_DataFabricacao.setText("");
        
    }//GEN-LAST:event_jButton_AtualizarActionPerformed

        // Botão para excluir o selecioando ====================================
    
    private void jButtonExcluirSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSelecionadoActionPerformed
        
        Equipamentos auxEquipamentos = (Equipamentos) jList_Equipamentos.getSelectedValue();
        equipamentos.remove(auxEquipamentos);
        atualizaLista();
        
    }//GEN-LAST:event_jButtonExcluirSelecionadoActionPerformed

    // preencher os campos quando clica na lista ===============================
    
    private void jList_EquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_EquipamentosMouseClicked
        
        jTextField_Nome.setText(jList_Equipamentos.getSelectedValue().getNome());
        jTextField_NumeroSerie.setText(jList_Equipamentos.getSelectedValue().getNumeroSerie());
        jTextField_Fabricante.setText(jList_Equipamentos.getSelectedValue().getFabricante());
        jTextField_Preco.setText(Float.toString(jList_Equipamentos.getSelectedValue().getPreco()));
        jTextField_DataFabricacao.setText(jList_Equipamentos.getSelectedValue().getDataFabricacao());
        
        
    }//GEN-LAST:event_jList_EquipamentosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluirSelecionado;
    private javax.swing.JButton jButton_Atualizar;
    private javax.swing.JButton jButton_CriarEquipamento;
    private javax.swing.JButton jButton_SalvarEdicao;
    private javax.swing.JLabel jLabel_DataFabricacao;
    private javax.swing.JLabel jLabel_Fabricante;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_NumeroSerie;
    private javax.swing.JLabel jLabel_Preco;
    private javax.swing.JList<Equipamentos> jList_Equipamentos;
    private javax.swing.JPanel jPanel_Background;
    private javax.swing.JPanel jPanel_EdicaoDados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_DataFabricacao;
    private javax.swing.JTextField jTextField_Fabricante;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_NumeroSerie;
    private javax.swing.JTextField jTextField_Preco;
    // End of variables declaration//GEN-END:variables
}
