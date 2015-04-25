package com.company;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by joaovitor on 4/23/15.
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String apelido;
    private Dependente dependente;
    private HashSet hashSetDependentes;

    public Cliente(String nome, String endereco, String apelido, Dependente dependente){
        this.nome = nome;
        this.endereco = endereco;
        this.apelido = apelido;
        this.dependente = dependente;
        this.hashSetDependentes = new HashSet<Dependente>();
    }

    public void addDependente(Dependente dependente){
        hashSetDependentes.add(dependente);
    }

    public void removeDependente(Dependente dependente){
        hashSetDependentes.remove(dependente);
    }

    public HashSet<Dependente> getHashDependente(){
        return hashSetDependentes;
    }

    public void imprimeDependentes(){
        Dependente aux;
        Iterator iterator = hashSetDependentes.iterator();
        while (iterator.hasNext())
            System.out.print( ((Dependente) iterator.next()).getNomeDep() + ", " );
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public void unsetDependente(){
        this.dependente = null;
    }
}
