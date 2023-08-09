package br.com.controle;
// pacote do diagrama de classe

public class Dobro {
    private int valor;
    
    public void setValor(int valor) { //lê o valor
        this.valor = valor;
    }

    public int getValor() { //imprime o valor
        return valor;
    }
    
    public int calcularDobro(){ //public int tem retorno
        return this.valor*2;
        
    }
}
