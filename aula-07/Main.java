package br.com.visao;
import javax.swing.JOptionPane;

import br.com.controle.CalculadoraAlturas;
import br.com.controle.Pessoa;

public class Main {
	public static void main(String[] args) {
        CalculadoraAlturas calculadora = new CalculadoraAlturas();

        for (int i = 1; i <= 10; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da pessoa " + i + " em metros:"));
            String sexo = JOptionPane.showInputDialog("Informe o sexo da pessoa " + i + " (m/f):").toLowerCase();

            Pessoa pessoa = new Pessoa(altura, sexo);
            calculadora.adicionarPessoa(pessoa);
        }

        String resultado = "Maior altura do grupo: " + calculadora.calcularMaiorAltura() + " metros\n" +
                "Menor altura do grupo: " + calculadora.calcularMenorAltura() + " metros\n" +
                "Média de altura dos homens: " + calculadora.calcularMediaAlturaHomens() + " metros\n" +
                "Número de mulheres: " + calculadora.contarMulheres();

        JOptionPane.showMessageDialog(null, resultado);
    }
}
