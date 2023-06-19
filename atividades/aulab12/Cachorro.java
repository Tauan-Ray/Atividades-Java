package atividades.aulab12;

public class Cachorro extends Mamifero{
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }

}
