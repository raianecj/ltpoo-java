// Classe criada dentro do pacote "entidade"


package entidade;

import controle.Aluno;
import java.sql.PreparedStatement;

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
}
