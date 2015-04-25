package com.company;

public class Main {

    public static void main(String[] args) {

        // Exercício 2.1
        System.out.println("\n2.1\nCriando dois clientes e associando um dependente para cada um:");
        Dependente dependente1 = new Dependente("Dependente Cliente 1", 01);
        Dependente dependente2 = new Dependente("Dependente Cliente 2", 02);

        Cliente cliente = new Cliente("Cliente 1", "Rua X", "Apelido Cliente 1", dependente1);
        Cliente cliente2 = new Cliente("Cliente 2", "Rua Y", "Apelido Cliente 2", dependente2);

        System.out.println("Cliente: " + cliente.getApelido() + " -> " + cliente.getDependente().getNomeDep());
        System.out.println("Cliente: " + cliente2.getApelido() + " -> " + cliente2.getDependente().getNomeDep());

        // Exercício 2.2
        System.out.println("\n2.2\nDesassociando dependente de um cliente");
        cliente2.unsetDependente();
        System.out.println("Cliente: " + cliente.getApelido() + " -> " + cliente.getDependente().getNomeDep());
        System.out.println("Cliente: " + cliente2.getApelido() + " -> " + cliente2.getDependente());

        // Exercício 2.3
        System.out.println("\n2.3\nCriando dois clientes com dependentes igual a null");
        Cliente cliente3 = new Cliente("Cliente 3", "Rua X", "Apelido Cliente 3", null);
        Cliente cliente4 = new Cliente("Cliente 4", "Rua X", "Apelido Cliente 4", null);
        System.out.println("Cliente: " + cliente3.getApelido() + " -> " + cliente3.getDependente());
        System.out.println("Cliente: " + cliente4.getApelido() + " -> " + cliente4.getDependente());

        // Exercício 2.4
        System.out.println("\n2.4\nCriando um clientes e adicionando dois dependentes à ele");
        Cliente cliente5 = new Cliente("Cliente 5", "Rua X", "Apelido Cliente 1", null);
        Dependente dependente3 = new Dependente("Primeiro Dependente Cliente 5", 01);
        Dependente dependente4 = new Dependente("Segundo Dependente Cliente 5", 02);
        cliente5.addDependente(dependente3);
        cliente5.addDependente(dependente4);

        System.out.println("\nImprimindo Dependentes");
        cliente5.imprimeDependentes();

        System.out.println("\nRemovendo o primeiro dependente");
        cliente5.getHashDependente().remove(dependente3);
        System.out.println("\nImprimindo Dependentes novamente");
        cliente5.imprimeDependentes();
    }
}
