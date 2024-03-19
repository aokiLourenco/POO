package estudo.g9.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        
        
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        ArrayList<String> c3 = new ArrayList<>();
        c3.add("Aoki");
        c3.add("amarelo");
        c3.add("Aoki");
        c3.add("grossa");
        System.out.println("Contém carro? " + c3.contains("carro"));
        System.out.println(c3.lastIndexOf("Aoki"));
        System.out.println(c3.indexOf("Aoki"));
    }
}
