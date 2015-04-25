package com.company;

/**
 * Created by joaovitor on 4/23/15.
 */
public class Dependente {
    private String nomeDep;
    private double numero;

    public Dependente(String nomeDep, double numero){
        this.nomeDep = nomeDep;
        this.numero = numero;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public double getNumero() {
        return numero;
    }
}
