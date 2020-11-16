/*
Exercícios de Fixação – Lista
1. Implementar uma lista de produtos. Seu programa deverá ler os dados de
vários produtos e inseri-los na lista. A classe Lista deverá ter as seguintes
funcionalidades:
- Ordenar os elementos da lista por uma determinada chave;
- Inserir elemento na lista ordenada;
- Buscar um elemento na lista;
- Retirar um elemento da lista;
- Alterar um elemento na lista. Lembre-se: não pode alterar o campo chave.
Busca pelo campo chave e altera os outros campos. Considere como campo
chave o código do produto.
Obs.: Considere que os produtos possuem código, descrição e preço;
 */
package br.app;

import br.model.Produto;
import br.model.Lista;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class ProdutoApp extends javax.swing.JFrame {

    Lista lista = new Lista(5);
    Produto produto;
    Random rd = new Random();

    /**
     * Creates new form ProdutoApp
     */
    public ProdutoApp() {
        initComponents();
        jTextAreaSaida.setLineWrap(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelListaDeProdutos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonInserirDeFormaOrdenada = new javax.swing.JButton();
        jButtonInserindoApenasElementosSemOrdenacao = new javax.swing.JButton();
        jButtonBuscarUmElementoNaLista = new javax.swing.JButton();
        jButtonRetirarUmElementoDaLista = new javax.swing.JButton();
        jButtonAlteraUmElementoDaLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPosicaoInformada = new javax.swing.JTextField();
        jButtonOrdenarAlistaDeProdutos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonExibiarAlista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estrutura de Dados - Lista Linear Exercicio 01 - Lista de Produtos Diversos");
        setResizable(false);

        jPanelListaDeProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Preço");

        jButtonInserirDeFormaOrdenada.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonInserirDeFormaOrdenada.setText("Inserir de Forma Ordenada");
        jButtonInserirDeFormaOrdenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirDeFormaOrdenadaActionPerformed(evt);
            }
        });

        jButtonInserindoApenasElementosSemOrdenacao.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonInserindoApenasElementosSemOrdenacao.setText("Inserir");
        jButtonInserindoApenasElementosSemOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserindoApenasElementosSemOrdenacaoActionPerformed(evt);
            }
        });

        jButtonBuscarUmElementoNaLista.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonBuscarUmElementoNaLista.setText("Buscar");
        jButtonBuscarUmElementoNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUmElementoNaListaActionPerformed(evt);
            }
        });

        jButtonRetirarUmElementoDaLista.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonRetirarUmElementoDaLista.setText("Retirar");
        jButtonRetirarUmElementoDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarUmElementoDaListaActionPerformed(evt);
            }
        });

        jButtonAlteraUmElementoDaLista.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonAlteraUmElementoDaLista.setText("Alterar");
        jButtonAlteraUmElementoDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlteraUmElementoDaListaActionPerformed(evt);
            }
        });

        jTextAreaSaida.setEditable(false);
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaida);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Posição");

        jButtonOrdenarAlistaDeProdutos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonOrdenarAlistaDeProdutos.setText("Ordenar a lista de Produtos por código");
        jButtonOrdenarAlistaDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarAlistaDeProdutosActionPerformed(evt);
            }
        });

        jLabel4.setText("Cod..");

        jButtonExibiarAlista.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jButtonExibiarAlista.setText("Exibir a lista de produtos");
        jButtonExibiarAlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibiarAlistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaDeProdutosLayout = new javax.swing.GroupLayout(jPanelListaDeProdutos);
        jPanelListaDeProdutos.setLayout(jPanelListaDeProdutosLayout);
        jPanelListaDeProdutosLayout.setHorizontalGroup(
            jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPosicaoInformada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOrdenarAlistaDeProdutos))
                            .addComponent(jTextFieldDescricao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaDeProdutosLayout.createSequentialGroup()
                        .addComponent(jButtonAlteraUmElementoDaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRetirarUmElementoDaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarUmElementoNaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInserindoApenasElementosSemOrdenacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInserirDeFormaOrdenada))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                        .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExibiarAlista)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanelListaDeProdutosLayout.setVerticalGroup(
            jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPosicaoInformada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrdenarAlistaDeProdutos))
                .addGap(22, 22, 22)
                .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserirDeFormaOrdenada)
                    .addComponent(jButtonInserindoApenasElementosSemOrdenacao)
                    .addComponent(jButtonBuscarUmElementoNaLista)
                    .addComponent(jButtonRetirarUmElementoDaLista)
                    .addComponent(jButtonAlteraUmElementoDaLista))
                .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanelListaDeProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanelListaDeProdutosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExibiarAlista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaDeProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaDeProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirDeFormaOrdenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirDeFormaOrdenadaActionPerformed
        // TODO add your handling code here: 
        try {
            int codigo = rd.nextInt(100) + 1;
            String descricao = jTextFieldDescricao.getText();
            double preco = Double.parseDouble(jTextFieldPreco.getText());
            produto = new Produto(codigo, descricao, preco);
            lista.inserirDeFormaOrdenada(produto);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonInserirDeFormaOrdenadaActionPerformed

    private void jButtonInserindoApenasElementosSemOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserindoApenasElementosSemOrdenacaoActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = rd.nextInt(100) + 1;
            String descricao = jTextFieldDescricao.getText();
            double preco = Double.parseDouble(jTextFieldPreco.getText());
            produto = new Produto(codigo, descricao, preco);
            lista.inserirNoInicio(produto);
            jTextAreaSaida.setText(produto.toString());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonInserindoApenasElementosSemOrdenacaoActionPerformed

    private void jButtonBuscarUmElementoNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUmElementoNaListaActionPerformed
        // TODO add your handling code here:
        try {
            jTextAreaSaida.setText(lista.getProdutoNaPosicaoInformata(Integer.parseInt(jTextFieldPosicaoInformada.getText())) + "");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        jTextFieldPosicaoInformada.requestFocus();
    }//GEN-LAST:event_jButtonBuscarUmElementoNaListaActionPerformed

    private void jButtonRetirarUmElementoDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarUmElementoDaListaActionPerformed
        // TODO add your handling code here:
        try {
            produto = new Produto();
            
            produto.setCodigo(Integer.parseInt(jTextFieldDescricao.getText()));
            System.out.println("Codigo do produto antes de chamar o método remover: " + produto.getCodigo());
            lista.removerProduto(produto);
            System.out.println(Integer.parseInt(jTextFieldDescricao.getText()));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }

        jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonRetirarUmElementoDaListaActionPerformed

    private void jButtonAlteraUmElementoDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlteraUmElementoDaListaActionPerformed
        // TODO add your handling code here:
        try {
            int codigo = Integer.parseInt(jTextFieldCodigo.getText());
            String descricao = jTextFieldDescricao.getText();
            double preco = Double.parseDouble(jTextFieldPreco.getText());
            produto = new Produto(codigo, descricao, preco);
            lista.alterarProduto(produto);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonAlteraUmElementoDaListaActionPerformed

    private void jButtonOrdenarAlistaDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarAlistaDeProdutosActionPerformed
        // TODO add your handling code here:
        try {
            lista.ordenarLista();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonOrdenarAlistaDeProdutosActionPerformed

    private void jButtonExibiarAlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibiarAlistaActionPerformed
        // TODO add your handling code here:
        try {
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.getProdutoNaPosicaoInformata(i));
                
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonExibiarAlistaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlteraUmElementoDaLista;
    private javax.swing.JButton jButtonBuscarUmElementoNaLista;
    private javax.swing.JButton jButtonExibiarAlista;
    private javax.swing.JButton jButtonInserindoApenasElementosSemOrdenacao;
    private javax.swing.JButton jButtonInserirDeFormaOrdenada;
    private javax.swing.JButton jButtonOrdenarAlistaDeProdutos;
    private javax.swing.JButton jButtonRetirarUmElementoDaLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelListaDeProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldPosicaoInformada;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}