package br.com.principal;

import br.com.desconto.ClasseVendas;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        ClasseVendas c = new ClasseVendas();
        c.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite um valor")));  
        JOptionPane.showMessageDialog(null, c.calcularDesconto());
    }
}
