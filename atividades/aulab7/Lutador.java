package atividades.aulab7;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na ,int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2f){
            this.categoria = "Inválido";
        }

        else if (this.peso <= 70.3f){
            this.categoria = "Leve";
        }

        else if (this.peso <= 83.9f){
            this.categoria = "Médio";
        }

        else if (this.peso <= 120.2f){
            this.categoria = "Pesado";
        }

        else{
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }

    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando: "+this.getPeso()+ "kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

}
