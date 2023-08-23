package br.com.controle;

public class Vendas {
    private double valor;       //qnd coloca visibilidade vira atributo 
    private int parcelas;       //atributo
            double valorFinal;  //variavel

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    public double calcular(){
        if (this.parcelas <= 1){
            valorFinal = this.valor - (this.valor*0.1);
        } else if ((this.parcelas > 1)&&(this.parcelas<=3)){
            valorFinal = this.valor + (this.valor*0.05);
        } else if (this.parcelas > 3){
            valorFinal = this.valor +(this.valor*0.1);
        }
        return valorFinal;
    }
            
}
