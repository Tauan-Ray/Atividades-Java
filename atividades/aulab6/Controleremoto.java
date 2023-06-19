package atividades.aulab6;

public class Controleremoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controleremoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }
       

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------Menu--------");
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());

        for (int i = 0; i < this.getVolume(); i +=10){
            System.out.print("| ");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        
        else{
            System.out.println("Impossivel diminuir volume");
        }
    }
    

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }

        else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.volume > 0){
            this.setVolume(0);
        
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

        else{
            System.out.println("Não consegui reproduzir");
        }
    }
    
    @Override
    public void pause() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(false);
        }

        else{
            System.out.println("Não consegui pausar");
        }
    }
}