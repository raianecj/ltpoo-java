// Raiane Carvalho - 202310501
// Resolução da atividade 1
package br.com.control;

public class Calculos {
    private double carroNovo;
    private double custoFabrica;
    double desconto;
    private int pcd;

    public int getPcd() {
        return pcd;
    }

    public void setPcd(int pcd) {
        this.pcd = pcd;
    }


    public double getCarroNovo() {
        return carroNovo;
    }

    public void setCarroNovo(double carroNovo) {
        this.carroNovo = carroNovo;
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getDesconto() {
        return desconto; 
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcular(){
        if (this.pcd == 1){
        carroNovo = this.custoFabrica + (this.custoFabrica* 0.28)+(this.custoFabrica*0.45);
        desconto = this.carroNovo - (this.carroNovo * 0.2);
        return desconto;
        }
        else if (this.pcd == 0){
        carroNovo = this.custoFabrica + (this.custoFabrica* 0.28)+(this.custoFabrica*0.45); 
    } return carroNovo;
    }
}

    
    
    

