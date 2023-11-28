package view;

import control.Livro;
import entity.CrudLivro;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Raiane
 */
public class CadastrarLivro extends javax.swing.JFrame {   
    public CadastrarLivro() {
        initComponents();
    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelBiblioteca = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelEdicao = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jTtitulo = new javax.swing.JTextField();
        jTautor = new javax.swing.JTextField();
        jTeditora = new javax.swing.JTextField();
        jTano = new javax.swing.JTextField();
        jBcadastrar = new javax.swing.JButton();
        jBdeletar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTlivros = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBimprimirLista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTpaginas = new javax.swing.JTextField();
        jTidioma = new javax.swing.JTextField();
        jBpesquisar = new javax.swing.JButton();
        jLcodigo = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBiblioteca.setText("Estante Virtual Hi");

        jLabelTitulo.setText("Titulo:");

        jLabelAutor.setText("Autor:");

        jLabelEdicao.setText("Editora:");

        jLabelAno.setText("Ano:");

        jTtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtituloActionPerformed(evt);
            }
        });

        jTeditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeditoraActionPerformed(evt);
            }
        });

        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jBdeletar.setText("Deletar");
        jBdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeletarActionPerformed(evt);
            }
        });

        jTlivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Editora", "Ano", "Paginas", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTlivros);

        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBimprimirLista.setText("Imprimir Tudo");
        jBimprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBimprimirListaActionPerformed(evt);
            }
        });

        jLabel1.setText("Paginas:");

        jLabel2.setText("Idioma:");

        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jLcodigo.setText("Digite o código para pesquisar:");

        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBpesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBcadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBdeletar))
                    .addComponent(jLabelBiblioteca)
                    .addComponent(jBimprimirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelAutor)
                            .addComponent(jLabelEdicao)
                            .addComponent(jLabelAno)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTautor)
                            .addComponent(jTeditora)
                            .addComponent(jTpaginas)
                            .addComponent(jTano)
                            .addComponent(jTtitulo)
                            .addComponent(jTidioma, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(jTautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdicao)
                    .addComponent(jTeditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAno)
                    .addComponent(jTano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTpaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcadastrar)
                    .addComponent(jBalterar)
                    .addComponent(jBdeletar)
                    .addComponent(jLcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jBimprimirLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTtituloActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTeditoraActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Livro l = new Livro();
        l.setTitulo(jTtitulo.getText());
        l.setAutor(jTautor.getText());
        l.setEditora(jTeditora.getText());
        l.setAno(jTano.getText());
        l.setPaginas(jTpaginas.getText());
        l.setIdioma(jTidioma.getText());
        CrudLivro dao = new CrudLivro();
        try{   
            dao.inserir(l);
            limparFormulario(); // limpa o formulario apos cadastrar
        }catch (Exception ex){
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                           

    //Metodo para limpar o formulario
    private void limparFormulario(){
        jTtitulo.setText("");
        jTautor.setText("");
        jTeditora.setText("");
        jTano.setText("");
        jTpaginas.setText("");
        jTidioma.setText("");
    }
    
    private void jBdeletarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Livro l = new Livro();
        l.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o código do livro que deseja excluir: ")));
        CrudLivro dao = new CrudLivro();
        try {
            dao.deletar(l);
        } catch (Exception ex){
            Logger.getLogger(CadastrarLivro.class.getName()).log(Level.SEVERE,null,ex);
        }
    }                                         

    private void jBimprimirListaActionPerformed(java.awt.event.ActionEvent evt) {                                                

        try {
            Livro l = new Livro();
            CrudLivro dao = new CrudLivro();
            DefaultTableModel livropesque = (DefaultTableModel)jTlivros.getModel();
            {
                livropesque.setRowCount(0); //Limpa o modelo da tabela antes de adicionar novas linhas
                ArrayList<Livro>livros = dao.PesquisarTudo();
                for(int i = 0; i < livros.size(); i++){
                    l = livros.get(i);
                    livropesque.addRow(new Object[]{l.getCodigo(),l.getTitulo(),l.getAutor(),l.getEditora(),l.getAno(),l.getPaginas(),l.getIdioma()});
                }
            }
        }catch (Exception e){
            System.out.println("Erro " + e.getMessage());
        }
    }                                               

    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            Livro l = new Livro();
            CrudLivro dao = new CrudLivro();
           // l.setCodigo(Integer.valueOf(JOptionPane.showInputDialog("Digite o código do livro: ")));
            l.setCodigo(Integer.valueOf(jTcodigo.getText()));
            dao.PesquisarRegistro(l);
            JOptionPane.showMessageDialog(null, l.getTitulo());
            jTtitulo.setText(l.getTitulo());
            jTautor.setText(l.getAutor());
            jTeditora.setText(l.getEditora());
            jTano.setText(l.getAno());
            jTpaginas.setText(l.getPaginas());
            jTidioma.setText(l.getIdioma());
            jTcodigo.setEditable(false);
        }catch (Exception e){
            System.out.println("Erro " + e.getMessage());
        }
    }                                           

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            Livro l = new Livro();
            CrudLivro dao = new CrudLivro();
            l.setCodigo(Integer.valueOf(jTcodigo.getText()));
            l.setTitulo(jTtitulo.getText());
            l.setAutor(jTautor.getText());
            l.setEditora(jTeditora.getText());
            l.setAno(jTano.getText());
            l.setPaginas(jTpaginas.getText());
            l.setIdioma(jTidioma.getText());
            dao.editarLivro(l);
            
            jTtitulo.setText("");
            jTautor.setText("");
            jTeditora.setText("");
            jTano.setText("");
            jTpaginas.setText("");
            jTidioma.setText("");
            jTcodigo.requestFocus();
            
            JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
            limparFormulario(); // limpa o formulario apos alterar
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Erro " + e.getMessage());
        }
    }                                         

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBdeletar;
    private javax.swing.JButton jBimprimirLista;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelBiblioteca;
    private javax.swing.JLabel jLabelEdicao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTano;
    private javax.swing.JTextField jTautor;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTeditora;
    private javax.swing.JTextField jTidioma;
    private javax.swing.JTable jTlivros;
    private javax.swing.JTextField jTpaginas;
    private javax.swing.JTextField jTtitulo;
    // End of variables declaration                   
}
