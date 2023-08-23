
package br.com.view;

import br.com.control.Consumo;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
    Consumo c = new Consumo();
    c.setKmInicial(Integer.valueOf(JOptionPane.showInputDialog("Digite o km inicial")));
    c.setKmFinal(Integer.valueOf(JOptionPane.showInputDialog("Digite o km final")));
    c.setLitros(Integer.valueOf(JOptionPane.showInputDialog("Litros")));
    JOptionPane.showMessageDialog(null, "O consumo médio foi "+c.calcularConsumo());
    }
}
