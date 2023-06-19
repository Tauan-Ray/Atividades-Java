package atividades.aulab11;


public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){
        System.out.println(this.getNome()+" praticou "+ this.getCurso());
    }
    
}
