package br.com.controle;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraAlturas {
	private List<Pessoa> pessoas;

    public CalculadoraAlturas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public double calcularMaiorAltura() {
        double maiorAltura = Double.MIN_VALUE;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            }
        }
        return maiorAltura;
    }

    public double calcularMenorAltura() {
        double menorAltura = Double.MAX_VALUE;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAltura() < menorAltura) {
                menorAltura = pessoa.getAltura();
            }
        }
        return menorAltura;
    }

    public double calcularMediaAlturaHomens() {
        int countHomens = 0;
        double somaAlturaHomens = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("m")) {
                countHomens++;
                somaAlturaHomens += pessoa.getAltura();
            }
        }

        if (countHomens == 0) {
            return 0;
        }

        return somaAlturaHomens / countHomens;
    }

    public int contarMulheres() {
        int countMulheres = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("f")) {
                countMulheres++;
            }
        }
        return countMulheres;
    }
}
