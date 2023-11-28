package entity;

import control.Livro;
import entity.DAO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class CrudLivro extends DAO{
    //metodo para cadastrar livro
    public void inserir (Livro l) throws Exception{
        try{
            abrirBanco();
            //verfica se algum campo esta vazio
            if (camposValidos(l)){
            String query = "INSERT INTO livro(codigo, titulo, autor, editora, ano, paginas, idioma) VALUES (null,?,?,?,?,?,?)";
            pst=(PreparedStatement) con.prepareStatement(query);
            pst.setString(1, l.getTitulo());
            pst.setString(2, l.getAutor());
            pst.setString(3, l.getEditora());
            pst.setString(4, l.getAno());
            pst.setString(5, l.getPaginas());
            pst.setString(6, l.getIdioma());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
            }else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            }
            fecharBanco();
        }catch (Exception e){
            System.out.println("Erro " + e.getMessage());
        }
    }
    // metodo para verificar se todos os campos sao validos
    private boolean camposValidos(Livro l){
        return !l.getTitulo().isEmpty() &&
               !l.getAutor().isEmpty() &&
               !l.getEditora().isEmpty() &&
               !l.getAno().isEmpty() &&
               !l.getPaginas().isEmpty() &&
               !l.getIdioma().isEmpty();
    }
    // metodo para deletar livro
    public void deletar (Livro l) throws Exception{
        try {
        abrirBanco();
        String query = "delete from livro where codigo=?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setInt(1, l.getCodigo());
        int rowsAfetadas = pst.executeUpdate();

        if (rowsAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Livro deletado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado para deletar.");
        }

    } catch (Exception e) {
        e.printStackTrace(); // Isso imprime o rastreamento da pilha
    } finally {
        fecharBanco();
    }
    }
    // metodo listar
    public ArrayList<Livro> PesquisarTudo() throws Exception {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        try{
            abrirBanco();
            String query = "select * FROM livro";
            pst = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = pst.executeQuery();
            Livro l;
            while (tr.next()){
                l = new Livro();
                l.setCodigo(tr.getInt("codigo"));
                l.setTitulo(tr.getString("titulo"));
                l.setAutor(tr.getString("autor"));
                l.setEditora(tr.getString("editora"));
                l.setAno(tr.getString("ano"));
                l.setPaginas(tr.getString("paginas"));
                l.setIdioma(tr.getString("idioma"));
                livros.add(l);
            }
            fecharBanco();
        }catch (Exception e){
            System.out.println("Erro " + e.getMessage());
        }
        return livros;   
    }
    // metodo pesquisar livro
    public void PesquisarRegistro(Livro l) throws Exception {
        try {
            abrirBanco();
            String query = "select * FROM livro where codigo=?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setInt(1,l.getCodigo());
            ResultSet tr = pst.executeQuery();
            if (tr.next()) {
                l.setCodigo(tr.getInt("codigo"));
                l.setTitulo(tr.getString("titulo"));
                l.setAutor(tr.getString("autor"));
                l.setEditora(tr.getString("editora"));
                l.setAno(tr.getString("ano"));
                l.setPaginas(tr.getString("paginas"));
                l.setIdioma(tr.getString("idioma"));
            } else {
                JOptionPane.showMessageDialog(null,"Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
    // metodo alterar livro
    public void editarLivro(Livro l) throws Exception {
        abrirBanco();
        String query = "UPDATE livro set titulo = ?, autor = ?, editora = ?, ano = ?, paginas = ?, idioma = ? WHERE codigo = ?";
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.setString(1, l.getTitulo());
        pst.setString(2, l.getAutor());
        pst.setString(3, l.getEditora());
        pst.setString(4, l.getAno());
        pst.setString(5, l.getPaginas());
        pst.setString(6, l.getIdioma());
        pst.setInt(7, l.getCodigo());
        pst.executeUpdate();
        fecharBanco();
    }
}
