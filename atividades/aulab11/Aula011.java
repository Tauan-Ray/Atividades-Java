package atividades.aulab11;

public class Aula011{
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        System.out.println("==========================");

        Professor p1 = new Professor();
        p1.setNome("Marcela");
        p1.setIdade(29);
        p1.setSexo("F");
        p1.setEspecialidade("Biologia");
        p1.setSalario(2548.50f);
        p1.receberAumento(200);
        System.out.println(p1.toString());

        System.out.println("==========================");

        Aluno a1 = new Aluno();
        a1.setNome("Claúdio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        System.out.println("==========================");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.setIdade(21);
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        System.out.println("==========================");

        Tecnico t1 = new Tecnico();
        t1.setNome("Ana");
        t1.setIdade(19);
        t1.setSexo("F");
        t1.setMatricula(1113);
        t1.setCurso("Agronomia");
        t1.setRegistroProfissional(2221);
        t1.praticar();
        System.out.println(t1.toString());

        System.out.println("==========================");
    }
}