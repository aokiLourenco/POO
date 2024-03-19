package aulas.aula3;

import java.util.Scanner;
import java.util.Random;

public class Ex3_7 {
    public static void main(String[] args) {
        
        final String NORMAL = "\033[0m"; final String VERMELHO = "\033[0;31m"; final String VERMELHO_NEGRITO = "\033[1;31m";
        Random gerador = new Random();
        Scanner val_input = new Scanner(System.in);
        String resposta;
        int val_rnd, val_recebido, num_tentativas;
        boolean continuar = true;
        do{
            System.out.println(" ");
            val_rnd = gerador.nextInt(100) + 1;
            val_recebido = num_tentativas = 0;
            do{
                do{
                    try {
                        System.out.print("Adivinhe o número [1;100]: ");
                        val_recebido = val_input.nextInt();
                        if (val_recebido >= 1 && val_recebido <= 100) {
                            num_tentativas++;
                            break;
                        } else {
                            System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de estar entre 1 e 100" + NORMAL);
                        }
                    } catch (Exception e) {
                        val_input.nextLine();
                        System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de ser um número inteiro!" + NORMAL);
                    }
                }while(true);
                if (val_recebido>val_rnd) {
                    System.out.println("O valor gerado é inferior.");
                }
                if (val_recebido<val_rnd) {
                    System.out.println("O valor gerado é superior.");
                }
            }while(val_recebido!=val_rnd);
            System.out.println(" ");
            System.out.println(String.format("Tentativas: %d.", num_tentativas));
            System.out.println(" ");
            val_input.nextLine();
            System.out.print("Deseja continuar? (S/N) ");
            resposta = val_input.nextLine().toLowerCase();
            if (!(resposta.equals("s")) && !(resposta.equals("sim"))) {
                continuar = false;
            };
        }while(continuar);
        val_input.close();
    }
}
