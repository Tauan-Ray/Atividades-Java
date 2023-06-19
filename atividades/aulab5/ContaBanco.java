// Atividades prática proposta pelo professor Gustavo Guanabara feita com melhoria de perguntar ao usuário

package atividades.aulab5;
import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    Scanner ent  = new Scanner(System.in);

    public ContaBanco(boolean st, float s, String d, int nc){
        this.status = st;
        this.saldo = s;
        this.dono = d;
        this.numConta = nc;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public void abrirConta(){
        setStatus(true);
        System.out.println("Sua conta será conta corrente ou conta poupança? [1.cc / 2.cp]");
        int ti = ent.nextInt();
        if (ti == 1){
            setSaldo(getSaldo() + 50);
            setTipo("cc");
            System.out.println("Você recebeu R$50 de bônus");
        }

        else if (ti == 2){
            setSaldo(getSaldo() + 150);
            setTipo("cp");
            System.out.println("Você recebeu R$150 de bônus");
        }

        else{
            System.out.println("Escolha uma opção correta!!!");
        }
        System.out.println("Sua conta foi aberta com sucesso"); 
        System.out.println("==============================");
    }

    public void fecharConta(){
        if (getStatus() == false){
            System.out.println("Você não possui conta para fechar ainda");
            System.out.println("==============================");
        }
        if (getStatus() == true){
            if (getSaldo() == 0){
                setStatus(false);
                System.out.println("Sua conta foi fechada com sucesso!!!");
                setTipo(null);
                
            }
    
            else if (getSaldo() < 0){
                System.out.println("Você possui dividas, e não pode fechar sua conta.");
            }
    
            else if (getSaldo() > 0){
                System.out.println("Você possui dinheiro na sua conta, e não pode fechar sua conta");
            }
            System.out.println("==============================");
        }
    }

    public void depositar(){
        if (getStatus() == true){
            System.out.println("Quanto você quer depositar na sua conta? ");
            float dep = ent.nextFloat();
            setSaldo(getSaldo() + dep);
            System.out.println("Dinheiro depositado com sucesso");
            System.out.println("Saldo: R$"+getSaldo());
            System.out.println("==============================");
        }

        else if (getStatus() == false){
            System.out.println("Sua conta está fechada, não é possivel depositar dinheiro");
            System.out.println("==============================");
        }

    }

    public void sacar(){
        if (getStatus() == true){
            System.out.println("Quanto você quer sacar? ");
            float sa = ent.nextFloat();
            if (getSaldo() < sa){
                System.out.println("Você não possui dinheiro suficiente para fazer essa transação");
                System.out.println("==============================");
            }

            else if (getSaldo() >= sa){
                System.out.println("Dinheiro sacado com sucesso!!!");
                setSaldo(getSaldo() - sa);
                System.out.println("Saldo: R$"+getSaldo());
                System.out.println("==============================");
            }
        }

        else if (getStatus() == false){
            System.out.println("Sua conta está fechada, não é possivel sacar dinheiro");
            System.out.println("==============================");
        }
    }

    public void pagarMensal(){
        if (getStatus() == true){
            if (getTipo() == "cc"){
                if (getSaldo() >=12){
                    System.out.println("Você pagou sua mensalidade");
                    setSaldo(getSaldo() - 12);
                    System.out.println("Saldo: R$"+getSaldo());
                    System.out.println("==============================");
                }

                else if (getSaldo() < 12){
                    System.out.println("Você não possui dinheiro suficiente para pagar a mensalidade");
                }
                
            }
    
            else if (getTipo() == "cp"){
                if (getSaldo() >= 20){
                    System.out.println("Você pagou sua mensalidade");
                    setSaldo(getSaldo() - 20);
                    System.out.println("Saldo: R$"+getSaldo());
                    System.out.println("==============================");
                }

                else if (getSaldo() < 20){
                    System.out.println("Você não possui dinheiro suficiente para pagar a mensalidade");
                }
                
            }
        }

        else if (getStatus() == false){
            System.out.println("Sua conta está fechada, não a como pagar a sua mensalidade");
            System.out.println("==============================");
        }
        
    }

    public void mostrar(){
        System.out.println("Número da conta: "+getNumConta());
        System.out.println("Nome: "+getDono());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Saldo: R$"+getSaldo());
        if (getStatus() == true){
            System.out.println("Status: Conta aberta");
        }

        else if (getStatus() == false){
            System.out.println("Status: Conta fechada");
        }
        System.out.println("==============================");
    }


    public void ops(){
        System.out.println("Escolha uma opção");
        System.out.println("1.Abrir conta");
        System.out.println("2.Fechar conta");
        System.out.println("3.Depositar");
        System.out.println("4.Sacar");
        System.out.println("5.Pagar mensalidade");
        System.out.println("6.Mostrar informações");
        System.out.println("7.Fechar programa");
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        System.out.println("==============================");   
        
    }
}
