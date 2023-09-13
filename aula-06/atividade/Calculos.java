
package br.com.control;


public class Calculos {
    private double Gasolina = 6.3;
    private double Alcool = 5.9;
    private double Litros;
    double Total;

    public double getLitros() {
        return Litros;
    }

    public void setLitros(double Litros) {
        this.Litros = Litros;
    }

    public double getGasolina() {
        return Gasolina;
    }

    public void setGasolina(double Gasolina) {
        this.Gasolina = Gasolina;
    }

    public double getAlcool() {
        return Alcool;
    }

    public void setAlcool(double Alcool) {
        this.Alcool = Alcool;
    }
    public double calcularA(){
        if(Litros <= 20){
            Total = (this.Alcool*this.Litros)*0.03;
        }else if (Litros > 20){
            Total = (this.Alcool*this.Litros)*0.05;
        }
        return Total;
    }
    public double calcularG(){
        if(Litros <= 20){
            Total = this.Gasolina +((this.Gasolina * this.Litros)*0.04);
        }else if (Litros > 20){
            Total = this.Gasolina + ((this.Gasolina *this.Litros)*0.06);
        }
        return Total;
    }
    
}
