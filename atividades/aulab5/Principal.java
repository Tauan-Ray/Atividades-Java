package atividades.aulab5;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        ContaBanco cb = new ContaBanco(false, 0, "Tauan", 123456);
        try (Scanner ent  = new Scanner(System.in)){
            char repeat = 's';

        while (repeat == 's'){

            cb.ops();
            int op = ent.nextInt();
            

            if (op == 1){
                cb.abrirConta();
            }

            else if (op == 2){
                cb.fecharConta();
            }

            else if (op == 3){
                cb.depositar();
            }

            else if (op == 4){
                cb.sacar();
            }

            else if (op == 5){
                cb.pagarMensal();
            }

            else if (op == 6){
                cb.mostrar();
            }

            else if (op == 7){
                repeat = 'n';
            }

            else{
                System.out.println("Escolha uma opção válida");
            }
        }
    }
        }
}
