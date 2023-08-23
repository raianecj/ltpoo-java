package br.com.visao;

import br.com.controle.Vendas;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        Vendas v = new Vendas();
        v.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da venda")));  
        v.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de parcelas")));  
        JOptionPane.showMessageDialog(null, "Novo valor é R$"+v.calcular());
    }
}
