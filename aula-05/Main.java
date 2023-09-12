// Raiane Carvalho - 202310501
// Resolução da atividade 1
package br.com.view;

import br.com.control.Calculos;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Calculos c = new Calculos();
        c.setCustoFabrica(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de custo de fabrica do carro: ")));
        c.setPcd(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para PCD e 0 para não: ")));
        JOptionPane.showMessageDialog(null,"O valor final do carro é R$"+c.calcular());
    }
    
}
