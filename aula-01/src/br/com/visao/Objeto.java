package br.com.visao;

import br.com.controle.Dobro;
import javax.swing.JOptionPane;


public class Objeto {
    public static void main(String[] args) { /* public = visivel em todo o projeto
                                              * static = primeiro metodo a ser executado
                                              * void = sem retorno
                                              * main = é executavel
                                              * string = troca mensagens entre os objetos
                                              * args = valores  */
        Dobro d = new Dobro(); // 'd' é a variavel do tipo objeto, novo apelido para o Dobro 
                               // new = é o construtor
      // quando chamar 'd' ele vai criar uma cópia de tudo que está na classe Dobro 
        d.setValor(Integer.valueOf(JOptionPane.showInputDialog("Digite um valor")));  //classe para digitar um valor //todo valor input é uma string, tem que converter para int(casting,o integer faz essa conversao)
        JOptionPane.showMessageDialog(null, d.calcularDobro()); //classe para imprimir o valor de set
        
    }
            
            
}
