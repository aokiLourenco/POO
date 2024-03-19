package aulas.aula3;

import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        
        double val_inicial, sum_val, val_max, val_min, val_tmp;
        int num_val = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Adicionar um valor: ");
        val_inicial = sum_val = val_max = val_min = sc.nextDouble();
        while (true) {
            System.out.print("Adicionar um valor: ");
            val_tmp = sc.nextDouble();
            if (val_tmp == val_inicial) break;
            if (val_tmp < val_min) val_min = val_tmp;
            if (val_tmp > val_max) val_max = val_tmp;
            sum_val += val_tmp;
            num_val += 1;
        }
        sc.close();

        System.out.println("============== RESULTADO ==============");
        System.out.println(String.format("Valor máximo: %.2f\nValor minimo: %.2f\nMédia dos valores: %.2f\nNúmero de valores: %d", val_max, val_min, sum_val/num_val, num_val));
    }
}
