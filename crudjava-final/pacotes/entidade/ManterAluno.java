/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import controle.Aluno;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author jes73
 */
public class ManterAluno extends DAO{
    public void inserir(Aluno a) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO aluno(codigo,nome,email) "
            + "values(null,?,?)";
    pst=(PreparedStatement) con.prepareStatement(query);
    pst.setString(1, a.getNome());
    pst.setString(2,a.getEmail());
    pst.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
    }
    
    //listando Alunos
            public ArrayList<Aluno> PesquisarTudo () throws Exception {
       ArrayList<Aluno> alunos = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select codigo, nome FROM aluno";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Aluno a ;
         while (tr.next()){               
           a = new Aluno();
           a.setCodigo(tr.getInt("codigo"));
           a.setNome(tr.getString("nome"));
           alunos.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return alunos;
     }
  // pesquisar aluno          
  public void PesquisarRegistro(Aluno a) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM aluno where codigo=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1, a.getCodigo());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                a.setCodigo(tr.getInt("codigo"));
                a.setNome(tr.getString("nome"));
                a.setEmail(tr.getString("email"));
            } else {
              //  JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado! ");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }    
  // alterar aluno
  public void editarAluno(Aluno a) throws Exception {
        abrirBanco();
        //JOptionPane.showMessageDialog(null, a.getNome()+ a.getEmail() + a.getIdade());
        String query = "UPDATE aluno set nome = ?,email = ? where codigo=?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, a.getNome());
        pst.setString(2, a.getEmail());
        pst.setInt(3, a.getCodigo());
        pst.executeUpdate();
        fecharBanco();
    }
            
}
