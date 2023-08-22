package br.com.visao;

import br.com.controle.Calculos;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        Calculos c = new Calculos();
        c.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da venda")));  
        c.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade de parcelas")));  
        JOptionPane.showMessageDialog(null, "Novo valor é R$"+c.calcular());
    }
}
