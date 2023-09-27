package br.com.controle;

public class Dados {
    private double altura;
    private int sexo;
            double maior = 0.0;
            double menor = 9999.9; 
            int qtdh; //quantidade altura
            double somah; //soma altura

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if(this.altura > maior){
            maior = this.altura;
        }
        if(this.altura < menor){
            menor = this.altura;
        }
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
        if(this.sexo == 1){
            qtdh++;
            somah+=this.altura;
        }
    }
    public double getMedia(){
        return somah/qtdh;
    }
    public double getMaior(){
        return maior;
    }
    public double getMenor(){
        return menor;
    }
    
}
