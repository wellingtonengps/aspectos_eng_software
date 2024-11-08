package org.example;

public class Pessoa {
    private double peso;
    private double altura;
    private char sexo;

    public Pessoa(double peso, double altura, char sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String calcularImc() {
        double imc = peso / (altura * altura);

        if (sexo == 'F') {
            if (imc < 19.1) return "Abaixo do peso";
            else if (imc < 25.8) return "Peso normal";
            else if (imc < 27.3) return "Marginalmente acima do peso";
            else if (imc < 32.3) return "Acima do peso ideal";
            else return "Obeso";
        } else if (sexo == 'M') {
            if (imc < 20.7) return "Abaixo do peso";
            else if (imc < 26.4) return "Peso normal";
            else if (imc < 27.8) return "Marginalmente acima do peso";
            else if (imc < 31.1) return "Acima do peso ideal";
            else return "Obeso";
        } else {
            throw new IllegalArgumentException("Sexo inválido. Use 'M' ou 'F'.");
        }
    }
}
