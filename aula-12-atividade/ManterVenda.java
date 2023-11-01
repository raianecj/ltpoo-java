package entidade;

import controle.Venda;
import java.sql.PreparedStatement;

public class ManterVenda extends DAO{
    public void inserir(Venda v) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO venda(codigo,valor,nomevendedor,desconto) "
            + "values(null,?,?,?)";
    pst=(PreparedStatement) con.prepareStatement(query);
    pst.setDouble(1, v.getValor());
    pst.setString(2,v.getNomeVendedor());
    pst.setDouble(3,v.getDesconto());
    pst.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
    }
}
