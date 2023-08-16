package br.com.desconto;

public class ClasseVendas {
    private double valor;
            double desconto;

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public double calcularDesconto(){
        if (valor < 500){
            desconto = this.valor -(this.valor*0.05);
        } else if(this.valor >=500){
            desconto = this.valor - (this.valor*0.1);
        }
        return desconto;
            
    }
}
