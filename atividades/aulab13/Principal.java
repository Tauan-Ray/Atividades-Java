package atividades.aulab13;

public class Principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        System.out.println("========================");
        c.reagir(11, 45);
        c.reagir(19, 00);
        System.out.println("========================");
        c.reagir(true);
        c.reagir(false);
        System.out.println("========================");
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
