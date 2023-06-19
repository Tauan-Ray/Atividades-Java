package atividades.aulab12;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        r.setCorEscama("Verde");
        r.setPeso(0.80f);
        r.setIdade(2);
        r.setMembros(4);
        r.emitirSom();
        r.alimentar();
        r.locomover();
        System.out.println("===================================");

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); // Nadando
        p.alimentar(); // Comendo susbtâncias
        p.emitirSom(); // Peixe não faz som
        p.soltarBolha();
        System.out.println("===================================");

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover(); // Voando
        a.alimentar(); // Comendo frutas
        a.emitirSom(); // Som de ave
        a.fazerNinho();
        System.out.println("===================================");

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(85.3f);
        m.setCorPelo("Marrom");
        m.setIdade(2);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de mamífero
        System.out.println("===================================");

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover(); // Saltando
        c.alimentar(); // Mamando
        c.emitirSom(); // Som de mamífero
        c.usarBolsa();
        System.out.println("===================================");

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover(); // Correndo
        k.alimentar(); // Mamando
        k.emitirSom(); // Au! Au! Au!
        k.abanarRabo();

        
    }
}
