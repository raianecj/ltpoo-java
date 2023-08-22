package br.com.controle;

public class Calculos {
    private double valor;
            int parcelas;
            double valorFinal;

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
        if (parcelas == 1){
            valorFinal = this.valor - (this.valor*0.1);
        } else if ((parcelas > 1)&&(parcelas<=3)){
            valorFinal = this.valor + (this.valor*0.05);
        } else if (parcelas > 3){
            valorFinal = this.valor +(this.valor*0.1);
        }
        return valorFinal;
    }

}
