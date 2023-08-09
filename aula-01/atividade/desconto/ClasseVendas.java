package br.com.desconto;

public class ClasseVendas {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int calcularDesconto(){
        if (valor < 500){
            return this.valor*5/100;
        } else
        return this.valor*10/100;
            
    }
}
