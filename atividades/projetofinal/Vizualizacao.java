package atividades.projetofinal;

public class Vizualizacao {
    private Gafanhoto espectator;
    private Video filme;

    public Vizualizacao(Gafanhoto espectator, Video filme) {
        this.espectator = espectator;
        this.filme = filme;
        this.espectator.setTotAssistido(this.espectator.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectator() {
        return espectator;
    }

    public void setEspectator(Gafanhoto espectator) {
        this.espectator = espectator;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }

        else if(porc <= 50){
            tot = 5;
        }

        else if(porc <= 90){
            tot = 8;
        }

        else{
            tot = 10;
        }

        this.filme.setAvaliacao(tot);

    }

    @Override
    public String toString() {
        return "Vizualizacao - espectator=" + espectator + "filme= " + filme;
    }

    
}
