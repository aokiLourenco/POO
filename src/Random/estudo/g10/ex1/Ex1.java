package estudo.g10.ex1;

import java.util.*;

public class Ex1 {
    public static void main(String[] args){
        Map<String, String> mapa = new HashMap<>();
        mapa.put("branco", "Que tem a cor da neve");
        mapa.put("preto", "Que tem a cor do preto");
        mapa.put("azul", "Que tem a cor do céu");
        mapa.put("verde", "Que tem a cor do bom");
        mapa.put("amarelo", "Que tem a minha cor");

        //Remove
        mapa.remove("branco");
        mapa.remove("preto");

        //Change
        mapa.put("azul", "Que tem a cor do mar");
        mapa.put("verde", "Que tem a cor da erva");

        System.out.printf("MAPA: \n%s\n", mapa.toString());
        System.out.println("-".repeat(60));

        System.out.printf("KEYS: \n%s\n", mapa.keySet());
        System.out.println("-".repeat(60));

        System.out.printf("VALUES: \n%s\n", mapa.values());
        System.out.println("-".repeat(60));
        
        System.out.printf("Busca por azul: \n%s\n", mapa.get("azul"));

    }
}
