package aulas.aula9.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

import aulas.aula6.ex1.Pessoa;
import aulas.aula5.ex1.Date;

public class ALDemo {

    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
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

        Set <Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Açoriano", 12345687, new Date(10, 2, 1987)));
        c3.add(new Pessoa("Piquense", 12345685, new Date(11, 3, 1988)));
        c3.add(new Pessoa("Piquense 2", 12345686, new Date(12, 4, 1989)));
        c3.add(new Pessoa("Piquense 3", 12345688, new Date(13, 5, 1990)));
        c3.add(new Pessoa("Piquense 4", 12345689, new Date(14, 6, 2003)));

        Iterator <Pessoa> itr = c3.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(15, 11, 2003));
        c4.add(new Date(16, 12, 2002));
        c4.add(new Date(17, 1, 2001));
        c4.add(new Date(18, 2, 2000));
        c4.add(new Date(19, 3, 1999));
        
        System.out.println(c4);
    }
}

